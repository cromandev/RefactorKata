package com.gildedrose;

public class MagicItemManager extends NormalItemManager {

  public MagicItemManager(Item item) {
    super(item);
  }

  @Override
  protected void updateQuality() {
    if (item.sellIn < 0) {
      setQuality(item.quality - 2);
    } else {
      setQuality(item.quality - 4);
    }
  }
}
