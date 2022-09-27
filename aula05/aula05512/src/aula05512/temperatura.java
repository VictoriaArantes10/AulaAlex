package aula05512;

public class temperatura {
    public static void CparaF(double C) {
        Double F = (C * 1.8) + 32;
        System.out.println(C + " = " + F);
    }
    public static void CparaK(double C) {
        Double K = C + 273.15;
        System.out.println(C + " = " + K);
    }
    public static void CparaRe(double C) {
        Double Re = C * 0.8;
        System.out.println(C + " = " + Re);
    }
    public static void CparaRa(double C) {
        Double Ra = (C * 1.8) + 491.67;
        System.out.println(C + " = " + Ra);
    }
}
