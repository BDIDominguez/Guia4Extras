/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia4extra;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Dario
 */
public class Guia4Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner teclado = new Scanner(System.in);
        String vResp;
        do {
            System.out.println(" *************** MENU ***************** \n"
                    + " 1 ---- Alquiler de Amarres segun el Bote  \n"
                    + " 2 ---- Electrodomestico y sus precios   \n"
                    + " S ---- Salir \n");
            vResp = JOptionPane.showInputDialog("Que Opcion Elijes, S Sale");
            switch (vResp) {
                case "1":
                    Yate yate = new Yate(15, 100, "DJX380",50, LocalDate.now());
                    Lancha lancha = new Lancha(15, "DJX380",50, LocalDate.now());
                    Velero velero = new Velero(4, "DJX380", 50, LocalDate.now());
                    Amarre amarre1 = new Amarre("La Niña", 30541575, LocalDate.parse("2023-05-15"), LocalDate.parse("2023-05-22"), 1, yate);
                    Amarre amarre2 = new Amarre("La Pinta", 30541575, LocalDate.parse("2023-05-15"), LocalDate.parse("2023-05-22"), 2, lancha);
                    Amarre amarre3 = new Amarre("La Santa Maria", 30541575, LocalDate.parse("2023-05-15"), LocalDate.parse("2023-05-22"), 3, velero);
                    System.out.println("El costo del Amarre"+ amarre1.getPosicion()+ " " + amarre1.getNombre() + " es de: " + yate.calculeAlquiler(amarre1.getDesde(), amarre1.getHasta()));
                    System.out.println("El costo del Amarre"+ amarre2.getPosicion()+ " " + amarre2.getNombre() + " es de: " + lancha.calculeAlquiler(amarre2.getDesde(), amarre2.getHasta()));
                    System.out.println("El costo del Amarre"+ amarre3.getPosicion()+ " " + amarre3.getNombre() + " es de: " + velero.calculeAlquiler(amarre3.getDesde(), amarre3.getHasta()));
                    break;
                case "2":
                  
                   
                    break;
              

            }
        } while (!vResp.toUpperCase().equals("S"));
        JOptionPane.showMessageDialog(null, "Gracias por usar nuestros software!!");
    }
    
}
