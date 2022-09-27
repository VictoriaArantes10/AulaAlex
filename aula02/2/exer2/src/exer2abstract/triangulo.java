package exer2abstract;

public class triangulo extends formag {

    public float base;
    public float altura;

    public triangulo(float base, float altura, String nome) {
        super(nome);
        this.base = base;
        this.altura = altura;
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
    

