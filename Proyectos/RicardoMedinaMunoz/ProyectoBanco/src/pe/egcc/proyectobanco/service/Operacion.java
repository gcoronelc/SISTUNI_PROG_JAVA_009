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
public class Operacion {
  
  double principal;
    double interes;
    double resultado;
    int meses;

    
    public Operacion(double principal, double interes, int meses) {
        
        this.principal = principal;
        this.interes = interes;
        this.meses = meses;
  
       
    }
   
    public double getPrincipal() {
        return principal;
    }

    public void setPrincipal(double principal) {
        this.principal = principal;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public int getMeses() {
        return meses;
    }

    public void setMeses(int meses) {
        this.meses = meses;
    }
  
    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
}
