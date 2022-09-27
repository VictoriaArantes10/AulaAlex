package aula01;

public class PessoaFisica extends Pessoa {
    public String cpf;

    public PessoaFisica(String cpf, String nome, String telefone, String email, String endereco, float valor) {
        super(nome, telefone, email, endereco, valor);
        this.cpf = cpf;
    }
    
    @Override
    public void calcular_desconto(float percentual) {
        this.valor = this.valor - (this.valor * ((percentual + 10)/100));
    }
    
    @Override
    public void imprimir() {
        System.out.println("Nome: " +nome);
        System.out.println("Telefone: " +telefone);
        System.out.println("Email: " +email);
        System.out.println("Endereco: " +endereco);
        System.out.println("Valor: " +valor);
        System.out.println("CPF: " +cpf);
    }
    
}
