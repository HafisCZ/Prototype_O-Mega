package mar21.omega;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import cpw.mods.fml.common.registry.GameRegistry;

public class RecipeSheet
{
    public static void registerRecipes()
    {
        GameRegistry.addRecipe(new ItemStack(ModCore.raw_silicon_wafer, 2), new Object[]
                               {
                                   " A ", "ABA", " A ", 'A', Block.sand, 'B', Item.coal
                               });
        GameRegistry.addRecipe(new ItemStack(ModCore.induction_coil), new Object[]
                               {
                                   "  A", " B ", "A  ", 'A', Item.redstone, 'B', ModCore.magnetite_crystal
                               });
        GameRegistry.addShapelessRecipe(new ItemStack(ModCore.empty_socket), new Object[]
                               {
                                   Item.ingotIron,
                                   Block.glass,
                               });
        GameRegistry.addShapelessRecipe(new ItemStack(ModCore.mixed_rocks), new Object[]
        					   {
        						ModCore.gold_dust,
        						ModCore.wolframite_dust,
        						ModCore.iron_dust,
        					   });
        GameRegistry.addRecipe(new ItemStack(ModCore.chip), new Object[]
                               {
                                   "DBD", "ECE", "CAC", 'A', ModCore.empty_socket, 'B', ModCore.silicon_wafer, 'C', Item.redstone, 'D', Item.ingotIron, 'E', Block.glass
                               });
        GameRegistry.addRecipe(new ItemStack(ModCore.custom_chip), new Object[]
                               {
                                   "DBD", "ECE", "CAC", 'A', ModCore.empty_socket, 'B', ModCore.silicon_wafer, 'C', Item.redstone, 'D', Item.ingotGold, 'E', Block.glass
                               });
        GameRegistry.addRecipe(new ItemStack(ModCore.enhanced_chip), new Object[]
                               {
                                   "DBD", "ECE", "CAC", 'A', ModCore.empty_socket, 'B', ModCore.silicon_wafer, 'C', Item.redstone, 'D', Item.diamond, 'E', Block.glass
                               });
        GameRegistry.addRecipe(new ItemStack(ModCore.advanced_chip), new Object[]
                               {
                                   "DBD", "ECE", "CAC", 'A', ModCore.empty_socket, 'B', ModCore.silicon_wafer, 'C', Item.redstone, 'D', Item.emerald, 'E', Block.glass
                               });
        GameRegistry.addRecipe(new ItemStack(ModCore.carbonized_iron), new Object[]
                               {
                                   " A ", "ABA", " A ", 'A', Item.coal, 'B', Item.ingotIron
                               });
        GameRegistry.addRecipe(new ItemStack(ModCore.machine_casing), new Object[]
                               {
                                   "ABA", "BCB", "ABA", 'C', ModCore.wolframite_ingot, 'B', ModCore.steel_ingot, 'A', Item.redstone
                               });
        GameRegistry.addRecipe(new ItemStack(ModCore.berylium_core), new Object[]
                               {
                                   " DC", "ABA", "CD ", 'B', ModCore.berylium_crystal, 'C', ModCore.advanced_chip, 'A', ModCore.induction_coil, 'D', Block.obsidian
                               });
        GameRegistry.addRecipe(new ItemStack(ModCore.powered_drill), new Object[]
                               {
                                   "ABE", "BAD", " CC", 'A', ModCore.induction_coil, 'B', ModCore.wolframite_ingot, 'C', ModCore.steel_ingot, 'D', ModCore.berylium_core, 'E', ModCore.electrified_crystal
                               });
        GameRegistry.addRecipe(new ItemStack(ModCore.blank_upgrade), new Object[]
                               {
                                   "AAA", "ABA", "AAA", 'A', Item.paper, 'B', ModCore.empty_socket
                               });
        GameRegistry.addRecipe(new ItemStack(ModCore.tool_woodcutter_upgrade), new Object[]
                               {
                                   "A", "B", "C", 'A', Item.axeDiamond, 'B', ModCore.chip, 'C', ModCore.blank_upgrade
                               });
        GameRegistry.addRecipe(new ItemStack(ModCore.tool_heatabsorber_upgrade), new Object[]
                               {
                                   "A", "B", "C", 'A', Item.netherStar, 'B', ModCore.advanced_chip, 'C', ModCore.blank_upgrade
                               });
        GameRegistry.addRecipe(new ItemStack(ModCore.machine_energy_upgrade), new Object[]
                               {
                                   "A", "B", "C", 'A', ModCore.electrified_crystal, 'B', ModCore.custom_chip, 'C', ModCore.blank_upgrade
                               });
        GameRegistry.addRecipe(new ItemStack(ModCore.wolframite_pickaxe), new Object[]{
        	"AAA"," B "," C ",'A',ModCore.wolframite_ingot, 'B',Item.pickaxeIron,'C',Item.stick});
    }
}