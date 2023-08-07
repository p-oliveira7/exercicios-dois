package exercicios01.exercicio02;

import java.util.Scanner;

public class MaiorValor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro valor: ");
        int valor1 = scanner.nextInt();
        System.out.println("Digite o segundo valor: ");
        int valor2 = scanner.nextInt();
        int maiorValor = Math.max(valor1, valor2);
        System.out.println("O maior valor é: " + maiorValor);
    }
}
