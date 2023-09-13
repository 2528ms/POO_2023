import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        Bicicleta bicicleta = new Bicicleta(2234, 29, "Montanbike", 0);
        Edificio guay2 = new Edificio(8, "9 de Julio 25", 30, 10000, 50000, 2000);
        Auto auto = new Auto("KCH241", 22445589, 3355678, "1.6", 100, 8);

        List<ImpactoEcologico> lista = new ArrayList<ImpactoEcologico>();
		lista.add(bicicleta.obtenerImpactoEcologico());
    }
}
