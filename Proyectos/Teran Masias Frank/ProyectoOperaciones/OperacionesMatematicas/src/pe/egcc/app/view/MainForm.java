package pe.egcc.app.view;

import javax.swing.JInternalFrame;

public class MainForm extends javax.swing.JFrame {

    public MainForm() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        menuArchivo = new javax.swing.JMenu();
        exitMenuItem = new javax.swing.JMenuItem();
        menuOperaciones = new javax.swing.JMenu();
        menuItemFibonacci = new javax.swing.JMenuItem();
        menuItemFacorial = new javax.swing.JMenuItem();
        menuItemPrimos = new javax.swing.JMenuItem();
        menuItemMCD = new javax.swing.JMenuItem();
        menuItemCapicua = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Operaciones Matematicas & de Cadenas");

        menuArchivo.setMnemonic('f');
        menuArchivo.setText("Archivo");

        exitMenuItem.setMnemonic('x');
        exitMenuItem.setText("Exit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        menuArchivo.add(exitMenuItem);

        menuBar.add(menuArchivo);

        menuOperaciones.setText("Números Enteros");

        menuItemFibonacci.setText("Fibonacci");
        menuItemFibonacci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemFibonacciActionPerformed(evt);
            }
        });
        menuOperaciones.add(menuItemFibonacci);

        menuItemFacorial.setText("Factorial");
        menuItemFacorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemFacorialActionPerformed(evt);
            }
        });
        menuOperaciones.add(menuItemFacorial);

        menuItemPrimos.setText("Primos");
        menuItemPrimos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemPrimosActionPerformed(evt);
            }
        });
        menuOperaciones.add(menuItemPrimos);

        menuItemMCD.setText("MCD-MCM");
        menuItemMCD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemMCDActionPerformed(evt);
            }
        });
        menuOperaciones.add(menuItemMCD);

        menuItemCapicua.setText("Capicúa");
        menuItemCapicua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemCapicuaActionPerformed(evt);
            }
        });
        menuOperaciones.add(menuItemCapicua);

        menuBar.add(menuOperaciones);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 589, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 398, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void menuItemFacorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemFacorialActionPerformed
        cargarFormulario(FactorialForm.class);
    }//GEN-LAST:event_menuItemFacorialActionPerformed

    private void menuItemPrimosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemPrimosActionPerformed
        cargarFormulario(PrimosForm.class);
    }//GEN-LAST:event_menuItemPrimosActionPerformed

    private void menuItemMCDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemMCDActionPerformed
        cargarFormulario(McdMcmForm.class);
    }//GEN-LAST:event_menuItemMCDActionPerformed

    private void menuItemFibonacciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemFibonacciActionPerformed
        cargarFormulario(FibonacciForm.class);
    }//GEN-LAST:event_menuItemFibonacciActionPerformed

    private void menuItemCapicuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemCapicuaActionPerformed
        cargarFormulario(CapicuaForm.class);
    }//GEN-LAST:event_menuItemCapicuaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
    
    private void cargarFormulario(Class<?> aClass){
        
        try {
            //Variable de COntrol
            JInternalFrame view = null;
            //Buscar objeto
            for(JInternalFrame form: desktopPane.getAllFrames()){
                if(aClass.isInstance(form)){
                    view = form;
                    break;
                }
            }
            //Si no lo encuentra
            if (view == null) {
                view = (JInternalFrame) Class.forName(aClass.getName()).newInstance();
                desktopPane.add(view);
            }
            //Hacer visible el formulario
            view.setVisible(true);
            view.setSelected(true);
        } catch (Exception e) {
            
        }
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu menuArchivo;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem menuItemCapicua;
    private javax.swing.JMenuItem menuItemFacorial;
    private javax.swing.JMenuItem menuItemFibonacci;
    private javax.swing.JMenuItem menuItemMCD;
    private javax.swing.JMenuItem menuItemPrimos;
    private javax.swing.JMenu menuOperaciones;
    // End of variables declaration//GEN-END:variables
}
