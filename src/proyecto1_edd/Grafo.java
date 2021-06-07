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
    private boolean dirigido; // Indica si es dirigido o no.
    private int maxNodos; // Tamaño máximo de la tabla.
    private int numVertices; // Número de vértices del grafo.
    private boolean matrizAdy [ ] [ ]; // Matriz de adyacencias del grafo.

    public Grafo(boolean dirigido, int n) {
        this.dirigido = dirigido;
        this.maxNodos = n;
        this.numVertices = 0;
        this.matrizAdy = new boolean [n][n];
    }
    
    public void insertaArista (int i, int j) {
    matrizAdy [i] [j] = true;
    if (!dirigido)
    matrizAdy [j] [i] = matrizAdy [i] [j];
    }
    
    public void eliminarArista (int i, int j) {
    matrizAdy [i] [j] = false;
    if (!dirigido)
    matrizAdy [j] [i] = false;
    }
    public void insertaVertice (int n) {
    if ( n > maxNodos - numVertices )
    System.out.println ("Error, se supera el número máximo de nodos");
    else {
    for (int i=0; i < numVertices + n; i++) {
    for (int j = numVertices; j < numVertices + n; j++)
    matrizAdy [i] [j] = matrizAdy [j] [i] = false;
    }
    numVertices = numVertices + n;
}
}
    public int gradoIn(int j) {
    int gIn = 0;
    for (int i = 0; i < numVertices; i++) //recorrido por filas
    if (matrizAdy [i] [j])
    gIn++; //manteniendo la posición de la columna en [j]
    return gIn;
}
}

