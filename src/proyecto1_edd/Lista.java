
package proyecto1_edd;

import javax.swing.JOptionPane;

/**
 *
 * @author Christian
 */
public class Lista {
    
    private Nodo pFirst;
    private Nodo pLast;
    private int size; 
    private String rutastxt;
    private String path;
    
    public Lista() {
        pLast = null;
        pFirst = null;
        size = 0;
        rutastxt = "";
        path = "";
    }

    /**
     *
     * @return pFirst de lista
     */
    public Nodo getpFirst() {
        return pFirst;
    }

    /**
     *
     * @param pFirst de lista
     */
    public void setpFirst(Nodo pFirst) {
        this.pFirst = pFirst;
    }

    /**
     *
     * @return pLast de lista
     */
    public Nodo getpLast() {
        return pLast;
    }

    /**
     *
     * @param pLast de lista
     */
    public void setpLast(Nodo pLast) {
        this.pLast = pLast;
    }

    /**
     *
     * @return size de lista
     */
    public int getSize() {
        return size;
    }

    /**
     *
     * @param size de lista
     */
    public void setSize(int size) {
        this.size = size;
    }

    /**
     *
     * @return texto de rutas existentes
     */
    public String getRutastxt() {
        return rutastxt;
    }

    /**
     *
     * @param rutastxt texto de las existentes
     */
    public void setRutastxt(String rutastxt) {
        this.rutastxt = rutastxt;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
    
    /**
     *
     * @return lista es vacia
     */
    public boolean esVacio(){
        return pFirst == null;
    }
    
    /**
     *
     * @param posicion proximo nodo
     * @return null si no existe proximo
     */
    public Nodo Proximo(Nodo posicion){
        if(posicion.getSiguiente()!= null){
            posicion = posicion.getSiguiente();
            return posicion;
        }else{
            return null;
        }
    } 
    
    /**
     *
     * @param posicion anterior nodo
     * @return null si no existe anterior
     */
    public Nodo Anterior(Nodo posicion){
        if(posicion.getAnterior()!= null){
            posicion = posicion.getAnterior();
            return posicion;
        }else{
            return null;
        }   
    }

    /**
     *
     * @param id de almacen a insertar (al final de la lista)
     * @param ruta del nuevo almacen
     */
    public void insertarAlmacen(String id, String ruta){
        Nodo pNew = new Nodo();
        pNew.setId(id);
        pNew.setNombre("Almacen " + id);
        
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
        this.insertarRuta(pNew,ruta);
    }
    
    /**
     *
     * @param n Nodo creado con insertar Almacen
     * @param ruta que sigue este nuevo Almacen
     */
    public void insertarRuta(Nodo n, String ruta){
        if(ruta != null){
            String[] r = ruta.split(",");
            if(r.length > 3){
                int a = r.length;
                int cicle = a/3;
                int b = 0;
                while(cicle != 0){
                    String[] c = new String[3];
                    System.arraycopy(r, b, c, 0, 3);
                    this.rutastxt += c[0] + "," + c[1] + "," + c[2] + "\n";
                    n.setEdges(c);
                    b += 3;
                    cicle -= 1;
                } 
            }else{
                this.rutastxt += ruta;
                n.setEdges(r); 
            }
        }
    }

    /**
     *
     * @param nombre producto
     * @param cantidad en stock del producto
     */
    public void AgregarProducto(String nombre, int cantidad){
        Nodo pNew = new Nodo(nombre, cantidad);
        if(esVacio()){
            JOptionPane.showMessageDialog(null, "Debe agregar almacenes para poder agregar productos");
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

    /**
     *
     * @param posicion del almacen a mostrar sus productos
     */
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

    /**
     *
     * @param posicion de almacen a eliminar
     */
    public void EliminarAlmacen(int posicion){
        
        if(esVacio()){
            System.out.println("Lista vacía");
            
        }else if(posicion >= size){
            System.out.println("Posicion inválida");
        }else{
            Nodo aux = pFirst;
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

    /**
     *
     * @param n Nodo a conseguir indice
     * @return indice del Nodo n
     */
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
    
    /**
     *
     * @param posicion del Nodo a acceder
     * @return aux apuntador del Nodo a acceder, null de no existir o ser válido
     */
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
    
    /**
     *
     * @param nombre del producto
     * @return aux apuntador del producto a acceder, null de no existir o ser válido
     */
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
    
    /**
     *
     * @param nombre producto a restar su stock
     * @param cantidad a restar
     */
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
    
    /**
     *
     * @param nombre producto a sumar su stock
     * @param cantidad a sumar
     */
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
    
        
