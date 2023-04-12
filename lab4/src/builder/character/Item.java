package builder.character;

import builder.equipments.ItemType;
import builder.equipments.PotionType;
import builder.equipments.RingType;

public class Item {
    private final ItemType itemType;
    private final RingType ring;
    private final PotionType potion;
    private final int healthPoints;

    public Item(ItemType itemType, RingType ring, PotionType potion, int healthPoints) {
        this.itemType = itemType;
        this.ring = ring;
        this.potion = potion;
        this.healthPoints = healthPoints;
    }

    public ItemType getItemType() {
        return itemType;
    }

    public RingType getRing() {
        return ring;
    }

    public PotionType getPotion() {
        return potion;
    }

    public int getHealthPoints() {
        return healthPoints;
    }
}

