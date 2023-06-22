public class Elipse extends Figura{
    private Integer radioMayor;
    private Integer radioMenor;

    public Elipse (String nombre, String color, Punto punto,Integer radioMayor, Integer radioMenor){
        super(color, nombre, punto);
        this.radioMayor = radioMayor;
        this.radioMenor = radioMenor;
    }

    public Integer getRadioMayor() {
        return this.radioMayor;
    }

    public void setRadioMayor(Integer radioMayor) {
        this.radioMayor = radioMayor;
    }

    public Integer getRadioMenor() {
        return this.radioMenor;
    }

    public void setRadioMenor(Integer radioMenor) {
        this.radioMenor = radioMenor;
    }

    @Override
    public double area() {
        return 3.14159 * (radioMayor * radioMenor);
       
    }

    @Override
    public Integer perimetro() {
        return null;
    }

    @Override
    public String toString() {
        return "["+ super.toString() +
            " radioMayor='" + getRadioMayor() + "'" +
            ", radioMenor='" + getRadioMenor() + "'" +
            "]";
    }

}
