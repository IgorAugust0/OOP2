package builder.attributes;

public enum EquipmentName {

    // Weapons
    SWORD(WeaponType.SWORD),
    AXE(WeaponType.AXE),
    DAGGER(WeaponType.DAGGER),
    STAFF(WeaponType.STAFF),

    // Armor
    SHIELD(ArmorType.SHIELD),
    HELMET(ArmorType.HELMET),
    CHESTPLATE(ArmorType.CHESTPLATE),
    LEGGINGS(ArmorType.LEGGINGS),
    BOOTS(ArmorType.BOOTS),

    // Rings

    // Potions
    HEALTH_POTION(EquipmentType.POTION),

    // Items
    MAP(ItemType.ITEM),
    COMPASS(ItemType.ITEM);

    private EquipmentType equipmentType;
    private ItemType itemType;
    private Object equipment;

    private EquipmentName(EquipmentType equipmentType) {
        this.equipmentType = equipmentType;
    }

    private EquipmentName(ItemType itemType) {
        this.itemType = itemType;
    }

    private EquipmentName(WeaponType weaponType) {
        this.equipmentType = EquipmentType.WEAPON;
        this.equipment = weaponType;
    }

    private EquipmentName(ArmorType armorType) {
        this.equipmentType = EquipmentType.ARMOR;
        this.equipment = armorType;
    }

    public EquipmentType getEquipmentType() {
        return equipmentType;
    }

    public ItemType getItemType() {
        return itemType;
    }

    public Object getEquipment() {
        return equipment;
    }
}
