package builder.director;

import java.util.Scanner;

import builder.attributes.*;
import builder.builders.*;
import builder.character.Character;
import builder.equipments.*;

public class Director {
    private String playerName;
    private CharacterBuilder builder;
    private Scanner scanner;
    private int score;

    public Director(String playerName, CharacterBuilder builder) {
        this.playerName = playerName;
        this.builder = builder;
        this.scanner = new Scanner(System.in);
        this.score = 0;
    }

    public void constructCharacter() {
        System.out.println("\nBem-vindo ao criador de personagem, " + playerName + "!");

        boolean done = false;

        while (!done) {
            System.out.println("""
                    Selecione uma opção:
                    1. Nome
                    2. Gênero
                    3. Raça
                    4. Profissão
                    5. Tipo de equipamento
                    6. Equipamento
                    7. Inserir atributos manualmente
                    8. Rolar atributos aleatoriamente
                    9. Ver meu personagem atual
                    10. Terminei de criar meu personagem!
                    """);
            try {
                int option = scanner.nextInt();
                scanner.nextLine(); // consume newline

                switch (option) {
                    case 1 -> {
                        System.out.print("Digite o nome do seu personagem: ");
                        String name = scanner.nextLine();
                        builder.setName(name);
                        score += 10;
                    }
                    case 2 -> {
                        System.out.println("Escolha o gênero:");
                        // Gender[] genderTypes = Gender.values();
                        for (Gender genderType : Gender.values()) {
                            System.out.println(genderType.ordinal() + 1 + ". " + genderType);
                        }
                        int genderOption = scanner.nextInt();
                        scanner.nextLine(); // consume newline
                        builder.setGender(Gender.values()[genderOption - 1]);
                        score += 10;
                    }
                    case 3 -> {
                        System.out.println("Escolha a raça:");
                        for (Race raceType : Race.values()) {
                            System.out.println(raceType.ordinal() + 1 + ". " + raceType);
                        }
                        int raceOption = scanner.nextInt();
                        scanner.nextLine(); // consume newline
                        builder.setRace(Race.values()[raceOption - 1]);
                        score += 10;
                    }
                    case 4 -> {
                        System.out.println("Escolha a profissão:");
                        for (Profession professionType : Profession.values()) {
                            System.out.println(professionType.ordinal() + 1 + ". " + professionType);
                        }
                        int professionOption = scanner.nextInt();
                        scanner.nextLine(); // consume newline
                        builder.setProfession(Profession.values()[professionOption - 1]);
                        score += 10;
                    }
                    case 5 -> {
                        System.out.println("Escolha o tipo de equipamento:");
                        for (EquipmentType equipmentType : EquipmentType.values()) {
                            System.out.println(equipmentType.ordinal() + 1 + ". " + equipmentType);
                        }
                        int equipmentTypeOption = scanner.nextInt();
                        scanner.nextLine(); // consume newline
                        builder.setEquipmentType(EquipmentType.values()[equipmentTypeOption - 1]);
                        score += 10;
                    }
                    case 6 -> {
                        EquipmentType selectedType = builder.getEquipmentType();
                        System.out.println("Escolha qual equipamento:");
                        for (EquipmentName equipmentName : EquipmentName.values()) {
                            if (equipmentName.getEquipmentType() == selectedType) {
                                System.out.println(equipmentName.ordinal() + 1 + ". " + equipmentName);
                            }
                        }
                        int equipmentNameOption = scanner.nextInt();
                        scanner.nextLine(); // consume newline
                        builder.setEquipmentName(EquipmentName.values()[equipmentNameOption - 1]);
                        score += 10;
                    }
                    case 7 -> {
                        builder.manualAttributes();
                        score += 15;
                    }
                    case 8 -> {
                        builder.rollAttributes();
                        System.out.println("Pressione qualquer tecla para continuar...");
                        scanner.nextLine(); // espera por qualquer tecla
                        score += 5;
                    }
                    case 9 -> {
                        Character character = builder.getCharacter();
                        System.out.println("Personagem atual:");
                        System.out.println(character);
                        System.out.println("Pressione qualquer tecla para continuar...");
                        scanner.nextLine(); // espera por qualquer tecla
                    }
                    case 10 -> {
                        done = true;
                    }
                    default -> {
                        System.out.println("Opção inválida!");
                    }
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Opção inválida! Por favor, digite um número entre 1 e 10.");
                scanner.nextLine(); // consume newline
            }

        }
        Character character = builder.getCharacter();
        System.out.println("\nSeu personagem:");
        System.out.println(character);
        System.out.println("Pontuação de " + playerName + ": " + score);
    }
}