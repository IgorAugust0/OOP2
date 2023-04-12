package builder.builders;

import java.util.Random;
import java.util.Scanner;

import builder.Character;
import builder.InputUtils;
import builder.attributes.*;
import builder.game.Score;

public class CharacterBuilder implements Builder {
    private String name;
    private Gender gender;
    private Race race;
    private Profession profession;
    private EquipmentType equipmentType;
    // private WeaponType weaponType;
    // private ArmorType armorType;
    private EquipmentName equipmentName;
    private int healthPoints;
    private int strength;
    private int defense;
    private int intelligence;
    private int dexterity;
    private int level = 1;
    private int maxHealth;
    private int currentHealth;
    private Score score;

    public CharacterBuilder(Score score) {
        this.score = score;
    }

    @Override
    public void setName(String name) {
        this.name = name;
        score.addPoints(10);
    }

    @Override
    public void setGender(Gender gender) {
        this.gender = gender;
        score.addPoints(5);
    }

    @Override
    public void setRace(Race race) {
        this.race = race;
        score.addPoints(20);
    }

    @Override
    public void setProfession(Profession profession) {
        this.profession = profession;
        score.addPoints(15);
    }

    @Override
    public void setEquipmentType(EquipmentType equipmentType) {
        this.equipmentType = equipmentType;
        score.addPoints(5);
    }

    @Override
    public void setEquipmentName(EquipmentName equipmentName) {
        this.equipmentName = equipmentName;
        score.addPoints(5);
    }

    @Override
    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
        score.addPoints(2);
    }

    @Override
    public void setStrength(int strength) {
        this.strength = strength;
        score.addPoints(3);
    }

    @Override
    public void setDefense(int defense) {
        this.defense = defense;
        score.addPoints(3);
    }

    @Override
    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
        score.addPoints(5);
    }

    @Override
    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
        score.addPoints(4);
    }

    public EquipmentType getEquipmentType() {
        return this.equipmentType;
    }

    public EquipmentName getEquipmentName() {
        return this.equipmentName;
    }

    public Score getScore() {
        return this.score;
    }

    // MÉTODOS PARA USAR NO METODO MANUALATTRIBUTES()
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