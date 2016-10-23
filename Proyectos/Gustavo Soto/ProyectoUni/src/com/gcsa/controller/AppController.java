/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gcsa.controller;

import com.gcsa.service.DescuentoService;

/**
 *
 * @author Gustavo Soto
 */
public class AppController {

    DescuentoService descuentoService = new DescuentoService();

    public Double calcularDescuento(Double importeTotal, Integer cantidadCupones) {
        return descuentoService.calcularDescuento(importeTotal, cantidadCupones);
    }
    
        public Double calcularIgv(Double importeTotal) {
        return descuentoService.calcularIgv(importeTotal);
    }
    
}
