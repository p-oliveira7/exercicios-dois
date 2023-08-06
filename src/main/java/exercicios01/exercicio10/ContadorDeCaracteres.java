package exercicios01.exercicio10;

import java.util.Scanner;

public class ContadorDeCaracteres {
    public static void contaCaracteres(String texto) {
        int vogais = 0;
        int espacos = 0;
        int consoantes = 0;

        texto = texto.toLowerCase();

        for (char c : texto.toCharArray()) {
            switch (c) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    vogais++;
                    break;
                case ' ':
                    espacos++;
                    break;
                default:
                    if ((c >= 'a' && c <= 'z')) {
                        consoantes++;
                    }
                    break;
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



