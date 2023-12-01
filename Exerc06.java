package metodos;
import java.util.Scanner;

public class Exerc06 {

    public static void main(String[] args) {
        System.out.println("Implemente um método chamado trocarValores que recebe dois inteiros como parâmetros e troca os valores entre eles. ");
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int numero1 = sc.nextInt();
        System.out.println("Digite o segundo número: ");
        int numero2 = sc.nextInt();
        sc.close();

        System.out.println("Valores antes da troca: ");
        System.out.println("Número 1: " + numero1 + ", Número 2: " + numero2);

        trocarValores(numero1, numero2);

        System.out.println("Valores depois da troca: ");
        System.out.println("Número 1: " + numero1 + ", Número 2: " + numero2);

    }
    public static void trocarValores(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }
}

