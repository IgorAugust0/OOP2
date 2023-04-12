package builder.character;

import builder.equipments.ArmorType;
import builder.equipments.EquipmentName;
import builder.equipments.EquipmentType;
import builder.equipments.WeaponType;

public class Equipment {
    private final EquipmentType equipmentType;
    private final EquipmentName equipmentName;
    private final WeaponType weapon;
    private final ArmorType armor;
    private final int strength;
    private final int defense;
    private final int intelligence;
    private final int dexterity;

    public Equipment(EquipmentType equipmentType, EquipmentName equipmentName, WeaponType weapon, ArmorType armor, int strength, int defense, int intelligence, int dexterity) {
        this.equipmentType = equipmentType;
        this.equipmentName = equipmentName;
        this.weapon = weapon;
        this.armor = armor;
        this.strength = strength;
        this.defense = defense;
        this.intelligence = intelligence;
        this.dexterity = dexterity;
    }

    public EquipmentType getEquipmentType() {
        return equipmentType;
    }

    public EquipmentName getEquipmentName() {
        return equipmentName;
    }

    public WeaponType getWeapon() {
        return weapon;
    }

    public ArmorType getArmor() {
        return armor;
    }

    public int getStrength() {
        return strength;
    }

    public int getDefense() {
        return defense;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getDexterity() {
        return dexterity;
    }
}

