package builder;

import java.util.Scanner;

import builder.attributes.*;
import builder.builders.CharacterBuilder;

public class Director {
    private CharacterBuilder builder;
    private Scanner scanner;

    public Director(CharacterBuilder builder) {
        this.builder = builder;
        this.scanner = new Scanner(System.in);
    }

    public void constructCharacter() {
        System.out.println("Welcome to the Character Builder!");

        boolean done = false;

        while (!done) {
            System.out.println("""
                    Select an option:
                    1. Type name
                    2. Select gender
                    3. Select race
                    4. Select profession
                    5. Select equipment type
                    6. Select equipment name
                    7. Randomly roll attributes
                    8. View current character
                    9. Finish building character
                    """);
            try {
                int option = scanner.nextInt();
                scanner.nextLine(); // consume newline

                switch (option) {
                    case 1 -> {
                        System.out.print("Enter name: ");
                        String name = scanner.nextLine();
                        builder.setName(name);
                    }
                    case 2 -> {
                        System.out.println("Select gender:");
                        // Gender[] genderTypes = Gender.values();
                        for (Gender genderType : Gender.values()) {
                            System.out.println(genderType.ordinal() + 1 + ". " + genderType);
                        }
                        int genderOption = scanner.nextInt();
                        scanner.nextLine(); // consume newline
                        builder.setGender(Gender.values()[genderOption - 1]);
                    }
                    case 3 -> {
                        System.out.println("Select race:");
                        for (Race raceType : Race.values()) {
                            System.out.println(raceType.ordinal() + 1 + ". " + raceType);
                        }
                        int raceOption = scanner.nextInt();
                        scanner.nextLine(); // consume newline
                        builder.setRace(Race.values()[raceOption - 1]);
                    }
                    case 4 -> {
                        System.out.println("Select profession:");
                        for (Profession professionType : Profession.values()) {
                            System.out.println(professionType.ordinal() + 1 + ". " + professionType);
                        }
                        int professionOption = scanner.nextInt();
                        scanner.nextLine(); // consume newline
                        builder.setProfession(Profession.values()[professionOption - 1]);
                    }
                    case 5 -> {
                        System.out.println("Select equipment type:");
                        for (EquipmentType equipmentType : EquipmentType.values()) {
                            System.out.println(equipmentType.ordinal() + 1 + ". " + equipmentType);
                        }
                        int equipmentTypeOption = scanner.nextInt();
                        scanner.nextLine(); // consume newline
                        builder.setEquipmentType(EquipmentType.values()[equipmentTypeOption - 1]);
                    }
                    case 6 -> {
                        EquipmentType selectedType = builder.getEquipmentType();
                        System.out.println("Select equipment name:");
                        for (EquipmentName equipmentName : EquipmentName.values()) {
                            if (equipmentName.getEquipmentType() == selectedType) {
                                System.out.println(equipmentName.ordinal() + 1 + ". " + equipmentName);
                            }
                        }
                        int equipmentNameOption = scanner.nextInt();
                        scanner.nextLine(); // consume newline
                        builder.setEquipmentName(EquipmentName.values()[equipmentNameOption - 1]);
                    }
                    case 7 -> {
                        builder.manualAttributes();
                    }
                    case 8 -> {
                        builder.rollAttributes();
                    }
                    case 9 -> {
                        Character character = builder.getCharacter();
                        System.out.println("Current character:");
                        System.out.println(character);
                    }
                    case 10 -> {
                        done = true;
                    }
                    default -> {
                        System.out.println("Invalid option!");
                    }
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Invalid option! Please enter a valid option.");
                scanner.nextLine(); // consume newline
            }

        }

        Character character = builder.getCharacter();
        System.out.println("Character created:");
        System.out.println(character);
    }
}

// import java.util.Scanner;

// public class Director {
// private final Builder builder;

// public Director(Builder builder) {
// this.builder = builder;
// }

// public void createCharacter() {
// Scanner scanner = new Scanner(System.in);

// System.out.println("Welcome to the character creator!");
// System.out.println("Please select from the following options:");
// System.out.println("1. Enter a name for your character");
// System.out.println("2. Select a profession for your character");
// System.out.println("3. Equip your character with items");
// System.out.println("4. Roll attributes randomly");
// System.out.println("5. Finish and create your character");

// boolean finished = false;
// while (!finished) {
// System.out.print("Enter your choice: ");
// String choice = scanner.nextLine();

// switch (choice) {
// case "1":
// System.out.print("Enter your character's name: ");
// String name = scanner.nextLine();
// builder.setName(name);
// break;
// case "2":
// System.out.println("Select a profession for your character:");
// System.out.println("1. Warrior");
// System.out.println("2. Mage");
// System.out.println("3. Thief");
// System.out.print("Enter your choice: ");
// int professionChoice = Integer.parseInt(scanner.nextLine());
// switch (professionChoice) {
// case 1:
// builder.setProfession(Profession.WARRIOR);
// break;
// case 2:
// builder.setProfession(Profession.MAGE);
// break;
// case 3:
// builder.setProfession(Profession.THIEF);
// break;
// default:
// System.out.println("Invalid choice");
// break;
// }
// break;
// case "3":
// System.out.println("Equip your character with items:");
// System.out.println("1. Sword");
// System.out.println("2. Axe");
// System.out.println("3. Bow");
// System.out.print("Enter your choice: ");
// int itemChoice = Integer.parseInt(scanner.nextLine());
// switch (itemChoice) {
// case 1:
// builder.setWeapon(Weapon.SWORD);
// break;
// case 2:
// builder.setWeapon(Weapon.AXE);
// break;
// case 3:
// builder.setWeapon(Weapon.BOW);
// break;
// default:
// System.out.println("Invalid choice");
// break;
// }
// break;
// case "4":
// builder.rollAttributes();
// break;
// case "5":
// finished = true;
// break;
// default:
// System.out.println("Invalid choice");
// break;
// }
// }

// Character character = builder.getResult();
// System.out.println("Your character has been created!");
// System.out.println(character.toString());
// }
// }

// public class Director {
// private Builder builder;

// public Director(Builder builder) {
// this.builder = builder;
// }

// public void constructCharacter() {
// Scanner scanner = new Scanner(System.in);

// System.out.println("Create New Character");

// System.out.print("Type Name: ");
// String name = scanner.nextLine();
// builder.setName(name);

// System.out.print("Select Race (1. Human, 2. Elf, 3. Dwarf): ");
// int raceSelection = scanner.nextInt();
// switch (raceSelection) {
// case 1:
// builder.setRace(Race.HUMAN);
// break;
// case 2:
// builder.setRace(Race.ELF);
// break;
// case 3:
// builder.setRace(Race.DWARF);
// break;
// default:
// System.out.println("Invalid selection, defaulting to human");
// builder.setRace(Race.HUMAN);
// break;
// }

// System.out.print("Select Profession (1. Warrior, 2. Mage, 3. Rogue): ");
// int professionSelection = scanner.nextInt();
// switch (professionSelection) {
// case 1:
// builder.setProfession(Profession.WARRIOR);
// break;
// case 2:
// builder.setProfession(Profession.MAGE);
// break;
// case 3:
// builder.setProfession(Profession.ROGUE);
// break;
// default:
// System.out.println("Invalid selection, defaulting to warrior");
// builder.setProfession(Profession.WARRIOR);
// break;
// }

// System.out.print("Select Weapon (1. Sword, 2. Axe, 3. Bow): ");
// int weaponSelection = scanner.nextInt();
// switch (weaponSelection) {
// case 1:
// builder.setWeapon(Weapon.SWORD);
// break;
// case 2:
// builder.setWeapon(Weapon.AXE);
// break;
// case 3:
// builder.setWeapon(Weapon.BOW);
// break;
// default:
// System.out.println("Invalid selection, defaulting to sword");
// builder.setWeapon(Weapon.SWORD);
// break;
// }

// System.out.print("Select Armor (1. Light, 2. Medium, 3. Heavy): ");
// int armorSelection = scanner.nextInt();
// switch (armorSelection) {
// case 1:
// builder.setArmor(Armor.LIGHT);
// break;
// case 2:
// builder.setArmor(Armor.MEDIUM);
// break;
// case 3:
// builder.setArmor(Armor.HEAVY);
// break;
// default:
// System.out.println("Invalid selection, defaulting to light armor");
// builder.setArmor(Armor.LIGHT);
// break;
// }

// System.out.print("Randomly Roll Attributes? (y/n): ");
// String rollSelection = scanner.next();
// if (rollSelection.equalsIgnoreCase("y")) {
// builder.rollAttributes();
// } else {
// System.out.print("Enter Attribute Values: ");
// int health = scanner.nextInt();
// int strength = scanner.nextInt();
// int defense = scanner.nextInt();
// builder.setAttributes(health, strength, defense);
// }

// System.out.println("Character created: " + builder.build().toString());
// }
// }
