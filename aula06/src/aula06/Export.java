package aula06;

import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;


public class Export {

public class CreateTextFile {

    private static Formatter output;

    public static void openFile() {
        try {
            output = new Formatter("C:\\Users\\User\\Desktop\\teste\\exer.txt"); // abre o arquivo
        } catch (SecurityException securityException) {
            System.err.println("Write permission denied. Terminating.");
            System.exit(1);
        } catch (FileNotFoundException fileNotFoundException) {
            System.err.println("Error opening file. Terminating.");
            System.exit(1);
        }
    }

        
    public static void exportar(String nome, String telefone, String email, String salario) {
        PrintWriter out;
try {
    out = new PrintWriter("C:\\Users\\User\\Desktop\\teste\\exer.txt");
    out.println(nome);
    out.println(telefone);
    out.println(email);
    out.println(salario);
    out.close();
} catch (FileNotFoundException e) {
    System.err.println("File doesn't exist");
    e.printStackTrace();
}
        
        
    }
    

    public static void closeFile() {
        if (output != null) {
            output.close();
        }
    }
}
}
