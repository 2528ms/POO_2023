public class TrianguloRectangulo extends Rectangulo{
    private Integer hiputenusa;

    public TrianguloRectangulo(String nombre, String color, Punto centro, Integer ladoVertical,
         Integer ladoHorizontal,Integer hiputenusa) {

        super(nombre, color, centro, ladoVertical, ladoHorizontal);
        this.hiputenusa = hiputenusa;

    }

    public Integer getHiputenusa() {
        return this.hiputenusa;
    }

    public void setHiputenusa(Integer hiputenusa) {
        this.hiputenusa = hiputenusa;
    }

    @Override
    public String toString() {
        return "[" +super.toString()+
            " hiputenusa='" + getHiputenusa() + "'" +
            "]";
    }

}
