
package proyecto1_edd;

/**
 *
 * @author Christian
 */
public class Nodo {
    
    private int valor;
    private Nodo siguiente;
    private Nodo anterior;
    private Lista productos;
    private String prod;
    private String nombre;
    private String id;
    private String[] edges;
    
    public Nodo(){//nodo utilizado para la lista de los almacenes
        this.nombre = "";
        this.id = "";
        this.siguiente = null;
        this.anterior = null;
        this.productos = new Lista();
        this.edges = new String[3];
    }

    /**
     *
     * @param producto nombre del producto
     * @param valor cantidad en stock
     */
    public Nodo(String producto, int valor) {//nodo utilizado para la lista de productos
        this.prod = producto;
        this.valor = valor;
        this.siguiente = null;
        this.anterior = null;
    }
    
    /**
     *
     * @return valor de la cantidad en stock del producto
     */
    public int getValor() {
        return valor;
    }

    /**
     *
     * @param valor de la cantidad en stock del producto
     */
    public void setValor(int valor) {
        this.valor = valor;
    }

    /**
     *
     * @return siguiente Nodo
     */
    public Nodo getSiguiente() {
        return siguiente;
    }

    /**
     *
     * @param siguiente Nodo
     */
    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    /**
     *
     * @return anterior Nodo
     */
    public Nodo getAnterior() {
        return anterior;
    }

    /**
     *
     * @param anterior Nodo
     */
    public void setAnterior(Nodo anterior) {
        this.anterior = anterior;
    }

    /**
     *
     * @return productos (lista de todos)
     */
    public Lista getProductos() {
        return productos;
    }

    /**
     *
     * @param productos (lista de todos)
     */
    public void setProductos(Lista productos) {
        this.productos = productos;
    }

    /**
     *
     * @return Nombre producto
     */
    public String getProd() {
        return prod;
    }

    /**
     *
     * @param prod (Nombre producto)
     */
    public void setProd(String prod) {
        this.prod = prod;
    }

    /**
     *
     * @return Nombre almacen
     */
    public String getNombre() {
        return nombre;
    }

    /**
     *
     * @param nombre almacen
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     *
     * @return id almacen
     */
    public String getId() {
        return id;
    }

    /**
     *
     * @param id almacen
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     *
     * @return edges (almacenes con los que conecta)
     */
    public String[] getEdges() {
        return edges;
    }

    /**
     *
     * @param edges (almacenes con los que conecta)
     */
    /**
     *
     * @param edges (almacenes con los que conecta)
     */
    public void setEdges(String[] edges){
        String [] auxi  = this.edges; 
        if (auxi != null){
          int fal = auxi.length; 
          int sal = edges.length; 
          String[] result = new String[fal+sal];
          System.arraycopy(auxi, 0, result, 0, fal);  
          System.arraycopy(edges, 0, result, fal, sal);  
        
          this.edges = result;
        } else if (auxi == null){
            this.edges = edges;
        }
         
        
    }
}
