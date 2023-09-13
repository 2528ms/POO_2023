public class Edificio implements ImpactoEcologico{
    private Integer totalPisos;
    private String direcccion;
    private Integer totalDeptos;
    private double consumoEnergiaAnual; // kWh
    private static final double emisionesEnKwh = 0.5; // kg CO2/kWh
    private double recursosNaturales; // kg
    private double residuosGenerados; // kg



    public Edificio(Integer totalPisos, String direcccion, Integer totalDeptos, double consumoEnergiaAnual, double recursosNaturales, double residuosGenerados) {
        this.totalPisos = totalPisos;
        this.direcccion = direcccion;
        this.totalDeptos = totalDeptos;
        this.consumoEnergiaAnual = consumoEnergiaAnual;
        this.recursosNaturales = recursosNaturales;
        this.residuosGenerados = residuosGenerados;
    }

    public Integer getTotalPisos() {
        return this.totalPisos;
    }

    public void setTotalPisos(Integer totalPisos) {
        this.totalPisos = totalPisos;
    }

    public String getDirecccion() {
        return this.direcccion;
    }

    public void setDirecccion(String direcccion) {
        this.direcccion = direcccion;
    }

    public Integer getTotalDeptos() {
        return this.totalDeptos;
    }

    public void setTotalDeptos(Integer totalDeptos) {
        this.totalDeptos = totalDeptos;
    }

    public double getConsumoEnergiaAnual() {
        return this.consumoEnergiaAnual * emisionesEnKwh;
    }

    public void setConsumoEnergiaAnual(double consumoEnergiaAnual) {
        this.consumoEnergiaAnual = consumoEnergiaAnual;
    }

    public double getRecursosNaturales() {
        return this.recursosNaturales;
    }

    public void setRecursosNaturales(double recursosNaturales) {
        this.recursosNaturales = recursosNaturales;
    }

    public double getResiduosGenerados() {
        return this.residuosGenerados;
    }

    public void setResiduosGenerados(double residuosGenerados) {
        this.residuosGenerados = residuosGenerados;
    }

    public double obtenerImpactoEcologico(){
        double impactoEnergia = getConsumoEnergiaAnual();
        double impactoRecursosNaturales = getRecursosNaturales();
        double impactoResiduos = getResiduosGenerados();
        
        double impactoTotal = impactoEnergia + impactoRecursosNaturales + impactoResiduos;

        return impactoTotal;
    }

    @Override
    public String toString() {
        return "[" +
            " totalPisos='" + getTotalPisos() + "'" +
            ", direcccion='" + getDirecccion() + "'" +
            ", totalDeptos='" + getTotalDeptos() + "'" +
            ", consumoEnergiaAnual='" + getConsumoEnergiaAnual() + "'" +
            ", recursosNaturales='" + getRecursosNaturales() + "'" +
            ", residuosGenerados='" + getResiduosGenerados() + "'" +
            "]";
    }
 

}
