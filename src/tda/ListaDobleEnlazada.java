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
public class ListaDobleEnlazada <T> {
    private Nodo <T> cabeza;
    private Nodo <T> ultimo;    
    // Metodos u operaciones

    public Nodo getCabeza() {
        return cabeza;
    }

    public Nodo getUltimo() {
        return ultimo;
    }

    public ListaDobleEnlazada() {
        cabeza = null;
    }

    public void setCabeza(Nodo cabeza) {
        this.cabeza = cabeza;
    }

    public void setUltimo(Nodo ultimo) {
        this.ultimo = ultimo;
    }
    
    // Verifica si la lista está vacia
    public boolean esVacia() {
        return this.cabeza == null;
    }
    
    public int contarNodos() {
        if (esVacia()) {
            return 0;
        }
        else {
            Nodo temp = cabeza;
            int cont = 0;
            while(temp != null) {
                temp = temp.getSgteNodo();
                cont++;
            }
        return cont;
        }
    }
    
    // Agregar: añade al final de la lista un nuevo nodo
    public void agregar(T item) {
        Nodo <T> nuevoNodo = new Nodo(item, null, null);
        if (esVacia()) {
            cabeza = nuevoNodo;
            ultimo = nuevoNodo;
        }
//        else {
//            Nodo temp = cabeza;
//            while (temp.getSgteNodo() != null) {                
//                temp = temp.getSgteNodo();
//            }
//            temp.setSgteNodo(nuevoNodo);
//        }
        else {
            ultimo.setSgteNodo(nuevoNodo);
            nuevoNodo.setAntNodo(ultimo);
            ultimo = nuevoNodo;
        }
    }
    
    // Mostrar: muestra los elementos de la lista
    public void mostrar() {
        if (esVacia()) {
            System.out.println("Lista vacia.");
        }
        else {
            Nodo <T> aux = cabeza;
            while (aux != null) {   
                System.out.print(aux.getItem()+"\t");
                aux = aux.getSgteNodo();
            }
        }
        System.out.println();
    }

    // Mostrar los elementos de la lista en orden inverso
    public void inverso() {
        if (esVacia()) {
            System.out.println("Lista vacia.");
        }
        else {
            Nodo <T> aux = ultimo;
            while (aux != null) {   
                System.out.print(aux.getItem()+"\t");
                aux = aux.getAntNodo();
            }
        }
        System.out.println();    
    }
    
    public T iesimo(int pos) {
        if (pos >= 1 && pos <= contarNodos()) {
        Nodo <T> temp = cabeza;
        int cont = 1;
        while(cont < pos) {
                temp = temp.getSgteNodo();
                cont++;
            }
            return temp.getItem();
        }
        else {
            return null;
        }
    }
    
    public Integer ubicacion(T item) {
        int pos = -1;
        if (esVacia()) {
            return pos;
        }
        else {
            Nodo <T> temp = cabeza;
            int cont = 1;
            while(temp != null) {
                if (temp.getItem().equals(item)) {
                    pos = cont;
                    return pos; 
                }
                temp = temp.getSgteNodo();
                cont++;
            }
            return pos;
        }
    }    

    public void insertar(T item, int pos) {
        if (pos >= 1 && pos <=contarNodos()) {
            Nodo <T> nuevoNodo = new Nodo(item);
            // Caso 1: añadir en la pos 1
            if (pos == 1) {
                nuevoNodo.setSgteNodo(cabeza);
                cabeza.setAntNodo(nuevoNodo);
                cabeza = nuevoNodo;
            }
            else if (pos > 1) {
                int i = 1;
                Nodo <T> aux = cabeza;
                while(pos-1 != i) {
                    aux = aux.getSgteNodo();
                    i++;
                }
                Nodo <T> aux2 = aux.getSgteNodo();
                nuevoNodo.setSgteNodo(aux2);
                aux2.setAntNodo(nuevoNodo);
                nuevoNodo.setAntNodo(aux);
                aux.setSgteNodo(nuevoNodo);
            }
        }
        else {
            System.out.println("La posicion no es valida");
        }
    }
       
    public void eliminar(int pos) {
        Nodo <T> aux = cabeza;
        if (pos == 1) {
            cabeza = cabeza.getSgteNodo();
            if (cabeza != null) {
                cabeza.setAntNodo(null);
            }
        }
        else if (pos > 1 && pos <= contarNodos()) {
            int i = 1;
            while (i < pos-1) {
                aux = aux.getSgteNodo();
                i++;
            }
            if (pos == contarNodos()) {
                ultimo = aux;
                aux.setSgteNodo(null);
            }
            else {
                Nodo <T> aux2 = aux.getSgteNodo();
                aux.setSgteNodo(aux2.getSgteNodo());
                aux2 = aux2.getSgteNodo();
                aux2.setAntNodo(aux);
            }
        }
        else {
            System.out.println("Posicion no existe");
        }    
    }

    
}

