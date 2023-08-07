package exercicios01.exercicio05;

import java.util.Scanner;

public class DiaDaSemana {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número de 1 a 7: ");
        int dia = scanner.nextInt();
        String[] diasDaSemana = {"Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sábado", "Domingo"};
        if (dia >= 1 && dia <= 7) {
            System.out.println("O dia da semana correspondente é: " + diasDaSemana[dia - 1]);
        } else {
            System.out.println("Número inválido. Por favor, digite um número de 1 a 7.");
        }
    }
}
