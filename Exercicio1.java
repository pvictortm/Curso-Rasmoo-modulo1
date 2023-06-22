import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
    // Faça um programq que receba como entrada um valor que represente uma
    // temperatura em graus celsius e imprima esse valor convertido em
    // Kelvin e Fahrenheit.

    // K = C + 273.15
    // F = C * 1.8 + 32

        Scanner scanner = new Scanner(System.in); //lê um valor digitado em terminal para ser recuperado no código
        System.out.println("Digite uma temperatura em graus celsius.");
        double temperaturaCelsius = scanner.nextDouble(); // lendo uma variavel que possua o double

        double kelvin = temperaturaCelsius + 273.15;
        double fahrenheit = temperaturaCelsius * 1.8 + 32;

        System.out.println("A temperatura em Kelvin é: " + kelvin);
        System.out.println("A temperatura em Fahrenheit é: " + fahrenheit);


    }
}
