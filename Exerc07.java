package metodos;
import java.util.Scanner;

public class Exerc07 {

    public static void main(String[] args) {
        System.out.println("Crie um método chamado converterCelsiusParaFahrenheit que recebe uma temperatura em graus Celsius como parâmetro e retorna a temperatura equivalente em Fahrenheit. ");

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a temperatura em Celsius para converter para Fahrenheit:");
        double temperaturaCelsius = sc.nextDouble();
        sc.close();

        double temperaturaFahrenheit = converterCelsiusParaFahrenheit(temperaturaCelsius);
        System.out.println("A temperatura em Fahrenheit é: " + temperaturaFahrenheit);

    }

    public static double converterCelsiusParaFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
}

