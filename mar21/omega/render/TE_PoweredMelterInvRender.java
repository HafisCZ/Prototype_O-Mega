package mar21.omega.render;

import mar21.omega.tileentity.TE_PoweredMelter;
import net.minecraft.client.renderer.tileentity.TileEntityRenderer;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.IItemRenderer;

public class TE_PoweredMelterInvRender implements IItemRenderer
{
    private powered_melter_model model;
    
    public TE_PoweredMelterInvRender()
    {
        model = new powered_melter_model();
    }
    @Override
    public boolean handleRenderType(ItemStack itemstack, ItemRenderType type)
    {
        return true;
    }
    @Override
    public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item, ItemRendererHelper helper)
    {
        return true;
    }
    @Override
    public void renderItem(ItemRenderType type, ItemStack item, Object... data)
    {
        TileEntityRenderer.instance.renderTileEntityAt(new TE_PoweredMelter(), 0.0D, 0.0D, 0.0D, 0.0F);
    }
}