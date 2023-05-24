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
public class Viajes {

    private String origen;
    private String destino;
    private int distancia;
    private Combustible combustible;
    private Vehiculo vehiculo;
    private int peajes;
    private boolean mismaruta;
    private int kmorigen;
    private int kmdestino;

    public Viajes(String origen, String destino, int distancia, Combustible combustible, Vehiculo vehiculo, int peajes, boolean mismaruta, int kmorigen, int kmdestino) {
        this.origen = origen;
        this.destino = destino;
        this.distancia = distancia;
        this.combustible = combustible;
        this.vehiculo = vehiculo;
        this.peajes = peajes;
        this.mismaruta = mismaruta;
        this.kmorigen = kmorigen;
        this.kmdestino = kmdestino;
    }

    public void calDistancia() {
        if (!mismaruta){
            if ((kmorigen-kmdestino) > 0){
                distancia = kmorigen-kmdestino;
            }else{
                distancia = kmdestino - kmorigen;
            }
        }

    }

    public double calPeajes() {
        return (vehiculo.peaje * peajes);
    }

    public double calCostoCombustibles() {
        calDistancia();
        //return (distancia/(100/vehiculo.consumo))*combustible.getPrecio();
        
        return vehiculo.calcularCostoDeCombustible(distancia);
    }

    public void calCostoTotal() {
        System.out.println("Los el costo de los peajes es de: " + calPeajes());
        System.out.printf("El Total del viaje seria Peajes + Costo del Combustible:   %.2f \n", (calPeajes()+calCostoCombustibles()));
    }
}
