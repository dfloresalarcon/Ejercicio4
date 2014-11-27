/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicio4;

/**
 *
 * @author dfloresalarcon
 */
public class HiloSuma extends Thread{
    
     private String nombre;
    private int variable1;
    private int variable2;
    
    public HiloSuma()
    {
        
    }
    
    public HiloSuma(String nombre, int variable1, int variable2)
    {
        this.nombre=nombre;
        this.variable1=variable1;
        this.variable2=variable2;
    }
    
     /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the variable
     */
    public int getVariable1() {
        return variable1;
    }

    /**
     * @param variable the variable to set
     */
    public void setVariable1(int variable1) {
        this.variable1 = variable1;
    }
    
    public int getVariable2() {
        return variable2;
    }

    /**
     * @param variable the variable to set
     */
    public void setVariable2(int variable2) {
        this.variable2 = variable2;
    }
     @Override
    public void run()
    {
        System.out.println("Suma = "+(this.getVariable1()+this.getVariable2()));
    }
}
