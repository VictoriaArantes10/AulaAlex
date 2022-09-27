
package aula01;


public class Aula01 {

    public static void main(String[] args) {
        PessoaJuridica samuel = new PessoaJuridica("124312312","Victória","100","victoria_amrosa@hotmail.com","Rua Aquidauana 1190",500);
        
        samuel.calcular_desconto(10);
        
        samuel.imprimir();
    }
    
    
    
}
