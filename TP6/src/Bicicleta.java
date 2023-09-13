public class Bicicleta {
    private Integer numCuadro;
    private Integer radado;
    private String  tipo;
    private double emisionesCO2;


    public Bicicleta(Integer numCuadro, Integer radado, String tipo, double emisionesCO2) {
        this.numCuadro = numCuadro;
        this.radado = radado;
        this.tipo = tipo;
        this.emisionesCO2 = emisionesCO2;
    }

    public Integer getNumCuadro() {
        return this.numCuadro;
    }

    public void setNumCuadro(Integer numCuadro) {
        this.numCuadro = numCuadro;
    }

    public Integer getRadado() {
        return this.radado;
    }

    public void setRadado(Integer radado) {
        this.radado = radado;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getEmisionesCO2() {
        return this.emisionesCO2;
    }

    public void setEmisionesCO2(double emisionesCO2) {
        this.emisionesCO2 = emisionesCO2;
    }

    public double obtenerImpactoEcologico(){
        return this.emisionesCO2;
    }

    @Override
    public String toString() {
        return "[" +
            " numCuadro='" + getNumCuadro() + "'" +
            ", radado='" + getRadado() + "'" +
            ", tipo='" + getTipo() + "'" +
            ", emisionesCO2='" + getEmisionesCO2() + "'" +
            "]";
    }
   

}
