/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gcsa.service;

import com.gcsa.util.Constantes;

/**
 *
 * @author Gustavo Soto
 */
public class DescuentoService {

    public Double calcularIgv(Double totalImporte) {
        return totalImporte * Constantes.igv;
    }

    public Double calcularDescuento(Double totalImporte, Integer nroCupones) {
        if (nroCupones >= 5 && nroCupones <= 7) {
            return totalImporte * 0.2;
        } else if (nroCupones > 7) {
            return totalImporte * 0.5;
        } else {
            return 0.0;
        }
    }


}
