import java.io.*;

public class LineCounter implements Runnable {
    private File file;
    private int lines;

    public LineCounter(File file) {
        this.file = file;
    }

    public int getLines() {
        return lines;
    }
    
    @Override
    public void run() {
        try {
            LineNumberReader lnr = new LineNumberReader(new FileReader(file)); // cria um LineNumberReader para ler o arquivo
            lnr.skip(Long.MAX_VALUE); // pula para o final do arquivo (ultima linha)
            lines = lnr.getLineNumber(); // getLineNumber() retorna o número da última linha lida
            lnr.close(); // fecha o arquivo
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
