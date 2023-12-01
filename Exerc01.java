package metodos;
import java.util.Scanner;

public class Exerc01 {
    public static void main(String[] args) {
        System.out.println("Crie um método chamado soma que recebe dois números como parâmetros e retorna a soma deles. ");

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int numero1 = sc.nextInt();
        System.out.println("Digite o segundo número: ");
        int numero2 = sc.nextInt();
        sc.close();

        int resultado = soma(numero1, numero2);
        System.out.println("A soma de " + numero1 + " e " + numero2 + " é: " + resultado);

    }
    public static int soma(int a, int b) {
        return a + b;
    }
}

