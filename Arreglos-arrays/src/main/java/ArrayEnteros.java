
import java.util.Arrays;

public class ArrayEnteros {

    public static void main(String[] args) {

        int[] numeros = new int[4];
        
        //Asignando valores al array
        numeros[0] = 4;
        numeros[1] = 2;
        numeros[2] = 1;
        numeros[3] = 3;
        
        Arrays.sort(numeros);
        
        int i = numeros[0];
        int j = numeros[1];
        int k = numeros[2];
        int l = numeros[3];

        //Imprsiendo de valores del arreglo
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("k = " + k);
        System.out.println("l = " + l);
    }
}
