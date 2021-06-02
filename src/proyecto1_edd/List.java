/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1_edd;

/**
 * LISTA DOBLEMENTE ENLAZADA
 * @author Christian
 */
public class List {
    private Nodo pFirst;
    private Nodo pLast;
    private int size; 
//constructor
    
    public List() {
        pLast=null;
        pFirst = null;
        size = 0;
    }
    //Métodos y funciones

    public Nodo getpFirst() {
        return pFirst;
    }

    public void setpFirst(Nodo pFirst) {
        this.pFirst = pFirst;
    }

    public Nodo getpLast() {
        return pLast;
    }

    public void setpLast(Nodo pLast) {
        this.pLast = pLast;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    
    public boolean esVacio(){
        if(pFirst == null){
            return true;
            
        }else{
            return false;
        }
    }
    
    public Nodo Proximo(Nodo posicion){
        if(posicion.getSiguiente()!= null){
            posicion = posicion.getSiguiente();
            return posicion;
        }else{
            return null;
        }
    } 
    
    public Nodo Anterior(Nodo posicion){
        if(posicion.getAnterior()!= null){
            posicion = posicion.getAnterior();
            return posicion;
        }else{
            return null;
        }
        
    }
    
    //inserta elemento al final de la lista
    public void insertarFinal(Object elemento){
        Nodo pNew = new Nodo();
        pNew.setValor(elemento);
        
        if(esVacio()){
            pFirst = pNew;
            pLast = pNew;
        }else{
            Nodo aux = pLast;
            aux.setSiguiente(pNew);
            pNew.setAnterior(aux);
            pLast = pNew;   
    }
        size +=1;
    }
    
    //recorre la lista de primero a ultimo mostrando sus valores
    public void insertarInicio(Object elemento){
        Nodo pNew = new Nodo();
        pNew.setValor(elemento);
        if(esVacio()){
            pFirst = pNew;
            pLast = pNew;
        }else{
            Nodo aux = pFirst;
            aux.setAnterior(pNew);
            pNew.setSiguiente(aux);
            pFirst = pNew;
        }
    }
    
    public void Mostrar(){
        Nodo aux = pFirst;
        
        if(esVacio()){
            System.out.println("Lista Vacía");
        }else{
           
            do {
            System.out.print(aux.getValor() + ", ");
            aux = aux.getSiguiente();    
            }while(aux!= null);
        }
        
    }
    
    //elimina el elemento que se ubique en la posición dada
    public void Eliminar(int posicion){
        
        if(esVacio()){
            System.out.println("Lista vacía");
            
        }else if(posicion >= size){
            System.out.println("Posicion inválida");
        }else{
            Nodo aux = new Nodo();
            aux = pFirst;
            if (posicion == 0){
                if(size != 1){
                    pFirst = aux.getSiguiente();
                    aux.getSiguiente().setAnterior(null);
                }else{
                    pFirst = null;
                    pLast = null;
                            
                }
                
            }
            for (int i = 0; i < size; i++) {
                               
                if(posicion == i){
                    if(aux.getAnterior()!= null && aux.getSiguiente()!= null){
                        aux.getAnterior().setSiguiente(aux.getSiguiente());
                        aux.getSiguiente().setAnterior(aux.getAnterior());
                    }else if(aux.getAnterior()!= null){//plast
                        aux.getAnterior().setSiguiente(null);
                        pLast = aux.getAnterior();
                        
                    }else if(aux.getSiguiente()!= null){//pfirst
                        aux.getSiguiente().setAnterior(null);
                        pFirst = aux.getSiguiente();
                    }
                     
                }else{
                    aux = Proximo(aux);
                }
                
            }
            
        }
     
        
    }
    
    //obtener indice del nodo recibido !!Se puede optimizar recorriendola en funcion de size
    public int getIndex(Nodo n){
        
        if(esVacio()){
            System.out.println("Lista vacía");
            return -1;
        }else{
            Nodo aux = pFirst;
            int cont = 0;
            while(aux != null){
                if(n == aux){
                    return cont;
                }else{
                aux = aux.getSiguiente();
                cont ++;
                
                }
        }return cont;
                
        }
    
    }
    
    public Nodo getNodo(int posicion){
        if (esVacio() ){
            System.out.println("Lista vacía");
            return null;
        }else if(posicion >= size){
            System.out.println("Posición inválida");
            return null;
        }else{
            Nodo aux = pFirst;
            while(aux != null){
                if(getIndex(aux) == posicion){
                    return aux;
                }else{
                    aux = aux.getSiguiente();
                }
                
            } return null;
        }
    }
        
}

