package com.TheRPGAdventurer.TIDES.client.items.buket;

import com.TheRPGAdventurer.TIDES.Tides;
import com.TheRPGAdventurer.TIDES.server.entity.EntityStarfish;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemBucket;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class ItemStarfishBucket extends ItemBucket {

	public ItemStarfishBucket(String unlocalizedName, Block containedBlockIn) {
		super(containedBlockIn);
		this.setUnlocalizedName(unlocalizedName);
		this.setMaxStackSize(1);
		this.setRegistryName(new ResourceLocation(Tides.MODID, unlocalizedName));
		this.setCreativeTab(CreativeTabs.MISC);
		
	}
	
	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
		worldIn.spawnEntity(new EntityStarfish(worldIn));
		return null;
	}

}
