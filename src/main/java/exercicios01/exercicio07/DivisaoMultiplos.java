package exercicios01.exercicio07;

public class DivisaoMultiplos {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                int resultadoInt = i / 2;
                double resultadoDouble = i / 2.0;
                System.out.println("O resultado da divisão de " + i + " por 2 (usando int) é: " + resultadoInt);
                System.out.println("O resultado da divisão de " + i + " por 2 (usando double) é: " + resultadoDouble);
            }
        }
    }
}
