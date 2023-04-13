package builder.util;

//import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class InputUtils {
    public static int getValidInput(Scanner scanner, String prompt, int min, int max) {
        while (true) {
            System.out.print(prompt);
            try {
                int input = scanner.nextInt();
                if (input >= min && input <= max) {
                    return input;
                }
            } catch (/*InputMismatchException |*/ NoSuchElementException e) {
                System.out.println("Ocorreu um erro. Digite um número inteiro.");
                scanner.nextLine();
            }
            System.out.println("Erro: Digite um número entre os limites especificados.");
            scanner.nextLine();
        }
    }

}
