import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        String input;
        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese palabra");
        input = in.nextLine();
        esPalindromo(input);
    }

    private static void esPalindromo(String input) {

        input = input.toLowerCase();

        String input_invertido = new StringBuilder(input).reverse().toString();
        
        if (input.equals(input_invertido)) {
             System.out.println("la palabra ingresada es un palindromo");
        }else{
            System.out.println("la palabra ingresada no es un palindromo");
        }

    }
}
