package mar21.omega.machine;

import java.util.Random;

import mar21.omega.ModCore;
import mar21.omega.tileentity.TE_PowerInterface;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class MachinePowerInterface2 extends Block{
	
	public MachinePowerInterface2(int id, Material par2Material,
			CreativeTabs par3CreativeTabs)
	{
		super(id, par2Material);
		this.setCreativeTab(par3CreativeTabs);
	}
	
    /**public TileEntity createNewTileEntity(World par1World)
    {
        return new TE_PowerInterface();
    }*/
    
    public int idDropped(int par1, Random par2Random, int par3)
    {
        return ModCore.machine_power_interface.blockID;
    }
    
    public void onBlockAdded(World par1World, int par2, int par3, int par4)
    {
        super.onBlockAdded(par1World, par2, par3, par4);
        par1World.scheduleBlockUpdate(par2, par3, par4, ModCore.machine_power_interface_cable.blockID, 1);
        
        //ONLY TESTING //TODO
        /**System.out.println("Power Interface Added to world at "+par2+" "+par3+" "+par4+" Coordinates");
        TE_PowerInterface te_pi = new TE_PowerInterface();
        te_pi.setEnergyConsume(0);
        te_pi.setEnergy(100);
        System.out.println("[Power Interface]Energy: "+te_pi.getEnergy());
        System.out.println("[Power Interface]Consume: "+te_pi.getEnergyConsume());*/		
    }
    
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int i, float f, float g, float t)
    {
    	world.setBlock(x, y ,z, ModCore.machine_power_interface_act.blockID);
    	return true;
    	/**
    	TileEntity tile_entity = world.getBlockTileEntity(x, y, z);
    	if(tile_entity != null && world.getBlockId(x, y, z) == this.blockID && 0 == world.getBlockMetadata(x, y, z))
    	{
    		world.setBlockMetadataWithNotify(x, y, z, 1, 2);
    		return true;
    	}
    	if(tile_entity != null && world.getBlockId(x, y, z) == this.blockID && 1 == world.getBlockMetadata(x, y, z))
		{
			world.setBlockMetadataWithNotify(x, y, z, 2, 2);
			return true;
		}
    	if(tile_entity != null && world.getBlockId(x, y, z) == this.blockID && 2 == world.getBlockMetadata(x, y, z))
		{
			world.setBlockMetadataWithNotify(x, y, z, 0, 2);
			return true;
		}
    	return true;
    	*/
    }
	   
    public void registerIcons(IconRegister par1IconRegister)
	{
	    this.blockIcon = par1IconRegister.registerIcon(ModCore.modid + ":" + (this.getUnlocalizedName().substring(5)));
	}
        
}
