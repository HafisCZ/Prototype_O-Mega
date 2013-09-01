package mar21.omega.item;

import mar21.omega.api.Mar21Item;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemArtefactInvisibility extends Mar21Item
{
	boolean cooldown = false;
	int cooldownTicks = 1200;
	
    public ItemArtefactInvisibility(int id, CreativeTabs par2CreativeTabs)
    {
        super(id, par2CreativeTabs);
    }
    
    public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
    {
    	if (!par3EntityPlayer.isPotionActive(Potion.invisibility) && cooldown == false)
    	{
    	  cooldown = true;
    	  par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.invisibility.id, 200, 1));
    	}
        return par1ItemStack;
    }
    
    /**public void onTickInGame()
    {
    	if(cooldown == true)
    	{
    		cooldownTicks -= 1;
    	}
    	if(cooldownTicks <= 0 && cooldown == true)
    	{
    		cooldownTicks = 1200;
    		cooldown = false;
    	}
    }*/
}