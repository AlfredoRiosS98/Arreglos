public class OrdenamientoBurbujaEnteros {
    //Con este metodo puedes reutilizarlo para ordenar
    //todo tipo de datos
    public static void sortBurbuja(Object[] arreglo){
        int total = arreglo.length;
        int contador = 0;

        for(int i = 0; i < total-1; i++){

            for(int j = 0; j < total-1-i; j++){
                //Para cambiar el orden de ascendente a decendente o viceversa cambiar signo <>
                if(((Comparable)arreglo[j+1]).compareTo(arreglo[j]) < 0){
                    Object auxiliar = arreglo[j];
                    arreglo[j] = arreglo[j+1];
                    arreglo[j+1] = auxiliar;
                }
                contador++;
            }
        }

        System.out.println("contador = " + contador);
    }
    public static void main(String[] args) {

        Integer[] numeros = new Integer[4];

        //Asignando valores al array
        numeros[0] = 4;
        numeros[1] = 2;
        numeros[2] = 1;
        numeros[3] = 3;

        sortBurbuja(numeros);

        //Imprimir valores con for
        System.out.println("\n******************** FOR ********************");
        for(int i = 0; i < numeros.length; i++){
            System.out.println("para indice " + i + " : " + numeros[i]);
        }
    }
}
