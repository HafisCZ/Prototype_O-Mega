package mar21.omega.api;

import mar21.omega.ModCore;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class Mar21Item extends Item
{
    public Mar21Item(int id, CreativeTabs par2CreativeTabs)
    {
        // ITEM ID/CREATIVE TAB
        super(id);
        this.setCreativeTab(par2CreativeTabs);
    }

    public void registerIcons(IconRegister par1IconRegister)
    {
        // ITEM TEXTURE
        this.itemIcon = par1IconRegister.registerIcon(ModCore.modid + ":" + (this.getUnlocalizedName().substring(5)));
    }
}