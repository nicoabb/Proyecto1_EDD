/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1_edd;

import javax.swing.JOptionPane;


public class Lista {
    private Nodo pFirst;
    private Nodo pLast;
    private int size; 
//constructor
    
    public Lista() {
        pLast = null;
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
    
    //inserta almacen al final de la lista
    public void insertarAlmacen(String nombre){
        Nodo pNew = new Nodo();
        pNew.setNombre(nombre);
        pNew.setId(nombre.substring(nombre.indexOf(" ")+1));
        
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
    
    //hay que hacer una funcion que convierta la entrada en la posicion
    public void AgregarProducto(int posicion, String nombre, int cantidad){
        Nodo pNew = new Nodo(nombre, cantidad);
        if(esVacio()){
            JOptionPane.showMessageDialog(null, "Debe agregar almacenes para poder agregar productos");
            return;
        }else{
            Nodo almacen = pLast;
            Lista productos = almacen.getProductos();
            if(productos.esVacio()){
                productos.setpFirst(pNew);
                productos.setpLast(pNew);
            }else{
                Nodo aux = productos.getpLast();
                aux.setSiguiente(pNew);
                pNew.setAnterior(aux);
                productos.setpLast(pNew);        
        }
            productos.setSize(productos.getSize()+1);
        }
    }
    
    //muestra productos del almacen de la posicion referenciada
    public void MostrarProductos(int posicion){
        
        if(esVacio()){
            JOptionPane.showMessageDialog(null, "No existen almacenes");
        }else{
            
            Nodo almacen = getNodo(posicion);
            Lista productos = almacen.getProductos();
            if(productos.esVacio()){
                JOptionPane.showMessageDialog(null, "Almacen vacío");
            }else{
                Nodo aux = productos.getpFirst();
                do {
                System.out.println(aux.getProd() + ": " + aux.getValor());
                aux = aux.getSiguiente();    
                }while(aux!= null);
            }
        }  
    }
    
    //Muestra todos los almacenes
    public void MostrarAlmacenes(){
        Nodo aux = pFirst;
        if(esVacio()){
            System.out.println("Lista Vacía");
        }else{
            do {
            System.out.print(aux.getNombre() + ", ");
            aux = aux.getSiguiente();    
            }while(aux!= null);
        }
    }
    
    public void EvaluarRutas(Nodo nd,String ruta){
        while(nd != null){
            if(ruta.contains(nd.getId())){
                System.out.println("Almacen "+nd.getId()+" tiene ruta: "+ruta);
            }
            nd = nd.getSiguiente();
        }   
    }
    
    //elimina el elemento que se ubique en la posición dada
    public void EliminarAlmacen(int posicion){
        
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
        if (esVacio()){
            System.out.println("Lista vacía");
            return null;
        }else if(posicion > size){
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
            } 
            return null;
        }
    }
    
    public Nodo getProducto(String nombre){
        if (esVacio() ){
            System.out.println("Lista vacía");
            return null;
        }else {
            Nodo almacen = pFirst;

            while(almacen!= null){
                Lista productos = almacen.getProductos();
                Nodo aux = productos.getpFirst();
                for (int i = 0; i < productos.getSize(); i++) {
                    
                    if(aux.getProd().equals(nombre)){
                        return aux;
                    } 
                    aux = aux.getSiguiente();
                }
                almacen = almacen.getSiguiente();
            }   
        }
        return null;
    }
    
    public void EliminarStock(String nombre, int cantidad){
        if (esVacio() ){
            System.out.println("Lista vacía");
            
        }else {
            Nodo almacen = pFirst;
            while(almacen!= null){
                
                Lista productos = almacen.getProductos();
                if(!productos.esVacio()){
                    Nodo aux = productos.getpFirst();
                    
                    for (int i = 0; i < productos.getSize(); i++) {
                    
                        if(aux.getProd().equals(nombre)){
                            
                            int total = aux.getValor()-cantidad;
                            if(total<0){
                                JOptionPane.showMessageDialog(null, "No puedes eliminar más elementos de los que existen");
                                return;
                            }else{
                                
                                aux.setValor(total);
                               
                                return;
                            }
                        
                        }
                        aux = aux.getSiguiente();
                     }
                }
                
                almacen = almacen.getSiguiente();
            }   
        }
    }
    
    public void AgregarStock(String nombre, int cantidad){
        if (esVacio() ){
            System.out.println("Lista vacía");
            
        }else {
            Nodo almacen = pFirst;
            while(almacen!= null){
                
                Lista productos = almacen.getProductos();
                if(!productos.esVacio()){
                    Nodo aux = productos.getpFirst();
                    
                    for (int i = 0; i < productos.getSize(); i++) {
                    
                        if(aux.getProd().equals(nombre)){
                            
                            int total = aux.getValor()+cantidad;                       
                            aux.setValor(total);  
                            return;
                            }
                        aux = aux.getSiguiente();
                        }
                    }
                almacen = almacen.getSiguiente();
                }  
            }   
        }
    }
        
