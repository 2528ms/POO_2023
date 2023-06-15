import java.util.Scanner;

public class MapaMundi {
    public static void main(String[] args) {
        //Instanciamos MapaMundial
        MapaMundial mapa = new MapaMundial();
        //Inicializamos con el metodo toda la data de MapaMundial
        mapa.inicializar();
     
        //Ingresamos el nombre de un continente para que nos devuelva sus paises
        System.out.println("Ingrese el continente del que desea obtener sus paises");
        Scanner in = new Scanner(System.in);
        String ingresoContinente = in.nextLine();
        System.out.println(mapa.getPaises(ingresoContinente));

        //Ingresamos el nombre de pais que deseamos obtener sus fronteras
        System.out.println("Ingrese el pais del que desea obtener sus fronteras");
        Scanner in1 = new Scanner(System.in);
        String fronterasPais = in1.nextLine();
        System.out.println(mapa.gettLimitrofes(fronterasPais));

        System.out.println("Ingrese el pais del que desea obtener sus provincias");
        Scanner in2 = new Scanner(System.in);
        String ingresoPais = in2.nextLine();
        System.out.println(mapa.gettProvincias(ingresoPais));

        
        in.close();
        in1.close();
        in2.close();        
    }
}
