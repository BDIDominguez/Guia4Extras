/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia4extra;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
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
                    + " 2 ---- Calculemos el Costo de un Viaje   \n"
                    + " S ---- Salir \n");
            vResp = JOptionPane.showInputDialog("Que Opcion Elijes, S Sale");
            if (vResp == null){
                vResp = "S";
            }
            switch (vResp) {
                case "1":
                    Yate yate = new Yate(15, 100, "DJX380",50, LocalDate.now());
                    Lancha lancha = new Lancha(15, "DJX380",50, LocalDate.now());
                    Velero velero = new Velero(4, "DJX380", 50, LocalDate.now());
                    LocalDate hasta  = LocalDate.now(); // Fecha Actual
                    Period periodo = Period.ofDays(10); // Periodode de 10 dias
                    LocalDate desde = hasta.minus(periodo); // restandole a la fecha guardad en hasta los 10 dias cargados en periodo
                    Amarre amarre1 = new Amarre("La Niña", 30541575, desde, hasta, 1, yate);
                    Amarre amarre2 = new Amarre("La Pinta", 30541575, desde, hasta, 2, lancha);
                    Amarre amarre3 = new Amarre("La Santa Maria", 30541575, desde, hasta, 3, velero);
                    System.out.println("El costo del Amarre"+ amarre1.getPosicion()+ " " + amarre1.getNombre() + " es de: " + yate.calculeAlquiler(amarre1.getDesde(), amarre1.getHasta()));
                    System.out.println("El costo del Amarre"+ amarre2.getPosicion()+ " " + amarre2.getNombre() + " es de: " + lancha.calculeAlquiler(amarre2.getDesde(), amarre2.getHasta()));
                    System.out.println("El costo del Amarre"+ amarre3.getPosicion()+ " " + amarre3.getNombre() + " es de: " + velero.calculeAlquiler(amarre3.getDesde(), amarre3.getHasta()));
                      // Intente hacer funcional el codigo que me paso ChatGPT para ejecutar el contenido de un String como codigo JAVA
                    /*
                    String codigo = "System.out.println("El costo del");
                    try {
                        Amarre.ejecutarCodigoJava(codigo,amarre1,yate);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    */
                    break;
                case "2":
                    Combustible diesel = new Combustible("Infinia Diesel", 300);
                    Combustible nafta = new Combustible("Nafta Super", 250);
                    Auto auto = new Auto("Renault Logan", "DLX380", nafta, 100, 7);
                    Camioneta camioneta = new Camioneta("Renault Kangoo", "DLX380", diesel, 100, 10);
                    Camion camion = new Camion("Scania", "DGL234", diesel, 150, 12);
                    Viajes viaje1 = new Viajes("San Salvador", "Perico", 35, diesel, auto, 5, true, 1950, 1915);
                    
                    //System.out.println("El costo del combustible seria de " + viaje1.calCostoCombustibles());
                    viaje1.calCostoTotal();
                    
                    
                   
                    break;
              

            }
        } while (!vResp.toUpperCase().equals("S"));
        JOptionPane.showMessageDialog(null, "Gracias por usar nuestros software!!");
    }
    
}
