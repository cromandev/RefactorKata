package com.gildedrose;

public class NormalItemManager extends AbstractItemManager {

  public NormalItemManager(Item item) {
    super(item);
  }

  @Override
  protected void updateSellIn() {
    setSellIn(item.sellIn-1);
  }

  @Override
  protected void updateQuality() {
    if (item.sellIn < 0) {
      setQuality(item.quality - 2);
    } else {
      setQuality(item.quality - 1);
    }
  }
}
