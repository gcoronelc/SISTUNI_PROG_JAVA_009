/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.egcc.proyectobanco.service;

/**
 *
 * @author RICARDO
 */
public class InteresSimple extends Operacion {
  
  double InteresSimple;
          
    public InteresSimple(double principal, double interes, int meses) {
             
        super(principal, interes, meses);
        this.InteresSimple=principal*(1+(interes*meses));
       this.setResultado(this.InteresSimple);
    }
}
