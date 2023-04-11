package builder.builders;

import java.util.Random;
import java.util.Scanner;

import builder.Character;
import builder.attributes.*;

public class CharacterBuilder implements Builder {
    private String name;
    private Gender gender;
    private Race race;
    private Profession profession;
    private EquipmentType equipmentType;
    private EquipmentName equipmentName;
    private int healthPoints;
    private int strength;
    private int defense;
    private int intelligence;
    private int dexterity;
    private int level = 1;
    private int maxHealth;
    private int currentHealth;

    @Override
    public void setName(String name) {
        this.name = name;
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
    public void setEquipmentType(EquipmentType equipmentType) {
        this.equipmentType = equipmentType;
    }

    public EquipmentType getEquipmentType() {
        return this.equipmentType;
    }

    @Override
    public void setEquipmentName(EquipmentName equipmentName) {
        this.equipmentName = equipmentName;
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

    public int getLevel() {
        return this.level;
    }

    public int getMaxHealth() {
        return this.maxHealth;
    }

    public int getCurrentHealth() {
        return this.currentHealth;
    }

    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }

    public void setCurrentHealth(int currentHealth) {
        this.currentHealth = currentHealth;
    }

    public void rollAttributes() {
        final Random random = new Random();
        healthPoints = random.nextInt(10) + 1;
        strength = random.nextInt(10) + 1;
        defense = random.nextInt(10) + 1;
        intelligence = random.nextInt(10) + 1;
        dexterity = random.nextInt(10) + 1;
    }

    public void manualAttributes() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Manually set attributes:");
        System.out.print("Enter strength (between 1 and 20): ");
        int strength = scanner.nextInt();
        System.out.print("Enter intelligence (between 1 and 20): ");
        int intelligence = scanner.nextInt();
        System.out.print("Enter dexterity (between 1 and 20): ");
        int dexterity = scanner.nextInt();
        System.out.print("Enter defense (between 1 and 20): ");
        int defense = scanner.nextInt();
        scanner.nextLine(); // consume newline

        Profession profession = getProfession();

        // impose attribute limits based on profession
        switch (profession) {
            case WARRIOR:
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
                break;
            case MAGE:
                if (strength > 10) {
                    strength = 10;
                }
                if (intelligence > 15) {
                    intelligence = 15;
                }
                if (dexterity > 12) {
                    dexterity = 12;
                }
                if (defense > 10) {
                    defense = 10;
                }
                break;
            case ROGUE:
                if (strength > 12) {
                    strength = 12;
                }
                if (intelligence > 12) {
                    intelligence = 12;
                }
                if (dexterity > 15) {
                    dexterity = 15;
                }
                if (defense > 12) {
                    defense = 12;
                }
                break;
        }

        setStrength(strength);
        setIntelligence(intelligence);
        setDexterity(dexterity);
        setDefense(defense);

        int level = getLevel();
        int maxHealth = level * (5 + strength + defense) * profession.getHealthMultiplier();
        int currentHealth = maxHealth;
        setMaxHealth(maxHealth);
        setCurrentHealth(currentHealth);
        scanner.close();
    }

    public Character getCharacter() {
        Character character = new Character(name, gender, race, profession, equipmentType, equipmentName, healthPoints,
                strength, defense, intelligence, dexterity);
        return character;
    }

}
// public void rollAttributes() {
// Scanner scanner = new Scanner(System.in);
// int option;

// System.out.println("Select an option:");
// System.out.println("1. Randomly roll attributes");
// System.out.println("2. Manually assign attributes");
// option = scanner.nextInt();
// scanner.nextLine(); // consume newline

// if (option == 1) {
// // randomly roll attributes
// Random random = new Random();
// int maxHealthPoints =
// profession.getMaxAttribute(AttributeType.HEALTH_POINTS);
// int maxStrength = profession.getMaxAttribute(AttributeType.STRENGTH);
// int maxDefense = profession.getMaxAttribute(AttributeType.DEFENSE);
// int maxIntelligence = profession.getMaxAttribute(AttributeType.INTELLIGENCE);
// int intelligenceLimit = profession.getIntelligenceLimit();
// int maxAgility = profession.getMaxAttribute(AttributeType.AGILITY);
// int maxAttribute = profession.getMaxAttribute(AttributeType.HEALTH_POINTS);

// healthPoints = random.nextInt(maxHealthPoints) + 1;
// strength = random.nextInt(maxStrength) + 1;
// defense = random.nextInt(maxDefense) + 1;
// intelligence = random.nextInt(maxIntelligence) + 1;
// agility = random.nextInt(maxAgility) + 1;

// // Check intelligence limit based on profession
// if (intelligence > intelligenceLimit) {
// intelligence = intelligenceLimit;
// }

// // Check for overpowered character
// int totalPoints = healthPoints + strength + intelligence;
// int maxTotalPoints = maxHealthPoints + maxStrength + maxIntelligence;
// if (totalPoints > maxTotalPoints || healthPoints > maxAttribute ||
// strength > maxAttribute || intelligence > maxAttribute || dexterity >
// maxAttribute) {
// System.out.println("Sorry, your character is overpowered. Please try
// again.");
// rollAttributes();
// } else {
// character.setHealthPoints(healthPoints);
// character.setStrength(strength);
// character.setIntelligence(intelligence);
// character.setDexterity(dexterity);
// }
// } else if (option == 2) {
// // manually assign attributes
// int maxHealthPoints = profession.getMaxHealthPoints();
// int maxStrength = profession.getMaxStrength();
// int maxIntelligence = profession.getMaxIntelligence();
// int intelligenceLimit = profession.getIntelligenceLimit();
// int maxAttribute = profession.getMaxAttribute();

// System.out.println("Enter strength (maximum " + maxAttribute + "): ");
// int strength = scanner.nextInt();
// scanner.nextLine(); // consume newline
// strength = Math.min(maxAttribute, strength);

// System.out.println("Enter dexterity (maximum " + maxAttribute + "): ");
// int dexterity = scanner.nextInt();
// scanner.nextLine(); // consume newline
// dexterity = Math.min(maxAttribute, dexterity);

// System.out.println("Enter intelligence (maximum " + intelligenceLimit + "):
// ");
// int intelligence = scanner.nextInt();
// scanner.nextLine(); // consume newline
// intelligence = Math.min(intelligenceLimit, intelligence);

// System.out.println("Enter health points (maximum " + maxAttribute + "): ");
// int healthPoints = scanner.nextInt();
// scanner.nextLine(); // consume newline
// healthPoints = Math.min(maxAttribute, healthPoints);

// // Check for overpowered character
// int totalPoints = healthPoints + strength + intelligence;
// int maxTotalPoints = maxHealthPoints + maxStrength + maxIntelligence;
// if (totalPoints > maxTotalPoints || healthPoints > maxAttribute ||
// strength > maxAttribute || intelligence > maxAttribute || dexterity >
// maxAttribute) {
// System.out.println("Sorry, your character is overpowered. Please try
// again.");
// rollAttributes();
// } else {
// character.setHealthPoints(healthPoints);
// character.setStrength(strength);
// character.setIntelligence(intelligence);
// character.setDexterity(dexterity);
// }
// }
// }
// public void setAttribute(String attributeType, int value) {
// switch (attributeType.toLowerCase()) {
// case "health points":
// this.healthPoints = value;
// break;
// case "strength":
// this.strength = value;
// break;
// case "defense":
// this.defense = value;
// break;
// case "intelligence":
// this.intelligence = value;
// break;
// case "agility":
// this.agility = value;
// break;
// default:
// System.out.println(
// "Invalid attribute type. Please choose from: health points, strength,
// defense, intelligence, agility.");
// }
// }