package neosuniversity.unidad1;

/**
 * 
 * @author neosuniversity
 *
 */
public class MetodosStatic {
	public static void main(String[] args) {

		/**
		 * 1.- Para cargar los valores de este ejercicio en el intellij es necerio hacer lo siguinete
		 * 2.- en la barra de tareas hacer clicl en la opcion Run-->Edit configuration-->en la parte de configutration-->program arguments colocar los siguiente
		 * 3.- colocar:  45 9 1 6 -2   y despues hacer click en apply-->ok
		 * 4.- continuar con los demas pasos que se describen en el programa
		 */
		int opcion = 1;
		// int opcion=2;
		//int opcion=3;
		//int opcion=4;
		float promedio=0;
		int valores[] = new int[args.length];


		//hacer un ciclo for para recorrer el array args y relizar un Parseo de String a Integer en cada una de las posiciones del Array.


		imprimeArray(valores);

		/**
		 * 1.- crear una sentencia switch (opcion)
		 * 2.- crear las opciones case 1, case 2, case 3 y default
		 * 3.- el la opcion case 1 debera colocar la siguiente lineas de codigo
		 * 			imprimeArray(burbujaAsc(valores));
		 * 			System.out.println("Promedio: "+ calculaPromedio(valores));
		 * 			break;
		 * 	4.-en la opcion case 2 debera colocar las siguientes lineas de codigo
		 * 			imprimeArray(burbujaDesc(valores));
		 * 			System.out.println("Promedio: "+ calculaPromedio(valores));
		 * 			break;
		 * 	5.-en la opcion case 3 	colocar las siguientes lineas de codigo
		 * 			imprimeArray(valores);
		 * 			System.out.println("Promedio: "+ calculaPromedio(valores));
		 * 			break;
		 * 	6.- Por ultimo para el defualt deberas imprimir los siguiente
		 * 			Opción no valida
		 */
		switch (opcion) {
		case 1: {
			imprimeArray(burbujaAsc(valores));
			System.out.println("Promedio: "+ calculaPromedio(valores));
			break;
		}
		case 2: {
			imprimeArray(burbujaDesc(valores));
			System.out.println("Promedio: "+ calculaPromedio(valores));
			break;
		}
		case 3: {
			imprimeArray(valores);
			System.out.println("Promedio: "+ calculaPromedio(valores));
			break;
		}
		default :
			System.out.println("Opción no valida");
			break;
		}
		
		

	}
	/**
	 * imprime el array de tamano n
	 * @param array
	 */
	public static void imprimeArray(int[] array) {

		//realizar un ciclo for[elemento1,elemento2,elemnto3,elemento4,elementoN]
		//crear funcionalidad para imprimir el array valores usando la siguiente estructura [elemento1,elemento2,elemnto3,elemento4,elementoN]


	}
	/**
	 * ordena un array de forma Ascendente usando el metodo <br>
	 * de la burbuja
	 * @param array elementos del array
	 * @return array ordenado
	 */
	public static int[] burbujaAsc(int[] array) {
		/*
		 * 1.- realizar el ordenamiento del array por medio del algoritmo burbuja ascendente y retornar el array ordenando
		 */
		return array;
	}
	/**
	 * ordena un array de forma Descendente usando el metodo <br>
	 * de la burbuja
	 * @param array elementos del array
	 * @return array ordenado
	 */
	public static int[] burbujaDesc(int[] array) {
		/*
		* 1.- realizar el ordenamiento del array por medio del algoritmo burbuja descendenete y retornar el array ordenando
		*/
		return array;
	}
	/**
	 * Calcula el promedio de un array de tamano n
	 * @param array contiene los elementos
	 * @return promedio
	 */
	public static float calculaPromedio(int[] array) {
		/*
		*	1.- Realizar la funcionalidad pra obtner el promedio de los elemnetos de un array y devolver el promedio en un float
		*   2.- Recuerda que para calcular el promedio debes obtener la suma de todos los valores y dividirlo entre el total de elementos que contiene el array
		*/

		return 0;
	}

}
