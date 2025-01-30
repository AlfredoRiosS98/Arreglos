import java.util.Arrays;

public class OrdenamientoBurbuja {
    public static void arregloInverso(String[] arreglo){
        int total2 = arreglo.length;
        int total = arreglo.length;
        for(int i = 0; i < total2; i++){
            String actual = arreglo [i];
            String inverso = arreglo[total-1-i];
            arreglo[i] = inverso;
            arreglo[total-1-i] = actual;
            total2--;
        }
    }
    public static void main(String[] args) {
        String[] productos = new String[7];
        int total = productos.length;

        //Asignar valores manualmente
        productos[0] = "Kingston Pendrive 64Gb";
        productos[1] = "Samsung Galaxy";
        productos[2] = "Disco duro SS Samsung Externo";
        productos[3] = "Asus NoteBook";
        productos[4] = "MacBook Air";
        productos[5] = "Chromecast 4ta Generacion";
        productos[6] = "Bicicleta Oxford";

        //Ordenar valores
        //Arrays.sort(productos);
        //arregloInverso(productos);

        //Collections.reverse(Arrays.asList(productos));
        int contador = 0;
        for(int i = 0; i < total; i++){
            for(int j = 0; j < total; j++){
                if(productos[i].compareTo(productos[j]) < 0){
                    String auxiliar = productos[i];
                    productos[i] = productos[j];
                    productos[j] = auxiliar;
                }
                contador++;
            }
        }

        System.out.println("contador = " + contador);

        //Imprimir valores con for
        System.out.println("\n******************** FOR ********************");
        for(int i = 0; i < total; i++){
            System.out.println("para indice " + i + " : " + productos[i]);
        }
    }
}
