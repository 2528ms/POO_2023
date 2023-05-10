
import java.util.Arrays;
import java.util.Collections;

public class App {

    public static void main(String[] args) throws Exception {
        Integer[] numeros = {4,2,3,8,1};
        int suma_num = 0;
        

        for (int i = 0; i < numeros.length; i++){
            
            suma_num =  suma_num + numeros[i];
        
        }
        float promedio;
        promedio = (float) suma_num / (float) numeros.length; 
        
        System.out.println ("Array original " + Arrays.toString(numeros));
        System.out.println ("1 - El promedio de los numeros del array es " + promedio);
        System.out.println ("2 - La cantidad de numeros en el array es " + numeros.length); 
        Arrays.sort(numeros);
        System.out.println ("3 - El mayor valor del array es " + numeros[4]);
        System.out.println ("4 - Array de menor a mayor " + Arrays.toString(numeros));
        Arrays.sort(numeros, Collections.reverseOrder());
        System.out.println ("5 - Array de Mayor a menor " + Arrays.toString(numeros));
    }
    
}
