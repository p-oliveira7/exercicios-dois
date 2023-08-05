package exercicios01.exercicio11;

import java.util.Scanner;

public class ComparaPalavras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a primeira palavra: ");
        String palavra1 = scanner.nextLine();
        System.out.println("Digite a segunda palavra: ");
        String palavra2 = scanner.nextLine();
        scanner.close();

        System.out.println((palavra1.compareTo(palavra2) < 0) ? palavra1 + ", " + palavra2 : palavra2 + ", " + palavra1);

        String maisCaracteres = (palavra1.length() > palavra2.length()) ? palavra1 : (palavra1.length() < palavra2.length()) ? palavra2 : "As duas palavras têm o mesmo número de caracteres.";
        System.out.println("A palavra com maior número de caracteres é: " + maisCaracteres);
    }
}
