package metodos;

import java.util.Scanner;

public class Exerc04 {
    public static void main(String[] args) {
        System.out.println("Implemente um método chamado fatorial que calcula o fatorial de um número passado como parâmetro. ");

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número para calcular o fatorial: ");
        int numero = sc.nextInt();
        sc.close();
        if (numero < 0) {
            System.out.println("O fatorial de números negativos não é definido.");
        } else {
            long resultado = fatorial(numero);
            System.out.println("O fatorial de " + numero + " é: " + resultado);
        }
    }

    public static long fatorial(int num) {
        if (num < 0) { throw new IllegalArgumentException("O fatorial de números negativos não é definido."); }
        long resultado = 1;
        for (int i = 1; i <= num; i++) { resultado *= i; }
        return resultado;
    }
}
