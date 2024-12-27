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
public class Bolsa extends Producto implements Permanencia
{
    private int tmpoMin;

    public Bolsa(String cod, String nombre) {
        super(cod, nombre);
    }

   

    public int getTmpoMin() {
        return tmpoMin;
    }

    public void setTmpoMin(int tmpoMin) {
        this.tmpoMin = tmpoMin;
    }

    @Override
    public void CalcMontoMax() 
    {
        Random rand = new Random();
        this.montoMax = rand.nextInt(118000-112000+1)+112000;
    }

    @Override
    public void CalcTpoMin() 
    {
        Random rand = new Random();
       this.tmpoMin = rand.nextInt(8-5+1)+5;
      
    }
    
    
    
}
