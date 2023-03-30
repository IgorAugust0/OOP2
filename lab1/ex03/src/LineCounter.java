import java.io.*;
/* Depois, escreva uma variante do seu programa que usa sua classe LineCounter para ler
arquivos sequencialmente, sem o uso de threads. */

public class LineCounter {
    private File file;
    private int lines;

    public LineCounter(File file) {
        this.file = file;
    }

    public void run() { 
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file)); //
            while (reader.readLine() != null)
                lines++;
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public int getLines() {
        return lines;
    }
}