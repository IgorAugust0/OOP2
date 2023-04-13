package builder.equipments;

/**
 * Enum que representa os nome dos equipamentos do jogo com base no seu tipo.
 *
 */
public enum EquipmentName {

    // Weapons
    SWORD(WeaponType.SWORD),
    AXE(WeaponType.AXE),
    DAGGER(WeaponType.DAGGER),
    STAFF(WeaponType.STAFF),
    BOW(WeaponType.BOW),
    CROSSBOW(WeaponType.CROSSBOW),
    WAND(WeaponType.WAND),

    // Armor
    SHIELD(ArmorType.SHIELD),
    HELMET(ArmorType.HELMET),
    CHESTPLATE(ArmorType.CHESTPLATE),
    LEGGINGS(ArmorType.LEGGINGS),
    BOOTS(ArmorType.BOOTS),
    GAUNTLETS(ArmorType.GAUNTLETS),

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
    MAP(ItemType.ITEM),
    COMPASS(ItemType.ITEM),
    KEY(ItemType.ITEM),
    LOCKPICK(ItemType.ITEM);

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

    private EquipmentName(RingType ringType) {
        this.equipmentType = EquipmentType.RING;
        this.equipment = ringType;
    }

    private EquipmentName(PotionType potionType) {
        this.equipmentType = EquipmentType.POTION;
        this.equipment = potionType;
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
