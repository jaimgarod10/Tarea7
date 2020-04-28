/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tarea7;

/**
 *
 * @author jaimg
 */
public class Deportiva extends Barco{
    
    private int cv;
    private float precio;
    public Deportiva() {
    }
    
    public Deportiva(int cv, float eslora, int dias, String matricula) {
        super(eslora, dias, matricula);
        this.cv = cv;
    }

    public int getCv() {
        return cv;
    }

    public void setCv(int cv) {
        this.cv = cv;
    }

    @Override
    public void calcularPrecio() {
     precio=10*super.getEslora()*super.getDias()+2*cv;
        System.out.println("");
    }

    @Override
    public String toString() {
        return "Deportivas" + " precio: " + precio;
    }
    
}
