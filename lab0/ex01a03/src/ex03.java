// 3) Escreva um programa que gera um número aleatório de 1 a 100, e então pede
// para o usuário adivinhar o número. O programa deve retornar se o chute do
// usuário foi muito alto ou muito baixo, e então pedir outro chute até que o usuário
// acerte.

import java.util.*;

public class ex03 {
    public static void main(String[] args) {
        Random rand = new Random();
        int num = rand.nextInt(100) + 1; // Gera um num de 0 a 100
        int chute = 0;
        try (Scanner input = new Scanner(System.in)) {
            while (chute != num) { // enquanto o num digitado for diferente do gerado
                System.out.print("Digite um número de 0 a 100: ");
                chute = input.nextInt();
                if (chute > num) {
                    System.out.print("\nChute muito alto, digite novamente\n");
                } else if (chute < num) {
                    System.out.print("\nChute muito baixo, digite novamente\n");
                }

            }
            System.out.print("\nParabéns, você acertou!");
        }
    }
}