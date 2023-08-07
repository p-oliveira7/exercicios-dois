package exercicios01.exercicio06;

public class ProdutoImpares {
    public static void main(String[] args) {
        int produtoInt = 1;
        float produtoFloat = 1.0f;
        for (int i = 15; i <= 30; i++) {
            if (i % 2 != 0) {
                produtoInt *= i;
                produtoFloat *= i;
            }
        }
        System.out.println("O produto dos números ímpares de 15 a 30 (usando int) é: " + produtoInt);
        System.out.println("O produto dos números ímpares de 15 a 30 (usando float) é: " + produtoFloat);
    }
}
