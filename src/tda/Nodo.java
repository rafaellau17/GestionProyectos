


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tda;

/**
 *
 * @author N04102
 * @param <T>
 */
public class Nodo <T> {
    private T item;
    private Nodo <T> sgteNodo;
    private Nodo <T> antNodo;
    
    public Nodo() {
        item = null;
        sgteNodo = null;
        antNodo = null;
    }

    public Nodo(T item) {
        this.item = item;
        this.sgteNodo = null;
        this.antNodo = null;
    }
    
    public Nodo(T item, Nodo <T> sgteNodo, Nodo <T> antNodo) {
        this.item = item;
        this.sgteNodo = sgteNodo;
        this.antNodo = antNodo;
    }

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public Nodo <T> getSgteNodo() {
        return sgteNodo;
    }

    public void setSgteNodo(Nodo <T> sgteNodo) {
        this.sgteNodo = sgteNodo;
    }

    public Nodo <T> getAntNodo() {
        return antNodo;
    }

    public void setAntNodo(Nodo <T> antNodo) {
        this.antNodo = antNodo;
    }
    
    
    
}
