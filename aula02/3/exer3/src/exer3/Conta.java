package exer3;

public abstract class Conta  {
    public int numero;
    public String agencia;
    public String titular;
    public double saldo;

    public Conta(int numero, String agencia, String titular, double saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.titular = titular;
        this.saldo = saldo;
    }
    
    
}
