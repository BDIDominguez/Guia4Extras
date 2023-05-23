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
public class Yate extends Lancha{
    private int camarotes;

    public Yate(int camarotes, int cv, String matricula, int eslora, LocalDate fabricado) {
        super(cv, matricula, eslora, fabricado);
        this.camarotes = camarotes;
    }

    public Yate() {}

    public int getCamarotes() {
        return camarotes;
    }

    public void setCamarotes(int camarotes) {
        this.camarotes = camarotes;
    }
    
    @Override
    public double calculeAlquiler(LocalDate desde, LocalDate hasta) {
        System.out.println("Dias Trasnscurridos " + ChronoUnit.DAYS.between(desde, hasta));
        System.out.println("Eslora: " + eslora);
        System.out.println("Cavallos: " + cv);
        System.out.println("Camarotes " + camarotes);
        System.out.println("Modulo es de: " + ((10 * eslora) + cv + camarotes));
   
        return (ChronoUnit.DAYS.between(desde, hasta)) * ((10 * eslora) + cv + camarotes);
    }
    
}
