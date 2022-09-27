package exer2interface;

public class quadrado implements Iforma {
    public float lado;
    public String nome;
    public double area;

    public quadrado(float lado, String nome) {
        this.lado = lado;
        this.nome = nome;
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
