package exer2interface;

public class main {

    public static void main(String[] args) {
        
        triangulo triangulo = new triangulo (5,10,"triângulo");
        
        triangulo.calcularArea();
        
        triangulo.imprimir();
        
        quadrado quadrado = new quadrado (5,"quadrado");
        
        quadrado.calcularArea();
        
        quadrado.imprimir();
        
        circunferencia circunferencia = new circunferencia (5,"circuferência");
        
        circunferencia.calcularArea();
        
        circunferencia.imprimir();
        
    }
    }
    
