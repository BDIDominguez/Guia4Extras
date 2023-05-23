/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia4extra;

import java.time.LocalDate;


/**
 *
 * @author Dario
 */
public class Amarre {
    private String nombre;
    private int documento;
    private LocalDate desde;
    private LocalDate hasta;
    private int posicion;
    private Barco barco;

    public Amarre() {
    }

    public Amarre(String nombre, int documento, LocalDate desde, LocalDate hasta, int posicion, Barco barco) {
        this.nombre = nombre;
        this.documento = documento;
        this.desde = desde;
        this.hasta = hasta;
        this.posicion = posicion;
        this.barco = barco;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public LocalDate getDesde() {
        return desde;
    }

    public void setDesde(LocalDate desde) {
        this.desde = desde;
    }

    public LocalDate getHasta() {
        return hasta;
    }

    public void setHasta(LocalDate hasta) {
        this.hasta = hasta;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public Barco getBarco() {
        return barco;
    }

    public void setBarco(Barco barco) {
        this.barco = barco;
    }
    
    
    
}
