/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.egcc.MyMath.view;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import pe.egcc.MyMath.service.MyMathlService;

/**
 *
 * @author Alumno
 */
public class MyMathView extends javax.swing.JFrame {

    /**
     * Creates new form MyMathView
     */
    public MyMathView() {
        initComponents();
        cbOperacion.addItem("--Seleciione--");
        cbOperacion.addItem("Factorial");
        cbOperacion.addItem("MCD -MCM");
        cbOperacion.addItem("Fibonacci");
        cbOperacion.addItem("Primos");
        
        cbOperacion.setSelectedIndex(0);   
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtSegundoNumero = new javax.swing.JTextField();
        btnCalcular = new javax.swing.JButton();
        cbOperacion = new javax.swing.JComboBox<>();
        txtPrimerNumero = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        cbOperacion.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbOperacionItemStateChanged(evt);
            }
        });
        cbOperacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbOperacionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(txtSegundoNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cbOperacion, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCalcular, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE))
                .addGap(29, 29, 29))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(77, 77, 77)
                    .addComponent(txtPrimerNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(209, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(cbOperacion, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSegundoNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(146, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(75, 75, 75)
                    .addComponent(txtPrimerNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(189, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        long numero,nFactorial;
        
        numero=Long.parseLong(txtPrimerNumero.getText());
        MyMathlService Ope = new MyMathlService();
        nFactorial=Ope.CalcularFactorial(numero);
        
        String reporte="";
        reporte += "El Factorial de " + numero + " es: "+ nFactorial+"\n";
        JOptionPane.showMessageDialog(rootPane, reporte); 
        
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void cbOperacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbOperacionActionPerformed
        String seleccion = (String) cbOperacion.getSelectedItem();
        
        if(seleccion.equals("Factorial")){
            txtPrimerNumero.setVisible(true);
            txtSegundoNumero.setVisible(false);
            System.out.println("You seleted the book: " + seleccion);
        }
        else if (seleccion.equals("Fibonacci")){
            txtPrimerNumero.setVisible(true);
            txtSegundoNumero.setVisible(false);
            System.out.println("You seleted the book: " + seleccion);
        }
        else if (seleccion.equals("MCD -MCM")){
            txtPrimerNumero.setVisible(true);
            txtSegundoNumero.setVisible(true);
            System.out.println("You seleted the book: " + seleccion);
        }
        else if (seleccion.equals("Fibonacci")){
            txtPrimerNumero.setVisible(true);
            txtSegundoNumero.setVisible(false);
            System.out.println("You seleted the book: " + seleccion);
        }
    }//GEN-LAST:event_cbOperacionActionPerformed

    private void cbOperacionItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbOperacionItemStateChanged

    }//GEN-LAST:event_cbOperacionItemStateChanged

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MyMathView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JComboBox<String> cbOperacion;
    private javax.swing.JTextField txtPrimerNumero;
    private javax.swing.JTextField txtSegundoNumero;
    // End of variables declaration//GEN-END:variables
}
