package exer2abstract;

public class circunferencia extends formag {
    
    public float raio;

    public circunferencia(float raio, String nome) {
        super(nome);
        this.raio = raio;
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


