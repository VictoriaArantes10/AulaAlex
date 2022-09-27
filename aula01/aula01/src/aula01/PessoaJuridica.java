package aula01;

public class PessoaJuridica extends Pessoa{
    public String cnpj;

    public PessoaJuridica(String cnpj, String nome, String telefone, String email, String endereco, float valor) {
        super(nome, telefone, email, endereco, valor);
        this.cnpj = cnpj;
    }
    
    @Override
    public void calcular_desconto(float percentual) {
        this.valor = this.valor - (this.valor * ((percentual + 20)/100));
    }
    
    @Override
    public void imprimir() {
        System.out.println("Nome: " +nome);
        System.out.println("Telefone: " +telefone);
        System.out.println("Email: " +email);
        System.out.println("Endereco: " +endereco);
        System.out.println("Valor: " +valor);
        System.out.println("CPF: " +cnpj);
    }
}
