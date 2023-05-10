import java.util.Scanner;

public class PruebaEntero {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese numero ");
        Entero e = new Entero(Integer.valueOf(in.nextLine()));
        System.out.println("El numero " + e.getNumero() + " " + e.esPrimo());
        System.out.println("El numero ingresado es: "+ e.getNumero());
        System.out.println("El cuadrado de " + e.getNumero() + " es: " + e.cuadrado());
        System.out.println("El numero " + e.getNumero() + " es: " + e.parImpar());
        System.out.println("El factorial de " + e.getNumero() + " es: " + e.factorial());

        in.close();
    }
}