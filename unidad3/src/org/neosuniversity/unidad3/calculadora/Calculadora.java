package org.neosuniversity.unidad3.calculadora;

/**
 * Created by camus on 05/06/2018.
 */
public class Calculadora {


    private double operadorA;
    private double operadorB;
    private String operacion;
    private double resultado;

    public Calculadora() {}

    /*
    * crear correctamente el constructor
    */
    public Calculadora(double operadorA, double operadorB) {

    }

    /*
     * crear correctamente el constructor
     */
    public Calculadora(double operadorA, double operadorB,String operacion) {

    }

    /*
     * crear correctamente setters y getters
     */
    public double getOperadorA() {
        return 0;
    }

    public void setOperadorA(double operadorA) {

    }

    public double getOperadorB() {
        return 0;
    }

    public void setOperacorB(double operadorB) {

    }

    public String getOperacion() {
        return "";
    }

    public void setOperacion(String operacion) {

    }

    public double getResultado() {
        return 0;
    }

    public void setResultado(double resultado) {

    }

    private  double suma(Calculadora calculadora){
        /*
        * 1.- implementar la funcionalidad de una suma entre dos operadores y un operando
        * 2.- utilizar los metodos get
        * 3.- retornar el resultado
        */
        return  0;
    }

    private  double resta(Calculadora calculadora){
        /*
         * 1.- implementar la funcionalidad de una resta entre dos operadores y un operando
         * 2.- utilizar los metodos get
         * 3.- retornar el resultado
         */

        return 0;
    }

    private  double multiplicacion(Calculadora calculadora){
        /*
         * 1.- implementar la funcionalidad de una multiplicacion entre dos operadores y un operando
         * 2.- utilizar los metodos get
         * 3.- retornar el resultado
         */
        return 0;
    }

    private  double divison(Calculadora calculadora){
        /*
         * 1.- implementar la funcionalidad de una division entre dos operadores y un operando
         * 2.- utilizar los metodos get
         * 3.- retornar el resultado
         */
        return 0;
    }

    public void executeOperation(Calculadora calculadora){
        switch (calculadora.getOperacion()){
            case "+":{
                /*
                * 1.- dento del objeto calculadora realizar un set dentro de la propiedad resultado
                * 2.- invocar la operacion suma pasando como parametro el objeto calculadora
                * 3.- el retorno de la operacion suma guardarlo en calculadora.setResultado (ver punto no 1)
                */
            }
            case "-":{
                //calculadora.setResultado(resta(calculadora));
                /*
                 * 1.- dento del objeto calculadora realizar un set dentro de la propiedad resultado
                 * 2.- invocar la operacion resta pasando como parametro el objeto calculadora
                 * 3.- el retorno de la operacion resta guardarlo en calculadora.setResultado (ver punto no 1)
                 */
            }
            case "*":{
                /*
                 * 1.- dento del objeto calculadora realizar un set dentro de la propiedad resultado
                 * 2.- invocar la operacion multiplicacion pasando como parametro el objeto calculadora
                 * 3.- el retorno de la operacion multiplicacion guardarlo en calculadora.setResultado (ver punto no 1)
                 */
            }
            case "/":{
                /*
                 * 1.- dento del objeto calculadora realizar un set dentro de la propiedad resultado
                 * 2.- invocar la operacion division pasando como parametro el objeto calculadora
                 * 3.- el retorno de la operacion division guardarlo en calculadora.setResultado (ver punto no 1)
                 */
            }
            default:{
            }
        }
    }

}
