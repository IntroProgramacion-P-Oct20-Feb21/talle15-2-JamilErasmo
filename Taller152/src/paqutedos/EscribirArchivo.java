/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqutedos;

import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;
import paquetetres.*;

/**
 *
 * @author reroes
 */
public class EscribirArchivo {
    public static void ejercicio() throws FileNotFoundException {
        Formatter archivo = null;
            archivo = new Formatter("data/archivo2.txt");
            Scanner entrada = new Scanner(System.in);
            int bandera = 1;
            while (bandera == 1){
                String ruta = "/data/archivo2.txt";
                String nombre;
                double presupuesto;
                String estado;
                entrada.nextLine();
                System.out.println("Ingrese el nombre del jugador");
                nombre = entrada.nextLine();
                System.out.println("Ingrese el presupuesto");
                presupuesto = entrada.nextDouble();
                entrada.nextLine();
                System.out.println("Ingrese el nombre del estado");
                estado = entrada.nextLine();
                archivo.format("%s, presupuesto %.2f, estado %s", nombre,
                     presupuesto, estado);
                System.out.println("Pon 1 para dejar de suvir informacion");
                int sal = entrada.nextInt();
                if(sal == 1){
                    bandera = 2;
                
                }
            
            }
            archivo.close();
       }
}
