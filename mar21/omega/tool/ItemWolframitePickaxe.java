package mar21.omega.tool;

import mar21.omega.ModCore;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemPickaxe;

public class ItemWolframitePickaxe extends ItemPickaxe{

	public ItemWolframitePickaxe(int par1, EnumToolMaterial par2EnumToolMaterial) {
		super(par1, par2EnumToolMaterial);
	}
	
    public void registerIcons(IconRegister par1IconRegister)
    {
        this.itemIcon = par1IconRegister.registerIcon(ModCore.modid + ":" + (this.getUnlocalizedName().substring(5)));
    }
}
