
package proyecto1_edd;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.io.PrintWriter;

/**
 * 
 * @author Nicolás 
 */
public class DataManage {
    
    /**
     *
     * @param almacenes existentes
     * @param path de archivo
     */
    public void readtxt(Lista almacenes,String path){
        File file = new File(path); 
        try{
            
            //Lectura completa de archivo
            byte[] alltxt = Files.readAllBytes(Paths.get(path));
            String info = new String(alltxt);
            
            //División del texto 
            this.readinfo(almacenes, info);
            
        }catch (NumberFormatException | IOException e){
            System.out.println("No funciona");
        }  
    }
    
    public void readinfo(Lista almacenes, String info){
            String[] infoorder = info.split(";");
            for(int i = 0; i < infoorder.length; i++){
                if(infoorder[i].contains("Almacen ")){
                    String[] data = infoorder[i].split(":");
                    String id = data[0].substring(data[0].indexOf(" ")+1);
                    almacenes.insertarAlmacen(id,null); //creacion almacenes
                    String[] products = data[1].split("\n");
                    for(int n = 1; n <= (products.length-1); n++){ //creacion productos
                        String[] atr = products[n].split(",");
                        //atr por los atributos del producto (nombre, cantidad)
                        almacenes.AgregarProducto(n-1,atr[0], Integer.parseInt(atr[1]), false);
                    }
                }else{
                    if(infoorder[i].contains("Rutas")){
                        almacenes.setRutastxt(infoorder[i+1]);
                        String[] rutas = infoorder[i+1].split("\n");
                            for(int m = 1; m <= (rutas.length-1); m++){ //creacion rutas
                                Nodo pAux = almacenes.getpFirst();
                                String[] r = rutas[m].split(",");
                                while(pAux!= null){
                                    if(r[0].contains(pAux.getId())){
                                    pAux.setEdges(r);
                                    }
                                    pAux = pAux.getSiguiente();
                                }
                            }
                        }
                    }
            }
    }
    
    /**
     *
     * @param almacenes existentes
     * @param path del archivo txt
     */
    public void writetxt(Lista almacenes, String path){
        try{
            
            //Conseguir toda la informacion repartida en clases
            String datatxt = "Almacenes;\n";
            Nodo almacen = almacenes.getpFirst();
            while(almacen != null){
                Lista p = almacen.getProductos();
                Nodo product = p.getpFirst();
                datatxt += almacen.getNombre() + ":\n";
                while(product.getSiguiente() != null){
                    datatxt += product.getProd() + "," + product.getValor() + "\n";
                    product = product.getSiguiente();
                }
                datatxt += product.getProd() + "," + product.getValor() + ";\n";
                almacen = almacen.getSiguiente();
            }
            datatxt += "Rutas;";
            datatxt += almacenes.getRutastxt();
                
            //Escribir la informacion
            PrintWriter write;
            write = new PrintWriter(path);
            write.print(datatxt);
            write.close();
            
        }catch (NumberFormatException | IOException e){
            System.out.println("No funciona");
        }
    }
}
