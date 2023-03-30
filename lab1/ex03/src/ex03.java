/* Depois, escreva uma variante do seu programa que usa sua classe LineCounter para ler
arquivos sequencialmente, sem o uso de threads e de recursos do java 8 */

import java.io.*;
import java.util.Arrays;
// import java.time.*;

public class ex03 {
    private static final String PATH = "C:\\Users\\augus\\OneDrive\\Área de Trabalho\\UFU-BSI\\4º Período\\GSI020 - Programação Orientada a Objetos 2\\Lab\\lab1\\ex03\\src\\Arquivos";

    public static void main(String[] args) {
        long inicio = System.currentTimeMillis(); // marca o tempo de início da execução do programa
        // Instant inicio = Instant.now();

        File pasta = new File(PATH);
        int totalLinhas = Arrays.stream(pasta.listFiles())
                .filter(arquivo -> arquivo.isFile() && arquivo.getName().endsWith(".txt"))
                .mapToInt(arquivo -> {
                    LineCounter lineCounter = new LineCounter(arquivo);
                    lineCounter.run();
                    return lineCounter.getLines();
                })
                .sum();
        System.out.println("Número total de linhas: " + totalLinhas);

        long fim = System.currentTimeMillis(); // marca o tempo de fim da execução do programa
        // Instant fim = Instant.now();
        long tempo = fim - inicio; // calcula o tempo de execução do programa
        // long tempo = Duration.between(inicio, fim).toMillis();

        System.out.println("Tempo de execução: " + tempo + "ms");
    }

}

/*
 * Ex01:
 * Com runnable:
 * Para 10 arquivos:
 * Tempo de execução: 22ms
 * Tempo de execução: 30ms
 * Tempo de execução: 31ms
 * Tempo de execução: 22ms
 * Tempo de execução: 38ms
 * 
 * Para 100 arquivos:
 * Tempo de execução: 36ms
 * Tempo de execução: 38ms
 * Tempo de execução: 51ms
 * Tempo de execução: 48ms
 * Tempo de execução: 57ms
 * 
 * Para 1000 arquivos:
 * Tempo de execução: 217ms
 * Tempo de execução: 224ms
 * Tempo de execução: 199ms
 * Tempo de execução: 235ms
 * Tempo de execução: 283ms
 * 
 * Conclusão: Em relação ao tempo de execução, o programa com runnable é mais
 * rápido que o programa com thread pools, pois o programa com runnable é O(n),
 * enquanto o programa com thread pools é O(n²).
 * 
 * Ex02:
 * Thread pools com 100 threads:
 * Para 10 arquivos:
 * Tempo de execução: 39ms
 * Tempo de execução: 35ms
 * Tempo de execução: 28ms
 * Tempo de execução: 49ms
 * Tempo de execução: 39ms
 * 
 * Para 100 arquivos:
 * Tempo de execução: 130ms
 * Tempo de execução: 136ms
 * Tempo de execução: 140ms
 * Tempo de execução: 160ms
 * Tempo de execução: 211ms
 * 
 * Para 1000 arquivos :
 * Tempo de execução: 879ms
 * Tempo de execução: 811ms
 * Tempo de execução: 970ms
 * Tempo de execução: 1076ms
 * Tempo de execução: 2038ms
 * 
 * Conclusão: O tempo de execução do programa com threads pool acabou sendo
 * maior que o tempo de execução do programa sequencial, isso se deve ao fato de
 * que o tempo de execução do programa sequencial é O(n), enquanto o tempo de
 * execução do programa com threads pool é O(n²), pois o tempo de execução de
 * cada thread é O(n), e o número de threads é O(n).
 * 
 * Creio que o programa com threads pools é mais rápido que o programa
 * sequencial, entretato, acredito que a forma pela qual implementei o programa
 * com threads pools, ele acabou não sendo tão rápido/eficiente quanto o
 * programa sequencial e/ou o programa com runnable.
 * 
 * Ex03:
 * Sequencialmente (sem threads)
 * Para 10 arquivos:
 * Tempo de execução: 22ms
 * Tempo de execução: 32ms
 * Tempo de execução: 20ms
 * Tempo de execução: 28ms
 * Tempo de execução: 29ms
 *
 * Para 100 arquivos:
 * Tempo de execução: 60ms
 * Tempo de execução: 77ms
 * Tempo de execução: 82ms
 * Tempo de execução: 78ms
 * Tempo de execução: 89ms
 * 
 * Para 1000 arquivos:
 * Tempo de execução: 212ms
 * Tempo de execução: 279ms
 * Tempo de execução: 318ms
 * Tempo de execução: 486ms
 * Tempo de execução: 381ms
 * 
 * Conclusão: O tempo de execução do programa é diretamente proporcional ao
 * número de arquivos a serem lidos, ou seja, o tempo de execução do programa é
 * O(n), onde n é o número de arquivos a serem lidos.
 * 
 * Especificações da minha máquina:
 * Nome do dispositivo Lenovo-Flex-5i
 * Processador Intel(R) Core(TM) i5-1035G1 CPU @ 1.00GHz 1.19 GHz
 * RAM instalada 8,00 GB (utilizável: 7,76 GB)
 * Tipo de sistema Sistema operacional de 64 bits, processador baseado em x64
 * Caneta e toque Suporte a caneta e toque com 10 pontos de toque
 * Edição Windows 11 Home
 * Versão 22H2
 */

// VARIAÇÃO DO PROGRAMA QUE NÃO UTILIZA THREADS E RECURSOS DO JAVA 8:
//     public static void main(String[] args) {
//         File pasta = new File(PATH);
//         File[] listaDeArq = pasta.listFiles();
//         int totalLinhas = 0;
//         for (File arquivo : listaDeArq) {
//             if (arquivo.isFile() && arquivo.getName().endsWith(".txt")) {
//                 LineCounter line = new LineCounter(arquivo);
//                 line.run();
//                 totalLinhas += line.getLines();
//             }
//         }
//         System.out.println("Número total de linhas: " + totalLinhas);
//     }
// }