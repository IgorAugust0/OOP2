// package builder.game;

// import builder.attributes.EquipmentName;
// import builder.attributes.Gender;
// import builder.attributes.Profession;
// import builder.attributes.Race;

// public class ScoringSystem {
//     ...

//     Static method that calculates the score of a given character
//     public static int calculateScore(Character character) {
//         int score = 0;

//         // Add points based on the character's gender
//         Gender gender = character.getGender();
//         if (gender == Gender.FEMALE) {
//             score += 10;
//         } else {
//             score += 5;
//         }

//         // Add points based on the character's race
//         Race race = character.getRace();
//         switch (race) {
//             case HUMAN:
//                 score += 5;
//                 break;
//             case ELF:
//                 score += 10;
//                 break;
//             case DWARF:
//                 score += 15;
//                 break;
//             case ORC:
//                 score += 20;
//                 break;
//             default:
//                 break;
//         }

//         // Add points based on the character's profession
//         Profession profession = character.getProfession();
//         switch (profession) {
//             case WARRIOR:
//                 score += 10;
//                 break;
//             case MAGE:
//                 score += 15;
//                 break;
//             case ROGUE:
//                 score += 20;
//                 break;
//             default:
//                 break;
//         }

//         // Add points based on the character's attributes
//         Attributes attributes = character.getAttributes();
//         int totalAttributes = attributes.getStrength() + attributes.getDexterity() +
//                 attributes.getIntelligence() + attributes.getWisdom() + attributes.getConstitution();

//         if (totalAttributes >= 50) {
//             score += 15;
//         } else if (totalAttributes >= 40) {
//             score += 10;
//         } else if (totalAttributes >= 30) {
//             score += 5;
//         }

//         // Add points based on the character's equipment
//         EquipmentName equipmentName = character.getEquipmentName();
//         switch (equipmentName) {
//             case SWORD:
//             case BOW:
//             case WAND:
//                 score += 10;
//                 break;
//             case ARMOR:
//                 score += 15;
//                 break;
//             case POTION:
//                 score += 5;
//                 break;
//             default:
//                 break;
//         }

//         return score;
//     }
// }

