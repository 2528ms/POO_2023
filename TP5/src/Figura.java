public abstract class Figura {
    private String color;
    private String nombre;
    private Punto centro;

    public Figura(String color, String nombre, Punto centro) {
        this.color = color;
        this.nombre = nombre;
        this.centro = centro;
    }


    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Punto getCentro() {
        return this.centro;
    }

    protected void mover(Punto centro) {
        this.centro = centro;
    }

    public void moverX(Integer x){
        this.centro.setX(this.centro.getX( )+ x);
    }

    public void moverY(Integer Y){
        this.centro.setY(this.centro.getY( )+ Y);
    }

    @Override
    public String toString() {
        return "[" +
            "nombre:'" + getNombre() + "'" +
            " color:'" + getColor() + "'" +
            ", centro:'" + getCentro() + "'" +
            "]";
    }

    public abstract double area();
	
	public abstract Integer perimetro();
   
}
