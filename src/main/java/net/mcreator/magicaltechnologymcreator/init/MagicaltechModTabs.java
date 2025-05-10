
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.magicaltechnologymcreator.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.magicaltechnologymcreator.MagicaltechMod;

public class MagicaltechModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MagicaltechMod.MODID);
	public static final RegistryObject<CreativeModeTab> MT_CREATIVE_TAB = REGISTRY.register("mt_creative_tab",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.magicaltech.mt_creative_tab")).icon(() -> new ItemStack(Items.BUNDLE)).displayItems((parameters, tabData) -> {
				tabData.accept(MagicaltechModItems.ALUMITITE.get());
				tabData.accept(MagicaltechModBlocks.DRY_MUD.get().asItem());
				tabData.accept(MagicaltechModBlocks.PORTAL_FLOWER.get().asItem());
				tabData.accept(MagicaltechModBlocks.DEAD_BLACK_FLOWER.get().asItem());
				tabData.accept(MagicaltechModBlocks.DEAD_BLUE_FLOWER.get().asItem());
				tabData.accept(MagicaltechModBlocks.DEAD_BROWN_FLOWER.get().asItem());
				tabData.accept(MagicaltechModBlocks.DEAD_CYAN_FLOWER.get().asItem());
				tabData.accept(MagicaltechModBlocks.DEAD_GRAY_FLOWER.get().asItem());
				tabData.accept(MagicaltechModBlocks.DEAD_GREEN_FLOWER.get().asItem());
				tabData.accept(MagicaltechModBlocks.DEAD_LIGHT_BLUE_FLOWER.get().asItem());
				tabData.accept(MagicaltechModBlocks.DEAD_LIGHT_GRAY_FLOWER.get().asItem());
				tabData.accept(MagicaltechModBlocks.DEAD_LIME_PETAL.get().asItem());
				tabData.accept(MagicaltechModBlocks.PLATINUM_ORE.get().asItem());
				tabData.accept(MagicaltechModItems.PLATINUM_ORE_ITEM.get());
				tabData.accept(MagicaltechModItems.PLATINUM_DUST_ITEM.get());
				tabData.accept(MagicaltechModItems.PLATINUM_INGOT.get());
				tabData.accept(MagicaltechModItems.END_DUST.get());
				tabData.accept(MagicaltechModItems.ACTIVATED_END_DUST.get());
				tabData.accept(MagicaltechModBlocks.DEAD_MAGENTA_FLOWER.get().asItem());
				tabData.accept(MagicaltechModBlocks.DEAD_ORANGE_FLOWER.get().asItem());
				tabData.accept(MagicaltechModBlocks.DEAD_PINK_FLOWER.get().asItem());
				tabData.accept(MagicaltechModBlocks.DEAD_PURPLE_FLOWER.get().asItem());
				tabData.accept(MagicaltechModBlocks.DEAD_RED_FLOWER.get().asItem());
				tabData.accept(MagicaltechModBlocks.DEAD_WHITE_FLOWER.get().asItem());
				tabData.accept(MagicaltechModBlocks.DEAD_YELLOW_FLOWER.get().asItem());
				tabData.accept(MagicaltechModItems.BROKEN_DIAMOND.get());
				tabData.accept(MagicaltechModBlocks.PORTAL_FLOWER_GENERATED.get().asItem());
				tabData.accept(MagicaltechModItems.ALCHEMICAL_PEARL.get());
				tabData.accept(MagicaltechModItems.ENCHANTING_BOOK.get());
				tabData.accept(MagicaltechModItems.FIRERY_PEARL.get());
			})

					.build());
}
