package dio.br.metodos;

public class Quadrilateros {

    public static void  area(double lado) {

        System.out.println("Area do Quadrado: " +lado +lado);
    }

    public static void  area(double lado1, double lado2) {

        System.out.println("Area do Retangulo: " +lado1 +lado2);
    }

    public static void  area(double baseMaior, double baseMenor, double altura) {

        System.out.println("Area do  trapezio: " +(baseMaior+baseMenor)+altura/2);
    }
    public static void  area(float diagonalMaior, float diagonalMenor) {

        System.out.println("Area do losango: " + (diagonalMaior * diagonalMenor));
    }
}
