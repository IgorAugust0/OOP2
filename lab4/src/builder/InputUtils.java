package builder;

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
                System.out.println("Invalid input, please try again.");
                scanner.nextLine();
            }
            System.out.println("Invalid input, please try again.");
            scanner.nextLine();
        }
    }

}
