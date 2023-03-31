import java.io.*;
import java.util.concurrent.*;

// Callable é uma interface parecida com Runnable, mas que retorna um valor e pode lançar uma exceção
public class LineCounter implements Callable<Integer> {
    private final File file;
    // private String name;

    public LineCounter(File file /* , String name */) {
        this.file = file;
        // this.name = name;
    }

    @Override
    public Integer call() throws Exception {
        System.out.println(Thread.currentThread().getName() + " started processing " + file.getName());
        int lines = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            // Long duration = (long) (Math.random() * 15);
            // System.out.println("Executando : " + name);
            // TimeUnit.SECONDS.sleep(duration);
            // System.out.println("Terminou : " + name);
            while (reader.readLine() != null) {

                lines++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lines;
    }

    // public String getName() {
    // return name;
    // }
}
