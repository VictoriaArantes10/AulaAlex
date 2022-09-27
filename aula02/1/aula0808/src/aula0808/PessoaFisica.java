
package aula0808;


public final class PessoaFisica extends Pessoa {

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
        System.out.println("Nome: " +this.nome);
        System.out.println("Telefone: " +this.telefone);
        System.out.println("Email: " +this.endereco);
        System.out.println("Cpf: " +this.cpf);
        System.out.println("Valor Desconto: " +this.valor);   
    }

    
    
}
