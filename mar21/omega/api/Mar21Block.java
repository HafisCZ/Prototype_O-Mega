package mar21.omega.api;

import mar21.omega.ModCore;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;

public class Mar21Block extends Block
{
    public Mar21Block(int id, Material par2Material, CreativeTabs par3CreativeTabs)
    {
        super(id, par2Material);
        this.setCreativeTab(par3CreativeTabs);
        this.setHardness(1.0F);
        this.setResistance(20.0F);
    }

    public void registerIcons(IconRegister par1IconRegister)
    {
        this.blockIcon = par1IconRegister.registerIcon(ModCore.modid + ":" + (this.getUnlocalizedName().substring(5)));
    }
}