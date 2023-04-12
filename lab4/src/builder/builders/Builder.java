package builder.builders;

import builder.attributes.*;
import builder.equipments.*;

public interface Builder {

    void setName(String name);
    void setProfession(Profession profession);;
    void setEquipmentType(EquipmentType equipmentType);
    void setEquipmentName(EquipmentName equipmentName);
    void setWeaponType(WeaponType weapon);
    void setArmorType(ArmorType armor);
    void setItemType(ItemType item);
    void setRingType(RingType ring);
    void setPotionType(PotionType potion);
    void setHealthPoints(int healthPoints);
    void setStrength(int strength);
    void setDefense(int defense);
    void setGender(Gender gender);
    void setRace(Race race);
    void setIntelligence(int intelligence);
    void setDexterity(int dexterity);
}

