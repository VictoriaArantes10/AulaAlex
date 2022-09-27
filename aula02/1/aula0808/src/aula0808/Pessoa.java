package aula0808;


public abstract class Pessoa implements IPessoa{
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
    
    
    @Override
     public void calcular_desconto(float percentual) {
        this.valor = this.valor - (this.valor * (percentual/100));
    }
    
    @Override
    public void imprimir() {
        System.out.println("Nome: " +this.nome);
        System.out.println("Telefone: " +this.telefone);
        System.out.println("Email: " +this.endereco);
        System.out.println("Valor Desconto: " +this.valor);
    }
        
}
