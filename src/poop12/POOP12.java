/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop12;

/**
 *
 * @author aeth3rglow
 */
public class POOP12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Cuenta cuenta = new Cuenta(1000);

        HiloT hiloT1 = new HiloT("HiloT-1", cuenta);
        HiloT hiloT2 = new HiloT("HiloT-2", cuenta);

        HiloR hiloR = new HiloR(cuenta);
        Thread hiloRThread = new Thread(hiloR, "HiloR-1");

        hiloT1.start();
        hiloT2.start();
        hiloRThread.start();

        System.out.println("Termina hilo principal");
    }

}
