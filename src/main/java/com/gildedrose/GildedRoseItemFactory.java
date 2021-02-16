package com.gildedrose;

import java.util.Arrays;
import java.util.List;

public class GildedRoseItemFactory {

  private final List<String> LEGENDARY_ITEMS = Arrays.asList("Sulfuras, Hand of Ragnaros");
  private final List<String> EVENT_ITEMS = Arrays.asList("Backstage passes to a TAFKAL80ETC concert");
  private final List<String> ANCIENT_ITEMS = Arrays.asList("Aged Brie");
  private final List<String> MAGIC_ITEMS = Arrays.asList("Conjured Mana Cake");

  public AbstractItemManager getItem(Item item) {
    String name = item.name;
    if (LEGENDARY_ITEMS.contains(name)) {
      return new LegendaryItemManager(item);
    } else if (EVENT_ITEMS.contains(name)) {
      return new EventItemManager(item);
    } else if (ANCIENT_ITEMS.contains(name)) {
      return new AncientItemManager(item);
    } else if (MAGIC_ITEMS.contains(name)) {
      return new MagicItemManager(item);
    }
    return new NormalItemManager(item);
  }
}
