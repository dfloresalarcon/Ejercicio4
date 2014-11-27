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
public class Hilo3  extends Thread{
    
    private String nombre;
    private int variable;
    
    public Hilo3()
    {
        
    }
    
    public Hilo3(String nombre, int variable)
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
        for (int i =1; i<1000; i++)
        {
            if (i%3==0)
            {
                this.variable+=i;
            }
        }
        System.out.println("Multiplos de 3:"+this.variable);
    }
}
