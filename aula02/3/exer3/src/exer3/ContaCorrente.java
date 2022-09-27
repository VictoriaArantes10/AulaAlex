package exer3;

public class ContaCorrente extends Conta implements IConta {

    public ContaCorrente(int numero, String agencia, String titular, double saldo) {
        super(numero, agencia, titular, saldo);
    }
    


    @Override
    public void depositar(Double valor) {
        this.saldo = valor + this.saldo;
        System.out.println("//////Depositar//////");
        this.imprimir();
        System.out.println("////////////");
    }

    @Override
    public void sacar(Double valor) {
         this.saldo = this.saldo - valor;
         System.out.println("//////Sacar//////");
         this.imprimir();
         System.out.println("////////////");
    }

    @Override
    public void investir() {
        this.saldo = this.saldo + (this.saldo * 0.03);
        System.out.println("//////Investir//////");
        this.imprimir();
        System.out.println("////////////");
    }

    @Override
    public void imprimir() {
        System.out.println("Número: " + this.numero);
        System.out.println("Agencia: " + this.agencia);
        System.out.println("Titular: " + this.titular);
        System.out.println("Saldo: " + this.saldo);
    }
    
}
