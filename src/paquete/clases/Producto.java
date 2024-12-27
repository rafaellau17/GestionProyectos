/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete.clases;

/**
 *
 * @author profo2302
 */
public abstract class Producto 
{
    protected int montoMax;
    protected String nombre,cod;

    public Producto(String cod, String nombre) {
        this.cod = cod;
        this.nombre = nombre;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public int getMontoMax() {
        return montoMax;
    }

    public void setMontoMax(int montoMax) {
        this.montoMax = montoMax;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public abstract void CalcMontoMax();
    
}
