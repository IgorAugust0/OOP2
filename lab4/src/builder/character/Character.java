package builder.character;

// import java.util.List;

import builder.attributes.*;
import builder.equipments.*;

/**
 * Classe que representa o personagem, contendo todos os atributos e
 * equipamentos, os quais são do tipo final para que não sejam alterados.
 */
public class Character {
    private final String name;
    private final Gender gender;
    private final Race race;
    private final Profession profession;
    private final EquipmentType equipmentType;
    private final EquipmentName equipmentName;
    // private final List<Equipment> equipment;
    // private final List<Item> inventory;
    private final WeaponType weapon;
    private final ArmorType armor;
    private final ItemType item;
    private final RingType ring;
    private final PotionType potion;
    private final int healthPoints;
    private final int strength;
    private final int defense;
    private final int intelligence;
    private final int dexterity;

    public Character(String name, Gender gender, Race race, Profession profession, EquipmentType equipmentType,
            EquipmentName equipmentName, WeaponType weapon, ArmorType armor, ItemType item, RingType ring,
            PotionType potion, int healthPoints, int strength, int defense, int intelligence, int dexterity) {
        this.name = name;
        this.gender = gender;
        this.race = race;
        this.profession = profession;
        this.equipmentType = equipmentType;
        this.equipmentName = equipmentName;
        this.weapon = weapon;
        this.armor = armor;
        this.item = item;
        this.ring = ring;
        this.potion = potion;
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

    public WeaponType getWeapon() {
        return weapon;
    }

    public ArmorType getArmor() {
        return armor;
    }

    public ItemType getItem() {
        return item;
    }

    public RingType getRing() {
        return ring;
    }

    public PotionType getPotion() {
        return potion;
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
        String characterString = String.format("Nome: %s\n", name);
        characterString += String.format("Gênero: %s\n", gender);
        characterString += String.format("Raça: %s\n", race);
        characterString += String.format("Profissão: %s\n", profession);
        characterString += String.format("Equipmentos: %s %s\n", equipmentType, equipmentName);
        characterString += String.format("Vida: %d\n", healthPoints);
        characterString += String.format("Força: %d\n", strength);
        characterString += String.format("Defesa: %d\n", defense);
        characterString += String.format("Inteligência: %d\n", intelligence);
        characterString += String.format("Destreza: %d\n", dexterity);

        return characterString;
    }

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
