package mar21.omega.api;

import java.lang.reflect.Constructor;
import java.util.logging.Level;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;

import mar21.omega.ModCore;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.LoaderException;
import cpw.mods.fml.common.LoaderState;
import cpw.mods.fml.common.ModContainer;
import cpw.mods.fml.common.registry.BlockProxy;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class Mar21API
{
	/**
	  Minecraft modding m2cAPI created by mar21
	  Easy way to make code short and compact
	  You can use this m2cAPI if you have in mod description:
	   This mod is using the m2cAPI by mar21
	  Or anything similary to this. Thanks !
	  
	  For Minecraft: 1.6.X
	  And Minecraft Forge, FML, MCP
	**/
    // Block LanguageRegistry and GameRegistry //TODO
    public static void regBlock(Block par1Block, String par2String)
    {
        GameRegistry.registerBlock(par1Block, ModCore.modid + par1Block.getUnlocalizedName().substring(5));
        LanguageRegistry.addName(par1Block, par2String);
    }
    public static void regBlock(Block[] par1BlockArray, String[] par2StringArray)
    {
        if (par1BlockArray.length == par2StringArray.length)
        {
        	for (int i = 0; i < par1BlockArray.length; i++)
        	{
            	GameRegistry.registerBlock(par1BlockArray[i], ModCore.modid + par1BlockArray[i].getUnlocalizedName().substring(5));
            	LanguageRegistry.addName(par1BlockArray[i], par2StringArray[i]);
        	}
        }
    }
    
    // Item LanguageRegistry //TODO
    public static void regItem(Item par1Item, String par2String)
    {
        LanguageRegistry.addName(par1Item, par2String);
    }
    public static void regItem(Item[] par1ItemArray, String[] par2StringArray)
    {
        if (par1ItemArray.length == par2StringArray.length);
        {
        	for (int i = 0; i < par1ItemArray.length; i++)
        	{
        		LanguageRegistry.addName(par1ItemArray[i], par2StringArray[i]);
        	}
        }
    }
    
    // Item and Block FurnaceRecipes.addSmelting() via Block //TODO

    public static void regSmelting(Block par1Block, Item par2Item, Float par3Float)
    {
        FurnaceRecipes.smelting().addSmelting(par1Block.blockID, new ItemStack(par2Item), par3Float);
    }
    public static void regSmelting(Block par1Block, Block par2Block, Float par3Float)
    {
        FurnaceRecipes.smelting().addSmelting(par1Block.blockID, new ItemStack(par2Block), par3Float);
    }
    public static void regSmelting(Block[] par1BlockArray, Item[] par2ItemArray, Float[] par3FloatArray)
    {
        if (par1BlockArray.length == par2ItemArray.length);
        {
        	for (int i = 0; i < par1BlockArray.length; i++)
        	{
            	FurnaceRecipes.smelting().addSmelting(par1BlockArray[i].blockID, new ItemStack(par2ItemArray[i]), par3FloatArray[i]);
        	}
        }
    }
    public static void regSmelting(Block[] par1BlockArray, Item[] par2ItemArray, Float par3Float)
    {
        if (par1BlockArray.length == par2ItemArray.length);
        {
        	for (int i = 0; i < par1BlockArray.length; i++)
        	{
            	FurnaceRecipes.smelting().addSmelting(par1BlockArray[i].blockID, new ItemStack(par2ItemArray[i]), par3Float);
        	}
        }
    }
    public static void regSmelting(Block[] par1BlockArray, Block[] par2BlockArray, Float[] par3FloatArray)
    {
        if (par1BlockArray.length == par2BlockArray.length);
        {
        	for (int i = 0; i < par1BlockArray.length; i++)
        	{
            	FurnaceRecipes.smelting().addSmelting(par1BlockArray[i].blockID, new ItemStack(par2BlockArray[i]), par3FloatArray[i]);
        	}
        }
    }
    public static void regSmelting(Block[] par1BlockArray, Block[] par2BlockArray, Float par3Float)
    {
        if (par1BlockArray.length == par2BlockArray.length);
        {
        	for (int i = 0; i < par1BlockArray.length; i++)
        	{
            	FurnaceRecipes.smelting().addSmelting(par1BlockArray[i].blockID, new ItemStack(par2BlockArray[i]), par3Float);
        	}
        }
    }
    
    // Item and Block FurnaceRecipes.addSmelting() via Item //TODO
    public static void regSmelting(Item par1Item, Item par2Item, Float par3Float)
    {
        FurnaceRecipes.smelting().addSmelting(par1Item.itemID, new ItemStack(par2Item), par3Float);
    }
    public static void regSmelting(Item par1Item, Block par2Block, Float par3Float)
    {
        FurnaceRecipes.smelting().addSmelting(par1Item.itemID, new ItemStack(par2Block), par3Float);
    }
    public static void regSmelting(Item[] par1ItemArray, Item[] par2ItemArray, Float[] par3FloatArray)
    {
        if (par1ItemArray.length == par2ItemArray.length);
        {
        	for (int i = 0; i < par1ItemArray.length; i++)
        	{
            	FurnaceRecipes.smelting().addSmelting(par1ItemArray[i].itemID, new ItemStack(par2ItemArray[i]), par3FloatArray[i]);
        	}
        }
    }
    public static void regSmelting(Item[] par1ItemArray, Item[] par2ItemArray, Float par3Float)
    {
        if (par1ItemArray.length == par2ItemArray.length);
        {
        	for (int i = 0; i < par1ItemArray.length; i++)
        	{
            	FurnaceRecipes.smelting().addSmelting(par1ItemArray[i].itemID, new ItemStack(par2ItemArray[i]), par3Float);
        	}
        }
    }
    public static void regSmelting(Item[] par1ItemArray, Block[] par2BlockArray, Float[] par3FloatArray)
    {
        if (par1ItemArray.length == par2BlockArray.length);
        {
        	for (int i = 0; i < par1ItemArray.length; i++)
        	{
            	FurnaceRecipes.smelting().addSmelting(par1ItemArray[i].itemID, new ItemStack(par2BlockArray[i]), par3FloatArray[i]);
        	}
        }
    }
    public static void regSmelting(Item[] par1ItemArray, Block[] par2BlockArray, Float par3Float)
    {
        if (par1ItemArray.length == par2BlockArray.length);
        {
        	for (int i = 0; i < par1ItemArray.length; i++)
        	{
            	FurnaceRecipes.smelting().addSmelting(par1ItemArray[i].itemID, new ItemStack(par2BlockArray[i]), par3Float);
        	}
        }
    }
    
    // Item and Block FurnaceRecipes.addSmelting() via Item (With Ammount) //TODO
    
    // Item and Block FurnaceRecipes.addSmelting() via Block (With Ammount) //TODO
    public static void regSmelting(Item par1Item, Item par2Item, Float par3Float, int par4Int, int par5Int)
    {
        FurnaceRecipes.smelting().addSmelting(par1Item.itemID, new ItemStack(par2Item, par4Int, par5Int), par3Float);
    }
    public static void regSmelting(Item par1Item, Block par2Block, Float par3Float, int par4Int, int par5Int)
    {
        FurnaceRecipes.smelting().addSmelting(par1Item.itemID, new ItemStack(par2Block, par4Int, par5Int), par3Float);
    }
    public static void regSmelting(Item[] par1ItemArray, Item[] par2ItemArray, Float[] par3FloatArray, int par4Int, int par5Int)
    {
        if (par1ItemArray.length == par2ItemArray.length);
        {
        	for (int i = 0; i < par1ItemArray.length; i++)
        	{
            	FurnaceRecipes.smelting().addSmelting(par1ItemArray[i].itemID, new ItemStack(par2ItemArray[i], par4Int, par5Int), par3FloatArray[i]);
        	}
        }
    }
    public static void regSmelting(Item[] par1ItemArray, Item[] par2ItemArray, Float[] par3FloatArray, int[] par4IntArray, int par5Int)
    {
        if (par1ItemArray.length == par2ItemArray.length);
        {
        	for (int i = 0; i < par1ItemArray.length; i++)
        	{
            	FurnaceRecipes.smelting().addSmelting(par1ItemArray[i].itemID, new ItemStack(par2ItemArray[i], par4IntArray[i], par5Int), par3FloatArray[i]);
        	}
        }
    }
    public static void regSmelting(Item[] par1ItemArray, Item[] par2ItemArray, Float[] par3FloatArray, int par4Int, int[] par5IntArray)
    {
        if (par1ItemArray.length == par2ItemArray.length);
        {
        	for (int i = 0; i < par1ItemArray.length; i++)
        	{
            	FurnaceRecipes.smelting().addSmelting(par1ItemArray[i].itemID, new ItemStack(par2ItemArray[i], par4Int, par5IntArray[i]), par3FloatArray[i]);
        	}
        }
    }
    public static void regSmelting(Item[] par1ItemArray, Item[] par2ItemArray, Float[] par3FloatArray, int[] par4IntArray, int[] par5IntArray)
    {
        if (par1ItemArray.length == par2ItemArray.length);
        {
        	for (int i = 0; i < par1ItemArray.length; i++)
        	{
            	FurnaceRecipes.smelting().addSmelting(par1ItemArray[i].itemID, new ItemStack(par2ItemArray[i], par4IntArray[i], par5IntArray[i]), par3FloatArray[i]);
        	}
        }
    }
    public static void regSmelting(Item[] par1ItemArray, Item[] par2ItemArray, Float par3Float, int par4Int, int par5Int)
    {
        if (par1ItemArray.length == par2ItemArray.length);
        {
        	for (int i = 0; i < par1ItemArray.length; i++)
        	{
            	FurnaceRecipes.smelting().addSmelting(par1ItemArray[i].itemID, new ItemStack(par2ItemArray[i]), par3Float);
        	}
        }
    }
    public static void regSmelting(Item[] par1ItemArray, Item[] par2ItemArray, Float par3Float, int[] par4IntArray, int par5Int)
    {
        if (par1ItemArray.length == par2ItemArray.length);
        {
        	for (int i = 0; i < par1ItemArray.length; i++)
        	{
            	FurnaceRecipes.smelting().addSmelting(par1ItemArray[i].itemID, new ItemStack(par2ItemArray[i], par4IntArray[i], par5Int), par3Float);
        	}
        }
    }
    public static void regSmelting(Item[] par1ItemArray, Item[] par2ItemArray, Float par3Float, int par4Int, int[] par5IntArray)
    {
        if (par1ItemArray.length == par2ItemArray.length);
        {
        	for (int i = 0; i < par1ItemArray.length; i++)
        	{
            	FurnaceRecipes.smelting().addSmelting(par1ItemArray[i].itemID, new ItemStack(par2ItemArray[i], par4Int, par5IntArray[i]), par3Float);
        	}
        }
    }
    public static void regSmelting(Item[] par1ItemArray, Item[] par2ItemArray, Float par3Float, int[] par4IntArray, int[] par5IntArray)
    {
        if (par1ItemArray.length == par2ItemArray.length);
        {
        	for (int i = 0; i < par1ItemArray.length; i++)
        	{
            	FurnaceRecipes.smelting().addSmelting(par1ItemArray[i].itemID, new ItemStack(par2ItemArray[i], par4IntArray[i], par5IntArray[i]), par3Float);
        	}
        }
    }
    public static void regSmelting(Item[] par1ItemArray, Block[] par2BlockArray, Float[] par3FloatArray, int par4Int, int par5Int)
    {
        if (par1ItemArray.length == par2BlockArray.length);
        {
        	for (int i = 0; i < par1ItemArray.length; i++)
        	{
            	FurnaceRecipes.smelting().addSmelting(par1ItemArray[i].itemID, new ItemStack(par2BlockArray[i], par4Int, par5Int), par3FloatArray[i]);
        	}
        }
    }
    public static void regSmelting(Item[] par1ItemArray, Block[] par2BlockArray, Float[] par3FloatArray, int[] par4IntArray, int par5Int)
    {
        if (par1ItemArray.length == par2BlockArray.length);
        {
        	for (int i = 0; i < par1ItemArray.length; i++)
        	{
            	FurnaceRecipes.smelting().addSmelting(par1ItemArray[i].itemID, new ItemStack(par2BlockArray[i], par4IntArray[i], par5Int), par3FloatArray[i]);
        	}
        }
    }
    public static void regSmelting(Item[] par1ItemArray, Block[] par2BlockArray, Float[] par3FloatArray, int[] par4IntArray, int[] par5IntArray)
    {
        if (par1ItemArray.length == par2BlockArray.length);
        {
        	for (int i = 0; i < par1ItemArray.length; i++)
        	{
            	FurnaceRecipes.smelting().addSmelting(par1ItemArray[i].itemID, new ItemStack(par2BlockArray[i], par4IntArray[i], par5IntArray[i]), par3FloatArray[i]);
        	}
        }
    }
    public static void regSmelting(Item[] par1ItemArray, Block[] par2BlockArray, Float[] par3FloatArray, int par4Int, int[] par5IntArray)
    {
        if (par1ItemArray.length == par2BlockArray.length);
        {
        	for (int i = 0; i < par1ItemArray.length; i++)
        	{
            	FurnaceRecipes.smelting().addSmelting(par1ItemArray[i].itemID, new ItemStack(par2BlockArray[i], par4Int, par5IntArray[i]), par3FloatArray[i]);
        	}
        }
    }

    public static void regSmelting(Item[] par1ItemArray, Block[] par2BlockArray, Float par3Float, int par4Int, int par5Int)
    {
        if (par1ItemArray.length == par2BlockArray.length);
        {
        	for (int i = 0; i < par1ItemArray.length; i++)
        	{
            	FurnaceRecipes.smelting().addSmelting(par1ItemArray[i].itemID, new ItemStack(par2BlockArray[i], par4Int, par5Int), par3Float);
        	}
        }
    }
    public static void regSmelting(Item[] par1ItemArray, Block[] par2BlockArray, Float par3Float, int[] par4IntArray, int par5Int)
    {
        if (par1ItemArray.length == par2BlockArray.length);
        {
        	for (int i = 0; i < par1ItemArray.length; i++)
        	{
            	FurnaceRecipes.smelting().addSmelting(par1ItemArray[i].itemID, new ItemStack(par2BlockArray[i], par4IntArray[i], par5Int), par3Float);
        	}
        }
    }
    public static void regSmelting(Item[] par1ItemArray, Block[] par2BlockArray, Float par3Float, int[] par4IntArray, int[] par5IntArray)
    {
        if (par1ItemArray.length == par2BlockArray.length);
        {
        	for (int i = 0; i < par1ItemArray.length; i++)
        	{
            	FurnaceRecipes.smelting().addSmelting(par1ItemArray[i].itemID, new ItemStack(par2BlockArray[i], par4IntArray[i], par5IntArray[i]), par3Float);
        	}
        }
    }
    public static void regSmelting(Item[] par1ItemArray, Block[] par2BlockArray, Float par3Float, int par4Int, int[] par5IntArray)
    {
        if (par1ItemArray.length == par2BlockArray.length);
        {
        	for (int i = 0; i < par1ItemArray.length; i++)
        	{
            	FurnaceRecipes.smelting().addSmelting(par1ItemArray[i].itemID, new ItemStack(par2BlockArray[i], par4Int, par5IntArray[i]), par3Float);
        	}
        }
    }
    // Ore LanguageRegistry,GameRegistry and smelting recipe into item or block //TODO
    public static void regOre(Block par1Block, Block par2Block, String par3String, Float par4Float)
    {
        GameRegistry.registerBlock(par1Block, ModCore.modid + par1Block.getUnlocalizedName().substring(5));
        LanguageRegistry.addName(par1Block, par3String);
        FurnaceRecipes.smelting().addSmelting(par1Block.blockID, new ItemStack(par2Block), par4Float);
    }
    public static void regOre(Block par1Block, Item par2Item, String par3String, Float par4Float)
    {
        GameRegistry.registerBlock(par1Block, ModCore.modid + par1Block.getUnlocalizedName().substring(5));
        LanguageRegistry.addName(par1Block, par3String);
        FurnaceRecipes.smelting().addSmelting(par1Block.blockID, new ItemStack(par2Item), par4Float);
    }
    public static void regOre(Block[] par1BlockArray, Block[] par2BlockArray, String[] par3StringArray, Float[] par4FloatArray)
    {
        if (par1BlockArray.length == par2BlockArray.length)
        {
        	for (int i = 0; i < par1BlockArray.length; i++)
        	{
           	 	GameRegistry.registerBlock(par1BlockArray[i], ModCore.modid + par1BlockArray[i].getUnlocalizedName().substring(5));
           	 	LanguageRegistry.addName(par1BlockArray[i], par3StringArray[i]);
           	 	FurnaceRecipes.smelting().addSmelting(par1BlockArray[i].blockID, new ItemStack(par2BlockArray[i]), par4FloatArray[i]);
        	}
    	}
    }
    public static void regOre(Block[] par1BlockArray, Block[] par2BlockArray, String[] par3StringArray, Float par4Float)
    {
        if (par1BlockArray.length == par2BlockArray.length)
        {
        	for (int i = 0; i < par1BlockArray.length; i++)
        	{
        		GameRegistry.registerBlock(par1BlockArray[i], ModCore.modid + par1BlockArray[i].getUnlocalizedName().substring(5));
        		LanguageRegistry.addName(par1BlockArray[i], par3StringArray[i]);
        		FurnaceRecipes.smelting().addSmelting(par1BlockArray[i].blockID, new ItemStack(par2BlockArray[i]), par4Float);
        	}
        }
    }
    public static void regOre(Block[] par1BlockArray, Item[] par2ItemArray, String[] par3StringArray, Float[] par4FloatArray)
    {
        if (par1BlockArray.length == par2ItemArray.length)
        {
        	for (int i = 0; i < par1BlockArray.length; i++)
        	{
        		GameRegistry.registerBlock(par1BlockArray[i], ModCore.modid + par1BlockArray[i].getUnlocalizedName().substring(5));
        		LanguageRegistry.addName(par1BlockArray[i], par3StringArray[i]);
        		FurnaceRecipes.smelting().addSmelting(par1BlockArray[i].blockID, new ItemStack(par2ItemArray[i]), par4FloatArray[i]);
        	}
    	}
    }
    public static void regOre(Block[] par1BlockArray, Item[] par2ItemArray, String[] par3StringArray, Float par4Float)
    {
        if (par1BlockArray.length == par2ItemArray.length)
        {
        	for (int i = 0; i < par1BlockArray.length; i++)
        	{
        		GameRegistry.registerBlock(par1BlockArray[i], ModCore.modid + par1BlockArray[i].getUnlocalizedName().substring(5));
        		LanguageRegistry.addName(par1BlockArray[i], par3StringArray[i]);
        		FurnaceRecipes.smelting().addSmelting(par1BlockArray[i].blockID, new ItemStack(par2ItemArray[i]), par4Float);
        	}
        }
    }
    // Ore LanguageRegistry,GameRegistry and toggleable smelting recipe into item or block - boolean //TODO
    public static void regOre(Block par1Block, Block par2Block, String par3String, Float par4Float, Boolean par5Boolean)
    {
        GameRegistry.registerBlock(par1Block, ModCore.modid + par1Block.getUnlocalizedName().substring(5));
        LanguageRegistry.addName(par1Block, par3String);
        if(par5Boolean == true)
        {
        	FurnaceRecipes.smelting().addSmelting(par1Block.blockID, new ItemStack(par2Block), par4Float);	
        }
    }
    public static void regOre(Block par1Block, Item par2Item, String par3String, Float par4Float, Boolean par5Boolean)
    {
        GameRegistry.registerBlock(par1Block, ModCore.modid + par1Block.getUnlocalizedName().substring(5));
        LanguageRegistry.addName(par1Block, par3String);
        if(par5Boolean == true)
        {
        	FurnaceRecipes.smelting().addSmelting(par1Block.blockID, new ItemStack(par2Item), par4Float);
        }
    }
    public static void regOre(Block[] par1BlockArray, Block[] par2BlockArray, String[] par3StringArray, Float[] par4FloatArray, Boolean par5Boolean)
    {
        if (par1BlockArray.length == par2BlockArray.length)
        {
        	for (int i = 0; i < par1BlockArray.length; i++)
        	{
           	 	GameRegistry.registerBlock(par1BlockArray[i], ModCore.modid + par1BlockArray[i].getUnlocalizedName().substring(5));
           	 	LanguageRegistry.addName(par1BlockArray[i], par3StringArray[i]);
           	 	if(par5Boolean == true)
           	 	{
           	 	FurnaceRecipes.smelting().addSmelting(par1BlockArray[i].blockID, new ItemStack(par2BlockArray[i]), par4FloatArray[i]);
           	 	}
        	}
    	}
    }
    public static void regOre(Block[] par1BlockArray, Block[] par2BlockArray, String[] par3StringArray, Float[] par4FloatArray, Boolean[] par5BooleanArray)
    {
        if (par1BlockArray.length == par2BlockArray.length)
        {
        	for (int i = 0; i < par1BlockArray.length; i++)
        	{
           	 	GameRegistry.registerBlock(par1BlockArray[i], ModCore.modid + par1BlockArray[i].getUnlocalizedName().substring(5));
           	 	LanguageRegistry.addName(par1BlockArray[i], par3StringArray[i]);
           	 	if(par5BooleanArray[i] == true)
           	 	{
           	 	FurnaceRecipes.smelting().addSmelting(par1BlockArray[i].blockID, new ItemStack(par2BlockArray[i]), par4FloatArray[i]);
           	 	}
        	}
    	}
    }
    public static void regOre(Block[] par1BlockArray, Block[] par2BlockArray, String[] par3StringArray, Float par4Float, Boolean par5Boolean)
    {
        if (par1BlockArray.length == par2BlockArray.length)
        {
        	for (int i = 0; i < par1BlockArray.length; i++)
        	{
        		GameRegistry.registerBlock(par1BlockArray[i], ModCore.modid + par1BlockArray[i].getUnlocalizedName().substring(5));
        		LanguageRegistry.addName(par1BlockArray[i], par3StringArray[i]);
        		if(par5Boolean == true)
        		{
        			FurnaceRecipes.smelting().addSmelting(par1BlockArray[i].blockID, new ItemStack(par2BlockArray[i]), par4Float);
        		}
        	}
        }
    }
    public static void regOre(Block[] par1BlockArray, Block[] par2BlockArray, String[] par3StringArray, Float par4Float, Boolean[] par5BooleanArray)
    {
        if (par1BlockArray.length == par2BlockArray.length)
        {
        	for (int i = 0; i < par1BlockArray.length; i++)
        	{
        		GameRegistry.registerBlock(par1BlockArray[i], ModCore.modid + par1BlockArray[i].getUnlocalizedName().substring(5));
        		LanguageRegistry.addName(par1BlockArray[i], par3StringArray[i]);
        		if(par5BooleanArray[i] == true)
        		{
        			FurnaceRecipes.smelting().addSmelting(par1BlockArray[i].blockID, new ItemStack(par2BlockArray[i]), par4Float);
        		}
        	}
        }
    }
    public static void regOre(Block[] par1BlockArray, Item[] par2ItemArray, String[] par3StringArray, Float[] par4FloatArray, Boolean par5Boolean)
    {
        if (par1BlockArray.length == par2ItemArray.length)
        {
        	for (int i = 0; i < par1BlockArray.length; i++)
        	{
        		GameRegistry.registerBlock(par1BlockArray[i], ModCore.modid + par1BlockArray[i].getUnlocalizedName().substring(5));
        		LanguageRegistry.addName(par1BlockArray[i], par3StringArray[i]);
        		if(par5Boolean == true)
        		{
        			FurnaceRecipes.smelting().addSmelting(par1BlockArray[i].blockID, new ItemStack(par2ItemArray[i]), par4FloatArray[i]);
        		}
        	}
    	}
    }
    public static void regOre(Block[] par1BlockArray, Item[] par2ItemArray, String[] par3StringArray, Float[] par4FloatArray, Boolean[] par5BooleanArray)
    {
        if (par1BlockArray.length == par2ItemArray.length)
        {
        	for (int i = 0; i < par1BlockArray.length; i++)
        	{
        		GameRegistry.registerBlock(par1BlockArray[i], ModCore.modid + par1BlockArray[i].getUnlocalizedName().substring(5));
        		LanguageRegistry.addName(par1BlockArray[i], par3StringArray[i]);
        		if(par5BooleanArray[i] == true)
        		{
        			FurnaceRecipes.smelting().addSmelting(par1BlockArray[i].blockID, new ItemStack(par2ItemArray[i]), par4FloatArray[i]);
        		}
        	}
    	}
    }
    public static void regOre(Block[] par1BlockArray, Item[] par2ItemArray, String[] par3StringArray, Float par4Float, Boolean par5Boolean)
    {
        if (par1BlockArray.length == par2ItemArray.length)
        {
        	for (int i = 0; i < par1BlockArray.length; i++)
        	{
        		GameRegistry.registerBlock(par1BlockArray[i], ModCore.modid + par1BlockArray[i].getUnlocalizedName().substring(5));
        		LanguageRegistry.addName(par1BlockArray[i], par3StringArray[i]);
        		if(par5Boolean == true)
        		{
        			FurnaceRecipes.smelting().addSmelting(par1BlockArray[i].blockID, new ItemStack(par2ItemArray[i]), par4Float);
        		}
        	}
        }
    }
    public static void regOre(Block[] par1BlockArray, Item[] par2ItemArray, String[] par3StringArray, Float par4Float, Boolean[] par5BooleanArray)
    {
        if (par1BlockArray.length == par2ItemArray.length)
        {
        	for (int i = 0; i < par1BlockArray.length; i++)
        	{
        		GameRegistry.registerBlock(par1BlockArray[i], ModCore.modid + par1BlockArray[i].getUnlocalizedName().substring(5));
        		LanguageRegistry.addName(par1BlockArray[i], par3StringArray[i]);
        		if(par5BooleanArray[i] == true)
        		{
        			FurnaceRecipes.smelting().addSmelting(par1BlockArray[i].blockID, new ItemStack(par2ItemArray[i]), par4Float);
        		}
        	}
        }
    }
    // Ore LanguageRegistry,GameRegistry and toggleable smelting recipe into item or block -integer //TODO
    public static void regOre(Block par1Block, Block par2Block, String par3String, Float par4Float, int par5Int)
    {
        GameRegistry.registerBlock(par1Block, ModCore.modid + par1Block.getUnlocalizedName().substring(5));
        LanguageRegistry.addName(par1Block, par3String);
        if(par5Int == 1)
        {
        	FurnaceRecipes.smelting().addSmelting(par1Block.blockID, new ItemStack(par2Block), par4Float);	
        }
    }
    public static void regOre(Block par1Block, Item par2Item, String par3String, Float par4Float, int par5Int)
    {
        GameRegistry.registerBlock(par1Block, ModCore.modid + par1Block.getUnlocalizedName().substring(5));
        LanguageRegistry.addName(par1Block, par3String);
        if(par5Int == 1)
        {
        	FurnaceRecipes.smelting().addSmelting(par1Block.blockID, new ItemStack(par2Item), par4Float);
        }
    }
    public static void regOre(Block[] par1BlockArray, Block[] par2BlockArray, String[] par3StringArray, Float[] par4FloatArray, int par5Int)
    {
        if (par1BlockArray.length == par2BlockArray.length)
        {
        	for (int i = 0; i < par1BlockArray.length; i++)
        	{
           	 	GameRegistry.registerBlock(par1BlockArray[i], ModCore.modid + par1BlockArray[i].getUnlocalizedName().substring(5));
           	 	LanguageRegistry.addName(par1BlockArray[i], par3StringArray[i]);
           	 	if(par5Int == 1)
           	 	{
           	 	FurnaceRecipes.smelting().addSmelting(par1BlockArray[i].blockID, new ItemStack(par2BlockArray[i]), par4FloatArray[i]);
           	 	}
        	}
    	}
    }
    public static void regOre(Block[] par1BlockArray, Block[] par2BlockArray, String[] par3StringArray, Float[] par4FloatArray, int[] par5IntArray)
    {
        if (par1BlockArray.length == par2BlockArray.length)
        {
        	for (int i = 0; i < par1BlockArray.length; i++)
        	{
           	 	GameRegistry.registerBlock(par1BlockArray[i], ModCore.modid + par1BlockArray[i].getUnlocalizedName().substring(5));
           	 	LanguageRegistry.addName(par1BlockArray[i], par3StringArray[i]);
           	 	if(par5IntArray[i] == 1)
           	 	{
           	 	FurnaceRecipes.smelting().addSmelting(par1BlockArray[i].blockID, new ItemStack(par2BlockArray[i]), par4FloatArray[i]);
           	 	}
        	}
    	}
    }
    public static void regOre(Block[] par1BlockArray, Block[] par2BlockArray, String[] par3StringArray, Float par4Float, int par5Int)
    {
        if (par1BlockArray.length == par2BlockArray.length)
        {
        	for (int i = 0; i < par1BlockArray.length; i++)
        	{
        		GameRegistry.registerBlock(par1BlockArray[i], ModCore.modid + par1BlockArray[i].getUnlocalizedName().substring(5));
        		LanguageRegistry.addName(par1BlockArray[i], par3StringArray[i]);
        		if(par5Int == 1)
        		{
        			FurnaceRecipes.smelting().addSmelting(par1BlockArray[i].blockID, new ItemStack(par2BlockArray[i]), par4Float);
        		}
        	}
        }
    }
    public static void regOre(Block[] par1BlockArray, Block[] par2BlockArray, String[] par3StringArray, Float par4Float, int[] par5IntArray)
    {
        if (par1BlockArray.length == par2BlockArray.length)
        {
        	for (int i = 0; i < par1BlockArray.length; i++)
        	{
        		GameRegistry.registerBlock(par1BlockArray[i], ModCore.modid + par1BlockArray[i].getUnlocalizedName().substring(5));
        		LanguageRegistry.addName(par1BlockArray[i], par3StringArray[i]);
        		if(par5IntArray[i] == 1)
        		{
        			FurnaceRecipes.smelting().addSmelting(par1BlockArray[i].blockID, new ItemStack(par2BlockArray[i]), par4Float);
        		}
        	}
        }
    }
    public static void regOre(Block[] par1BlockArray, Item[] par2ItemArray, String[] par3StringArray, Float[] par4FloatArray, int par5Int)
    {
        if (par1BlockArray.length == par2ItemArray.length)
        {
        	for (int i = 0; i < par1BlockArray.length; i++)
        	{
        		GameRegistry.registerBlock(par1BlockArray[i], ModCore.modid + par1BlockArray[i].getUnlocalizedName().substring(5));
        		LanguageRegistry.addName(par1BlockArray[i], par3StringArray[i]);
        		if(par5Int == 1)
        		{
        			FurnaceRecipes.smelting().addSmelting(par1BlockArray[i].blockID, new ItemStack(par2ItemArray[i]), par4FloatArray[i]);
        		}
        	}
    	}
    }
    public static void regOre(Block[] par1BlockArray, Item[] par2ItemArray, String[] par3StringArray, Float[] par4FloatArray, int[] par5IntArray)
    {
        if (par1BlockArray.length == par2ItemArray.length)
        {
        	for (int i = 0; i < par1BlockArray.length; i++)
        	{
        		GameRegistry.registerBlock(par1BlockArray[i], ModCore.modid + par1BlockArray[i].getUnlocalizedName().substring(5));
        		LanguageRegistry.addName(par1BlockArray[i], par3StringArray[i]);
        		if(par5IntArray[i] == 1)
        		{
        			FurnaceRecipes.smelting().addSmelting(par1BlockArray[i].blockID, new ItemStack(par2ItemArray[i]), par4FloatArray[i]);
        		}
        	}
    	}
    }
    public static void regOre(Block[] par1BlockArray, Item[] par2ItemArray, String[] par3StringArray, Float par4Float, int par5Int)
    {
        if (par1BlockArray.length == par2ItemArray.length)
        {
        	for (int i = 0; i < par1BlockArray.length; i++)
        	{
        		GameRegistry.registerBlock(par1BlockArray[i], ModCore.modid + par1BlockArray[i].getUnlocalizedName().substring(5));
        		LanguageRegistry.addName(par1BlockArray[i], par3StringArray[i]);
        		if(par5Int == 1)
        		{
        			FurnaceRecipes.smelting().addSmelting(par1BlockArray[i].blockID, new ItemStack(par2ItemArray[i]), par4Float);
        		}
        	}
        }
    }
    public static void regOre(Block[] par1BlockArray, Item[] par2ItemArray, String[] par3StringArray, Float par4Float, int[] par5IntArray)
    {
        if (par1BlockArray.length == par2ItemArray.length)
        {
        	for (int i = 0; i < par1BlockArray.length; i++)
        	{
        		GameRegistry.registerBlock(par1BlockArray[i], ModCore.modid + par1BlockArray[i].getUnlocalizedName().substring(5));
        		LanguageRegistry.addName(par1BlockArray[i], par3StringArray[i]);
        		if(par5IntArray[i] == 1)
        		{
        			FurnaceRecipes.smelting().addSmelting(par1BlockArray[i].blockID, new ItemStack(par2ItemArray[i]), par4Float);
        		}
        	}
        }
    }
    
    // Metadata LanguageRegistry //TODO
    public static void regMeta(Block[] par1BlockArray,String[] par2StringArray)
    {
    	if(par1BlockArray.length == par2StringArray.length)
    	{
    		for(int i = 0; i < par1BlockArray.length ; i++)
    		{
    			LanguageRegistry.addName(new ItemStack(par1BlockArray[i], 1, i), par2StringArray[i]);
    		}
    	}
    }
    public static void regMeta(Item[] par1ItemArray,String[] par2StringArray)
    {
    	if(par1ItemArray.length == par2StringArray.length)
    	{
    		for(int i = 0; i < par1ItemArray.length ; i++)
    		{
    			LanguageRegistry.addName(new ItemStack(par1ItemArray[i], 1, i), par2StringArray[i]);
    		}
    	}
    }
    // Simple .setCreativeTab() //TODO
    public static void regTab(Block par1Block, CreativeTabs par1CreativeTab)
    {
        par1Block.setCreativeTab(par1CreativeTab);
    }
    public static void regTab(Item par1Item, CreativeTabs par1CreativeTab)
    {
        par1Item.setCreativeTab(par1CreativeTab);
    }
    public static void regTab(Block[] par1BlockArray, CreativeTabs par1CreativeTab)
    {
        for (int i = 0; i < par1BlockArray.length; i++)
        {
            par1BlockArray[i].setCreativeTab(par1CreativeTab);
        }
    }
    public static void regTab(Item[] par1ItemArray, CreativeTabs par1CreativeTab)
    {
        for (int i = 0; i < par1ItemArray.length; i++)
        {
            par1ItemArray[i].setCreativeTab(par1CreativeTab);
        }
    }
    public static void regTab(Block[] par1BlockArray, CreativeTabs[] par1CreativeTabArray)
    {
        for (int i = 0; i < par1BlockArray.length; i++)
        {
            par1BlockArray[i].setCreativeTab(par1CreativeTabArray[i]);
        }
    }
    public static void regTab(Item[] par1ItemArray, CreativeTabs[] par1CreativeTabArray)
    {
        for (int i = 0; i < par1ItemArray.length; i++)
        {
            par1ItemArray[i].setCreativeTab(par1CreativeTabArray[i]);
        }
    }
    // Toggleable .setCreativeTab() - boolean //TODO
    public static void regTab(Block par1Block, CreativeTabs par2Tab, Boolean par3Boolean)
    {
    	if(par3Boolean == true)
    	{
    		par1Block.setCreativeTab(par2Tab);
    	}
    }
    public static void regTab(Item par1Item, CreativeTabs par2Tab, Boolean par3Boolean)
    {
    	if(par3Boolean == true)
    	{
    		par1Item.setCreativeTab(par2Tab);
    	}
    }
    public static void regTab(Item[] par1ItemArray, CreativeTabs par2Tab, Boolean par3Boolean)
    {
    	for(int i = 0; i < par1ItemArray.length ; i++)
    		{
    		if(par3Boolean == true)
    			{
    			par1ItemArray[i].setCreativeTab(par2Tab);	
    			}
    		}
    }
    public static void regTab(Block[] par1BlockArray, CreativeTabs par2Tab, Boolean par3Boolean)
    {
    	for(int i = 0; i < par1BlockArray.length ; i++)
		{
			if(par3Boolean == true)
			{
				par1BlockArray[i].setCreativeTab(par2Tab);
			}
		}
    }
    public static void regTab(Block[] par1BlockArray, CreativeTabs par2Tab, Boolean[] par3BooleanArray)
    {
    	if(par1BlockArray.length == par3BooleanArray.length)
    	{
    		for(int i = 0; i < par1BlockArray.length;i++)
    		{
    			if(par3BooleanArray[i] == true)
    			{
    				par1BlockArray[i].setCreativeTab(par2Tab);
    			}
    		}
    	}
    }
    public static void regTab(Item[] par1ItemArray, CreativeTabs par2Tab, Boolean[] par3BooleanArray)
    {
    	if(par1ItemArray.length == par3BooleanArray.length)
    	{
    		for(int i = 0; i < par1ItemArray.length;i++)
    		{
    			if(par3BooleanArray[i] == true)
    			{
    				par1ItemArray[i].setCreativeTab(par2Tab);
    			}
    		}
    	}
    }
    public static void regTab(Block[] par1BlockArray, CreativeTabs[] par2TabArray, Boolean par3Boolean)
    {
    	if(par1BlockArray.length == par2TabArray.length)
    	{
    		for(int i = 0; i < par1BlockArray.length;i++)
    		{
    			if(par3Boolean == true)
    			{
    				par1BlockArray[i].setCreativeTab(par2TabArray[i]);
    			}
    		}
    	}
    }
    public static void regTab(Item[] par1ItemArray, CreativeTabs[] par2TabArray, Boolean par3Boolean)
    {
    	if(par1ItemArray.length == par2TabArray.length)
    	{
    		for(int i = 0; i < par1ItemArray.length;i++)
    		{
    			if(par3Boolean == true)
    			{
    				par1ItemArray[i].setCreativeTab(par2TabArray[i]);
    			}
    		}
    	}
    }
    public static void regTab(Block[] par1BlockArray, CreativeTabs[] par2TabArray, Boolean[] par3BooleanArray)
    {
    	if(par1BlockArray.length == par2TabArray.length)
    	{
    		if(par1BlockArray.length == par3BooleanArray.length)
    		{
    			for(int i = 0; i < par1BlockArray.length; i++)
    			{
    				if(par3BooleanArray[i] == true)
    				{
    					par1BlockArray[i].setCreativeTab(par2TabArray[i]);
    				}
    			}
    		}
    	}
    }
    // Toggleable .setCreativeTab() - integer //TODO
    public static void regTab(Block par1Block, CreativeTabs par2Tab, int par3Int)
    {
    	if(par3Int == 1)
    	{
    		par1Block.setCreativeTab(par2Tab);
    	}
    }
    public static void regTab(Item par1Item, CreativeTabs par2Tab, int par3Int)
    {
    	if(par3Int == 1)
    	{
    		par1Item.setCreativeTab(par2Tab);
    	}
    }
    public static void regTab(Item[] par1ItemArray, CreativeTabs par2Tab, int par3Int)
    {
    	for(int i = 0; i < par1ItemArray.length ; i++)
    			{
    				if(par3Int == 1)
    				{
    					par1ItemArray[i].setCreativeTab(par2Tab);
    				}
    			}
    }
    public static void regTab(Block[] par1BlockArray, CreativeTabs par2Tab, int par3Int)
    {
    	for(int i = 0; i < par1BlockArray.length ; i++)
		{
    		if(par3Int == 1)
    		{
    			par1BlockArray[i].setCreativeTab(par2Tab);
    		}
		}
    }
    public static void regTab(Block[] par1BlockArray, CreativeTabs par2Tab, int[] par3IntArray)
    {
    	if(par1BlockArray.length == par3IntArray.length)
    	{
    		for(int i = 0; i < par1BlockArray.length;i++)
    		{
    			if(par3IntArray[i] == 1)
    			{
    				par1BlockArray[i].setCreativeTab(par2Tab);
    			}
    		}
    	}
    }
    public static void regTab(Item[] par1ItemArray, CreativeTabs par2Tab, int[] par3IntArray)
    {
    	if(par1ItemArray.length == par3IntArray.length)
    	{
    		for(int i = 0; i < par1ItemArray.length;i++)
    		{
    			if(par3IntArray[i] == 1)
    			{
    				par1ItemArray[i].setCreativeTab(par2Tab);
    			}
    		}
    	}
    }
    public static void regTab(Block[] par1BlockArray, CreativeTabs[] par2TabArray, int par3Int)
    {
    	if(par1BlockArray.length == par2TabArray.length)
    	{
    		for(int i = 0; i < par1BlockArray.length;i++)
    		{
    			if(par3Int == 1)
    			{
    				par1BlockArray[i].setCreativeTab(par2TabArray[i]);
    			}
    		}
    	}
    }
    public static void regTab(Item[] par1ItemArray, CreativeTabs[] par2TabArray, int par3Int)
    {
    	if(par1ItemArray.length == par2TabArray.length)
    	{
    		for(int i = 0; i < par1ItemArray.length;i++)
    		{
    			if(par3Int == 1)
    			{
    				par1ItemArray[i].setCreativeTab(par2TabArray[i]);
    			}
    		}
    	}
    }
    public static void regTab(Block[] par1BlockArray, CreativeTabs[] par2TabArray, int[] par3IntArray)
    {
    	if(par1BlockArray.length == par2TabArray.length)
    	{
    		if(par1BlockArray.length == par3IntArray.length)
    		{
    			for(int i = 0; i < par1BlockArray.length; i++)
    			{
    				if(par3IntArray[i] == 1)
    				{
    					par1BlockArray[i].setCreativeTab(par2TabArray[i]);
    				}
    			}
    		}
    	}
    }
    public static void regTab(Item[] par1ItemArray, CreativeTabs[] par2TabArray, int[] par3IntArray)
    {
        if(par1ItemArray.length == par2TabArray.length)
        {
        	if(par1ItemArray.length == par3IntArray.length)
        	{
        		for(int i = 0; i < par1ItemArray.length; i++)
        		{
        			if(par3IntArray[i] == 1)
        			{
        				par1ItemArray[i].setCreativeTab(par2TabArray[i]);
        			}
        		}
        	}
       	}
    }
    
    // SPECIAL GAME REGISTRY //TODO
    public static void registerBlock(net.minecraft.block.Block block, Class<? extends ItemBlock> itemclass, String name, String modId)
    {
        Multimap<ModContainer, BlockProxy> blockRegistry = ArrayListMultimap.create();
        if (Loader.instance().isInState(LoaderState.CONSTRUCTING))
        {
            FMLLog.warning("Mar21API: Mod %s is attempting to register a block while used !", Loader.instance().activeModContainer());
        }
        try
        {
            assert block != null : "Mar21API: Block cannot be null !";
            assert itemclass != null : "Mar21API: Item Class cannot be null !";
            int blockItemId = block.blockID - 256;
            Constructor<? extends ItemBlock> itemCtor;
            Item i;
            try
            {
                itemCtor = itemclass.getConstructor(int.class);
                i = itemCtor.newInstance(blockItemId);
            }
            catch (NoSuchMethodException e)
            {
                itemCtor = itemclass.getConstructor(int.class, net.minecraft.block.Block.class);
                i = itemCtor.newInstance(blockItemId, block);
            }
            GameRegistry.registerItem(i,name, modId);
        }
        catch (Exception e)
        {
            FMLLog.log(Level.SEVERE, e, "Mar21API: Error occured while register active !");
            throw new LoaderException(e);
        }
        blockRegistry.put(Loader.instance().activeModContainer(), (BlockProxy) block);
    }
    
    
    
}