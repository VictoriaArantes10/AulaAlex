
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;


public class CreateTextFile {
    
    private static Formatter output;
    
      public static void openFile() {
        try {
            output = new Formatter("clients.txt"); // abre o arquivo
        } catch (SecurityException securityException) {
            System.err.println("Write permission denied. Terminating.");
            System.exit(1); // termina o programa
        } catch (FileNotFoundException fileNotFoundException) {
            System.err.println("Error opening file. Terminating.");
            System.exit(1); // termina o programa
        }
    }

    public static void addRecords(String Nome, String Telefone, String Email, double Salario) {
        
        
            try {
                // gera saída do novo registro para o arquivo; supõe entrada válida                              
                output.format("%s %s %s %.2f%n", Nome, 
                Telefone, Email, Salario);                
                                
            } catch (FormatterClosedException formatterClosedException) {
                System.err.println("Error writing to file. Terminating.");
            } catch (NoSuchElementException elementException) {
                System.err.println("Invalid input. Please try again.");
            }
            System.out.print("? ");
            
    } //

    public static void closeFile() {
        if (output != null) {
            output.close();
        }
    }
}
