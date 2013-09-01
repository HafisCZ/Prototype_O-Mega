package mar21.omega.api;

import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.event.Event;

public class Mar21Extender {
	public static String getRenderedTexture(String model)
	{
		String par0String = "/mods/mar21/textures/model/"+model+"_texture.png";
		return par0String;
	}
	public static String getBlockTexture(String block)
	{
		String par0String = "/mods/mar21/textures/blocks/"+block+".png";
		return par0String;
	}
	public static String getItemTexture(String item)
	{
		String par0String = "/mods/mar21/textures/items/"+item+".png";
		return par0String;
	}
	public static String gIT(String item)
	{
		return getItemTexture(item);
	}
	public static String gBT(String block)
	{
		return getBlockTexture(block);
	}
	public static String gMT(String model)
	{
		return getRenderedTexture(model);
	}
	public static void getUnlocal(FMLPreInitializationEvent event)
	{
        
	}
}
