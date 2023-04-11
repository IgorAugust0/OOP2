package builder;

import java.util.Scanner;

import builder.builders.CharacterBuilder;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CharacterBuilder builder = new CharacterBuilder();
        Director director = new Director(builder);

        director.constructCharacter();
        scanner.close();
    }
}


// public static void main(String[] args) {
// CharacterBuilder builder = new CharacterBuilder();
// Director director = new Director(builder);
// // Character character = director.constructCharacter();
// director.constructCharacter();
// System.out.println("Personagem criado: " + character.toString());
// }
