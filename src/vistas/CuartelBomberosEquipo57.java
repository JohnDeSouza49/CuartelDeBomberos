package vistas;

import AccesoADatos.BomberoData;
import AccesoADatos.BrigadaData;
import AccesoADatos.CuartelData;
import AccesoADatos.SiniestroData;

public class CuartelBomberosEquipo57 extends javax.swing.JFrame {

    /**
     * Creates new form Ventana2
     */
    private BrigadaData bd;
    private CuartelData cd;
    private BomberoData bombd;
    private SiniestroData sd;

    public CuartelBomberosEquipo57() {
        bd = new BrigadaData();
        cd = new CuartelData();
        bombd = new BomberoData();
        sd = new SiniestroData();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDEscritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        FormularioIngresarSiniestro = new javax.swing.JMenuItem();
        FormularioConsultarSiniestro = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        FormularioIngresarCuartel = new javax.swing.JMenuItem();
        FormularioIngresarBrigada = new javax.swing.JMenuItem();
        FormularioIngresarBombero = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        FormularioConsultarCuarteles = new javax.swing.JMenuItem();
        FormularioConsultarBrigada = new javax.swing.JMenuItem();
        FormularioConsultarBomberos = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jDEscritorio.setPreferredSize(new java.awt.Dimension(400, 277));

        javax.swing.GroupLayout jDEscritorioLayout = new javax.swing.GroupLayout(jDEscritorio);
        jDEscritorio.setLayout(jDEscritorioLayout);
        jDEscritorioLayout.setHorizontalGroup(
            jDEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
        );
        jDEscritorioLayout.setVerticalGroup(
            jDEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 770, Short.MAX_VALUE)
        );

        jMenu1.setText("SINIESTROS");

        FormularioIngresarSiniestro.setText("Ingresar Siniestro");
        FormularioIngresarSiniestro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FormularioIngresarSiniestroActionPerformed(evt);
            }
        });
        jMenu1.add(FormularioIngresarSiniestro);

        FormularioConsultarSiniestro.setText("Consultar Siniestros");
        FormularioConsultarSiniestro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FormularioConsultarSiniestroActionPerformed(evt);
            }
        });
        jMenu1.add(FormularioConsultarSiniestro);

        jMenuBar1.add(jMenu1);

        jMenu4.setText("INGRESOS");

        FormularioIngresarCuartel.setText("Ingresar Cuartel");
        FormularioIngresarCuartel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FormularioIngresarCuartelActionPerformed(evt);
            }
        });
        jMenu4.add(FormularioIngresarCuartel);

        FormularioIngresarBrigada.setText("IngresarBrigada");
        FormularioIngresarBrigada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FormularioIngresarBrigadaActionPerformed(evt);
            }
        });
        jMenu4.add(FormularioIngresarBrigada);

        FormularioIngresarBombero.setText("Ingresar Bombero");
        FormularioIngresarBombero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FormularioIngresarBomberoActionPerformed(evt);
            }
        });
        jMenu4.add(FormularioIngresarBombero);

        jMenuBar1.add(jMenu4);

        jMenu2.setText("CONSULTAS");

        FormularioConsultarCuarteles.setText("Cuarteles");
        FormularioConsultarCuarteles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FormularioConsultarCuartelesActionPerformed(evt);
            }
        });
        jMenu2.add(FormularioConsultarCuarteles);

        FormularioConsultarBrigada.setText("Brigadas");
        FormularioConsultarBrigada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FormularioConsultarBrigadaActionPerformed(evt);
            }
        });
        jMenu2.add(FormularioConsultarBrigada);

        FormularioConsultarBomberos.setText("Bomberos");
        FormularioConsultarBomberos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FormularioConsultarBomberosActionPerformed(evt);
            }
        });
        jMenu2.add(FormularioConsultarBomberos);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("SALIR");
        jMenu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu3ActionPerformed(evt);
            }
        });

        jMenuItem7.setText("Salir del programa");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem7);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDEscritorio, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDEscritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 770, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FormularioIngresarSiniestroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FormularioIngresarSiniestroActionPerformed
        jDEscritorio.removeAll();
        jDEscritorio.repaint();
        IngresarSiniestro is = new IngresarSiniestro(bd, sd);
        is.setVisible(true);
        jDEscritorio.add(is);
        jDEscritorio.moveToFront(is);
    }//GEN-LAST:event_FormularioIngresarSiniestroActionPerformed

    private void FormularioConsultarSiniestroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FormularioConsultarSiniestroActionPerformed

        jDEscritorio.removeAll();
        jDEscritorio.repaint();
        ConsultarSiniestro cs = new ConsultarSiniestro();
        cs.setVisible(true);
        jDEscritorio.add(cs);
        jDEscritorio.moveToFront(cs);

    }//GEN-LAST:event_FormularioConsultarSiniestroActionPerformed

    private void FormularioIngresarCuartelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FormularioIngresarCuartelActionPerformed
        jDEscritorio.removeAll();
        jDEscritorio.repaint();
        IngresarCuartel ic = new IngresarCuartel();
        ic.setVisible(true);
        jDEscritorio.add(ic);
        jDEscritorio.moveToFront(ic);
    }//GEN-LAST:event_FormularioIngresarCuartelActionPerformed

    private void FormularioIngresarBrigadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FormularioIngresarBrigadaActionPerformed
        jDEscritorio.removeAll();
        jDEscritorio.repaint();
        IngresarBrigada ib = new IngresarBrigada();
        ib.setVisible(true);
        jDEscritorio.add(ib);
        jDEscritorio.moveToFront(ib);

    }//GEN-LAST:event_FormularioIngresarBrigadaActionPerformed

    private void FormularioIngresarBomberoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FormularioIngresarBomberoActionPerformed

        jDEscritorio.removeAll();
        jDEscritorio.repaint();
        IngresarBombero ibo = new IngresarBombero();
        ibo.setVisible(true);
        jDEscritorio.add(ibo);
        jDEscritorio.moveToFront(ibo);
    }//GEN-LAST:event_FormularioIngresarBomberoActionPerformed

    private void FormularioConsultarCuartelesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FormularioConsultarCuartelesActionPerformed

        jDEscritorio.removeAll();
        jDEscritorio.repaint();
        ConsultarCuarteles cc = new ConsultarCuarteles(cd);
        cc.setVisible(true);
        jDEscritorio.add(cc);
        jDEscritorio.moveToFront(cc);
    }//GEN-LAST:event_FormularioConsultarCuartelesActionPerformed

    private void FormularioConsultarBrigadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FormularioConsultarBrigadaActionPerformed

        jDEscritorio.removeAll();
        jDEscritorio.repaint();
        ConsultarBrigadas cb = new ConsultarBrigadas(bd, cd);
        cb.setVisible(true);
        jDEscritorio.add(cb);
        jDEscritorio.moveToFront(cb);
    }//GEN-LAST:event_FormularioConsultarBrigadaActionPerformed

    private void FormularioConsultarBomberosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FormularioConsultarBomberosActionPerformed

        jDEscritorio.removeAll();
        jDEscritorio.repaint();
        ConsultarBomberos cbo = new ConsultarBomberos(cd, bd, bombd);
        cbo.setVisible(true);
        jDEscritorio.add(cbo);
        jDEscritorio.moveToFront(cbo);
    }//GEN-LAST:event_FormularioConsultarBomberosActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu3ActionPerformed
        this.dispose();

    }//GEN-LAST:event_jMenu3ActionPerformed

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
            java.util.logging.Logger.getLogger(CuartelBomberosEquipo57.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CuartelBomberosEquipo57.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CuartelBomberosEquipo57.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CuartelBomberosEquipo57.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CuartelBomberosEquipo57().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem FormularioConsultarBomberos;
    private javax.swing.JMenuItem FormularioConsultarBrigada;
    private javax.swing.JMenuItem FormularioConsultarCuarteles;
    private javax.swing.JMenuItem FormularioConsultarSiniestro;
    private javax.swing.JMenuItem FormularioIngresarBombero;
    private javax.swing.JMenuItem FormularioIngresarBrigada;
    private javax.swing.JMenuItem FormularioIngresarCuartel;
    private javax.swing.JMenuItem FormularioIngresarSiniestro;
    private javax.swing.JDesktopPane jDEscritorio;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem7;
    // End of variables declaration//GEN-END:variables
}
