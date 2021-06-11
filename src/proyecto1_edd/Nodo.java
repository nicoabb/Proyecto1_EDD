
package proyecto1_edd;

/**
 *
 * @author cbcbe
 */
public class Nodo {
    
    private int valor;
    private Nodo siguiente;
    private Nodo anterior;
    private Lista productos;
    private String prod;
    private String nombre;
    private String id;
    private Lista edges;
    
    public Nodo(){//nodo utilizado para la lista de los almacenes
        this.nombre = "";
        this.id = "";
        this.siguiente = null;
        this.anterior = null;
        this.productos = new Lista();
        this.edges = new Lista();
        
    }

    public Nodo(String producto, int valor) {//nodo utilizado para la lista de productos
        this.prod = producto;
        this.valor = valor;
        this.siguiente = null;
        this.anterior = null;
    }
    
    // Métodos get y set para los atributos.

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public Nodo getAnterior() {
        return anterior;
    }

    public void setAnterior(Nodo anterior) {
        this.anterior = anterior;
    }

    public Lista getProductos() {
        return productos;
    }

    public void setProductos(Lista productos) {
        this.productos = productos;
    }

    public String getProd() {
        return prod;
    }

    public void setProd(String prod) {
        this.prod = prod;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
 public Lista getEdges() {
        return edges;
    }
    public void setEdges(Lista edges){
        this.edges = edges;
    }
   public void addEdges(String from, String hasta){
       edges.append(from,hasta); //Crear funcion que agregue la lista de ruta al atributo Nodo
   }
}
