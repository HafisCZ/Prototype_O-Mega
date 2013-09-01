package mar21.omega.machine;

import java.util.Random;

import mar21.omega.ModCore;
import mar21.omega.tileentity.TE_PowerConduit;
import mar21.omega.tileentity.TE_PoweredMelter;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class MachinePowerConduit extends BlockContainer
{
    public MachinePowerConduit(int id, Material par2Material)
    {
    	super(id, par2Material);
    	this.setHardness(2.0F);
    }

    public int idDropped(int par1, Random par2Random, int par3)
    {
        return ModCore.power_conduit.blockID;
    }
    
    public void onBlockAdded(World par1World, int par2, int par3, int par4)
    {
        super.onBlockAdded(par1World, par2, par3, par4);
        par1World.scheduleBlockUpdate(par2, par3, par4, ModCore.power_conduit.blockID, 5);
    }
    
	@Override
	public void onNeighborBlockChange(World world, int x, int y, int z, int changedID)
	{
		TE_PowerConduit te = (TE_PowerConduit)world.getBlockTileEntity(x,y,z);
		if(changedID == this.blockID && te != null)
		{
			String test1 = te.getSector();
			sync1(world, x + 1, y, z, te);
			sync1(world, x - 1, y, z, te);
			sync1(world, x, y + 1, z, te);
			sync1(world, x, y - 1, z, te);
			sync1(world, x, y, z + 1, te);
			sync1(world, x, y, z - 1, te);
			String test2 = te.getSector();
			if(!(test1.equals(test2)))
			{
				world.notifyBlocksOfNeighborChange(x, y, z, this.blockID);
			}
			sync2(world, x + 1, y, z, te);
			sync2(world, x - 1, y, z, te);
			sync2(world, x, y + 1, z, te);
			sync2(world, x, y - 1, z, te);
			sync2(world, x, y, z + 1, te);
			sync2(world, x, y, z - 1, te);
		}
	}
	
	public void sync1(World world, int x, int y, int z, TE_PowerConduit localCable)
	{
		if(world.getBlockId(x, y, z) == this.blockID)
		{
			TE_PowerConduit tile = (TE_PowerConduit)world.getBlockTileEntity(x, y, z);
			if(tile != null && localCable.getCoolDown() == 0 && !(tile.getSector().equals("")) && localCable.getSector().equals(""))
			{
				localCable.resetCoolDown();
				localCable.setSector(tile.getSector());
			}
		}
	}
	
	public void sync2(World world, int x, int y, int z, TE_PowerConduit localCable)
	{
		if(world.getBlockId(x, y, z) == ModCore.powered_melter_idle.blockID)
		{
			TE_PoweredMelter tile = (TE_PoweredMelter)world.getBlockTileEntity(x, y, z);
			if(tile != null && !(localCable.getSector().equals("")))
			{
				world.markBlockForUpdate(x, y, z);
			}
		}
	}
	
	public void sync3(World world, int x, int y, int z, TE_PowerConduit localCable)
	{
		if(world.getBlockId(x, y, z) == ModCore.powered_melter_act.blockID)
		{
			TE_PoweredMelter tile = (TE_PoweredMelter)world.getBlockTileEntity(x, y, z);
			if(tile != null && !(localCable.getSector().equals("")))
			{
				world.markBlockForUpdate(x, y, z);
			}
		}
	}
	
	@Override
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int par6, float par7, float par8, float par9)
	{
		if(!world.isRemote)
		{
			Random rand = new Random();
			((TE_PowerConduit)world.getBlockTileEntity(x, y, z)).resetCoolDown();
			world.markBlockForUpdate(x, y, z);
			world.notifyBlocksOfNeighborChange(x, y, z, this.blockID);
			return true;
		}
		return false;
	}
	
	@Override
	public int getRenderBlockPass()
    {
        return 1;
    }
	
	@Override
	public int getRenderType()
	{
		return -1;
	}
	
	@Override
	public void registerIcons(IconRegister par1IconRegister)
	{
		this.blockIcon = par1IconRegister.registerIcon(ModCore.modid + ":" + (this.getUnlocalizedName().substring(5)));
	}
	
	@Override
	public boolean isOpaqueCube()
	{
		return false;
		
	}
	private boolean isValid(int block)
	{
		if(block == this.blockID || block == ModCore.powered_melter_idle.blockID || block == ModCore.powered_melter_act.blockID)
		{
			return true;
		}
		return false;
	}
	
	@Override
	public void setBlockBoundsBasedOnState(IBlockAccess par1IBlockAccess, int x, int y, int z)
	{
		this.setBlockBounds(0.3125F, 0.3125F, 0.3125F, 0.6875F, 0.6875F, 0.6875F);
		float minx = (float)this.minX;
		float maxx = (float)this.maxX;
		float miny = (float)this.minY;
		float maxy = (float)this.maxY;
		float minz = (float)this.minZ;
		float maxz = (float)this.maxZ;
		
		if (isValid(par1IBlockAccess.getBlockId(x-1, y, z)))
			minx = 0;
		
		if (isValid(par1IBlockAccess.getBlockId(x+1, y, z)))
			maxx = 1;
		
		if (isValid(par1IBlockAccess.getBlockId(x, y-1, z)))
			miny = 0;
		
		if (isValid(par1IBlockAccess.getBlockId(x, y+1, z)))
			maxy = 1;
		
		if (isValid(par1IBlockAccess.getBlockId(x, y, z-1)))
			minz = 0;
		
		if (isValid(par1IBlockAccess.getBlockId(x, y, z+1)))
			maxz = 1;
		
		this.setBlockBounds(minx, miny, minz, maxx, maxy, maxz);
	}

	@Override
	public TileEntity createNewTileEntity(World world) {
		return new TE_PowerConduit();
	}
}
