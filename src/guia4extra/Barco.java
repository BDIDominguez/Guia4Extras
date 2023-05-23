/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia4extra;

import java.time.LocalDate;

import java.time.temporal.ChronoUnit;


/**
 *
 * @author Dario
 */
public abstract class Barco {
    protected String matricula;
    protected int eslora;
    protected LocalDate fabricado;

    public Barco(String matricula, int eslora, LocalDate fabricado) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.fabricado = fabricado;
    }
    public Barco() {}

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getEslora() {
        return eslora;
    }

    public void setEslora(int eslora) {
        this.eslora = eslora;
    }

    public LocalDate getFabricado() {
        return fabricado;
    }

    public void setFabricado(LocalDate fabricado) {
        this.fabricado = fabricado;
    }
    
    public double  calculeAlquiler(LocalDate desde, LocalDate hasta){
        return  (ChronoUnit.DAYS.between(desde, hasta))*(10*eslora);
    }
    
}
