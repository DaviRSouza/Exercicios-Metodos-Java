package metodos;

import java.util.Scanner;

public class Exerc09 {

    public static void main(String[] args) {
        System.out.println("Crie um método chamado ehPalindromo que recebe uma string como parâmetro e retorna true se ela for um palíndromo e false caso contrário. ");

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma palavra ou frase para verificar se é um palíndromo:");
        String texto = sc.nextLine();
        sc.close();
        boolean resultado = ehPalindromo(texto);

        System.out.println(resultado ? "A palavra/frase é um palíndromo."
                                     : "A palavra/frase não é um palíndromo.");
    }

    public static boolean ehPalindromo(String texto) {
        texto = texto.toLowerCase().replaceAll("[^a-zA-Z]", ""); // Remover caracteres não alfabéticos e considerar minúsculas

        int esquerda = 0;
        int direita = texto.length() - 1;

        while (esquerda < direita) {
            if (texto.charAt(esquerda) != texto.charAt(direita)) {
                return false;
            }
            esquerda++;
            direita--;
        }
        return true;
    }
}
