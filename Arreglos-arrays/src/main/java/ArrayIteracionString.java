import java.util.Arrays;

public class ArrayIteracionString {
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
        Arrays.sort(productos);


        //Imprimir valores con for
        System.out.println("\n******************** FOR ********************");
        for(int i = 0; i < total; i++){
            System.out.println("para indice " + i + " : " + productos[i]);
        }

        //Imprimir valores con foreach
        System.out.println("\n******************** ForEach ********************");
        for(String prod: productos){
            System.out.println("prod = " + prod);
        }

        //Imprimir valores con While
        System.out.println("\n******************** While ********************");
        int i = 0;
        while(i < total){
            System.out.println("para indice " + i + " : " + productos[i]);
            i++;
        }

        //Imprimir valores con Do-While
        System.out.println("\n******************** Do-While ********************");
        int j = 0;
        do{
            System.out.println("para indice " + j + " : " + productos[j]);
            j++;
        }while(j < total);
    }
}
