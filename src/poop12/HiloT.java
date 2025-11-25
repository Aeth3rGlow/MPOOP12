package poop12;

/**
 *
 * @author aeth3rglow
 */
public class HiloT extends Thread {
    private Cuenta cuenta;

    public HiloT(String name, Cuenta cuenta) {
        super(name);
        this.cuenta = cuenta;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            cuenta.depositar(100);
            try {
                sleep(100); 
            } catch (InterruptedException e) {
                System.out.println(getName() + " interrumpido.");
            }
            cuenta.retirar(50);
        }
        System.out.println(getName() + " terminó.");
    }
}
