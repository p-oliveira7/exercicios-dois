package exercicios01.exercicio09;

import java.util.Scanner;

public class AreaCirculo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double raio = 0;
        boolean valido = false;
        while (!valido) {
            System.out.println("Digite o raio do círculo: ");
            if (scanner.hasNextDouble()) {
                raio = scanner.nextDouble();
                valido = true;
            } else {
                System.out.println("Valor inválido. Por favor, digite um número.");
                scanner.next();
            }
        }
        scanner.close();

        double area = Math.PI * Math.pow(raio, 2);
        long areaArredondada = Math.round(area);

        System.out.println("A área do círculo é: " + areaArredondada);
    }
}
