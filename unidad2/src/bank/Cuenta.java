package bank;

public class Cuenta {

    private double saldo;

    public Cuenta () {
        saldo = 0;
    }

    public Cuenta (double cant) {
        saldo = cant;
    }

    public double getSaldo() {
        return saldo;
    }

    public void deposito(double deposito) {
        if (deposito <= 0) {
            //mandar a a imprimir a consola el mensaje "No es posible realizar el deposito, el deposito debe ser mayor a 0"
        } else {
            // relizar la operacion saldo = saldo + deposito

        }
    }

    public void traspaso(Cuenta cuenta, double cant) {
        if (cuenta.getSaldo() >= cant) {
            cuenta.retiro(cant);
            deposito(cant);
        }

    }

    public void retiro(double retiro) {
        if (retiro > saldo) {
            //mandar a a imprimir a consola el mensaje "No es posible realizar el retiro ya que supera el saldo de la cuenta"

        } else {
            // relizar la operacion saldo = saldo - deposito
        }

    }

    public void imprimirSaldo() {
        //mandar a a imprimir a consola el saldo con el siguiente mensaje "Saldo de la cuenta: " + saldo
    }


}
