package builder.builders;

import builder.attributes.EquipmentName;
import builder.attributes.EquipmentType;
import builder.attributes.Gender;
import builder.attributes.Profession;
import builder.attributes.Race;

public interface Builder {

    void setName(String name);
    void setProfession(Profession profession);;
    void setEquipmentType(EquipmentType equipmentType);
    void setEquipmentName(EquipmentName equipmentName);
    void setHealthPoints(int healthPoints);
    void setStrength(int strength);
    void setDefense(int defense);
    void setGender(Gender gender);
    void setRace(Race race);
    void setIntelligence(int intelligence);
    void setDexterity(int dexterity);
}

