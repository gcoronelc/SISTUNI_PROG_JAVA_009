/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gcsa.view;

import com.gcsa.model.Bembos;
import com.gcsa.model.Carsa;
import com.gcsa.model.EmpresaModel;
import com.gcsa.model.Uber;
import com.gcsa.util.Constantes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Gustavo Soto
 */
public class VistaInicio extends javax.swing.JFrame implements ActionListener {

    /**
     * Creates new form VistaInicio
     */
    Integer idEmpresa = 0;

    public VistaInicio() {
        configurarVentana();
        initComponents();
    }

    private void configurarVentana() {
        this.setTitle("PROMOCIONES");                   // colocamos titulo a la ventana
        this.setSize(500, 300);                                 // colocamos tamanio a la ventana (ancho, alto)
        this.setLocationRelativeTo(null);                       // centramos la ventana en la pantalla
        this.setLayout(null);                                   // no usamos ningun layout, solo asi podremos dar posiciones a los componentes
        this.setResizable(false);                               // hacemos que la ventana no sea redimiensionable
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    // hacemos que cuando se cierre la ventana termina todo proceso
        setContentPane(new JLabel(new ImageIcon(getClass().getResource("/com/gcsa/img/porcentaje.jpg"))));
    }

    public void escogerEmpresa(String nombreEmpresa) {
        switch (nombreEmpresa) {
            case "Seleccionar":
                idEmpresa = 0;
                break;
            case "Bembos":
                idEmpresa = 1;
                break;

            case "Carsa":
                idEmpresa = 2;
                break;
            case "Uber":
                idEmpresa = 3;
                break;

            default:
                break;
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_principal = new javax.swing.JLabel();
        btn_procesar = new javax.swing.JButton();
        comboEmpresas = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbl_principal.setText("PROMOCIONES");

        btn_procesar.setText("INGRESAR");
        btn_procesar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_procesarActionPerformed(evt);
            }
        });

        comboEmpresas.setModel(new javax.swing.DefaultComboBoxModel(Constantes.listaEmpresas ));
        comboEmpresas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboEmpresasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(172, 172, 172)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(comboEmpresas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_procesar)
                    .addComponent(lbl_principal))
                .addContainerGap(129, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lbl_principal)
                .addGap(68, 68, 68)
                .addComponent(comboEmpresas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                .addComponent(btn_procesar)
                .addGap(49, 49, 49))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboEmpresasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboEmpresasActionPerformed
        JComboBox combo = (JComboBox) evt.getSource();
        String current = (String) combo.getSelectedItem();
        escogerEmpresa(current);

    }//GEN-LAST:event_comboEmpresasActionPerformed

    private void btn_procesarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_procesarActionPerformed
        // TODO add your handling code here:
        EmpresaModel empresaModel = null;
        if (idEmpresa < 1) {
            lbl_principal.setText("DEBE ESCOGER UNA EMPRESA");
        } else {
            if (idEmpresa == 1) {
                empresaModel = new Bembos();
            } else if (idEmpresa == 2) {
                empresaModel = new Carsa();
            } else {
                empresaModel = new Uber();
            }
        }

        if (empresaModel != null) {
            this.setVisible(false);
            VistaPrincipal principal = new VistaPrincipal(empresaModel);
            principal.setVisible(true);
        }

    }//GEN-LAST:event_btn_procesarActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_procesar;
    private javax.swing.JComboBox comboEmpresas;
    private javax.swing.JLabel lbl_principal;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
