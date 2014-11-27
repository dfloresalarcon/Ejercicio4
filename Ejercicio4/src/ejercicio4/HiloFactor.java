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
public class HiloFactor extends Thread{
    
    private String nombre;
    private int variable;
    
    public HiloFactor()
    {
        
    }
    
    public HiloFactor(String nombre, int variable)
    {
        this.nombre=nombre;
        this.variable=variable;
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
    public int getVariable() {
        return variable;
    }

    /**
     * @param variable the variable to set
     */
    public void setVariable(int variable) {
        this.variable = variable;
    }
    
     @Override
    public void run()
    {
        int var=1;
        for (int i =1; i<=this.variable; i++)
        {
            var*=i;
        }
        System.out.println("Factorial: "+ var);
    }
}
