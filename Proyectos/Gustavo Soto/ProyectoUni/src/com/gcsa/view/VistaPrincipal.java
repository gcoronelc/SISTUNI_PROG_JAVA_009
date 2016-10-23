/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gcsa.view;

import com.gcsa.controller.AppController;
import com.gcsa.model.Bembos;
import com.gcsa.model.Carsa;
import com.gcsa.model.EmpresaModel;
import com.gcsa.model.Factura;
import com.gcsa.model.Uber;
import javax.swing.ImageIcon;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;

/**
 *
 * @author Gustavo Soto
 */
public class VistaPrincipal extends javax.swing.JFrame {

    private Integer nroCupones = 0;
    private Double importe = 0.0;
    private String nombre = "";
    private EmpresaModel empresaModel;
    Double dscto, igv, totalApagar;

    /**
     * Creates new form VistaPrincipal
     */
    public VistaPrincipal(EmpresaModel empresaModel) {

        setTitle("Home Principal");
        setSize(600, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);


        if (empresaModel instanceof Bembos) {
            setContentPane(new JLabel(new ImageIcon(getClass().getResource("/com/gcsa/img/bembos.png"))));
            empresaModel = new Bembos("Elisa Gomez", "Bembos Miraflores");
        }

        if (empresaModel instanceof Carsa) {
            setContentPane(new JLabel(new ImageIcon(getClass().getResource("/com/gcsa/img/carsa.jpg"))));
            empresaModel = new Carsa();
        }

        if (empresaModel instanceof Uber) {
            setContentPane(new JLabel(new ImageIcon(getClass().getResource("/com/gcsa/img/uber.jpg"))));
            empresaModel = new Uber();
        }
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        et_nroCupones = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btn_Procesar = new javax.swing.JButton();
        et_nombreParticipante = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        et_Importe = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        et_nroCupones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                et_nroCuponesActionPerformed(evt);
            }
        });

        jLabel1.setText("Número de cupones");

        btn_Procesar.setText("PROCESAR");
        btn_Procesar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ProcesarActionPerformed(evt);
            }
        });

        jLabel2.setText("Nombre Participante");

        jLabel5.setText("Importe");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(et_nroCupones, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(et_nombreParticipante)
                            .addComponent(et_Importe))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                .addComponent(btn_Procesar)
                .addGap(21, 21, 21))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(et_nroCupones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(btn_Procesar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(et_nombreParticipante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(et_Importe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(102, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void et_nroCuponesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_et_nroCuponesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_et_nroCuponesActionPerformed

    private void btn_ProcesarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ProcesarActionPerformed
        // TODO add your handling code here:
        nroCupones = Integer.parseInt(et_nroCupones.getText().toString());
        importe = Double.parseDouble(et_Importe.getText().toString());
        nombre = et_nombreParticipante.getText().toString();

        AppController appController = new AppController();

        dscto = appController.calcularDescuento(importe * nroCupones, nroCupones);
        Double tmpPagar = (importe * nroCupones) - dscto;
        igv = appController.calcularIgv(tmpPagar);
        totalApagar = tmpPagar + igv;

        Factura factura = new Factura();
        factura.setNumeroFactura("abc-"+String.valueOf((int)(Math.random() * 500 + 1)));
        factura.setIgv(igv);
        factura.setNombreParticipante(nombre);
        factura.setMonto(tmpPagar);
        factura.setMontoTotal(totalApagar);

        String print = "--------------------------**********----------------" + "\n";
        print += "FACTURA: " + factura.getNumeroFactura() + "\n";
        print += "Participante: " + factura.getNombreParticipante() + "\n";
        print += "Monto: " + factura.getMonto() + "\n";
        print += "IGV: " + factura.getIgv() + "\n";
        print += "TOTAL A PAGAR: " + factura.getMontoTotal() + "\n";
        print += "------------------------------------************-------------";
        jTextArea1.setText(String.valueOf(print));

    }//GEN-LAST:event_btn_ProcesarActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Procesar;
    private javax.swing.JTextField et_Importe;
    private javax.swing.JTextField et_nombreParticipante;
    private javax.swing.JTextField et_nroCupones;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
