/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.egcc.app.view;

import javax.swing.JInternalFrame;

/**
 *
 * @author Gustavo Coronel
 */
public class MainForm extends javax.swing.JFrame {

  /**
   * Creates new form MainForm
   */
  public MainForm() {
    initComponents();
    setExtendedState(MAXIMIZED_BOTH);
  }

  /**
   * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    desktopPane = new javax.swing.JDesktopPane();
    jToolBar1 = new javax.swing.JToolBar();
    btnFactorial = new javax.swing.JButton();
    jButton2 = new javax.swing.JButton();
    jButton3 = new javax.swing.JButton();
    jButton4 = new javax.swing.JButton();
    jSeparator1 = new javax.swing.JToolBar.Separator();
    btnSalir = new javax.swing.JButton();
    menuBar = new javax.swing.JMenuBar();
    fileMenu = new javax.swing.JMenu();
    exitMenuItem = new javax.swing.JMenuItem();
    menuOpciones = new javax.swing.JMenu();
    menuOpcionesFactorial = new javax.swing.JMenuItem();
    menuOpcionesMcdMcm = new javax.swing.JMenuItem();
    menuOpcionesFibonacci = new javax.swing.JMenuItem();
    menuOpcionesPrimo = new javax.swing.JMenuItem();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    jToolBar1.setFloatable(false);
    jToolBar1.setRollover(true);

    btnFactorial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pe/egcc/app/img/FaceBook.png"))); // NOI18N
    btnFactorial.setToolTipText("Factorial");
    btnFactorial.setFocusable(false);
    btnFactorial.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    btnFactorial.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
    btnFactorial.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnFactorialActionPerformed(evt);
      }
    });
    jToolBar1.add(btnFactorial);

    jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pe/egcc/app/img/FaceBook.png"))); // NOI18N
    jButton2.setToolTipText("MCD y MCM");
    jButton2.setFocusable(false);
    jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
    jToolBar1.add(jButton2);

    jButton3.setText("jButton3");
    jButton3.setFocusable(false);
    jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
    jToolBar1.add(jButton3);

    jButton4.setText("jButton4");
    jButton4.setFocusable(false);
    jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    jButton4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
    jToolBar1.add(jButton4);
    jToolBar1.add(jSeparator1);

    btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pe/egcc/app/img/salir.png"))); // NOI18N
    btnSalir.setToolTipText("Salir");
    btnSalir.setFocusable(false);
    btnSalir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    btnSalir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
    btnSalir.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnSalirActionPerformed(evt);
      }
    });
    jToolBar1.add(btnSalir);

    fileMenu.setMnemonic('f');
    fileMenu.setText("File");

    exitMenuItem.setMnemonic('x');
    exitMenuItem.setText("Exit");
    exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        exitMenuItemActionPerformed(evt);
      }
    });
    fileMenu.add(exitMenuItem);

    menuBar.add(fileMenu);

    menuOpciones.setText("Opciones");

    menuOpcionesFactorial.setText("Factorial");
    menuOpcionesFactorial.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        menuOpcionesFactorialActionPerformed(evt);
      }
    });
    menuOpciones.add(menuOpcionesFactorial);

    menuOpcionesMcdMcm.setText("MCD y MCM");
    menuOpcionesMcdMcm.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        menuOpcionesMcdMcmActionPerformed(evt);
      }
    });
    menuOpciones.add(menuOpcionesMcdMcm);

    menuOpcionesFibonacci.setText("Fibonacci");
    menuOpciones.add(menuOpcionesFibonacci);

    menuOpcionesPrimo.setText("Primo");
    menuOpciones.add(menuOpcionesPrimo);

    menuBar.add(menuOpciones);

    setJMenuBar(menuBar);

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
      .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
        .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(0, 0, 0)
        .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
        .addGap(0, 0, 0))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
      System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

  private void menuOpcionesFactorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuOpcionesFactorialActionPerformed
    cargarFormulario(FactorialView.class);
  }//GEN-LAST:event_menuOpcionesFactorialActionPerformed

  private void menuOpcionesMcdMcmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuOpcionesMcdMcmActionPerformed
    cargarFormulario(McdMcmView.class);
  }//GEN-LAST:event_menuOpcionesMcdMcmActionPerformed

  private void btnFactorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFactorialActionPerformed
    cargarFormulario(FactorialView.class);
  }//GEN-LAST:event_btnFactorialActionPerformed

  private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
    System.exit(0);
  }//GEN-LAST:event_btnSalirActionPerformed

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    /* Set the Nimbus look and feel */
    //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
    /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
     */
    try {
      for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
        if ("Nimbus".equals(info.getName())) {
          javax.swing.UIManager.setLookAndFeel(info.getClassName());
          break;
        }
      }
    } catch (ClassNotFoundException ex) {
      java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new MainForm().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnFactorial;
  private javax.swing.JButton btnSalir;
  private javax.swing.JDesktopPane desktopPane;
  private javax.swing.JMenuItem exitMenuItem;
  private javax.swing.JMenu fileMenu;
  private javax.swing.JButton jButton2;
  private javax.swing.JButton jButton3;
  private javax.swing.JButton jButton4;
  private javax.swing.JToolBar.Separator jSeparator1;
  private javax.swing.JToolBar jToolBar1;
  private javax.swing.JMenuBar menuBar;
  private javax.swing.JMenu menuOpciones;
  private javax.swing.JMenuItem menuOpcionesFactorial;
  private javax.swing.JMenuItem menuOpcionesFibonacci;
  private javax.swing.JMenuItem menuOpcionesMcdMcm;
  private javax.swing.JMenuItem menuOpcionesPrimo;
  // End of variables declaration//GEN-END:variables

  private void cargarFormulario(Class<?> aClass) {
    try {
     // Variable de control
     JInternalFrame view = null;
     // Buscar objeto
     for(JInternalFrame form: desktopPane.getAllFrames()){
       if(aClass.isInstance(form)){
         view = form;
         break;
       }
     }
     // Si no lo encuentra...
     if(view == null){
       view = (JInternalFrame) Class.forName(aClass.getName()).newInstance();
       desktopPane.add(view);
     }
     // Hacer visible el formulario
     view.setVisible(true);
     view.setSelected(true);
    } catch (Exception e) {
    }
  }

}
