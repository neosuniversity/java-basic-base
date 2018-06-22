package org.neosuniversity.unidad3.calculadora;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;


public class CalculadoraController {

    @FXML
    private TextField txtOperadorA;

    @FXML
    private TextField txtOperadorB;

    /*
    * 1.- Antes de eliminar estos comentarios debera crear un campo TextField en calculadora.fxml
    * 2.- Despues de crear el campo debera mapear txtResultado en el componente creado (en la parte fx: id)
     */
   // @FXML
   // private TextField txtResultado;

    @FXML
    private TextArea txtOperacion;

    private Calculadora calculadora;


   /*
    * 1.- antes de quitar los comentarios de este metodo debera crear un boton en calculadora.fxml
    * 2.- despues de haber creado el boton +, podra eliminar estos comentarios
    * 3.- mapear el nombre actionSuma en la seccion Code--> On Action dentro de calculadora.fxml
    *
    public void actionSuma(ActionEvent event){
        ejectutaOperacion("+",Alert.AlertType.INFORMATION);
    }*/

   /*
    * 1.- antes de quitar los comentarios de este metodo debera crear un boton en calculadora.fxml
    * 2.- despues de haber creado el boton -, podra eliminar estos comentarios
    * 3.- mapear el nombre actionResta en la seccion Code--> On Action dentro de calculadora.fxml
    *
    public void actionResta(ActionEvent event){
        ejectutaOperacion("-",Alert.AlertType.ERROR);
    }

    */
   /*
    * 1.- antes de quitar los comentarios de este metodo debera crear un boton en calculadora.fxml
    * 2.- despues de haber creado el boton *, podra eliminar estos comentarios
    * 3.- mapear el nombre actionMultiplicacion en la seccion Code--> On Action dentro de calculadora.fxml
    *
    public void actionMultiplicacion(ActionEvent event){
        ejectutaOperacion("*",Alert.AlertType.WARNING);
    }
    */
    public void actionDivision(ActionEvent event){
        ejectutaOperacion("/",Alert.AlertType.CONFIRMATION);
    }
    /*
    * 1.- antes de quitar los comentarios de este metodo debera crear un boton limpiear en calculadora.fxml
    * 2.- despues de haber creado el boton limpiar, podra eliminar estos comentarios
    * 3.- mapear el nombre actionlimpiar en la seccion Code--> On Action dentro de calculadora.fxml
    *
    public void actionlimpiar(ActionEvent event){
        txtOperadorA.clear();
        txtOperadorB.clear();
        txtResultado.clear();
        txtOperacion.clear();
    }*/

    private void ejectutaOperacion(String operador,Alert.AlertType value){
        if(validaOperadores(txtOperadorA.getText(), txtOperadorB.getText())){
            enviaMensajeError(value);
        }else {
            System.out.println("valor" + txtOperadorA.getText() + operador + txtOperadorB.getText());
            txtOperacion.setText(txtOperadorA.getText() + operador + txtOperadorB.getText());
            /*
            * 1.- Utilizar el objeto calculadora
            * 2.- Utilizar el metodo ejecutaOparacion(String operadorA, String operadorB,String operador)
            * 3.- Del paso 2 asignar el resultado al objeto calculadora  (ejemplo calculadora = operacion ....)
            * 4.- Dentro de txtResultado realizar un setText y poner el calculo dentro de este componente
            */
        }
    }

    private Calculadora ejecutaOparacion(String operadorA, String operadorB,String operador){
        Calculadora calculadora = new Calculadora(Double.valueOf(operadorA),Double.valueOf(operadorB),operador);
        calculadora.executeOperation(calculadora);
        return calculadora;
    }

    private boolean validaOperadores(String operadorA, String OperadorB){
        boolean bandera=false;
        if(operadorA!=null && OperadorB!=null){
            if(operadorA.isEmpty()|| OperadorB.isEmpty()){
                bandera=true;
            }
        }
        return bandera;
    }

    private void enviaMensajeError(Alert.AlertType value){
        Alert alerta = new Alert(value);
        alerta.setTitle("Error en operandos");
        alerta.setHeaderText("***Favor de verificar los operadores ***");
        alerta.show();
    }

}
