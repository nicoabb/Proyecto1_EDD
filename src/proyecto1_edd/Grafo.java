/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package proyecto1_edd;

/**
 *
 * @author Christian
 */
public class Grafo {

    private int size;
    private Lista[] adylist;
    private Lista almacenes;
    
    public Grafo(Lista almacenes){
    this.almacenes = almacenes; 
    this.size = size; 
    Lista a = new Lista();
    this.adylist = new Lista[size];
    Nodo aux = almacenes.getpFirst();
    do{
            System.out.println(aux.getEdges()[0] + aux.getEdges()[1]);
            aux = aux.getSiguiente();
            
            
    }while (aux != null);
    }
     /**
     * @return the size
     */
    public int getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(int size) {
        this.size = size;
    }

    /**
     * @return the adylist
     */
    public Lista[] getAdylist() {
        return adylist;
    }

    /**
     * @param adylist the adylist to set
     */
    public void setAdylist(Lista[] adylist) {
        this.adylist = adylist;
    }

    /**
     * @return the almacenes
     */
    public Lista getAlmacenes() {
        return almacenes;
    }

    /**
     * @param almacenes
     */
    public void setAlmacenes(Lista almacenes) {
        this.almacenes = almacenes;
    }

    
}
