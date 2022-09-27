package aula0808;

public final class PessoaJuridica extends Pessoa {
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
        System.out.println("Nome: " +this.nome);
        System.out.println("Telefone: " +this.telefone);
        System.out.println("Email: " +this.endereco);
        System.out.println("Cpf: " +this.cnpj);
        System.out.println("Valor Desconto: " +this.valor);   
    }
    
}
