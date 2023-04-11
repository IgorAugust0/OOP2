// package builder.attributes;

// import java.util.Random;
// import java.util.Scanner;

// public class AttributeRoller {
//     private Profession profession;
//     private Character character;

//     public AttributeRoller(Profession profession, Character character) {
//         this.profession = profession;
//         this.character = character;
//     }

//     public void rollAttributes() {
//         Scanner scanner = new Scanner(System.in);
//         int option;

//         System.out.println("Select an option:");
//         System.out.println("1. Randomly roll attributes");
//         System.out.println("2. Manually assign attributes");
//         option = scanner.nextInt();
//         scanner.nextLine(); // consume newline

//         if (option == 1) {
//             // randomly roll attributes
//             Random random = new Random();
//             int maxAttribute = profession.getMaxAttribute();

//             int strength = random.nextInt(maxAttribute) + 1;
//             int dexterity = random.nextInt(maxAttribute) + 1;
//             int intelligence = random.nextInt(maxAttribute) + 1;
//             int healthPoints = random.nextInt(maxAttribute) + 1;

//             // Check for overpowered character
//             int totalPoints = healthPoints + strength + intelligence + dexterity;
//             int maxTotalPoints = profession.getMaxTotalPoints();
//             int maxAttributePoints = profession.getMaxAttributePoints();
//             if (totalPoints > maxTotalPoints || healthPoints > maxAttributePoints ||
//                     strength > maxAttributePoints || intelligence > maxAttributePoints
//                     || dexterity > maxAttributePoints) {
//                 System.out.println("Sorry, your character is overpowered. Please try again.");
//                 rollAttributes();
//             } else {
//                 character.setHealthPoints(healthPoints);
//                 character.setStrength(strength);
//                 character.setIntelligence(intelligence);
//                 character.setDexterity(dexterity);
//             }
//         } else if (option == 2) {
//             // manually assign attributes
//             int maxAttribute = profession.getMaxAttribute();

//             System.out.println("Enter strength (maximum " + maxAttribute + "): ");
//             int strength = scanner.nextInt();
//             scanner.nextLine(); // consume newline
//             strength = Math.min(maxAttribute, strength);

//             System.out.println("Enter dexterity (maximum " + maxAttribute + "): ");
//             int dexterity = scanner.nextInt();
//             scanner.nextLine(); // consume newline
//             dexterity = Math.min(maxAttribute, dexterity);

//             System.out.println("Enter intelligence (maximum " + profession.getIntelligenceLimit() + "): ");
//             int intelligence = scanner.nextInt();
//             scanner.nextLine(); // consume newline
//             intelligence = Math.min(profession.getIntelligenceLimit(), intelligence);

//             System.out.println("Enter health points (maximum " + maxAttribute + "): ");
//             int healthPoints = scanner.nextInt();
//             scanner.nextLine(); // consume newline
//             healthPoints = Math.min(maxAttribute, healthPoints);

//             // Check for overpowered character
//             int totalPoints = healthPoints + strength + intelligence + dexterity;
//             int maxTotalPoints = profession.getMaxTotalPoints();
//             int maxAttributePerType = profession.getMaxAttribute();
//             if (totalPoints > maxTotalPoints || healthPoints > maxAttributePerType ||
//                     strength > maxAttributePerType || intelligence > maxAttributePerType
//                     || dexterity > maxAttributePerType) {
//                 System.out.println("Sorry, your character is overpowered. Please try again.");
//                 rollAttributes();
//             } else {
//                 character.setHealthPoints(healthPoints);
//                 character.setStrength(strength);
//                 character.setIntelligence(intelligence);
//                 character.setDexterity(dexterity);
//             }
//         }
//     }
// }
