package com.gildedrose;

public abstract class AbstractItemManager {

  protected Item item;

  public AbstractItemManager(Item item) {
    this.item = item;
  }

  protected void setSellIn(int sellIn) {
    item.sellIn = sellIn;
  }

  protected void setQuality(int quality) {
    item.quality = Math.min(Math.max(quality, 0), 50);
  }

  public void passDay() {
    updateSellIn();
    updateQuality();
  }

  public boolean canSell() {
    return item.sellIn > 0;
  }

  protected abstract void updateSellIn();

  protected abstract void updateQuality();

  @Override
  public String toString() {
    return item.toString();
  }
}
