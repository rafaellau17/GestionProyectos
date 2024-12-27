/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete.clases;

import java.util.Random;

/**
 *
 * @author profo2302
 */
public class Bono extends Producto implements Permanencia
{
    private int tpoMin;

    public Bono(String cod, String nombre) {
        super(cod, nombre);
    }

    

    public int getTpoMin() {
        return tpoMin;
    }

    public void setTpoMin(int tpoMin) {
        this.tpoMin = tpoMin;
    }
    
    @Override
    public void CalcMontoMax() 
    {
       
       Random rand = new Random();
       int conta=0;
       int num = rand.nextInt(83000-80000+1)+80000;
       while(num%2!=0)
       {
           num = rand.nextInt(83000-80000+1)+80000;
       }
       int num2 = rand.nextInt(83000-80000+1)+80000;
       while(num2%2!=0)
       {
           num2 = rand.nextInt(83000-80000+1)+80000;
       }
       this.montoMax = num+num2;
       
    }

    @Override
    public void CalcTpoMin() 
    {
        Random rand = new Random();
       this.tpoMin = rand.nextInt(8-4+1)+4;
       while(this.tpoMin%2==0)
       {
           this.tpoMin = rand.nextInt(8-4+1)+4;
       }
       
    }
    
}
