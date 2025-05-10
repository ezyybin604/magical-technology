
package net.mcreator.magicaltechnologymcreator.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class PlatinumOreItemItem extends Item {
	public PlatinumOreItemItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.UNCOMMON));
	}
}
