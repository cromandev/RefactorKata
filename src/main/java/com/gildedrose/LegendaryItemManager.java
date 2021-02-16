package com.gildedrose;

public class LegendaryItemManager extends AbstractItemManager {

  public LegendaryItemManager(Item item) {
    super(item);
  }

  @Override
  protected void updateSellIn() {}

  @Override
  protected void updateQuality() {}

  public boolean canSell() {
    return false;
  }

}
