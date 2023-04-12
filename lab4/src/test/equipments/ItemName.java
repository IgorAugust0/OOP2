package test.equipments;

public enum ItemName {
    // Rings
    HEALTH_RING(RingType.HEALTH),
    STRENGTH_RING(RingType.STRENGTH),
    DEFENSE_RING(RingType.DEFENSE),
    INTELLIGENCE_RING(RingType.INTELLIGENCE),
    DEXTERITY_RING(RingType.DEXTERITY),

    // Potions
    HEALTH_POTION(PotionType.HEALTH),
    MANA_POTION(PotionType.MANA),
    STRENGTH_POTION(PotionType.STRENGTH),
    DEXTERITY_POTION(PotionType.DEXTERITY),

    // Items
    MAP_ITEM(ItemType.MAP),
    COMPASS_ITEM(ItemType.COMPASS),
    KEY_ITEM(ItemType.KEY),
    LOCKPICK_ITEM(ItemType.LOCKPICK);

    private AcessoriesType itemType;
    private Object item;

    private ItemName(ItemType itemType) {
        this.itemType = AcessoriesType.ITEM;
        this.item = itemType;
    }

    private ItemName(RingType ringType) {
        this.itemType = AcessoriesType.RING;
        this.item = ringType;
    }

    private ItemName(PotionType potionType) {
        this.itemType = AcessoriesType.POTION;
        this.item = potionType;
    }

    public AcessoriesType getItemType() {
        return itemType;
    }

    public Object getItem() {
        return item;
    }
}
