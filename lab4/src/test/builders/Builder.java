package test.builders;

import test.attributes.*;
import test.character.*;
import java.util.List;

public interface Builder {

    void setName(String name);
    void setProfession(Profession profession);
    void setEquipment(List<Equipment> equipment);
    void setInventory(List<Item> inventory);
    void setHealthPoints(int healthPoints);
    void setStrength(int strength);
    void setDefense(int defense);
    void setGender(Gender gender);
    void setRace(Race race);
    void setIntelligence(int intelligence);
    void setDexterity(int dexterity);
}

