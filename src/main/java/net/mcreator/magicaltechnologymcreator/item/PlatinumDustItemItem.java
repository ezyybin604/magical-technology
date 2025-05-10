
package net.mcreator.magicaltechnologymcreator.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class PlatinumDustItemItem extends Item {
	public PlatinumDustItemItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
