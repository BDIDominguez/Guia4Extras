/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia4extra;

/**
 *
 * @author Dario
 */
public class Camion extends Vehiculo{ 

    public Camion(String marca, String patente, Combustible combustible, int peaje, int consumo) {
        super(marca, patente, combustible, 150, 12);
    }
    
}
