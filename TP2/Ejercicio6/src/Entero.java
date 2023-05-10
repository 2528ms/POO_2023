public class Entero {
    private Integer numero;
    private Integer factorial = 1;
    //constructor de la clase Enteros
    public Entero(Integer numero) {
    super();
    this.numero = numero;
    }
    public Integer getNumero() {
    return numero;
    }
    public void setNumero(Integer numero) {
    this.numero = numero;
    }
    //calcula el cuadrado de n
    public Integer cuadrado(){
    return numero*numero;
    }

    //Verifica si el numero es par o impar
    public String parImpar(){
        if (numero % 2 == 0){
            return "Par";
        }else{
            return "Impar";
        }
    }

    //calcula el factorial del numero
    public Integer factorial () {
        while ( numero!=0) 
        {
            factorial=factorial*numero; numero--;
        }
        return factorial;
    }

    public String esPrimo() {

        for(int i=2;i<numero;i++) {
            if(numero%i==0)
                return "NO es numero primo";;
        }
        return "es numero primo";
    }

}