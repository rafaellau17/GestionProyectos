/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete.gestion;

import javax.swing.JOptionPane;
import paquete.clases.Bono;
import paquete.clases.Producto;
import paquete.clases.Seguro;

/**
 *
 * @author profo2302
 */
public class Gestion 
{
    private Producto[] arreglo;
    private int conta;

    public Gestion() 
    {
        arreglo = new Producto[50];
        conta=0;
    }

    public Producto[] getArreglo() {
        return arreglo;
    }

    public void setArreglo(Producto[] arreglo) {
        this.arreglo = arreglo;
    }

    public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }
    
    public void Ingresar(Producto ref)
    {
        if(conta<arreglo.length)
        {
            if(ref instanceof Bono)
            {
                ref.setCod( "B"+ref.getCod() );
            }
            else if(ref instanceof Seguro)
            {
                ref.setCod( ref.getCod()+"SI" );
            }
            else
            {
                ref.setCod( "I"+ref.getCod()+"B" );
            }
            arreglo[conta]=ref;
            conta++;
        }
        else
        {
            JOptionPane.showMessageDialog(null, "No hay espacio");
        }
    }
    
    public void Eliminar(String cod)
    {
        for(int i=0;i<conta;i++)
        {
            if(arreglo[i].getCod().equalsIgnoreCase(cod))
            {
                for(int j=i;j<conta-1;j++)
                {
                    arreglo[j]=arreglo[j+1];
                }
                arreglo[conta-1]=null;
                conta--;
                JOptionPane.showMessageDialog(null, "Eliminado con éxito");
            
            }
        }
    }
    
    public void ActualizaNom(String cod, String desc)
    {
        for(int i=0;i<conta;i++)
        {
            if(arreglo[i].getCod().equalsIgnoreCase(cod) || arreglo[i].getNombre().equalsIgnoreCase(desc) )
            {
                arreglo[i].setNombre(desc);
            }
        }
    }
    
    public void IngresarPos(Producto ref, int pos)
    {
        if(conta<arreglo.length)
        {
            if(pos<=conta)
            {
                for(int i=conta-1;i>=pos;i--)
                {
                    arreglo[i+1]=arreglo[i];
                }
                arreglo[pos]=ref;
                conta++;
                JOptionPane.showMessageDialog(null, "Ingreso con éxito");
            }
            else
            {
                JOptionPane.showMessageDialog(null, "posicion no valida");
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "No hay espacio");
        }
    }
    
    
    
    
    
}
