package test.equipments;

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
    GAUNTLETS(ArmorType.GAUNTLETS);

    private EquipmentType equipmentType;
    private Object equipment;

    private EquipmentName(EquipmentType equipmentType) {
        this.equipmentType = equipmentType;
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
    
    public Object getEquipment() {
        return equipment;
    }
}
