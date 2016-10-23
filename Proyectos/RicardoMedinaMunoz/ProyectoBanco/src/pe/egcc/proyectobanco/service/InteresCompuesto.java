/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.egcc.proyectobanco.service;
import java.lang.Math;
/**
 *
 * @author RICARDO
 */
public class InteresCompuesto extends Operacion {
  
    double InteresCompuesto;
       
    public InteresCompuesto(double principal, double interes, int meses) {
             
        super(principal, interes, meses);
        this.InteresCompuesto=principal*(Math.pow((1+interes), meses));
         this.setResultado(this.InteresCompuesto);
    }
}
