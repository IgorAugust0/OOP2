package builder.builders;

import builder.character.Character;
import builder.attributes.*;
import builder.equipments.*;
import builder.util.*;
import java.util.*;

/**
 * Classe CharacterBuilder que implementa a interface Builder e sobrescreve os
 * métodos set para a construção do personagem.
 * 
 * Implementa métodos para gerar atributos aleatoriamente ou para inseri-los
 * manualmente pelo usuário.
 * 
 */
public class CharacterBuilder implements Builder {
    private String name;
    private Gender gender;
    private Race race;
    private Profession profession;
    private EquipmentType equipmentType;
    private WeaponType weapon;
    private ArmorType armor;
    private ItemType item;
    private RingType ring;
    private PotionType potion;
    private EquipmentName equipmentName;
    private int healthPoints, strength;
    private int defense;
    private int intelligence;
    private int dexterity;
    private int level = 1;

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
    public void setEquipmentType(EquipmentType equipmentType) {
        this.equipmentType = equipmentType;
    }

    @Override
    public void setEquipmentName(EquipmentName equipmentName) {
        this.equipmentName = equipmentName;
    }

    @Override
    public void setWeaponType(WeaponType weapon) {
        this.weapon = weapon;
    }

    @Override
    public void setArmorType(ArmorType armor) {
        this.armor = armor;
    }

    @Override
    public void setItemType(ItemType item) {
        this.item = item;
    }

    @Override
    public void setRingType(RingType ring) {
        this.ring = ring;
    }

    @Override
    public void setPotionType(PotionType potion) {
        this.potion = potion;
    }

    @Override
    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    @Override
    public void setStrength(int strength) {
        List<Integer> limits = attributeLimits.get(getProfession());
        int limit = limits.get(0);
        if (strength > limit) {
            strength = limit;
        }
        this.strength = strength;
    }

    @Override
    public void setDefense(int defense) {
        List<Integer> limits = attributeLimits.get(getProfession());
        int limit = limits.get(1);
        if (defense > limit) {
            defense = limit;
        }
        this.defense = defense;
    }

    @Override
    public void setIntelligence(int intelligence) {
        List<Integer> limits = attributeLimits.get(getProfession());
        int limit = limits.get(2);
        if (intelligence > limit) {
            intelligence = limit;
        }
        this.intelligence = intelligence;
    }

    @Override
    public void setDexterity(int dexterity) {
        List<Integer> limits = attributeLimits.get(getProfession());
        int limit = limits.get(3);
        if (dexterity > limit) {
            dexterity = limit;
        }
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

    public EquipmentType getEquipmentType() {
        return this.equipmentType;
    }

    public EquipmentName getEquipmentName() {
        return this.equipmentName;
    }

    public WeaponType getWeapon() {
        return this.weapon;
    }

    public ArmorType getArmor() {
        return this.armor;
    }

    public ItemType getItem() {
        return this.item;
    }

    public RingType getRing() {
        return this.ring;
    }

    public PotionType getPotion() {
        return this.potion;
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
        return maxHealth;
    }

    // Método estático para criar um mapa de limites de atributos por profissão
    private static final Map<Profession, List<Integer>> attributeLimits = Map.of(
            Profession.WARRIOR, List.of(15, 15, 10, 15),
            Profession.MAGE, List.of(10, 10, 15, 10),
            Profession.ROGUE, List.of(10, 10, 15, 15));

    // Rolar atributos aleatoriamente
    public void rollAttributes() {
        final Random random = new Random();
        Profession profession = getProfession();
        List<Integer> limits = attributeLimits.get(profession);

        // Atribuir atributos aleatoriamente dentro dos limites de cada profissão
        setStrength(Math.min(random.nextInt(20) + 1, limits.get(0)));
        setDefense(Math.min(random.nextInt(20) + 1, limits.get(1)));
        setIntelligence(Math.min(random.nextInt(20) + 1, limits.get(2)));
        setDexterity(Math.min(random.nextInt(20) + 1, limits.get(3)));

        // Atribuir pontos de vida baseado nos atributos aleatórios
        int healthPoints = getHealthPoints();
        setHealthPoints(healthPoints);

        // Imprimir atributos após rolagem aleatória
        System.out.printf("Atributos:\n" +
                "  Vida: %d\n" +
                "  Força:      %d\n" +
                "  Defesa:       %d\n" +
                "  Inteligência:  %d\n" +
                "  Destreza:     %d\n",
                healthPoints, strength, defense, intelligence, dexterity);
    }

    // Atribuir atributos manualmente pelo usuário
    public void manualAttributes() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escollha os atributos manualmente:");
        int strength = InputUtils.getValidInput(scanner, "Insira a força (de 1 a 20): ", 1, 20);
        int defense = InputUtils.getValidInput(scanner, "Insira a defesa (de 1 e 20): ", 1, 20);
        int intelligence = InputUtils.getValidInput(scanner, "Insira a inteligência (de 1 e 20): ", 1, 20);
        int dexterity = InputUtils.getValidInput(scanner, "Insira a destreza (de 1 a 20): ", 1, 20);

        // Verificar se a profissão foi escolhida antes de atribuir atributos
        if (getProfession() == null) {
            System.out.println("Escolha uma profissão antes de atribuir atributos");
            return;
        }
        Profession profession = getProfession();
        List<Integer> limits = attributeLimits.get(profession);

        // Atribuir atributos manualmente dentro dos limites de cada profissão
        setStrength(Math.min(strength, limits.get(0)));
        setDefense(Math.min(defense, limits.get(1)));
        setIntelligence(Math.min(intelligence, limits.get(2)));
        setDexterity(Math.min(dexterity, limits.get(3)));

        // Obter a vida com base nos atributos e imprimi-la após atribuição manual
        int healthPoints = getHealthPoints();
        setHealthPoints(healthPoints);
        System.out.println("Vida do personagem: " + getHealthPoints());
    }

    // Método para criar um personagem com base nos atributos
    public Character getCharacter() {
        Character character = new Character(name, gender, race, profession, equipmentType, equipmentName, weapon, armor,
                item, ring, potion, healthPoints, strength, defense, intelligence, dexterity);
        return character;
    }

}