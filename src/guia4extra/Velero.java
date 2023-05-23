/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia4extra;

import java.time.LocalDate;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author Dario
 */
public class Velero extends Barco{
    private int mastiles;

    public Velero() {
    }

    public Velero(int mastiles, String matricula, int eslora, LocalDate fabricado) {
        super(matricula, eslora, fabricado);
        this.mastiles = mastiles;
    }

    public int getMastiles() {
        return mastiles;
    }

    public void setMastiles(int mastiles) {
        this.mastiles = mastiles;
    }


    @Override
    public double  calculeAlquiler(LocalDate desde, LocalDate hasta){
        System.out.println("Dias Trasnscurridos " + ChronoUnit.DAYS.between(desde, hasta));
        System.out.println("Eslora: " + eslora);
        System.out.println("Modulo es de: " + ((10 * eslora)));
        return  (ChronoUnit.DAYS.between(desde, hasta))*(10*eslora+mastiles);
    }
    
   
   
   

   

    
    
    
}
