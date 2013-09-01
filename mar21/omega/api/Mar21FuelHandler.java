package mar21.omega.api;

import mar21.omega.ModCore;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.IFuelHandler;

public class Mar21FuelHandler implements IFuelHandler
{
    @Override
    public int getBurnTime(ItemStack par1Fuel)
    {
        if (par1Fuel.itemID == ModCore.plant_ash.itemID)
        {
            return 200;
        }
        else
        {
            return 0;
        }
    }
}
