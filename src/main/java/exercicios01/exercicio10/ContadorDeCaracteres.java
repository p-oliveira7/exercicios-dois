package exercicios01.exercicio10;

import java.util.Scanner;

public class ContadorDeCaracteres {
    public static void contaCaracteres(String texto) {
        int vogais = 0;
        int espacos = 0;
        int consoantes = 0;

        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            if (c == ' ') {
                espacos++;
            } else if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                    c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                vogais++;
            } else if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
                consoantes++;
            }
        }

        System.out.println("Vogais: " + vogais);
        System.out.println("Espaços: " + espacos);
        System.out.println("Consoantes: " + consoantes);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um texto: ");
        String texto = scanner.nextLine();
        scanner.close();

        contaCaracteres(texto);
    }
}


