
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.magicaltechnologymcreator.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.magicaltechnologymcreator.item.PlatinumOreItemItem;
import net.mcreator.magicaltechnologymcreator.item.PlatinumIngotItem;
import net.mcreator.magicaltechnologymcreator.item.PlatinumDustItemItem;
import net.mcreator.magicaltechnologymcreator.item.FireryPearlItem;
import net.mcreator.magicaltechnologymcreator.item.EndDustItem;
import net.mcreator.magicaltechnologymcreator.item.EnchantingBookItem;
import net.mcreator.magicaltechnologymcreator.item.BrokenDiamondItem;
import net.mcreator.magicaltechnologymcreator.item.AlumititeItem;
import net.mcreator.magicaltechnologymcreator.item.AlchemicalPearlItem;
import net.mcreator.magicaltechnologymcreator.item.ActivatedEndDustItem;
import net.mcreator.magicaltechnologymcreator.MagicaltechMod;

public class MagicaltechModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, MagicaltechMod.MODID);
	public static final RegistryObject<Item> ALUMITITE = REGISTRY.register("alumitite", () -> new AlumititeItem());
	public static final RegistryObject<Item> DRY_MUD = block(MagicaltechModBlocks.DRY_MUD);
	public static final RegistryObject<Item> PORTAL_FLOWER = block(MagicaltechModBlocks.PORTAL_FLOWER);
	public static final RegistryObject<Item> DEAD_BLACK_FLOWER = block(MagicaltechModBlocks.DEAD_BLACK_FLOWER);
	public static final RegistryObject<Item> DEAD_BLUE_FLOWER = block(MagicaltechModBlocks.DEAD_BLUE_FLOWER);
	public static final RegistryObject<Item> DEAD_BROWN_FLOWER = block(MagicaltechModBlocks.DEAD_BROWN_FLOWER);
	public static final RegistryObject<Item> DEAD_CYAN_FLOWER = block(MagicaltechModBlocks.DEAD_CYAN_FLOWER);
	public static final RegistryObject<Item> DEAD_GRAY_FLOWER = block(MagicaltechModBlocks.DEAD_GRAY_FLOWER);
	public static final RegistryObject<Item> DEAD_GREEN_FLOWER = block(MagicaltechModBlocks.DEAD_GREEN_FLOWER);
	public static final RegistryObject<Item> DEAD_LIGHT_BLUE_FLOWER = block(MagicaltechModBlocks.DEAD_LIGHT_BLUE_FLOWER);
	public static final RegistryObject<Item> DEAD_LIGHT_GRAY_FLOWER = block(MagicaltechModBlocks.DEAD_LIGHT_GRAY_FLOWER);
	public static final RegistryObject<Item> DEAD_LIME_PETAL = block(MagicaltechModBlocks.DEAD_LIME_PETAL);
	public static final RegistryObject<Item> PLATINUM_ORE = block(MagicaltechModBlocks.PLATINUM_ORE);
	public static final RegistryObject<Item> PLATINUM_ORE_ITEM = REGISTRY.register("platinum_ore_item", () -> new PlatinumOreItemItem());
	public static final RegistryObject<Item> PLATINUM_DUST_ITEM = REGISTRY.register("platinum_dust_item", () -> new PlatinumDustItemItem());
	public static final RegistryObject<Item> PLATINUM_INGOT = REGISTRY.register("platinum_ingot", () -> new PlatinumIngotItem());
	public static final RegistryObject<Item> END_DUST = REGISTRY.register("end_dust", () -> new EndDustItem());
	public static final RegistryObject<Item> ACTIVATED_END_DUST = REGISTRY.register("activated_end_dust", () -> new ActivatedEndDustItem());
	public static final RegistryObject<Item> DEAD_MAGENTA_FLOWER = block(MagicaltechModBlocks.DEAD_MAGENTA_FLOWER);
	public static final RegistryObject<Item> DEAD_ORANGE_FLOWER = block(MagicaltechModBlocks.DEAD_ORANGE_FLOWER);
	public static final RegistryObject<Item> DEAD_PINK_FLOWER = block(MagicaltechModBlocks.DEAD_PINK_FLOWER);
	public static final RegistryObject<Item> DEAD_PURPLE_FLOWER = block(MagicaltechModBlocks.DEAD_PURPLE_FLOWER);
	public static final RegistryObject<Item> DEAD_RED_FLOWER = block(MagicaltechModBlocks.DEAD_RED_FLOWER);
	public static final RegistryObject<Item> DEAD_WHITE_FLOWER = block(MagicaltechModBlocks.DEAD_WHITE_FLOWER);
	public static final RegistryObject<Item> DEAD_YELLOW_FLOWER = block(MagicaltechModBlocks.DEAD_YELLOW_FLOWER);
	public static final RegistryObject<Item> BROKEN_DIAMOND = REGISTRY.register("broken_diamond", () -> new BrokenDiamondItem());
	public static final RegistryObject<Item> PORTAL_FLOWER_GENERATED = block(MagicaltechModBlocks.PORTAL_FLOWER_GENERATED);
	public static final RegistryObject<Item> ALCHEMICAL_PEARL = REGISTRY.register("alchemical_pearl", () -> new AlchemicalPearlItem());
	public static final RegistryObject<Item> ENCHANTING_BOOK = REGISTRY.register("enchanting_book", () -> new EnchantingBookItem());
	public static final RegistryObject<Item> FIRERY_PEARL = REGISTRY.register("firery_pearl", () -> new FireryPearlItem());

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
