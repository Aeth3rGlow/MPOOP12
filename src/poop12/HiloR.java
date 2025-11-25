package poop12;

/**
 *
 * @author aeth3rglow
 */
public class HiloR implements Runnable {
    private Cuenta cuenta;

    public HiloR(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("HiloR (Periódico): Consultando el saldo...");
            System.out.println("Saldo actual: " + cuenta.getSaldo());
            try {
                Thread.sleep(1000); 
            } catch (InterruptedException e) {
                System.out.println("HiloR interrumpido.");
            }
        }
        System.out.println("HiloR terminó.");
    }
}
