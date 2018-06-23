package org.neosuniversity.unidad3.music;

/**
 * @author neosuniversity
 */
public class BibliotecaMusicaTest {

    public static void main(String[] args){

        /*
        *   1.- Crear objetos 5 objetos cantante (ver documento para obtener la informacion)
        *   2.- Crear 10 objetos cancion (ver documento para obtener la informacion)
        *   3.- Crear 5 arrays de canciones (listas) (ver documento para obtener la informacion)
        *   4.- Crear 5 Discos (ver documento para obtener la informacion)
        *   5.- Crear una array de discos (lista) (ver documento para obtener la informacion)
        *   6.- Crear un objeto biblioteca de la clase BibliotecaMusica
        *   7.- imprimir total de discos con el metodo imprimeTotalDiscos
        *   8.- utilizar el metodo procesaBiblioteca y pasar como referencia el objeto biblioteca
        */

        //imprimeTotalDiscos(biblioteca);
        //procesaBiblioteca(biblioteca);

    }
    public static  void procesaBiblioteca(BibliotecaMusica biblioteca){
       /* Disco[] discos= biblioteca.getLstDiscos();

        for(int i=0;i < discos.length;i++){
            Disco disco = discos[i];
            imprimeDisco(disco,i);
            Cancion[] canciones = disco.getLstCanciones();
            for(int j=0; j< canciones.length;j++){
                imprimeCanciones(canciones[j],j);
            }
        }*/
    }


    public static void imprimeTotalDiscos(BibliotecaMusica biblioteca){
        //System.out.println("Numero de discos en la biblioteca: " + biblioteca.getLstDiscos().length);
    }

    public static void imprimeDisco(Disco disco, int contador){
       // System.out.println((contador +1) + " - "+"Disco: " + disco.getNombreDisco().toUpperCase()+ " #Cantante: " +disco.getCantante().getNombreCantante().toUpperCase() );
    }

    public static void imprimeCanciones(Cancion cancion, int contador){
       // System.out.println("\t"+(contador +1) + " - "+"Canción: " +cancion.getNombreCancion().toUpperCase());
    }

}
