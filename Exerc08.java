package metodos;

import java.util.Scanner;

public class Exerc08 {

    public static void main(String[] args) {
        System.out.println("Implemente um método chamado encontrarMaiorElemento que recebe uma matriz de inteiros como parâmetro e retorna o maior elemento presente nela. ");
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número de linhas da matriz:");
        int linhas = sc.nextInt();

        System.out.println("Digite o número de colunas da matriz:");
        int colunas = sc.nextInt();

        int[][] matriz = new int[linhas][colunas];

        System.out.println("Digite os elementos da matriz:");

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }
        sc.close();

        int maiorElemento = encontrarMaiorElemento(matriz);
        System.out.println("O maior elemento na matriz é: " + maiorElemento);
    }

    public static int encontrarMaiorElemento(int[][] matriz) {
        int maior = matriz[0][0];

        for (int[] linha : matriz) {
            for (int elemento : linha) {
                if (elemento > maior) {
                    maior = elemento;
                }
            }
        }

        return maior;
    }
}

