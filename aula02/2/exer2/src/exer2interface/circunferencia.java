package exer2interface;

public class circunferencia implements Iforma {
    public float raio;
    public String nome;
    public double area;

    public circunferencia(float raio, String nome) {
        this.raio = raio;
        this.nome = nome;
    }

    

  @Override
    public void calcularArea() {
        this.area = this.raio * this.raio * 3.14;
    }
    
    @Override
    public void imprimir() {
         System.out.println("Nome:" + this.nome);
         System.out.println("Lado:" + this.raio);
         System.out.println("Área:" + this.area);
    }
    
}
