package MyPackage;

import java.util.Scanner;
import javax.swing.JDialog;
import javax.swing.JFrame;

public class ExceptionsClass {
    
    public static void main(String[] args) {
        JFrame frame = new JFrame("teste");
        JDialog dialog = new JDialog(frame, "Só números");
        
        dialog.setSize(300,300);
        
        Scanner scan = new Scanner(System.in);
        
        try {
            System.out.println("Digite um dividendo: ");
            String dividendoStr = scan.nextLine();
            
            System.out.println("Digite um divisor: ");
            String divisorStr = scan.nextLine();
            
            if(!dividendoStr.matches("[+-]?\\d*(\\.\\d+)?") || !divisorStr.matches("[+-]?\\d*(\\.\\d+)?")) {
                throw new ConvertStringToNumericException();
            }
            
            double dividendo = Double.parseDouble(dividendoStr);
            double divisor = Double.parseDouble(divisorStr);
            
            System.out.println(Double.toString(dividendo / divisor));
            
        } catch(ConvertStringToNumericException ex) {
            dialog.setVisible(true);   
            
        } finally {
            System.out.println("Concluído.");
        }
    }
    
    public static class ConvertStringToNumericException extends Exception {
        
        @Override
        public String getMessage() {
            return "Erro ao Converter string para Inteiro";
        }
        
    }
    
}
