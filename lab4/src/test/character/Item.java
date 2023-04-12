package test.character;

import builder.equipments.ItemType;
import test.equipments.*;

public class Item {
    private final ItemType type;
    private final ItemName name;

    public Item(ItemType type, ItemName name) {
        this.type = type;
        this.name = name;
    }

    public ItemName getName() {
        return name;
    }

    public ItemType getType() {
        return type;
    }
}
