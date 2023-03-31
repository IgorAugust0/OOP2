// 2) Faça um programa que lê uma string e conta os caracteres que aparecem nela,
// colocando caracteres e suas quantidades em um HashMap. Ao terminar a leitura,
// o programa mostra os caracteres e a quantidade de cada um.

import java.util.*;

public class ex02 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            String str;
            System.out.print("Digite uma string: ");
            str = input.nextLine();
            HashMap<Character, Integer> map = new HashMap<>(); // Character = tipo de chave, Integer = tipo de valor
            for (int i = 0; i < str.length(); i++) { // percorre a string e conta os caracteres
                char c = str.charAt(i); // cria um char com o caractere da posição i da string
                if (map.containsKey(c)) { // se o HashMap já contém o caractere
                    map.put(c, map.get(c) + 1); // incrementa o valor da chave c
                } else {
                    map.put(c, 1); // se não, adiciona o caractere c com valor 1
                }
            }
            for (Map.Entry<Character, Integer> entry : map.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }

}
