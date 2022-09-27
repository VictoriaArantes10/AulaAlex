package aula01;

public class Pessoa {
    public String nome;
    public String telefone;
    public String email;
    public String endereco;
    public float valor;

    public Pessoa(String nome, String telefone, String email, String endereco, float valor) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
        this.valor = valor;
    }
    
    public void calcular_desconto(float percentual) {
        this.valor = this.valor - (this.valor * (percentual/100));
    }
    
    public void imprimir() {
        System.out.println("Nome: " +nome);
        System.out.println("Telefone: " +telefone);
        System.out.println("Email: " +email);
        System.out.println("Endereco: " +endereco);
        System.out.println("Valor: " +valor);
    }
        
}
