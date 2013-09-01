package mar21.omega;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class OmegaTab extends CreativeTabs {

	public OmegaTab(int par1, String par2Str) {
		super(par1, par2Str);
		// TODO Auto-generated constructor stub
	}

	   @SideOnly(Side.CLIENT)

	    /**
	     * the itemID for the item to be displayed on the tab
	     */
	    public int getTabIconItemIndex()
	    {
	        return ModCore.powered_drill.itemID;
	    }
	   
	   public String getTranslatedTabLabel(){
		   return "Omega";
	   }
}
