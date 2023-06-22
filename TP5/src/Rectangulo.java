public class Rectangulo extends Figura {
    private Integer ladoVertical;
    private Integer ladoHorizontal;

    public Rectangulo(String nombre, String color, Punto punto,Integer ladoVertical, Integer ladoHorizontal) {
        super(color, nombre, punto);
        this.ladoVertical = ladoVertical;
        this.ladoHorizontal = ladoHorizontal;
    }

    public Integer getLadoVertical() {
        return this.ladoVertical;
    }

    public void setLadoVertical(Integer ladoVertical) {
        this.ladoVertical = ladoVertical;
    }

    public Integer getLadoHorizontal() {
        return this.ladoHorizontal;
    }

    public void setLadoHorizontal(Integer ladoHorizontal) {
        this.ladoHorizontal = ladoHorizontal;
    }
   
    @Override
    public String toString() {
        return "[" +
            super.toString() +
            " ladoMayor='" + getLadoVertical() + "'" +
            ", ladoMenor='" + getLadoHorizontal() + "'" +
            "]";
    }
    
    public double area() {
        return this.ladoHorizontal * this.ladoVertical;
    }

    public Integer perimetro() {
		return 2 * this.ladoVertical + 2 * this.ladoHorizontal;
	}
	
	public void cambiarTamanio(Integer factor) {
		this.setLadoVertical(factor * this.ladoVertical);
		this.setLadoHorizontal(factor * this.ladoHorizontal);
	}

}
