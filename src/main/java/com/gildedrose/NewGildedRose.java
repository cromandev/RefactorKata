package com.gildedrose;

import java.util.*;

public class NewGildedRose {
  Item[] items;
  GildedRoseItemFactory gildedRoseItemFactory = new GildedRoseItemFactory();
  private Set<AbstractItemManager> itemManagers = new HashSet<>();

  public NewGildedRose(Item[] items) {
    this.items = items;
    for (Item item : items) {
      addItem(item);
    }
  }

  public void addItem(Item item) {
    addItemManager(gildedRoseItemFactory.getItem(item));
  }

  protected void addItemManager(AbstractItemManager newItem) {
    itemManagers.add(newItem);
  }

  public void passDay() {
    for (AbstractItemManager item : itemManagers) {
      item.passDay();
    }
  }

}
