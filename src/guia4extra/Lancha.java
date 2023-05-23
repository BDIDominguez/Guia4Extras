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
public class Lancha extends Barco{
    protected int cv;

    public Lancha(int cv, String matricula, int eslora, LocalDate fabricado) {
        super(matricula, eslora, fabricado);
        this.cv = cv;
    }

    public Lancha() {
        
    }

    public int getCv() {
        return cv;
    }

    public void setCv(int cv) {
        this.cv = cv;
    }

    @Override
    public double  calculeAlquiler(LocalDate desde, LocalDate hasta){
        System.out.println("Dias Trasnscurridos " + ChronoUnit.DAYS.between(desde, hasta));
        System.out.println("Eslora: " + eslora);
        System.out.println("Cavallos: " + cv);
        System.out.println("Modulo es de: " + ((10 * eslora) + cv ));
         return  (ChronoUnit.DAYS.between(desde, hasta))*(10*eslora+cv);
    }
    
}
