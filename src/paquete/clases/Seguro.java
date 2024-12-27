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
public class Seguro extends Producto
{

    public Seguro(String cod, String nombre) {
        super(cod, nombre);
    }

    

    @Override
    public void CalcMontoMax() 
    {
        Random rand = new Random();
        int num1 = rand.nextInt(25-15+1)+15;
        int num2 = rand.nextInt(69000-67000+1)+67000;
        this.montoMax = num1 * num2;
        
    }
    
    
    
}
