import java.util.Scanner;

public class Sueldo {
 
    public static void main(String[] args) throws Exception {
        Empleado [] empleados = new Empleado[5];
        Scanner in = new Scanner(System.in);
        String empleado;
        Integer sueldo;
        Integer mayorSueldo = 0;
        Integer totalSueldos = 0;
        String empleadoMejorPago = "";

        for (int i = 0; i < empleados.length; i++)
        {
            System.out.println("Ingrese nombre del empleado ");
            empleado = in.nextLine();
            System.out.println("Ingrese sueldo del empleado ");
            sueldo = Integer.parseInt(in.nextLine());
            empleados[i] =  new Empleado(empleado, sueldo);
        }

        in.close();

        for (int i = 0; i < empleados.length; i++) 
        {
            totalSueldos += empleados[i].getSueldo();

            if (mayorSueldo < empleados[i].getSueldo())
            {
                 mayorSueldo = empleados[i].getSueldo();
                 empleadoMejorPago = empleados[i].getNombre();
            }            
        }

        System.out.println("El empleado mejor pago es " + empleadoMejorPago +", su sueldo es "+mayorSueldo);
        System.out.println("El sueldo promedio es "+totalSueldos/empleados.length);

    }
}
