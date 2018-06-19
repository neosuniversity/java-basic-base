package neosuniversity.unidad1;

/**
 * @author neosuniversity
 */
public class ArraysReto {
    public static void main(String[] args) {
        int opcion = 1;   //ordenacion ascendente
        //int opcion=2; //ordenacion descendente

        int[] valores = {45, 9, 1, 6, -2};

        //crear funcionalidad para imprimir el array valores usando la siguiente estructura [elemento1,elemento2,elemnto3,elemento4,elementoN]
        for (int i = 0; i < valores.length; i++) {
            //se crea la primer parte de la estructura
            if (i == 0) {
                System.out.print("[" + valores[i] + ",");
            } else {
                //programar la ultima parte del array --> elemento2,elemnto3,elemento4,elementoN]

            }
        }
        System.out.println("");

        //ordenacion de el array ordenacion por metodo de burbuja
        switch (opcion) {
            case 1: {
                //crear la funcionalidad de ordenacion ascendente (usando el metodo de la burbuja)

                break;
            }
            case 2: {
                //crear la funcionalidad de ordenacion descendente (usando el metodo de la burbuja)

                break;
            }
        }

        //crear funcionalidad para imprimir el array ordenado  usando la siguiente estructura [elemento1,elemento2,elemnto3,elemento4,elementoN]
        for (int i = 0; i < valores.length; i++) {
            //se crea la primer parte de la estructura
            if (i == 0) {
                System.out.print("[" + valores[i] + ",");
            } else {
                //programar la ultima parte del array --> elemento2,elemnto3,elemento4,elementoN]

            }
        }

    }
}
