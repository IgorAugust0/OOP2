import java.io.*; // Import the File class

public class CreateFile {
    private static final String PATH = "C:\\Users\\augus\\OneDrive\\Área de Trabalho\\UFU-BSI\\4º Período\\GSI020 - Programação Orientada a Objetos 2\\Lab\\lab1\\ex03\\src\\Arquivos\\";
    private static final String text = "Never gonna give you up!\nNever gonna let you down\nNever gonna turn around and desert you\nNever gonna make you cry\nNever gonna say goodbye\nNever gonna tell a lie and hurt you";

    public static void main(String[] args) {
        for (int i = 1; i <= 1000; i++) {
            try {
                File obj = new File(PATH + "texto" + i + ".txt");
                FileWriter escritor = new FileWriter(PATH + "texto" + i + ".txt");
                PrintWriter gravarArq = new PrintWriter(escritor);
                gravarArq.print(text);
                gravarArq.close();
                System.out.println("Escrita com sucesso no arquivo");
                if (obj.createNewFile()) {
                    System.out.println("Arquivo criado: " + obj.getName());
                } else {
                    System.out.println("Arquivo já existe.");
                }
            } catch (IOException e) {
                System.out.println("Ocorreu um erro.");
                e.printStackTrace();
            }
        }
    }
}