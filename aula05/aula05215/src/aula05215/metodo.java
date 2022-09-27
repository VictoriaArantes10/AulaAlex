package aula05215;



public class metodo {
    public static void quadrado(double lado) {
        Double area = Math.pow(lado, 2);
        System.out.println("Área do quadrado: " + area);
    }
    
    public static void triangulo(double base, double altura) {
        Double area = base*altura/2;
        System.out.println("Área do triângulo: " + area);
    }
    
    public static void circuferencia(double raio) {
        Double area = Math.PI * Math.pow(raio, 2);
        System.out.println("Área do circuferência: " + area);
    }
}
