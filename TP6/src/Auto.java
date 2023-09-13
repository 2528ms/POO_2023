public class Auto implements ImpactoEcologico{
    private String Patente;
    private Integer NumMotor;
    private Integer NumChasis;
    private String motor;
    private double emisionesCO2;
    private double consumoCombustible;


    public Auto(String Patente, Integer NumMotor, Integer NumChasis, String motor, double emisionesCO2, double consumoCombustible) {
        this.Patente = Patente;
        this.NumMotor = NumMotor;
        this.NumChasis = NumChasis;
        this.motor = motor;
        this.emisionesCO2 = emisionesCO2;
        this.consumoCombustible = consumoCombustible;
    }


    public String getPatente() {
        return this.Patente;
    }

    public void setPatente(String Patente) {
        this.Patente = Patente;
    }

    public Integer getNumMotor() {
        return this.NumMotor;
    }

    public void setNumMotor(Integer NumMotor) {
        this.NumMotor = NumMotor;
    }

    public Integer getNumChasis() {
        return this.NumChasis;
    }

    public void setNumChasis(Integer NumChasis) {
        this.NumChasis = NumChasis;
    }

    public String getMotor() {
        return this.motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public double getEmisionesCO2() {
        return this.emisionesCO2;
    }

    public void setEmisionesCO2(double emisionesCO2) {
        this.emisionesCO2 = emisionesCO2;
    }

    public double getConsumoCombustible() {
        return this.consumoCombustible;
    }

    public void setConsumoCombustible(double consumoCombustible) {
        this.consumoCombustible = consumoCombustible;
    }
   

    public double obtenerImpactoEcologico(){
        // Calcular el impacto ecológico en base a las emisiones de CO2 y el consumo de combustible
        double impacto = (emisionesCO2 * 1000) / consumoCombustible;
        return impacto;
    }

    @Override
    public String toString() {
        return "[" +
            " Patente='" + getPatente() + "'" +
            ", NumMotor='" + getNumMotor() + "'" +
            ", NumChasis='" + getNumChasis() + "'" +
            ", motor='" + getMotor() + "'" +
            ", emisionesCO2='" + getEmisionesCO2() + "'" +
            ", consumoCombustible='" + getConsumoCombustible() + "'" +
            "]";
    }


}
