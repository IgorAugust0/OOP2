package test.character;

import java.util.List;

import test.attributes.*;

public class Character {
    private final String name;
    private final Gender gender;
    private final Race race;
    private final Profession profession;
    private final List<Equipment> equipment;
    private final List<Item> inventory;
    private final int healthPoints;
    private final int strength;
    private final int defense;
    private final int intelligence;
    private final int dexterity;

    public Character(String name, Gender gender, Race race, Profession profession, List<Equipment> equipment,
            List<Item> inventory, int healthPoints, int strength, int defense, int intelligence, int dexterity) {
        this.name = name;
        this.gender = gender;
        this.race = race;
        this.profession = profession;
        this.equipment = equipment;
        this.inventory = inventory;
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
        characterString += "Equipment:\n";
        for (Equipment e : equipment) {
            characterString += String.format("%s %s\n", e.getType(), e.getName());
        }
        characterString += "Inventory:\n";
        for (Item i : inventory) {
            characterString += String.format("%s\n", i.getType());
        }
        characterString += String.format("Health Points: %d\n", healthPoints);
        characterString += String.format("Strength: %d\n", strength);
        characterString += String.format("Defense: %d\n", defense);
        characterString += String.format("Intelligence: %d\n", intelligence);
        characterString += String.format("Dexterity: %d\n", dexterity);

        return characterString;
    }
// characterString += String.format("Equipment: %s %s\n", equipmentType, equipmentName);
    // Exemplo: “Ragnar, elfo guerreiro | Vida: 5 | Força: 8 | Defesa: 7 | Arma:
    // espada de gelo | Item: poção de cura
    // @Override
    // public String toString() {
    // String characterString = String.format("%s, %s %s\n", name, race,
    // profession);
    // characterString += String.format("Vida: %d | Força: %d | Defesa: %d | Arma:
    // %s | Item: %s\n", healthPoints,
    // strength, defense, weapon, item);
    // return characterString;
    // }

}
