import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        lectura_numeros();
    }

    private static void lectura_numeros(){

        int [] num_arreglo = new int[3];
        Scanner in = new Scanner(System.in);
        System.out.println("Si primer numero ingresado es +, realiza producto, si es - realiza suma");

        for (int i = 0; i < num_arreglo.length; i++){
        System.out.println("Ingrese un numero ");
        num_arreglo[i] =  Integer.parseInt(in.nextLine());
        }

        Integer producto;
        Integer suma;

        if (num_arreglo[0] >= 0) {
            producto = num_arreglo[1] * num_arreglo[2];
            System.out.println ("El producto de los numeros ingresado es " + producto);
        }else{
            suma = num_arreglo[1] + num_arreglo[2];
            System.out.println ("El producto de los numeros ingresado es " + suma);
        }

        System.out.println("Desea continuar s/n");
        in.nextLine();
        String continuar = in.nextLine();

        if (continuar.equalsIgnoreCase("s")) {
            lectura_numeros();
        }       

    }
}
