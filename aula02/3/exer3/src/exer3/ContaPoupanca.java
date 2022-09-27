package exer3;

public class ContaPoupanca extends Conta implements IConta  {

    public ContaPoupanca(int numero, String agencia, String titular, double saldo) {
        super(numero, agencia, titular, saldo);
    }
    
    @Override
    public void depositar(Double valor) {
        this.saldo = valor + this.saldo;
        this.imprimir();
    }

    @Override
    public void sacar(Double valor) {
         this.saldo =this.saldo - valor;
         this.imprimir();
    }

    @Override
    public void investir() {
        this.saldo = this.saldo + (this.saldo * 0.05);
        this.imprimir();
    }

    @Override
    public void imprimir() {
        System.out.println("Número: " + this.numero);
        System.out.println("Agencia: " + this.agencia);
        System.out.println("Titular: " + this.titular);
        System.out.println("Saldo: " + this.saldo);
        
    }
    
    
}
