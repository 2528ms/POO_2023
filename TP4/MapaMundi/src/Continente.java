import java.util.ArrayList;
import java.util.List;

public class Continente {
    private String nombre;
    private List<Pais> paises = new ArrayList<Pais>();

    public Continente(String nombre, List<Pais> pais) {
        this.nombre = nombre;
        this.paises = pais;
    }

    public Continente(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Pais> getPaises() {
        return this.paises;
    }

    public void setPais(List<Pais> pais) {
        this.paises = pais;
    }

    public void add (Pais pais){
        this.paises.add(pais);
    }

    public boolean delete (Pais pais){
        return this.paises.remove(pais);
    }

    @Override
    public String toString() {
        return "{" +
            " nombre='" + getNombre() + "'" +
            ", pais='" + getPaises() + "'" +
            "}";
    }

}
