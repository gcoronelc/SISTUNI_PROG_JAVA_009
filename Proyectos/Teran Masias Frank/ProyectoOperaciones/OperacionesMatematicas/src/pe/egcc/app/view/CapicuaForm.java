package pe.egcc.app.view;

import pe.egcc.app.controller.AppController;

public class CapicuaForm extends javax.swing.JInternalFrame {

    public CapicuaForm() {
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
        setTitle("Capicúa");

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
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtProcesar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(81, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblRespuesta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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
                .addContainerGap(84, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void txtProcesarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProcesarActionPerformed
        int numero;
        boolean capicua;
        String reporte;

        numero=Integer.parseInt(txtNumero.getText());
        AppController control = new AppController();
        capicua=control.esCapicua(numero);
        if(capicua == true){
            reporte="El Número " + numero + " es Capicúa.";
        }else{
            reporte="El Número " + numero + " no es Capicúa.";
        }
        
        lblRespuesta.setText(reporte);
    }//GEN-LAST:event_txtProcesarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblRespuesta;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JButton txtProcesar;
    // End of variables declaration//GEN-END:variables
}
