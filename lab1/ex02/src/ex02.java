import java.io.*;
import java.util.concurrent.*;
import java.util.*;

public class ex02 {
    private static final String PATH = "C:\\Users\\augus\\OneDrive\\Área de Trabalho\\UFU-BSI\\4º Período\\GSI020 - Programação Orientada a Objetos 2\\Lab\\lab1\\ex02\\src\\Arquivos";

    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(100);
        // ScheduledExecutorService executor = Executors.newScheduledThreadPool(100);

        // Future representa o resultado de uma computação assíncrona.
        // Nesse caso é basicamente uma forma da thread principal controlar o progresso
        // e o resultado das outras threads

        // Abaixo, uma lista de futures do tipo inteiro para armazenar os resultados das
        // threads que serão executadas
        List<Future<Integer>> futures = new ArrayList<>();
        File pasta = new File(PATH);
        Arrays.stream(pasta.listFiles()) // stream de arquivos da pasta
                .filter(arquivo -> arquivo.isFile() && arquivo.getName().endsWith(".txt"))
                .forEach(arquivo -> { // para cada arquivo, cria uma thread e adiciona a lista de futures
                    LineCounter lineCounter = new LineCounter(arquivo);
                    futures.add(executor.submit(lineCounter)); // submit retorna um future do tipo inteiro
                });
        executor.shutdown();

        int totalLinhas = 0;
        for (Future<Integer> future : futures) { // para cada future, espera o resultado da thread
            try {
                totalLinhas += future.get(); // soma o resultado de cada future para obter o total de linhas
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }

        futures.forEach(future -> {
            try {
                System.out.println(future.get() + " linhas processados por " + future.toString());
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        });
        System.out.println("Número total de linhas: " + totalLinhas);

        long fim = System.currentTimeMillis();
        long tempo = fim - inicio;
        System.out.println("Tempo de execução: " + tempo + "ms");
    }

}
