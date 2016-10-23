/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gcsa.model;

/**
 *
 * @author Gustavo Soto
 */
public class Bembos extends EmpresaModel {

    private String nombreCajero;
    private String nombrLocal;

    public Bembos() {
    }

    public Bembos(String nombreCajero, String nombrLocal) {
        this.nombreCajero = nombreCajero;
        this.nombrLocal = nombrLocal;
    }

    public String getNombreCajero() {
        return nombreCajero;
    }

    public void setNombreCajero(String nombreCajero) {
        this.nombreCajero = nombreCajero;
    }

    public String getNombrLocal() {
        return nombrLocal;
    }

    public void setNombrLocal(String nombrLocal) {
        this.nombrLocal = nombrLocal;
    }
}
