package mar21.omega;

import net.minecraftforge.common.Configuration;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class ConfigHandler {
    public static int[] idB = new int[16];
    public static int[] idI = new int[42];
    @EventHandler
	public static void load(FMLPreInitializationEvent event)
	{
		Configuration config = new Configuration(event.getSuggestedConfigurationFile());
        config.load();
        	idB[1] = config.getBlock("MacheCasingID",4000).getInt();
        	idB[2] = config.getBlock("WolfOreID",4001).getInt();
        	idB[3] = config.getBlock("DefaultMetaID",4002).getInt();
        	idB[4] = config.getBlock("CopperOreID",4003).getInt();
        	idB[5] = config.getBlock("MagOreID",4004).getInt();
        	idB[6] = config.getBlock("ElectOreID",4005).getInt();
        	idB[7] = config.getBlock("BeryliumOreID",4006).getInt();
        	idB[8] = config.getBlock("TinOreID",4007).getInt();
        	idB[9] = config.getBlock("MosaicID", 4008).getInt();
        	idB[10] = config.getBlock("PowerMelterID", 4009).getInt();
        	idB[11] = config.getBlock("PowerMelter2ID", 4010).getInt();
        	idB[12] = config.getBlock("PowerConduitID", 4011).getInt();
        	idB[13] = config.getBlock("PowerIFaceID0", 4012).getInt();
        	idB[14] = config.getBlock("PowerIFaceID1", 4013).getInt();
        	idB[15] = config.getBlock("PowerIFaceID2", 4014).getInt();
        	idI[1] = config.getItem("IndCoilID",4200).getInt();
        	idI[2] = config.getItem("RawSilcWaferID",4201).getInt();
        	idI[3] = config.getItem("SilcWaferID",4202).getInt();
        	idI[4] = config.getItem("EmptySocketID",4203).getInt();
        	idI[5] = config.getItem("ChipID",4204).getInt();
        	idI[6] = config.getItem("CustChipID",4205).getInt();
        	idI[7] = config.getItem("EnhChipID",4206).getInt();
        	idI[8] = config.getItem("AdvChipID",4207).getInt();
        	idI[9] = config.getItem("CarbonIronID",4208).getInt();
        	idI[10] = config.getItem("SteelIngotID",4209).getInt();
        	idI[11] = config.getItem("WolfDustID",4210).getInt();
        	idI[12] = config.getItem("WolfIngotID",4211).getInt();
        	idI[13] = config.getItem("GoldDustID",4212).getInt();
        	idI[14] = config.getItem("IronDustID",4213).getInt();
        	idI[15] = config.getItem("CopperIngotID",4214).getInt();
        	idI[16] = config.getItem("CopperDustID",4215).getInt();
        	idI[17] = config.getItem("TinIngotID",4216).getInt();
        	idI[18] = config.getItem("TinDustID",4217).getInt();
        	idI[19] = config.getItem("ElectCrystalID",4218).getInt();
        	idI[20] = config.getItem("MagCrystalID",4219).getInt();
        	idI[21] = config.getItem("BerylCrystalID",4220).getInt();
        	idI[22] = config.getItem("MachSpeedUpID",4221).getInt();
        	idI[23] = config.getItem("MachEnergyUpID",4222).getInt();
        	idI[24] = config.getItem("MachEnMUpID",4223).getInt();
        	idI[25] = config.getItem("EnMatterID",4224).getInt();
        	idI[26] = config.getItem("PlantAshID",4225).getInt();
        	idI[27] = config.getItem("BerylCoreID",4226).getInt();
        	idI[28] = config.getItem("ToolWoodUpID",4227).getInt();
        	idI[29] = config.getItem("ToolSilkUpID",4228).getInt();
        	idI[30] = config.getItem("ToolSpeedUpID",4229).getInt();
        	idI[31] = config.getItem("ToolHeatUpID",4230).getInt();
        	idI[32] = config.getItem("BlankUpID",4231).getInt();
        	idI[33] = config.getItem("PowDrillID",4232).getInt();
        	idI[34] = config.getItem("MachFilterID", 4233).getInt();
        	idI[35] = config.getItem("MixRockID", 4234).getInt();
        	idI[36] = config.getItem("MixedAlloyID", 4035).getInt();
        	idI[37] = config.getItem("WolfPickaxe", 4036).getInt();
        	idI[38] = config.getItem("MechHelmet", 4037).getInt();
        	idI[39] = config.getItem("MechBody", 4038).getInt();
        	idI[40] = config.getItem("MechLeggins", 4039).getInt();
        	idI[41] = config.getItem("MechBoots", 4040).getInt();
        config.save();
	}
}
