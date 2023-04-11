package builder;

import builder.attributes.*;

public class Character {
    private final String name;
    private final Gender gender;
    private final Race race;
    private final Profession profession;
    private final EquipmentType equipmentType;
    private final EquipmentName equipmentName;
    private final int healthPoints;
    private final int strength;
    private final int defense;
    private final int intelligence;
    private final int dexterity;

    public Character(String name, Gender gender, Race race, Profession profession, EquipmentType equipmentType,
            EquipmentName equipmentName, int healthPoints, int strength, int defense, int intelligence, int dexterity) {
        this.name = name;
        this.gender = gender;
        this.race = race;
        this.profession = profession;
        this.equipmentType = equipmentType;
        this.equipmentName = equipmentName;
        this.healthPoints = healthPoints;
        this.strength = strength;
        this.defense = defense;
        this.intelligence = intelligence;
        this.dexterity = dexterity;
    }

    public String getName() {
        return name;
    }

    public Gender getGender() {
        return gender;
    }

    public Race getRace() {
        return race;
    }

    public Profession getProfession() {
        return profession;
    }

    public EquipmentType getEquipmentType() {
        return equipmentType;
    }

    public EquipmentName getEquipmentName() {
        return equipmentName;
    }

    public int getHealthPoints() {
        return healthPoints;
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

    @Override
    public String toString() {
        String characterString = String.format("Name: %s\n", name);
        characterString += String.format("Gender: %s\n", gender);
        characterString += String.format("Race: %s\n", race);
        characterString += String.format("Profession: %s\n", profession);
        characterString += String.format("Equipment: %s %s\n", equipmentType, equipmentName);
        characterString += String.format("Health Points: %d\n", healthPoints);
        characterString += String.format("Strength: %d\n", strength);
        characterString += String.format("Defense: %d\n", defense);
        characterString += String.format("Intelligence: %d\n", intelligence);
        characterString += String.format("Dexterity: %d\n", dexterity);

        return characterString;
    }

}