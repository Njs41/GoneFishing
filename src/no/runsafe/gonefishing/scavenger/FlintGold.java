package no.runsafe.gonefishing.scavenger;

import no.runsafe.framework.minecraft.Item;
import no.runsafe.framework.minecraft.item.meta.RunsafeMeta;

public class FlintGold implements IFishingLootItem
{
	@Override
	public RunsafeMeta getItem()
	{
		if (item == null)
		{
			item = Item.Materials.GoldNugget.getItem();
			item.setAmount(1);
			item.setDisplayName("Captain Flint's Gold");
			item.addLore("§6Looks like a piece of gold from the rusty treasure chest.");
		}
		return item;
	}

	private RunsafeMeta item;
}
