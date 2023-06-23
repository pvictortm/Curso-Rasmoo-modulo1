import java.util.Scanner;

public class exercicio1 {

    public static void main(String[] args) {

//        Read 2 variables, named A and B and make the sum of these two variables, assigning its result to the variable X. Print X as shown below. Print endline after the result otherwise you will get “Presentation Error”.
//
//        Input
//        The input file will contain 2 integer numbers.
//
//        Output
//        Print the letter X (uppercase) with a blank space before and after the equal signal followed by the value of X, according to the following example.
//
//        Note: don't forget the endline after all.

        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite um valor: ");
        Integer valorA = scanner.nextInt();

        System.out.println("Digite outro valor: ");
        Integer valorB = scanner.nextInt();

        int X = valorA + valorB;

        if(X > 0 && X < 100) {
            System.out.println("X = " + X);
        } else if (X > 100) {
            System.out.println("Erro de apresentação!");
        }
    }

}
