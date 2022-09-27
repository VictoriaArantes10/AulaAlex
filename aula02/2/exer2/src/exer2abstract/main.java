package exer2abstract;

public class main {

    public static void main(String[] args) {
        triangulo triangulo = new triangulo (10,15,"triângulo");
        
        triangulo.calcularArea();
        
        triangulo.imprimir();
        
        quadrado quadrado = new quadrado (10,"quadrado");
        
        quadrado.calcularArea();
        
        quadrado.imprimir();
        
        circunferencia circunferencia = new circunferencia (10,"circuferência");
        
        circunferencia.calcularArea();
        
        circunferencia.imprimir();
    }
    
}
