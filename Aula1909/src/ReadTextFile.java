import java.io.IOException;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;


public class ReadTextFile {

    private static Scanner input;

    public static void openFile() {
        try {
            input = new Scanner(Paths.get("clients.txt"));
        } catch (IOException ioException) {
            System.err.println("Error opening file. Terminating.");
            System.exit(1);
        }
    }
    // lê o registro no arquivo

    public static Cliente readRecords() {
        
        try {    
            
            
            Cliente cliente = new Cliente(input.next(), input.next(), input.next(), input.nextDouble());
            
            return cliente;

        } catch (NoSuchElementException elementException) {
            System.err.println("File improperly formed. Terminating.");
        } catch (IllegalStateException stateException) {
            System.err.println("Error reading from file. Terminating.");
        }
        
        return null;
    } 

    public static void closeFile() {
        if (input != null) {
            input.close();
        }
    }
}
