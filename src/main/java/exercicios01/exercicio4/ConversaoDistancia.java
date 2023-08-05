package exercicios01.exercicio4;

import java.util.Scanner;

public class ConversaoDistancia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a distância em milhas: ");
        double milhas = scanner.nextDouble();
        double quilometros = milhas * 1.609;
        System.out.println(milhas + " milhas é igual a " + quilometros + " quilômetros.");
    }
}
