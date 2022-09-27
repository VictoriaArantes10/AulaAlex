package exer2abstract;

public class quadrado extends formag {
    
    public float lado;

    public quadrado(float lado, String nome) {
        super(nome);
        this.lado = lado;
    }
    
    
    
     @Override
    public void calcularArea() {
        this.area = this.lado * this.lado ;
    }
    
    @Override
    public void imprimir() {
         System.out.println("Nome:" + this.nome);
         System.out.println("Lado:" + this.lado);
         System.out.println("Área:" + this.area);
    }
}
