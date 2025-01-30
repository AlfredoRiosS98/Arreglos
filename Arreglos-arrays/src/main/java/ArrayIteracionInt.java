public class ArrayIteracionInt {
    public static void main(String[] args) {
        int[] numeros = new int[10];

        int totalNumeros = numeros.length;
        for(int k = 0; k < totalNumeros; k++){
            numeros[k] = k*3;
        }

        for(int k = 0; k < totalNumeros; k++){
            System.out.println("Numeros = " + numeros[k]);
        }
    }
}
