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
import javax.swing.JOptionPane;
import org.graphstream.graph.EdgeRejectedException;
import org.graphstream.graph.ElementNotFoundException;
import org.graphstream.graph.Graph;
import org.graphstream.graph.IdAlreadyInUseException;
import org.graphstream.graph.Node;
import org.graphstream.graph.implementations.SingleGraph;

/**
 *
 * @author yunch
 */
public class Grafo {

    private int size;
    private Lista[] adylist;
    private Lista almacenes;

    public Grafo(Lista almacenes) {
        this.almacenes = almacenes;
        this.size = almacenes.getSize();
        this.adylist = new Lista[size];
        for (int i = 0; i < almacenes.getSize(); i++) {
            Lista a = new Lista();
            a.appendNodo(almacenes.index(i));
            for (int k = 0; k < almacenes.getSize(); k++) {
                for (int j = 0; j < almacenes.index(i).getEdges().getSize(); j++) {
                    for (int h = 0; h < almacenes.index(k).getEdges().getSize(); h++) {
                        Nodo b = almacenes.index(k).getEdges().searchId(almacenes.index(i).getEdges().index(j).getId());
                        if (b != null) {
                            if (actors.index(i).getId() != actors.index(k).getId()) {
                                if (a.searchId(almacenes.index(k).getId()) == null) {
                                    a.appendNodo(almacenes.index(k));
                                }
                            }
                        }
                    }
                }
            }
            adylist[i] = a;
        }

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
     * @param actors the actors to set
     */
    public void setAlmacenes(Lista almacenes) {
        this.almacenes = almacenes;
    }

    public void graficoId() {
        Graph graph = new SingleGraph("Grafo");
        graph.setAutoCreate(true);
        graph.setAttribute("ui.quality");
        graph.setAttribute("ui.antialias");
        graph.setAttribute("ui.stylesheet", "node { size-mode: fit; shape: rounded-box; fill-color: white; stroke-mode: plain; padding: 3px, 2px; }edge { shape: blob; size: 3px; fill-color: #444; }");
        for (int i = 0; i < size; i++) {
            String id = String.valueOf(adylist[i].index(0).getId());
            graph.addNode(id);
        }
        for (Node node : graph) {
            node.setAttribute("ui.label", node.getId());
        }
        for (int i = 0; i < size; i++) {
            for (int j = 1; j < adylist[i].getSize(); j++) {
                int a = adylist[i].index(0).getEdges().getSize();
                for (int k = 0; k < adylist[i].index(0).getEdges().getSize(); k++) {
                    try {
                        String id = String.valueOf(adylist[i].index(j).getEdges().searchId(adylist[i].index(0).getEdges().index(k).getId()));
                        graph.addEdge(id, String.valueOf(adylist[i].index(j).getId()), String.valueOf(adylist[i].index(0).getId()));
                    } catch (EdgeRejectedException | ElementNotFoundException | IdAlreadyInUseException e) {

                    }
                }
            }
        }

        graph.display();

    }
}
    
