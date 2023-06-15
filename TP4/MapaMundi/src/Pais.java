import java.util.ArrayList;
import java.util.List;

public class Pais {
    private String nombre ;
    private String capital;
    private List<Provincia> provincias = new ArrayList<Provincia>();
    private List<Frontera> paisesLimitrofes = new ArrayList<Frontera>();

    public Pais(String nombre, String capital, List<Provincia> provincias) {
        this.nombre = nombre;
        this.capital = capital;
        this.provincias = provincias;
    }

    public Pais(String nombre, String capital) {
        this.nombre = nombre;
        this.capital = capital;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCapital() {
        return this.capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public List<Provincia> getProvincias() {
        return this.provincias;
    }

    public void setProvincias(List<Provincia> provincias) {
        this.provincias = provincias;
    }

    public void add (Provincia provincia){
        this.provincias.add(provincia);
    }

    public boolean delete (Provincia provincia){
        return this.provincias.remove(provincia);
    }

    public List<Frontera> getFronteras() {
		return paisesLimitrofes;
	}

    public void add (Frontera limitrofe) {
		this.paisesLimitrofes.add(limitrofe);
	}
	
	public boolean delete (Frontera limitrofe) {
		return this.paisesLimitrofes.remove(limitrofe);
	}

    @Override
    public String toString() {
        return "{" +
            " nombre='" + getNombre() + "'" +
            ", capital='" + getCapital()+           
            "}";
    }
 
}
