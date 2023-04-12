package builder;

import java.util.Scanner;

import builder.builders.CharacterBuilder;
import builder.game.Score;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Score score = new Score();
        CharacterBuilder builder = new CharacterBuilder(score);
        Director director = new Director(builder);

        director.constructCharacter();
        scanner.close();
    }
}
