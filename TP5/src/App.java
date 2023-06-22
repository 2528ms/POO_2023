import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        
        Rectangulo r1 = new Rectangulo("Rectangulo 1","Rojo", new Punto (3,6), 4, 5);
		Cuadrado c1 = new Cuadrado("Cuadrado 1","gris", new Punto (8,2), 2, 2);		
		Elipse e1 = new Elipse("Elipse 1", "Azul", new Punto (3,7),2,1);
        Circulo cir1 = new Circulo("Cirucilo 1" , "Naranja", new Punto(6,7), 4, 1);
		Rectangulo r2 = new Rectangulo("Rectangulo 2","Negro", new Punto (3,6), 4, 5);
		Elipse e2 = new Elipse("Elipse 2", "Dorado", new Punto (3,7),2,1);

		List<Figura> lista = new ArrayList<Figura>();
		lista.add(r1);
		lista.add(c1);
		lista.add(e1);
        lista.add(cir1);
		lista.add(e2);
		lista.add(r2);

		for(Figura r : lista) {
			//r.setColor("Negro");
			//r.mover(new Punto(1,1));
			System.out.println(r.toString());
			System.out.println(r.area());
			System.out.println(r.perimetro());
			System.out.println("-------------------");
		}

    }
}
