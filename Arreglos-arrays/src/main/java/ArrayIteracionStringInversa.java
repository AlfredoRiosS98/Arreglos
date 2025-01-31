import java.util.Arrays;

public class ArrayIteracionStringInversa {
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

        System.out.println("\n******************** FOR INVERSO ********************");
        for(int i = 0; i< total; i++){
            System.out.println("para i = " + (total-1-i) + " valor: " + productos[total-1-i]);
        }

        System.out.println("\n******************** FOR INVERSO 2 ********************");
        for(int i = total - 1; i >= 0; i--){
            System.out.println("para i = " + i + " valor: " + productos[i]);
        }
    }
}
