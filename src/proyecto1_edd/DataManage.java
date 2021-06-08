/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1_edd;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * 
 * @author Nicolás 
 */
public class DataManage {
    
    public void readtxt(){
        File file = new File("Test Packages/almacenes.txt"); 
        try{
            boolean empty = file.createNewFile();
            if(empty){
                System.out.println("Archivo creado");
            }else{
                
                //Primera lectura para obtener cantidad de líneas
                FileReader info = new FileReader(file);
                BufferedReader text = new BufferedReader(info);
                int txtsize = 0; //cantidad de lineas
                String line;
                while((line = text.readLine()) != null){
                    txtsize += 1;
                }
                text.close();
                
                //Segunda lectura para convertir txt a String 
                FileReader info2 = new FileReader(file);
                BufferedReader text2 = new BufferedReader(info2);
                String[] content = new String[txtsize];
                for(int i = 0; (line = text2.readLine()) != null; i++){
                    content[i] = line;
                }
                info2.close();
                String textocompleto = String.join("\n", content);
                
                //Aqui comienza la división de la información para convertir a lista
                String[] infoorder = textocompleto.split(";");
                Lista almacenes = new Lista();
                for(int i = 0; i < infoorder.length; i++){
                    if(infoorder[i].contains("Almacen ")){
                        String[] data = infoorder[i].split(":");
                        almacenes.insertarAlmacen(data[0]);
                        String[] products = data[1].split("\n");
                        for(int n = 1; n <= (products.length-1); n++){
                            String[] atr = products[n].split(",");
                            //atr por los atributos del producto (nombre, cantidad)
                            almacenes.AgregarProducto(n-1, atr[0], Integer.parseInt(atr[1]));
                        }
                    }else{
                        if(infoorder[i].contains("Rutas")){
                            String[] rutas = infoorder[i+1].split("\n");
                            for(int m = 1; m <= (rutas.length-1); m++){
                                
                            }
                        }
                    }
                }
            }
        }catch (NumberFormatException | IOException e){
            System.out.println("No funciona");
        }
        
    }
}
