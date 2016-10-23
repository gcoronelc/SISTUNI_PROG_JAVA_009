package pe.egcc.app.view;

import pe.egcc.app.controller.AppController;

public class FactorialForm extends javax.swing.JInternalFrame {

    public FactorialForm() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtNumero = new javax.swing.JTextField();
        txtProcesar = new javax.swing.JButton();
        lblRespuesta = new javax.swing.JLabel();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Factorial");

        txtNumero.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        txtNumero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumeroKeyTyped(evt);
            }
        });

        txtProcesar.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        txtProcesar.setText("Procesar");
        txtProcesar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProcesarActionPerformed(evt);
            }
        });

        lblRespuesta.setBackground(new java.awt.Color(0, 0, 0));
        lblRespuesta.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        lblRespuesta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRespuesta.setBorder(new javax.swing.border.MatteBorder(null));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtProcesar, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                            .addComponent(txtNumero)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(lblRespuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtProcesar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblRespuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(88, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtProcesarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProcesarActionPerformed
        int numero;
        long factorial;
        String reporte;
        
        numero=Integer.parseInt(txtNumero.getText());
        AppController control = new AppController();
        factorial=control.factorial(numero);
        reporte="El Factorial de " + numero + " es: " + factorial + ".";
        lblRespuesta.setText(reporte);
    }//GEN-LAST:event_txtProcesarActionPerformed

    private void txtNumeroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumeroKeyTyped
            char car = evt.getKeyChar();
            // Verificar si la tecla pulsada no es un digito
            if(((car < '0') ||
               (car > '9')) &&
               (car != '\b' /*corresponde a BACK_SPACE*/))
            {
               evt.consume();  // ignorar el evento de teclado
            }
    }//GEN-LAST:event_txtNumeroKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblRespuesta;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JButton txtProcesar;
    // End of variables declaration//GEN-END:variables
}
