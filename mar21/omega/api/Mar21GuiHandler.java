package mar21.omega.api;

import mar21.omega.tileentity.ContainerPoweredMelter;
import mar21.omega.tileentity.GuiPoweredMelter;
import mar21.omega.tileentity.TE_PoweredMelter;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;

public class Mar21GuiHandler implements IGuiHandler{

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world,
			int x, int y, int z) {
		TileEntity tile_entity = world.getBlockTileEntity(x, y, z);
		if(tile_entity instanceof TE_PoweredMelter){
			return new ContainerPoweredMelter(player.inventory, (TE_PoweredMelter) tile_entity);
		}
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world,
			int x, int y, int z) {
		TileEntity tile_entity = world.getBlockTileEntity(x, y, z);
		if(tile_entity instanceof TE_PoweredMelter){
			return new GuiPoweredMelter(player.inventory, (TE_PoweredMelter) tile_entity);
		}
		return null;
	}

}
