
package net.mcreator.magicaltechnologymcreator.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class EndDustItem extends Item {
	public EndDustItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.RARE));
	}
}
