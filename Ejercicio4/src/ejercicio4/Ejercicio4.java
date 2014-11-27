
package ejercicio4;

import javax.swing.JOptionPane;

/**
 *
 * @author dfloresalarcon
 */
public class Ejercicio4 {

    public static void main(String[] args) throws InterruptedException {
       
        int variable =0;        
        Hilo3 mult3 = new Hilo3("mul3", variable);
        Hilo5 mult5 = new Hilo5("mul5", variable);       
        int num=Integer.parseInt(JOptionPane.showInputDialog("Numero para factorial"));
        HiloFactor factorial = new HiloFactor("factorial", num);
        
               
        mult5.start();
        mult3.start();
        factorial.start();
        
        mult5.join();
        mult3.join();
        
        HiloSuma suma35 = new HiloSuma("suma", mult3.getVariable(), mult5.getVariable());
        suma35.start();
        suma35.join();
        System.out.println("----Finalizado----");
    }
}
