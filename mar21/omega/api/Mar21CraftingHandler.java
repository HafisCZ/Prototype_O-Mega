package mar21.omega.api;

import mar21.omega.ModCore;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.ICraftingHandler;

public class Mar21CraftingHandler implements ICraftingHandler
{
    public void onCrafting(EntityPlayer player, ItemStack item,
                           IInventory craftMatrix)
    {
        if (item.itemID == ModCore.advanced_chip.itemID)
        {
            System.out.println("Advanced Electronics !");
        }
    }

    public void onSmelting(EntityPlayer player, ItemStack item)
    {
        if (item.itemID == ModCore.steel_ingot.itemID)
        {
            System.out.println("Hardened !");
        }
    }
}
