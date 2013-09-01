package mar21.omega;

import mar21.omega.api.Mar21API;
import mar21.omega.api.Mar21CraftingHandler;
import mar21.omega.api.Mar21FuelHandler;
import mar21.omega.api.Mar21GuiHandler;
import mar21.omega.api.Mar21PacketHandler;
import mar21.omega.block.BlockBeryliumOre;
import mar21.omega.block.BlockCopperOre;
import mar21.omega.block.BlockElectrifiedOre;
import mar21.omega.block.BlockMachineCasing;
import mar21.omega.block.BlockMagnetiteOre;
import mar21.omega.block.BlockMosaic;
import mar21.omega.block.BlockTinOre;
import mar21.omega.block.BlockWolframiteOre;
import mar21.omega.item.ItemAdvancedChip;
import mar21.omega.item.ItemBeryliumCore;
import mar21.omega.item.ItemBeryliumCrystal;
import mar21.omega.item.ItemBlankUpgrade;
import mar21.omega.item.ItemCarbonizedIngot;
import mar21.omega.item.ItemChip;
import mar21.omega.item.ItemCopperDust;
import mar21.omega.item.ItemCopperIngot;
import mar21.omega.item.ItemCustomChip;
import mar21.omega.item.ItemElectrifiedCrystal;
import mar21.omega.item.ItemEmptySocket;
import mar21.omega.item.ItemEnMatter;
import mar21.omega.item.ItemEnergyUpgrade;
import mar21.omega.item.ItemEnhancedChip;
import mar21.omega.item.ItemEnmatterUpgrade;
import mar21.omega.item.ItemGoldDust;
import mar21.omega.item.ItemHeatAbsorberUpgrade;
import mar21.omega.item.ItemInductionCoil;
import mar21.omega.item.ItemIronDust;
import mar21.omega.item.ItemMachineFilter;
import mar21.omega.item.ItemMagnetiteCrystal;
import mar21.omega.item.ItemMiningSpeedUpgrade;
import mar21.omega.item.ItemMixedAlloy;
import mar21.omega.item.ItemMixedRocks;
import mar21.omega.item.ItemPlantAsh;
import mar21.omega.item.ItemSiliconWafer;
import mar21.omega.item.ItemSiliconWaferRaw;
import mar21.omega.item.ItemSilkTouchUpgrade;
import mar21.omega.item.ItemSpeedUpgrade;
import mar21.omega.item.ItemSteelIngot;
import mar21.omega.item.ItemTinDust;
import mar21.omega.item.ItemTinIngot;
import mar21.omega.item.ItemWolframiteDust;
import mar21.omega.item.ItemWolframiteIngot;
import mar21.omega.item.ItemWoodHarvestUpgrade;
import mar21.omega.machine.MachinePowerConduit;
import mar21.omega.machine.MachinePowerInterface;
import mar21.omega.machine.MachinePowerInterface1;
import mar21.omega.machine.MachinePowerInterface2;
import mar21.omega.machine.MachinePoweredMelter;
import mar21.omega.render.TE_PoweredMelterRender;
import mar21.omega.tileentity.TE_PowerConduit;
import mar21.omega.tileentity.TE_PoweredMelter;
import mar21.omega.tool.ItemMechBoots;
import mar21.omega.tool.ItemMechChestplate;
import mar21.omega.tool.ItemMechHelmet;
import mar21.omega.tool.ItemMechLeggins;
import mar21.omega.tool.ItemPoweredDrill;
import mar21.omega.tool.ItemWolframitePickaxe;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.src.ModLoader;
import net.minecraftforge.common.EnumHelper;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = ModCore.modid, name = "Omega", version = "Alpha 1.4B")
@NetworkMod(clientSideRequired = true, serverSideRequired = false, channels = "Omega", packetHandler = Mar21PacketHandler.class)
public class ModCore
{
	public static final String modid = "mar21";
    
    @Instance
    public static ModCore instance = new ModCore();

    // BLOCKS //TODO
    public static Block machine_casing; // MAIN BLOCK WHICH IS USED FOR CRAFTING SOME MACHINES
    public static Block mosaic; // DESIGN BASED WHITE-BLACK BLOCK, NICE TO HAVE!
    public static Block wolframite_ore; // BASIC ORE > WOLFRAMITE INGOT, USED FOR CRAFTING WIDE SPECTRE OF THINGS
    public static Block copper_ore; // BASIC ORE > COPPER INGOT, FOR CRAFTING CABLES AND OTHER MATERIAL
    public static Block berylium_ore; // VERY RARE ORE > BERYLIUM CRYSTAL, USED FOR CRAFTING EN-MATTER MACHINES
    public static Block magnetite_ore; // SLIGHTLY RARE ORE > MAGNETITE CRYSTAL, USAGE IN CRAFTING COIL AND COAL GENERATORS
    public static Block tin_ore; // BASIC ORE > TIN INGOT, USED FOR FILTERS IN METALLURGIC MACHINES LIKE FILTERS
    public static Block electrified_ore; // RARE ORE, DROPS ELECTRIFIED CRYSTALS > HAVE TONS OF MJ INTEGRATED IN, DEPLETABLE IN ENERGY STORAGE
    //public static Block powered_molder; // METALURGIC MACHINE WHICH ALLOWS YOU TO MOLD TWO METALS INTO MIXED METAL (COPPER INGOT + TIN DUST > 2 BRONZE INGOT), 1 PROCESS AT TIME
    //public static Block powered_crusher; // METALURGIC MACHINE WHICH ALLOWS YOU TO CRUSH METAL ORE INTO HIS DUST, 1 PROCESS AT TIME
    public static Block powered_melter_idle; // METALURGIC MACHINE WHICH ALLOWS YOU TO MELT THE ORES/DUST INTO SIMPLE INGOTS, 1 PROCESS AT TIME
    public static Block powered_melter_act;
    public static Block machine_power_interface; // MACHINE DEVICE CONNECTING MACHINE TO POWER SUPPLY
    public static Block machine_power_interface_act;
    public static Block machine_power_interface_cable;
    //public static Block liquid_refinery; // MACHINE WHICH ALLOWS YOU TO REFINE ONE LIQUID INTO OTHER WITH POWER COST (OIL > FUEL OR WATER > PURIFIED WATER)
    //public static Block metal_factory; // METAL REFINERY - ALLOWS YOU TO SIMPLY PROCESS THE ORE TO THE DOUBLED INGOT (SKIPS THE DUST VERSION OF METAL) AND CONSUME 50% LESS ENERGY
    //public static Block chip_assembler; // MACHINE WHICH ALLOW YOU TO CRAFT ALL KINDS OF CHIP WITH LESS SOURCES BUT PROCESS WILL CONSUME POWER, USES ELECTRIFIED CRYSTALS, SILICONS WAFERS AND IRON/GOLD/DIAMOND/EMERALD TO CRAFT CHIPS
    //public static Block powered_assembler; // MACHINE WHICH ALLOWS TO UPGRADE ALL KINDS OF STAFF (LIKE ANVIL BUT IMPROVED WHICH NEEDS POWER TO OPERATE)
    //public static Block void_machine; // MACHINE WHICH ALLOWS YOU TO TURN ALL ITEMS AND BLOCKS INTO A MIXED ROCKS
    //public static Block enmatter_compressor; // SCIENTIFIC MACHINE WHICH CAN TURN A EN-MATTER TO OTHER MATERIAL
    //public static Block enmatter_accelerator; // SCIENTIFIC MACHINE THAN ALLOW YOU TO TURN MATTER INTO EN-MATTER, BUT WITH EXTREME POWER COST
    //public static Block magnetic_purifier; // MACHINE THAT ALLOWS YOU TO CONVERT AMMOUNT OF MIXED ROCKS INTO METAL
    //public static Block biowaste_generator; // GENERATOR THAT USES CROPS (ALL PLANTS AND SEEDS) AND CREATE PLANT ASH, GENERATED POWER DEPENDS ON CROP TYPE
    //public static Block coal_generator; // BASIC VERSION OF COAL GENERATOR - TYPE(COAL 1, CHARCOAL 0,2, BLAZE 2)*5 MJ/t
    //public static Block solar_generator; // BASIC VERSION OF SOLAR GENERATOR - SL*0,5 MJ/t
    //public static Block void_generator; // GENERATOR THAT CONSUME ENDERPEARLS TO CREATE STABLE VOID AND PRODUCE ENERGY FROM ANTIPRESSURE
    //public static Block magmatic_generator; // GENERATOR THAT CONSUME LAVA TO CREATE ENERGY, SOMETIMES GENERATES MIXED_ROCKS OR OBSIDIAN
    //public static Block enmatter_generator; // VERY EXPENSIVE, BUT POWERFULL
    //public static Block basic_energy_storage; // BASIC ENERGY STORAGE - 100 kMJ
    //public static Block enhanced_energy_storage; // ENHANCED ENERGY STORAGE - 600 kMJ
    //public static Block industrial_energy_storage; // INDUSTRIAL ENERGY STORAGE - 1200 kMJ
    //public static Block scientific_energy_storage; // SCIENTIFIC ENERGY STORAGE - 2400 kMJ
    //public static Block enmatter_energy_storage; // EN-MATTER MACHINE THAN ALLOWS YOU TO STORE EXTREME AMOUNT OF ENERGY BY TURNING ENERGY INTO EN-MATTER AND BACK
    public static Block power_conduit; // POWER CABELING

    // ITEMS //TODO
    public static Item induction_coil; // GOLD INDUCTION COIL, USED FOR MACHINE POWERING
    public static Item raw_silicon_wafer; // NORMAL SILICON WAFER, NEEDS TO BE MELTED
    public static Item silicon_wafer; // MELTED RAW SILICON WAFER, FOR CRAFTING CHIPS AND MORE
    public static Item empty_socket; // COMPONENT FOR ALL CHIPS
    public static Item chip; // BASIC CHIP - FOR THE BASIC GENERATORS AND ENERGY STORAGE
    public static Item custom_chip; // SLIGHTLY IMPROVED VERSION OF THE BASIC CHIP - FOR METALUERGIC MACHINES
    public static Item enhanced_chip; // ENHANCED VERSION OF BASIC CHIP - FOR INDUSTIAL MACHINES
    public static Item advanced_chip; // ADVANCED VERSION OF BASIC CHIP - FOR SCIENTIFIC MACHINES
    public static Item carbonized_iron; // RAW STEEL, NEEDS TO BE MELTED IN FURNACE OR OTHER
    public static Item steel_ingot; // STEEL, PURIFIED IRON INGOT
    public static Item wolframite_ingot; // WOLFRAMITE INGOT, OXIDED TUNGSTEN
    public static Item copper_ingot; // COPPER INGOT, USED FOR CABLES
    public static Item tin_ingot; // TIN INGOT, USED FOR TIN FILTERS
    public static Item berylium_crystal; // VERY RARE BERYLIUM CRYSTAL
    public static Item magnetite_crystal; // A BIT RARE MAGNETITE CRYSTAL
    public static Item electrified_crystal; // ELECTRIFIED CRYSTAL, IT HAVE 20 MJ IN
    public static Item machine_filter; // USABLE IN METALLURGIC MACHINES AS A ORE FILTER > CAUSES DUPLICATING OF MATERIALS, 3 STATES = NEW, CLOGGED AND UNUSABLE
    public static Item copper_dust; // DUST CREATED FROM ORE OR INGOT
    public static Item tin_dust; // DUST CREATED FROM ORE OR INGOT
    public static Item iron_dust; // DUST CREATED FROM ORE OR INGOT
    public static Item gold_dust; // DUST CREATED FROM ORE OR INGOT
    public static Item wolframite_dust; // DUST CREATED FROM ORE OR INGOT
    public static Item en_matter; // THING THAT HOLDS LOTS OF CONTENTRATED POWER IN-SELF, ALL IN PIECE OF MATTER
    public static Item plant_ash; // DUST SOMETIMES CREATED BY BIOWASTE GENERATOR, USABLE AS BONEMEAL
    public static Item berylium_core; // CORE FOR POWERED SUIT AND TOOLS
    public static Item mixed_rocks; // MIXED ROCKS
    public static Item mixed_alloy; // ALLOY CREATED FROM MIXED ROCKS
    public static Item powered_drill; // CHARGEABLE DRILL
    //public static Item upgrade_assembler; // USED FOR INSERT UPGRADES INTO TOOLS AND ARMORS
    public static Item wolframite_pickaxe;
    public static Item blank_upgrade; // BASIC CRAFTING MATERIAL FOR UPGRADES
    public static Item machine_speed_upgrade; // MACHINE UPGRADE THAN INCREASE SPEED OF PROCESS 20% PER UPGRADE, MAX 10 OF SAME TYPE UPGRADE IN ONE MACHINE
    public static Item machine_energy_upgrade; // MACHINE UPGRADE THAN DECREASE ENERGY CONSUMPTION BY 5% PER UPGRADE, MAX 10 OF SAME TYPE UPGRADE IN ONE MACHINE
    public static Item machine_enmatter_upgrade; // MACHINE UPGRADE FOR EN-MATTER MACHINES THAN IMPROVE THE ENERGY (5%) AND MATTER CONSUMPTION (5%), MAX 10 OF SAME TYPE UPGRADE IN ONE MACHINE
    public static Item tool_woodcutter_upgrade; // TOOL UPGRADE WHICH CAN ALLOW TOOL TO MINE WOOD MATERIALS (REQUIRED WOOD AND DIAMOND AXE)
    public static Item tool_silktouch_upgrade; // TOOL UPGRADE WHICH CAN ALLOW TOOL TO MINE AS PICKAXE WITH SILK TOUCH (REQUIRED SILK TOUCH I ENCHANTED BOOK)
    public static Item tool_miningspeed_upgrade; // TOOL UPGRADE WHICH BOOST MINING SPEED OF TOOL LIKE EFFICIENCY 5 (REQUIRED DIAMOND BLOCK AND EFFICIENCY V ENCHANTED BOOK)
    public static Item tool_heatabsorber_upgrade; // TOOL UPGRADE WHICH ABSORB HEAT AND EXTEND THE MAXIMUM HEAT CAPABILITY 10 TIMES (REQUIRED NETHER STAR)
    public static Item mechanical_helmet; // POWERED HELMET
    public static Item mechanical_chestplate; // POWERED_CHESTPLATE
    public static Item mechanical_leggins; // POWERED_LEGGINS
    public static Item mechanical_boots; // POWERED_BOOTS
    
    // PRE PreInit
    public static EnumToolMaterial powerTool = EnumHelper.addToolMaterial("powerTool", 3, -1, 8.0F, 4, 10);
    public static EnumToolMaterial wolframiteTool = EnumHelper.addToolMaterial("wolframiteTool", 2, 625, 6.0F, 4, 10);
    public static EnumArmorMaterial mechanicalArmor = EnumHelper.addArmorMaterial("mechanicalArmor", -1, new int[]{3,8,6,3}, 10);
    public static Mar21CraftingHandler Mar21CraftingHandler = new Mar21CraftingHandler();
    public static CreativeTabs tabOmega = new OmegaTab(CreativeTabs.getNextID(),"Omega");
    private Mar21GuiHandler guihandler = new Mar21GuiHandler();
    EventSheet Events = new EventSheet();
    
    @EventHandler
    public void preload(FMLPreInitializationEvent event) //TODO
    {
    	ConfigHandler.load(event);
    }
    @EventHandler
    public void load(FMLInitializationEvent event) //TODO
    {
        // BLOCK INIT
        machine_casing = new BlockMachineCasing(ConfigHandler.idB[1], Material.rock, tabOmega).setUnlocalizedName("machine_casing");
        wolframite_ore = new BlockWolframiteOre(ConfigHandler.idB[2], Material.rock, tabOmega).setUnlocalizedName("wolframite_ore");       
        copper_ore = new BlockCopperOre(ConfigHandler.idB[4], Material.rock, tabOmega).setUnlocalizedName("copper_ore");
        magnetite_ore = new BlockMagnetiteOre(ConfigHandler.idB[5], Material.rock, tabOmega).setUnlocalizedName("magnetite_ore");
        electrified_ore = new BlockElectrifiedOre(ConfigHandler.idB[6], Material.rock, tabOmega).setUnlocalizedName("electrified_ore");
        berylium_ore = new BlockBeryliumOre(ConfigHandler.idB[7], Material.rock, tabOmega).setUnlocalizedName("berylium_ore");
        tin_ore = new BlockTinOre(ConfigHandler.idB[8], Material.rock, tabOmega).setUnlocalizedName("tin_ore");
        mosaic = new BlockMosaic(ConfigHandler.idB[9], Material.rock, tabOmega).setUnlocalizedName("mosaic");
        // MACHINE INIT
        power_conduit = new MachinePowerConduit(ConfigHandler.idB[12], Material.rock).setUnlocalizedName("power_conduit").setCreativeTab(tabOmega);
        powered_melter_idle = new  MachinePoweredMelter(ConfigHandler.idB[10],false).setUnlocalizedName("powered_melter_idle").setCreativeTab(tabOmega);
        powered_melter_act = new  MachinePoweredMelter(ConfigHandler.idB[11],true).setUnlocalizedName("powered_melter_act");
        machine_power_interface = new MachinePowerInterface(ConfigHandler.idB[13], Material.rock, tabOmega).setUnlocalizedName("machine_power_interface");
        machine_power_interface_act = new MachinePowerInterface1(ConfigHandler.idB[14], Material.rock, tabOmega).setUnlocalizedName("machine_power_interface_act");
        machine_power_interface_cable = new MachinePowerInterface2(ConfigHandler.idB[15], Material.rock, tabOmega).setUnlocalizedName("machine_power_interface_cable");
        // ITEM INIT
        induction_coil = new ItemInductionCoil(ConfigHandler.idI[1], tabOmega).setUnlocalizedName("induction_coil");
        raw_silicon_wafer = new ItemSiliconWaferRaw(ConfigHandler.idI[2], tabOmega).setUnlocalizedName("raw_silicon_wafer");
        silicon_wafer = new ItemSiliconWafer(ConfigHandler.idI[3], tabOmega).setUnlocalizedName("silicon_wafer");
        empty_socket = new ItemEmptySocket(ConfigHandler.idI[4], tabOmega).setUnlocalizedName("empty_socket");
        chip = new ItemChip(ConfigHandler.idI[5], tabOmega).setUnlocalizedName("chip");
        custom_chip = new ItemCustomChip(ConfigHandler.idI[6], tabOmega).setUnlocalizedName("custom_chip");
        enhanced_chip = new ItemEnhancedChip(ConfigHandler.idI[7], tabOmega).setUnlocalizedName("enhanced_chip");
        advanced_chip = new ItemAdvancedChip(ConfigHandler.idI[8], tabOmega).setUnlocalizedName("advanced_chip");
        carbonized_iron = new ItemCarbonizedIngot(ConfigHandler.idI[9], tabOmega).setUnlocalizedName("carbonized_iron");
        steel_ingot = new ItemSteelIngot(ConfigHandler.idI[10], tabOmega).setUnlocalizedName("steel_ingot");
        wolframite_dust = new ItemWolframiteDust(ConfigHandler.idI[11], tabOmega).setUnlocalizedName("wolframite_dust");
        wolframite_ingot = new ItemWolframiteIngot(ConfigHandler.idI[12], tabOmega).setUnlocalizedName("wolframite_ingot");
        gold_dust = new ItemGoldDust(ConfigHandler.idI[13], tabOmega).setUnlocalizedName("gold_dust");
        iron_dust = new ItemIronDust(ConfigHandler.idI[14], tabOmega).setUnlocalizedName("iron_dust");
        copper_ingot = new ItemCopperIngot(ConfigHandler.idI[15], tabOmega).setUnlocalizedName("copper_ingot");
        copper_dust = new ItemCopperDust(ConfigHandler.idI[16], tabOmega).setUnlocalizedName("copper_dust");
        tin_ingot = new ItemTinIngot(ConfigHandler.idI[17], tabOmega).setUnlocalizedName("tin_ingot");
        tin_dust = new ItemTinDust(ConfigHandler.idI[18], tabOmega).setUnlocalizedName("tin_dust");
        electrified_crystal = new ItemElectrifiedCrystal(ConfigHandler.idI[19], tabOmega).setUnlocalizedName("electrified_crystal");
        magnetite_crystal = new ItemMagnetiteCrystal(ConfigHandler.idI[20], tabOmega).setUnlocalizedName("magnetite_crystal");
        berylium_crystal = new ItemBeryliumCrystal(ConfigHandler.idI[21], tabOmega).setUnlocalizedName("berylium_crystal");
        machine_speed_upgrade = new ItemSpeedUpgrade(ConfigHandler.idI[22], tabOmega).setUnlocalizedName("machine_speed_upgrade");
        machine_energy_upgrade = new ItemEnergyUpgrade(ConfigHandler.idI[23], tabOmega).setUnlocalizedName("machine_energy_upgrade");
        machine_enmatter_upgrade = new ItemEnmatterUpgrade(ConfigHandler.idI[24], tabOmega).setUnlocalizedName("machine_enmatter_upgrade");
        en_matter = new ItemEnMatter(ConfigHandler.idI[25], tabOmega).setUnlocalizedName("en_matter");
        plant_ash = new ItemPlantAsh(ConfigHandler.idI[26], tabOmega).setUnlocalizedName("plant_ash");
        berylium_core = new ItemBeryliumCore(ConfigHandler.idI[27], tabOmega).setUnlocalizedName("berylium_core");
        tool_woodcutter_upgrade = new ItemWoodHarvestUpgrade(ConfigHandler.idI[28], tabOmega).setUnlocalizedName("tool_woodcutter_upgrade");
        tool_silktouch_upgrade = new ItemSilkTouchUpgrade(ConfigHandler.idI[29], tabOmega).setUnlocalizedName("tool_silktouch_upgrade");
        tool_miningspeed_upgrade = new ItemMiningSpeedUpgrade(ConfigHandler.idI[30], tabOmega).setUnlocalizedName("tool_miningspeed_upgrade");
        tool_heatabsorber_upgrade = new ItemHeatAbsorberUpgrade(ConfigHandler.idI[31], tabOmega).setUnlocalizedName("tool_heatabsorber_upgrade");
        blank_upgrade = new ItemBlankUpgrade(ConfigHandler.idI[32], tabOmega).setUnlocalizedName("blank_upgrade");
        machine_filter = new ItemMachineFilter(ConfigHandler.idI[34], tabOmega).setUnlocalizedName("machine_filter");
        mixed_rocks = new ItemMixedRocks(ConfigHandler.idI[35], tabOmega).setUnlocalizedName("mixed_rocks");
        mixed_alloy = new ItemMixedAlloy(ConfigHandler.idI[36], tabOmega).setUnlocalizedName("mixed_alloy");
        
        mechanical_helmet = new ItemMechHelmet(ConfigHandler.idI[38], mechanicalArmor, ModLoader.addArmor("mechanical"),0).setUnlocalizedName("mechanical_helmet").setCreativeTab(tabOmega);
        mechanical_chestplate = new ItemMechChestplate(ConfigHandler.idI[39], mechanicalArmor, ModLoader.addArmor("mechanical"),1).setUnlocalizedName("mechanical_chestplate").setCreativeTab(tabOmega);
        mechanical_leggins = new ItemMechLeggins(ConfigHandler.idI[40],  mechanicalArmor, ModLoader.addArmor("mechanical"),2).setUnlocalizedName("mechanical_leggins").setCreativeTab(tabOmega);
        mechanical_boots = new ItemMechBoots(ConfigHandler.idI[41], mechanicalArmor, ModLoader.addArmor("mechanical"),3).setUnlocalizedName("mechanical_boots").setCreativeTab(tabOmega);
        
        // TOOL INIT
        powered_drill = new ItemPoweredDrill(ConfigHandler.idI[33], 2, powerTool).setUnlocalizedName("powered_drill").setCreativeTab(tabOmega);
        wolframite_pickaxe = new ItemWolframitePickaxe(ConfigHandler.idI[37], wolframiteTool).setUnlocalizedName("wolframite_pickaxe").setCreativeTab(tabOmega);
        // REGISTERING VARIABLES
        Block[] OREBlockArray = {wolframite_ore, copper_ore, tin_ore};
        Item[] OREItemArray = {wolframite_ingot, copper_ingot, tin_ingot};
        String[] OREStringArray = {"Wolframite Ore", "Copper Ore", "Tin Ore"};
        Block[] BLOCKBlockArray = {machine_casing, magnetite_ore, electrified_ore, berylium_ore,mosaic,machine_power_interface,machine_power_interface_act,machine_power_interface_cable};
        String[] BLOCKStringArray = {"Machine Casing", "Magnetite Ore", "Electrified Ore", "Berylium Ore","Mosaic","Power Interface","Power Interface","Power Interface"};
        Item[] ITEMItemArray = {induction_coil, raw_silicon_wafer, silicon_wafer, empty_socket, chip, custom_chip, enhanced_chip, advanced_chip, carbonized_iron, steel_ingot, wolframite_dust, wolframite_ingot, gold_dust, iron_dust, copper_ingot, copper_dust, tin_ingot, tin_dust, electrified_crystal, magnetite_crystal, berylium_crystal, machine_speed_upgrade, machine_energy_upgrade, machine_enmatter_upgrade, en_matter, powered_drill, plant_ash, berylium_core};
        String[] ITEMStringArray = {"Induction Coil", "Raw Silicon Wafer", "Silicon Wafer", "Empty Socket", "Basic Chip", "Custom Chip", "Enhanced Chip", "Advanced Chip", "Carbonized Iron", "Steel Ingot", "Wolframite Rocks", "Wolframite Ingot", "Gold Rocks", "Iron Rocks", "Copper Ingot", "Copper Rocks", "Tin Ingot", "Tin Rocks", "Electrified Crystal", "Magnetite Crystal", "Berylium Crystal", "Speed Upgrade [M]", "Energy Upgrade [M]", "EnMatter Upgrade [M]", "En-Matter", "Powered Drill", "Plant Ash", "Berylium Core"};
        Item[] ITEM2ItemArray = {tool_woodcutter_upgrade, tool_silktouch_upgrade, tool_miningspeed_upgrade, tool_heatabsorber_upgrade, blank_upgrade, machine_filter,mixed_rocks,mixed_alloy,wolframite_pickaxe,mechanical_helmet,mechanical_chestplate,mechanical_leggins,mechanical_boots};
        String[] ITEM2StringArray = {"WoodCutter Upgrade [T]", "SilkyTouch Upgrade [T]", "SpeedBooster Upgrade [T]", "Heat Absorber Upgrade [T]", "Blank Upgrade","Machine Filter","Mixed Rocks","Mixed Alloy","Wolframite Pickaxe","Mechanical Helmet","Mechanical Chestplate","Mechanica Leggins","Mechanical Boots"};
        Item[] SITEMItemAArray = {raw_silicon_wafer, carbonized_iron, mixed_rocks};
        Item[] SITEMItemBArray = {silicon_wafer, steel_ingot, mixed_alloy};
        Float[] SITEMFloatArray = {1.0F, 8.0F, 1.0F};
        Block[] MACHBlockArray = {powered_melter_act,powered_melter_idle,power_conduit};
        String[] MACHStringArray = {"Powered Melter A","Powered Melter","Power Conduit"};
        // REGISTERING
        Mar21API.regItem(ITEMItemArray, ITEMStringArray);
        Mar21API.regItem(ITEM2ItemArray, ITEM2StringArray);
        Mar21API.regSmelting(SITEMItemAArray, SITEMItemBArray, SITEMFloatArray);
        Mar21API.regOre(OREBlockArray, OREItemArray, OREStringArray, 1.0F);
        Mar21API.regBlock(BLOCKBlockArray, BLOCKStringArray);
        Mar21API.regBlock(MACHBlockArray, MACHStringArray);
        GameRegistry.registerTileEntity(TE_PoweredMelter.class, "tileentitypoweredmelter");
        GameRegistry.registerTileEntity(TE_PowerConduit.class, "tileentitypowerconduit");
        NetworkRegistry.instance().registerGuiHandler(this, guihandler);
        GameRegistry.registerWorldGenerator(Events);
        GameRegistry.registerFuelHandler(new Mar21FuelHandler());
        GameRegistry.registerCraftingHandler(Mar21CraftingHandler);
        RecipeSheet.registerRecipes();
        ClientRegistry.bindTileEntitySpecialRenderer(TE_PoweredMelter.class, new TE_PoweredMelterRender());
        //MinecraftForgeClient.registerItemRenderer(powered_melter_idle.blockID, new TE_PoweredMelterInvRender());
    }
}