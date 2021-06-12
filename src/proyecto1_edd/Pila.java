/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1_edd;

/**
 *
 * @author gabriellasuarez
 */
public class Pila {
    

    private Nodo cima;
    private Nodo base;
    private int size;

    public Pila() {
        this.size = 0;
        this.base = null;
        this.cima = null;
    }

    public void pile(Nodo a) {
        if (a != null) {
            Nodo b = new Nodo(); 
            b.setEdges(a.getEdges()); 
            if (getSize() == 0) {
                setCima(b);
                setBase(b);
            } else {
                getCima().setSiguiente(b);
                b.setAnterior(getCima());
                this.setCima(b);
            }
            size++;

        }
    }

    public void depile() {
        if (getSize() != 0) {
            this.setCima(getCima().getAnterior());
        }
        size--;
    }

    /**
     * @return the cima
     */
    public Nodo getCima() {
        return cima;
    }

    /**
     * @param cima the cima to set
     */
    public void setCima(Nodo cima) {
        this.cima = cima;
    }

    /**
     * @return the base
     */
    public Nodo getBase() {
        return base;
    }

    /**
     * @param base the base to set
     */
    public void setBase(Nodo base) {
        this.base = base;
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

    public boolean in(String search) {
        boolean innit = false;
        Nodo aux = base;
        while ((aux != null) && !(innit)) {
            if (aux.getNombre().equals(search)) {
                innit = true;
                break;
            } else {
                aux = aux.getSiguiente();
            }
        }

        return innit;
    }
}

    

