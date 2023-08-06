package exercicios01.exercicio10;

import java.util.Scanner;
import java.text.Normalizer;

public class ContadorDeCaracteres {
    public static void contaCaracteres(String texto) {
        String vogais = "aeiou";
        int vogalCount = 0;
        int espacoCount = 0;
        int consoanteCount = 0;

        texto = texto.toLowerCase();

        texto = Normalizer.normalize(texto, Normalizer.Form.NFD);
        texto = texto.replaceAll("[^\\p{ASCII}]", "");

        for (char c : texto.toCharArray()) {
            if (Character.isLetter(c)) {
                if (vogais.indexOf(c) != -1) {
                    vogalCount++;
                } else {
                    consoanteCount++;
                }
            } else if (Character.isWhitespace(c)) {
                espacoCount++;
            }
        }

        System.out.println("Vogais: " + vogalCount);
        System.out.println("Espaços: " + espacoCount);
        System.out.println("Consoantes: " + consoanteCount);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um texto: ");
        String texto = scanner.nextLine();
        scanner.close();

        contaCaracteres(texto);
    }
}




