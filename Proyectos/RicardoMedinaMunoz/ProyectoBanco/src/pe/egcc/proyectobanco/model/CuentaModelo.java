/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.egcc.proyectobanco.model;

/**
 *
 * @author RICARDO
 */
public class CuentaModelo {
 private String nombre;
    private String numeroCuenta;
    private double tipoInteres;
    private double saldo;
    
    
    //Constructor por defecto
    public CuentaModelo() {
    }

    //Constructor con parámetros
    public CuentaModelo(String nombre, String numeroCuenta, double tipoInteres, double saldo) {
        this.nombre = nombre;
        this.numeroCuenta = numeroCuenta;
        this.tipoInteres = tipoInteres;
        this.saldo = saldo;
    }

    //Constructor copia
    public CuentaModelo(final CuentaModelo c) {
        nombre = c.nombre;
        numeroCuenta = c.numeroCuenta;
        tipoInteres = c.tipoInteres;
        saldo = c.saldo;
    }

    //getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String s) {
        nombre = s;
    }

     public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String s) {
        numeroCuenta = s;
    }

    public double getTipoInteres() {
        return tipoInteres;
    }
    
    public void setTipoInteres(double n) {
        tipoInteres = n;
    }

    public double getSaldo() {
        return saldo;
    }
     
    public void setSaldo(double n) {
        saldo = n;
    }

//método ingreso
    public boolean ingreso(double n) {
        boolean ingresoCorrecto = true;
        if (n < 0) {
            ingresoCorrecto = false;
        } else {
            saldo = saldo + n;
        }
        return ingresoCorrecto;
    }

    //método reintegro
    public boolean retiro(double n) {
        boolean retiroCorrecto = true;
        if (n < 0) {
            retiroCorrecto = false;
        } else if (saldo >= n) {
            saldo -= n;
        } else {
            retiroCorrecto = false;
        }
        return retiroCorrecto;
    }

    //método transferencia
    public boolean transferencia(CuentaModelo c, double n) {
        boolean correcto = true;
        if (n < 0) {
            correcto = false;
        } else if (saldo >= n) {
            retiro(n);
            c.ingreso(n);
        } else {
            correcto = false;
        }
        return correcto;
    }
  
  
}
