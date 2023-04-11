package builder.attributes;

public enum EquipmentName {

    SWORD(EquipmentType.WEAPON),
    AXE(EquipmentType.WEAPON),
    DAGGER(EquipmentType.WEAPON),
    STAFF(EquipmentType.WEAPON),
    SHIELD(EquipmentType.ARMOR),
    HELMET(EquipmentType.ARMOR),
    CHESTPLATE(EquipmentType.ARMOR),
    LEGGINGS(EquipmentType.ARMOR),
    BOOTS(EquipmentType.ARMOR);

    private EquipmentType equipmentType;

    private EquipmentName(EquipmentType equipmentType) {
        this.equipmentType = equipmentType;
    }

    public EquipmentType getEquipmentType() {
        return equipmentType;
    }

}
