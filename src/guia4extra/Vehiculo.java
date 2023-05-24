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
public abstract class Vehiculo {
    protected String marca;
    protected String patente;
    protected Combustible combustible;
    protected int peaje;
    protected double consumo;

    public Vehiculo(String marca, String patente, Combustible combustible, int peaje, double consumo) {
        this.marca = marca;
        this.patente = patente;
        this.combustible = combustible;
        this.peaje = peaje;
        this.consumo = consumo;
    }

    

    

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public Combustible getCombustible() {
        return combustible;
    }

    public void setCombustible(Combustible combustible) {
        this.combustible = combustible;
    }

    public int getPeaje() {
        return peaje;
    }

    public void setPeaje(int peaje) {
        this.peaje = peaje;
    }
    
    /* calcularCostoDeCombustible() que cada tipo de vehículo lo implementará 
    de la siguiente forma: el consumo de combustible es de 7 Lts cada 100 Km 
    para los autos, 10 Lts cada 100 Km para las camionetas y 12 Lts cada 100 
    Km para los camiones */
    
    public double calcularCostoDeCombustible(int distancia){
        System.out.printf("Precio del Combustible : %.2f \n", combustible.getPrecio() ); 
        System.out.println("Distancia  " + distancia);
        System.out.printf("Consumo: %.2f \n", (100/consumo)); 
        System.out.printf("Modulo de costo: %.2f  \n",(distancia/(100/consumo)));
        return (combustible.getPrecio() * (distancia/(100/consumo)));
    }

}
