package mar21.omega.tool;

import java.util.List;
import java.util.Random;

import mar21.omega.ModCore;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemPoweredDrill extends ItemTool
{
    int par0level;
    private static final Block[] blocksEffectiveAgainst = new Block[] {};

    public ItemPoweredDrill(int par0Id, int par1Int, EnumToolMaterial par2EnumToolMaterial)
    {
        super(par0Id, par1Int, par2EnumToolMaterial, blocksEffectiveAgainst);
    }

    public boolean canHarvestBlock(Block par1Block)
    {
        return par1Block.blockMaterial == Material.rock || par1Block.blockMaterial == Material.snow || par1Block.blockMaterial == Material.clay;
    }

    public float getStrVsBlock(ItemStack par1ItemStack, Block par2Block)
    {
        return par2Block != null && par2Block.blockMaterial == Material.rock ?
               this.efficiencyOnProperMaterial : par2Block != null && par2Block.blockMaterial == Material.sand ?
               this.efficiencyOnProperMaterial : par2Block != null && par2Block.blockMaterial == Material.ground ?
               this.efficiencyOnProperMaterial : par2Block != null && par2Block.blockMaterial == Material.snow ?
               this.efficiencyOnProperMaterial : par2Block != null && par2Block.blockMaterial == Material.anvil ?
               this.efficiencyOnProperMaterial : par2Block != null && par2Block.blockMaterial == Material.grass ?
               this.efficiencyOnProperMaterial : par2Block != null && par2Block.blockMaterial == Material.snow ?
               this.efficiencyOnProperMaterial : par2Block != null && par2Block.blockMaterial == Material.clay ?
               this.efficiencyOnProperMaterial :
               super.getStrVsBlock(par1ItemStack, par2Block);
    }

    public void registerIcons(IconRegister par1IconRegister)
    {
        this.itemIcon = par1IconRegister.registerIcon(ModCore.modid + ":" + (this.getUnlocalizedName().substring(5)) + par0level);
    }
    
    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean par4)
    {
    	list.add("Press P to open the upgrade menu");
    }
    
    //REDSTONE PARTICLES GENERATION
    /**
    public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
	 {
		 Random rand = new Random();
		 for(int countparticles = 0; countparticles <= 10; ++countparticles)
		 {
			 par2World.spawnParticle("reddust", par3EntityPlayer.posX + (rand.nextDouble() - 0.5D) * (double)par3EntityPlayer.width, par3EntityPlayer.posY + rand.nextDouble() * (double)par3EntityPlayer.height - (double)par3EntityPlayer.yOffset, par3EntityPlayer.posZ + (rand.nextDouble() - 0.5D) * (double)par3EntityPlayer.width, 0.0D, 0.0D, 0.0D);
		 }

		 par3EntityPlayer.setItemInUse(par1ItemStack, this.getMaxItemUseDuration(par1ItemStack));
		 return par1ItemStack;
	 }*/
    
    public EnumRarity getRarity(ItemStack par1ItemStack)
    {
        return EnumRarity.rare;
    }
}