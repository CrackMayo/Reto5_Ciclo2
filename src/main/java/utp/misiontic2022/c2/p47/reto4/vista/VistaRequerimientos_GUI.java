/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utp.misiontic2022.c2.p47.reto4.vista;

import javax.swing.JOptionPane;
import utp.misiontic2022.c2.p47.reto4.controlador.ControladorRequerimientos;

/**
 *
 * @author User
 */
public class VistaRequerimientos_GUI extends javax.swing.JFrame {

    private ControladorRequerimientos controlador;
    private Reporte1_TM reporte1_TM;
    private Reporte2_TM reporte2_TM;
    private Reporte3_TM reporte3_TM;
    /**
     * Creates new form VistaRequerimientos_GUI
     */
    public VistaRequerimientos_GUI() {
        controlador = new ControladorRequerimientos();
        initComponents();
        listarRequerimiento1();
        listarRequerimiento2();
        listarRequerimiento3();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tpMain = new javax.swing.JTabbedPane();
        tpReporte1 = new javax.swing.JPanel();
        jScrollPaneReporte1 = new javax.swing.JScrollPane();
        jTableReporte1 = new javax.swing.JTable();
        tpReporte2 = new javax.swing.JPanel();
        jScrollPaneReporte2 = new javax.swing.JScrollPane();
        jTableReporte2 = new javax.swing.JTable();
        tpReporte3 = new javax.swing.JPanel();
        jScrollPaneReporte3 = new javax.swing.JScrollPane();
        jTableReporte3 = new javax.swing.JTable();
        appMenu = new javax.swing.JMenuBar();
        archivo = new javax.swing.JMenu();
        miSalir = new javax.swing.JMenuItem();
        ventana = new javax.swing.JMenu();
        miReporte1 = new javax.swing.JMenuItem();
        miReporte2 = new javax.swing.JMenuItem();
        miReporte3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Misión TIC 2022 - Ciclo 2 - Reto 5");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setName("appFrame"); // NOI18N
        setUndecorated(true);

        jTableReporte1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPaneReporte1.setViewportView(jTableReporte1);

        javax.swing.GroupLayout tpReporte1Layout = new javax.swing.GroupLayout(tpReporte1);
        tpReporte1.setLayout(tpReporte1Layout);
        tpReporte1Layout.setHorizontalGroup(
            tpReporte1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPaneReporte1, javax.swing.GroupLayout.DEFAULT_SIZE, 693, Short.MAX_VALUE)
        );
        tpReporte1Layout.setVerticalGroup(
            tpReporte1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPaneReporte1, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
        );

        tpMain.addTab("Reporte 1", tpReporte1);

        jTableReporte2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPaneReporte2.setViewportView(jTableReporte2);

        javax.swing.GroupLayout tpReporte2Layout = new javax.swing.GroupLayout(tpReporte2);
        tpReporte2.setLayout(tpReporte2Layout);
        tpReporte2Layout.setHorizontalGroup(
            tpReporte2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPaneReporte2, javax.swing.GroupLayout.DEFAULT_SIZE, 693, Short.MAX_VALUE)
        );
        tpReporte2Layout.setVerticalGroup(
            tpReporte2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPaneReporte2, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
        );

        tpMain.addTab("Reporte 2", tpReporte2);

        jTableReporte3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPaneReporte3.setViewportView(jTableReporte3);

        javax.swing.GroupLayout tpReporte3Layout = new javax.swing.GroupLayout(tpReporte3);
        tpReporte3.setLayout(tpReporte3Layout);
        tpReporte3Layout.setHorizontalGroup(
            tpReporte3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPaneReporte3, javax.swing.GroupLayout.DEFAULT_SIZE, 693, Short.MAX_VALUE)
        );
        tpReporte3Layout.setVerticalGroup(
            tpReporte3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPaneReporte3, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
        );

        tpMain.addTab("Reporte 3", tpReporte3);

        getContentPane().add(tpMain, java.awt.BorderLayout.CENTER);

        archivo.setText("Archivo");

        miSalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        miSalir.setText("Salir");
        miSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miSalirActionPerformed(evt);
            }
        });
        archivo.add(miSalir);

        appMenu.add(archivo);

        ventana.setText("Ventana");

        miReporte1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_1, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        miReporte1.setText("Reporte 1");
        miReporte1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miReporte1ActionPerformed(evt);
            }
        });
        ventana.add(miReporte1);

        miReporte2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_2, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        miReporte2.setText("Reporte 2");
        miReporte2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miReporte2ActionPerformed(evt);
            }
        });
        ventana.add(miReporte2);

        miReporte3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_3, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        miReporte3.setText("Reporte 3");
        miReporte3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miReporte3ActionPerformed(evt);
            }
        });
        ventana.add(miReporte3);

        appMenu.add(ventana);

        setJMenuBar(appMenu);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void miReporte1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miReporte1ActionPerformed
        // TODO add your handling code here:
        tpMain.setSelectedIndex(0);
    }//GEN-LAST:event_miReporte1ActionPerformed

    private void miReporte2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miReporte2ActionPerformed
        // TODO add your handling code here:
        tpMain.setSelectedIndex(1);
    }//GEN-LAST:event_miReporte2ActionPerformed

    private void miReporte3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miReporte3ActionPerformed
        // TODO add your handling code here:
        tpMain.setSelectedIndex(2);
    }//GEN-LAST:event_miReporte3ActionPerformed
    
    private void listarRequerimiento1() {
        try {
            var requerimientos1 = controlador.consultarRequerimiento1();
            reporte1_TM =  new Reporte1_TM(requerimientos1);
            jTableReporte1.setModel(reporte1_TM);
        } catch (Exception e) {
        }
    }
    
    private void listarRequerimiento2() {
        try {
            var requerimientos2 = controlador.consultarRequerimiento2();
            reporte2_TM =  new Reporte2_TM(requerimientos2);
            jTableReporte2.setModel(reporte2_TM);
        } catch (Exception e) {
        }
    }
    
    private void listarRequerimiento3() {
        try {
            var requerimientos3 = controlador.consultarRequerimiento3();
            reporte3_TM =  new Reporte3_TM(requerimientos3);
            jTableReporte3.setModel(reporte3_TM);
        } catch (Exception e) {
        }
    }
    
    
    private void miSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miSalirActionPerformed
        // TODO add your handling code here:
        if (JOptionPane.showConfirmDialog(this, "Desea salir de la aplicación?", getTitle(), JOptionPane.YES_OPTION) == JOptionPane.YES_OPTION) {

            dispose();
        }
    }//GEN-LAST:event_miSalirActionPerformed
    
    
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
            java.util.logging.Logger.getLogger(VistaRequerimientos_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaRequerimientos_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaRequerimientos_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaRequerimientos_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaRequerimientos_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar appMenu;
    private javax.swing.JMenu archivo;
    private javax.swing.JScrollPane jScrollPaneReporte1;
    private javax.swing.JScrollPane jScrollPaneReporte2;
    private javax.swing.JScrollPane jScrollPaneReporte3;
    private javax.swing.JTable jTableReporte1;
    private javax.swing.JTable jTableReporte2;
    private javax.swing.JTable jTableReporte3;
    private javax.swing.JMenuItem miReporte1;
    private javax.swing.JMenuItem miReporte2;
    private javax.swing.JMenuItem miReporte3;
    private javax.swing.JMenuItem miSalir;
    private javax.swing.JTabbedPane tpMain;
    private javax.swing.JPanel tpReporte1;
    private javax.swing.JPanel tpReporte2;
    private javax.swing.JPanel tpReporte3;
    private javax.swing.JMenu ventana;
    // End of variables declaration//GEN-END:variables
}
