package neosuniversity.unidad1;

/**
 * 
 * @author neosuniversity
 *
 */
public class Arrays {

	public static void main(String[] args) {
		
		int[] valores= {45,9,1,6,-2};
		float suma=0;
		int positivos=0;
		int negativos=0;

		/*
		* pasos a seguir
		* 1.- crear un ciclo for para poder recorer el array valores
		* 2.- dentro del ciclo for crear un if en el cual realizaras una comparacion para saber si el valor es positivo y le sumaras 1 a la variable positivos
		* 3.- dentro del ciclo for crear un if en el cual realizaras una comparacion para saber si el valor es negativo y le sumaras 1 a la variable negativos
		* 4.- dentro del ciclo for agregar --> suma+=valores[i];  con la finalidad de ir sumando los valores de array para despues obtener el promedio
		*/

		System.out.println("Promedio: "+suma /valores.length );
		System.out.println("Positivos: "+positivos );
		System.out.println("Negativos: "+negativos );
		
 
	}

}
