package mar21.omega.block;

import java.util.Random;

import mar21.omega.ModCore;
import mar21.omega.api.Mar21Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.world.World;

public class BlockElectrifiedOre extends Mar21Block
{
    public BlockElectrifiedOre(int id, Material par2Material, CreativeTabs par3CreativeTabs)
    {
        super(id, par2Material, par3CreativeTabs);
        this.setHardness(2.0F);
        this.canSilkHarvest();
    }

    public int idDropped(int par1, Random par2Random, int par3)
    {
        return ModCore.electrified_crystal.itemID;
    }

    public int quantityDropped(Random par2Random)
    {
        return 1 + par2Random.nextInt(4);
    }

    public void onBlockDestroyedByPlayer(World par1World, int x, int y, int z, int par2ExpDrop)
    {
        this.dropXpOnBlockBreak(par1World, z, y, z, 20);
    }
}