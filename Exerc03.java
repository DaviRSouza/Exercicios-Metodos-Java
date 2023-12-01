package metodos;

import java.util.Scanner;

public class Exerc03 {
    public static void main(String[] args) {
        System.out.println("Crie um método chamado calcularMedia que recebe um array de números como parâmetro e retorna a média deles. ");

        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos números você deseja inserir para calcular a média?");
        int quantidadeNumeros = sc.nextInt();

        double[] numeros = new double[quantidadeNumeros];

        for (int i = 0; i < quantidadeNumeros; i++) {
            System.out.println("Digite o número " + (i + 1) + ": ");
            numeros[i] = sc.nextDouble();
        }
        sc.close();

        double media = calcularMedia(numeros);
        System.out.println("A média dos números é: " + media);
    }

    public static double calcularMedia(double[] array) {
        if (array.length == 0) { return 0; }

        double soma = 0;
        for (double num : array) {
            soma += num;
        }
        return soma / array.length;
    }
}
