package math;

public class Fraccion {

    private int numerador;
    private int denominador;

    //realizar metodos getters and setters

   /*
   * 1.- crear constructor por default
   * 2.- descomentar constructor con parametro numerador
   * 3.- crear un constructor con los parmetros numerador y denominador
   * 4.- Descomentar el metodo suma y hacer las adecuaciones correspondientes
    */
/*
* Descomentar este constructor
 public Fraccion(int num) {
        numerador = num;
        denominador = 1;
    }
  */


   /*
    *Descomentar este metodo y
    * 1.- dentro del tmp.setNumerador realizar la operacion =numerador * fracion getDenominador + denominador * fraccion getNumerador
    * 2.- dentro del tmp.setDenominador realizar la operacion = denominador * fraccion getDenominador)
    *
    public Fraccion suma(Fraccion fraccion) {
        Fraccion tmp = new Fraccion();
        // paso 1
        // paso 2
        return tmp;
    }
    */

    @Override
    public String toString() {
        return
                numerador +
                        "/" + denominador;

    }
}
