/*1) Escreva um programa Java que lê todos os arquivos .TXT de uma pasta e imprime o
somatório total do número de linhas dos arquivos. O programa deve criar uma thread por
arquivo e usar essas threads para contar as linhas em todos os arquivos ao mesmo tempo.
Use java.io.LineNumberReader para lhe ajudar a contar as linhas. Você provavelmente vai
querer definir uma classe LineCounter que herda de Thread ou implementa Runnable. */

import java.io.*;
import java.util.Arrays;

public class ex01 {
    private static final String PATH = "C:\\Users\\augus\\OneDrive\\Área de Trabalho\\UFU-BSI\\4º Período\\GSI020 - Programação Orientada a Objetos 2\\Lab\\lab1\\ex01\\src\\Arquivos";

    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();

        File pasta = new File(PATH);
        int totalLinhas = Arrays.stream(pasta.listFiles()) // cria uma stream com os arquivos do caminho
                // encadeamento de métodos stream (fluent API)
                .filter(arquivo -> arquivo.isFile() && arquivo.getName().endsWith(".txt")) // expressão lambda para filtrar os arquivos que são txt
                .parallel() // cria uma stream paralela para processar os arquivos
                .mapToInt(arquivo -> { // mapeia cada arquivo para um inteiro que representa o número de linhas
                    LineCounter lineCounter = new LineCounter(arquivo);
                    Thread thread = new Thread(lineCounter);
                    thread.start();
                    try {
                        thread.join();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    return lineCounter.getLines();
                })
                .sum(); // soma todos os valores da stream para obter o total de linhas
        System.out.println("Número total de linhas: " + totalLinhas);

        long fim = System.currentTimeMillis();
        long tempo = fim - inicio;
        System.out.println("Tempo de execução: " + tempo + "ms");
    }

}

/*
 * public static void main(String[] args) {
 * File pasta = new File(PATH);
 * File[] listaDeArq = pasta.listFiles(); // lista os arquivos do caminho e
 * armazenam no vetor criado
 * int totalLinhas = 0;
 * for (File arquivo : listaDeArq) { // percorre vetor de arquivos
 * if (arquivo.isFile() && arquivo.getName().endsWith(".txt")) { // se for
 * arquivo e se terminar com txt
 * LineCounter lineCounter = new LineCounter(arquivo); // cria objeto do tipo
 * LineCounter
 * Thread thread = new Thread(lineCounter);
 * thread.start();
 * try {
 * thread.join();
 * } catch (InterruptedException e) {
 * e.printStackTrace();
 * }
 * totalLinhas += lineCounter.getLines();
 * }
 * }
 * System.out.println("Número total de linhas: " + totalLinhas);
 * }
 * }
 */