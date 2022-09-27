package exer3;

public class Exer3 {

    public static void main(String[] args) {
        ContaCorrente contac = new ContaCorrente(123,"213456","Victória Arantes",123);
        
        ContaPoupanca contap = new ContaPoupanca(123,"123456","Victória Arantes",123456);
        
        contac.depositar(123.0);
        
        contac.sacar(123.0);
        
        contac.investir();
        
        contap.depositar(123.0);
        
        contap.sacar(123.0);
        
        contap.investir();
       
       
    }
    
}
