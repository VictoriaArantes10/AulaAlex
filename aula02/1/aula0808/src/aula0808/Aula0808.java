package aula0808;


public class Aula0808 {

   
   
    public static void main(String[] args) {
        PessoaJuridica pessoaj = new PessoaJuridica("215","Victória","2150","victoria@victoria.com","Rua Aquidauana 1190",500);
        
        pessoaj.calcular_desconto(10);
        
        pessoaj.imprimir();
    }
    
    
    
}
