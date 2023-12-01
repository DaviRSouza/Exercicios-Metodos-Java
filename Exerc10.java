package metodos;

import java.util.Scanner;

public class Exerc10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o tamanho do array:");
        int tamanho = sc.nextInt();

        int[] array = new int[tamanho];

        System.out.println("Digite os elementos do array:");

        for (int i = 0; i < tamanho; i++) {
            array[i] = sc.nextInt();
        }
        sc.close();
        ordenarCrescente(array);

        System.out.println("Array ordenado em ordem crescente:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
    public static void ordenarCrescente(int[] array) {
        int tamanho = array.length;
        boolean troca;
        do {
            troca = false;
            for (int i = 0; i < tamanho - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    troca = true;
                }
            }
        } while (troca);
    }
}
