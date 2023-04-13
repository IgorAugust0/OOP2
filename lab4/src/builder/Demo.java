package builder;

import java.util.Scanner;
import builder.builders.CharacterBuilder;
import builder.director.Director;

/**
 * Classe Demo que contém o método main para a execução do programa.
 */
public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CharacterBuilder builder = new CharacterBuilder();
        System.out.print("Digite seu nome: ");
        String playerName = scanner.nextLine();
        Director director = new Director(playerName, builder);

        director.constructCharacter();
        scanner.close();
    }
}
