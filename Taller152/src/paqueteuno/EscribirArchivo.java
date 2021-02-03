/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqueteuno;

import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;
import paquetetres.*;

/**
 *
 * @author reroes
 */
public class EscribirArchivo {
   public static void hola() {
        Formatter archivo = null;
        try {
            String ruta = "/data/archivo1.txt";
            String[] paises = {"Ecuador", "Colombia", "Perú", "Venezuela", 
                "Chile", "Bolivia"};
            String[] capitales = {"Quito", "Bogotá", "Lima", "Caracas", 
                "Santiago", "La Paz"};
            int[] poblacion = {17643054, 51152371, 33050325, 28435940, 19116201,
                11673021};
            String cadena = "";
            archivo = new Formatter("data/archivo1.txt");
            for (int i = 0; i < paises.length; i++){
                archivo.format("%s %s, con capital %s tiene una poblacion"
                        + " de %d\n", cadena, paises[i], 
                        capitales[i], poblacion[i]);
            }
        }catch (Exception e) {
            System.err.printf("Error, revise: %s\n", e.toString());

        }finally{
            archivo.close();
        }
       
    }

    static void ejercicio() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
