// 1) Faça um programa que lê 2 strings e checa se a primeira termina com os
// caracteres da segunda.

import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            String str1, str2;
            System.out.print("Digite a primeira string: ");
            str1 = input.nextLine();
            System.out.print("Digite a segunda string: ");
            str2 = input.nextLine();
            if (str1.endsWith(str2)) { // retorna true se a string termina com os caracteres da outra
                System.out.println("A primeira string termina com os caracteres da segunda.");
            } else {
                System.out.println("A primeira string não termina com os caracteres da segunda.");
            }
        }
    }
}
