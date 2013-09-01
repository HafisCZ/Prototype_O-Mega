package mar21.omega.api;

import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class Mar21CreativeTab extends CreativeTabs
{
    private int tabIndexID;
    private String tabName;

    public Mar21CreativeTab(int par1, int par2, String par3String, String par4String)
    {
        super(par1, par3String);
        this.tabName = par4String;
        this.tabIndexID = par2;
    }

    @SideOnly(Side.CLIENT)
    public int getTabIconItemIndex()
    {
        return this.tabIndexID;
    }

    public String getTranslatedTabLabel()
    {
        return this.tabName;
    }
}
