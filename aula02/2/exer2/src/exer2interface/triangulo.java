package exer2interface;

public class triangulo implements Iforma{
    public float base;
    public float altura;
    public String nome;
    public double area;

    public triangulo(float base, float altura, String nome) {
        this.base = base;
        this.altura = altura;
        this.nome = nome;
    }


    
    
    
    @Override
    public void calcularArea() {
        this.area = (this.base * this.altura) / 2;
    }
    
    @Override
    public void imprimir() {
         System.out.println("Nome:" + this.nome);
         System.out.println("Base:" + this.base);
         System.out.println("Altura:" + this.altura);
         System.out.println("Área:" + this.area);
    }
    
}
