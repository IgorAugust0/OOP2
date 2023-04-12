package test.builders;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

import test.attributes.*;
import test.character.*;
import test.character.Character;
import test.util.InputUtils;

public class CharacterBuilder implements Builder {
    private String name;
    private Gender gender;
    private Race race;
    private Profession profession;
    private List<Equipment> equipment;
    private List<Item> inventory;
    private int healthPoints;
    private int strength;
    private int defense;
    private int intelligence;
    private int dexterity;
    private int level = 1;
    private int currentHealth;

    @Override
    public void setName(String name) {
        this.name = name;
        // score.addPoints(10);
    }

    @Override
    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public void setRace(Race race) {
        this.race = race;
    }

    @Override
    public void setProfession(Profession profession) {
        this.profession = profession;
    }

    @Override
    public void setEquipment(List<Equipment> equipment) {
        this.equipment = equipment;
    }

    @Override
    public void setInventory(List<Item> inventory) {
        this.inventory = inventory;
    }
    
    @Override
    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    @Override
    public void setStrength(int strength) {
        this.strength = strength;
    }

    @Override
    public void setDefense(int defense) {
        this.defense = defense;
    }

    @Override
    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    @Override
    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public Profession getProfession() {
        return this.profession;
    }

    public int getStrength() {
        return this.strength;
    }

    public int getDefense() {
        return this.defense;
    }

    public int getIntelligence() {
        return this.intelligence;
    }

    public int getDexterity() {
        return this.dexterity;
    }

    public int getCurrentHealth() {
        return this.currentHealth;
    }

    public int getLevel() {
        return this.level;
    }

    public int getHealthPoints() {
        int strength = getStrength();
        int defense = getDefense();
        int intelligence = getIntelligence();
        int dexterity = getDexterity();
        int level = getLevel();
        Profession profession = getProfession();
        int maxHealth = level * (5 + strength + defense + intelligence + dexterity) * profession.getHealthMultiplier();
        int minHealthPercent = 20;
        int minHealth = (int) (maxHealth * (minHealthPercent / 100.0));
        return Math.max(minHealth, maxHealth);
    }

    public void setCurrentHealth(int currentHealth) {
        this.currentHealth = currentHealth;
    }

    // Rolar atributos aleatoriamente
    public void rollAttributes() {
        final Random random = new Random();
        healthPoints = random.nextInt(10) + 1;
        strength = random.nextInt(10) + 1;
        defense = random.nextInt(10) + 1;
        intelligence = random.nextInt(10) + 1;
        dexterity = random.nextInt(10) + 1;
    }

    // Atribuir atributos manualmente pelo usuário
    public void manualAttributes() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Manually set attributes:");
        int strength = InputUtils.getValidInput(scanner, "Enter strength (between 1 and 20): ", 1, 20);
        int defense = InputUtils.getValidInput(scanner, "Enter defense (between 1 and 20): ", 1, 20);
        int intelligence = InputUtils.getValidInput(scanner, "Enter intelligence (between 1 and 20): ", 1, 20);
        int dexterity = InputUtils.getValidInput(scanner, "Enter dexterity (between 1 and 20): ", 1, 20);

        Profession profession = getProfession();

        // Imposição de limite de atributos baseado na profissão
        switch (profession) {
            case WARRIOR -> {
                if (strength > 15) {
                    strength = 15;
                }
                if (intelligence > 10) {
                    intelligence = 10;
                }
                if (dexterity > 15) {
                    dexterity = 15;
                }
                if (defense > 15) {
                    defense = 15;
                }
            }
            case MAGE -> {
                if (strength > 10) {
                    strength = 10;
                }
                if (intelligence > 15) {
                    intelligence = 15;
                }
                if (dexterity > 10) {
                    dexterity = 10;
                }
                if (defense > 10) {
                    defense = 10;
                }
            }
            case ROGUE -> {
                if (strength > 10) {
                    strength = 10;
                }
                if (intelligence > 10) {
                    intelligence = 10;
                }
                if (dexterity > 15) {
                    dexterity = 15;
                }
                if (defense > 10) {
                    defense = 10;
                }
            }
        }
        setStrength(strength);
        setIntelligence(intelligence);
        setDexterity(dexterity);
        setDefense(defense);

        int healthPoints = getHealthPoints();
        setCurrentHealth(healthPoints);
    }

    public Character getCharacter() {

        Character character = new Character(name, gender, race, profession, equipment, inventory, healthPoints, strength, defense, intelligence, dexterity);
        return character;
    }

}