package metodos;

import java.util.Scanner;

public class Exerc02 {
    public static void main(String[] args) {
        System.out.println("Implemente um método chamado ehPrimo que recebe um número como parâmetro e retorna true se ele for primo e false caso contrário. ");
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número para verificar se é primo: ");
        int numero = sc.nextInt();
        sc.close();

        System.out.println(ehPrimo(numero) ? "é um número primo."
                                           : "não é um número primo.");
    }

    public static boolean ehPrimo(int num) {
        if (num <= 1) { return false; }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) { return false; }
        }
        return true;
    }
}
