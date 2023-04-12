package builder;

import java.util.Scanner;

import builder.attributes.*;
import builder.builders.*;
import builder.game.*;

public class Director {
    private CharacterBuilder builder;
    private Scanner scanner;
    private Score score;

    public Director(CharacterBuilder builder) {
        this.builder = builder;
        this.scanner = new Scanner(System.in);
        this.score = new Score();
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
                    7. Manually enter attributes
                    8. Randomly roll attributes
                    9. View current character
                    10. Finish building character
                    """);
            try {
                int option = scanner.nextInt();
                scanner.nextLine(); // consume newline

                switch (option) {
                    case 1 -> {
                        System.out.print("Enter name: ");
                        String name = scanner.nextLine();
                        builder.setName(name);
                        // score += 10;
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
                        // score += 10;
                    }
                    case 3 -> {
                        System.out.println("Select race:");
                        for (Race raceType : Race.values()) {
                            System.out.println(raceType.ordinal() + 1 + ". " + raceType);
                        }
                        int raceOption = scanner.nextInt();
                        scanner.nextLine(); // consume newline
                        builder.setRace(Race.values()[raceOption - 1]);
                        // score += 10;
                    }
                    case 4 -> {
                        System.out.println("Select profession:");
                        for (Profession professionType : Profession.values()) {
                            System.out.println(professionType.ordinal() + 1 + ". " + professionType);
                        }
                        int professionOption = scanner.nextInt();
                        scanner.nextLine(); // consume newline
                        builder.setProfession(Profession.values()[professionOption - 1]);
                        // score += 10;
                    }
                    case 5 -> {
                        System.out.println("Select equipment type:");
                        for (EquipmentType equipmentType : EquipmentType.values()) {
                            System.out.println(equipmentType.ordinal() + 1 + ". " + equipmentType);
                        }
                        int equipmentTypeOption = scanner.nextInt();
                        scanner.nextLine(); // consume newline
                        builder.setEquipmentType(EquipmentType.values()[equipmentTypeOption - 1]);
                        // score += 10;
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
                        // score += 10;
                    }
                    case 7 -> {
                        builder.manualAttributes();
                        // score += 15;
                    }
                    case 8 -> {
                        builder.rollAttributes();
                        // score += 5;
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
        Score score = builder.getScore();
        System.out.println("Score: " + score);
        Character character = builder.getCharacter();
        System.out.println("Character created:");
        System.out.println(character);
    }
}