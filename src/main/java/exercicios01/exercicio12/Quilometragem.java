package exercicios01.exercicio12;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Quilometragem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalQuilometros = 0;
        int totalLitros = 0;
        int tanqueCheio = 1;

        while (true) {
            System.out.println("Tanque cheio #" + tanqueCheio + ":");
            int quilometros = getValidNumber(scanner, "Digite os quilômetros dirigidos ou -1 para sair: ");
            if (quilometros == -1) {
                break;
            }

            int litros = getValidNumber(scanner, "Digite os litros de gasolina consumidos: ");

            totalQuilometros += quilometros;
            totalLitros += litros;

            double consumo = (double) quilometros / litros;
            System.out.printf("Consumo para este tanque cheio: %.2f km/l%n", consumo);

            System.out.printf("Consumo total: %.2f km/l%n", (double) totalQuilometros / totalLitros);

            tanqueCheio++;
        }

        scanner.close();
    }

    private static int getValidNumber(Scanner scanner, String message) {
        while (true) {
            try {
                System.out.print(message);
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Por favor, insira um valor numérico válido.");
                scanner.nextLine(); // Limpar o buffer do scanner
            }
        }
    }
}
