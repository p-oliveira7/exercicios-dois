package exercicios01.exercicio8;

import java.util.Scanner;

public class Palindromo {
    public static String verificaPalindromo(String palavra) {
        String palavraInvertida = new StringBuilder(palavra).reverse().toString();
        if (palavra.equalsIgnoreCase(palavraInvertida)) {
            return "A palavra fornecida é um palíndromo!";
        } else {
            return "A palavra fornecida não é um palíndromo.";
        }
    }

    public static String digitaPalavra() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma palavra: ");
        String palavra = scanner.nextLine();
        scanner.close();
        return palavra;
    }

    public static void main(String[] args) {
        String palavra = digitaPalavra();
        String resultado = verificaPalindromo(palavra);
        System.out.println(resultado);
    }
}


