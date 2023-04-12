package test;

import java.util.Scanner;

import test.builders.*;
import test.director.*;
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
