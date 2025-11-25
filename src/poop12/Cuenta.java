package poop12;

/**
 *
 * @author aeth3rglow
 */
public class Cuenta {
    private double saldo;

    public Cuenta(double saldo) {
        this.saldo = saldo;
    }

    public synchronized void depositar(double monto) {
        System.out.println("Depositando " + monto);
        saldo += monto;
        System.out.println("Saldo actual: " + saldo);
        notifyAll();
    }

    public synchronized void retirar(double monto) {
        System.out.println("Intentando retirar " + monto);
        if (saldo >= monto) {
            saldo -= monto;
            System.out.println("Retiro exitoso. Saldo actual: " + saldo);
        } else {
            System.out.println("Saldo insuficiente para retirar " + monto);
        }
        notifyAll();
    }

    public double getSaldo() {
        return saldo;
    }
}
