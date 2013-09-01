package mar21.omega.block;

import mar21.omega.api.Mar21Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockTinOre extends Mar21Block
{
    public BlockTinOre(int id, Material par2Material, CreativeTabs par3CreativeTabs)
    {
        super(id, par2Material, par3CreativeTabs);
        this.setHardness(2.0F);
    }
}