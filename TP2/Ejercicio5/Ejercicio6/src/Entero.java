public class Entero 
{
    private Integer numero;
    //constructor de la clase Enteros
    public Entero(Integer numero) 
    {
        super();
        this.numero = numero;
    }
    public Integer getNumero() 
    {
        return numero;
    }
    public void setNumero(Integer numero) 
    {
        this.numero = numero;
    }
    //calcula el cuadrado de n
    public Integer cuadrado()
    {
        return numero * numero;
    }
}