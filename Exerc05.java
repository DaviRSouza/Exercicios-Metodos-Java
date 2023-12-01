package metodos;

import java.util.Scanner;

public class Exerc05 {
    public static void main(String[] args) {
        System.out.println("Crie um método chamado contarVogais que recebe uma string como parâmetro e retorna o número de vogais nela. ");
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma frase para contar o número de vogais:");
        String texto = sc.nextLine();
        sc.close();
        int numVogais = contarVogais(texto);
        System.out.println("O número de vogais no texto é: " + numVogais);
    }

    public static int contarVogais(String texto) {
        int contadorVogais = 0;

        texto = texto.toLowerCase();

        for (int i = 0; i < texto.length(); i++) {
            char caractere = texto.charAt(i);

            if (caractere == 'a' || caractere == 'e' || caractere == 'i' ||
                    caractere == 'o' || caractere == 'u') {
                contadorVogais++;
            }
        }
        return contadorVogais;
    }
}
