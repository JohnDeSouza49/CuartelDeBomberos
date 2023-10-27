package vistas;

import AccesoADatos.BrigadaData;
import Entidades.Brigada;
import Entidades.Cuartel;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

public class IngresarBrigada extends javax.swing.JInternalFrame {
BrigadaData bd = new BrigadaData();
    public IngresarBrigada() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jTFCodigoBi = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTFNombreBi = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jRBEstadoBi = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jTFIdCuartel = new javax.swing.JTextField();
        jBGuardarBi = new javax.swing.JButton();
        jBBuscarBi = new javax.swing.JButton();
        jBEliminarBi = new javax.swing.JButton();
        jBSalirBi = new javax.swing.JButton();
        jCBTipo = new javax.swing.JComboBox<>();

        setTitle("INGRESAR BRIGADA");

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("BRIGADA");

        jLabel2.setText("Codigo");

        jTFCodigoBi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFCodigoBiActionPerformed(evt);
            }
        });
        jTFCodigoBi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFCodigoBiKeyTyped(evt);
            }
        });

        jLabel3.setText("Nombre");

        jLabel4.setText("Especialidad");

        jLabel5.setText("Estado");

        jLabel6.setText("Numero Cuartel");

        jTFIdCuartel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFIdCuartelKeyTyped(evt);
            }
        });

        jBGuardarBi.setText("GUARDAR");
        jBGuardarBi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarBiActionPerformed(evt);
            }
        });

        jBBuscarBi.setText("BUSCAR");
        jBBuscarBi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarBiActionPerformed(evt);
            }
        });

        jBEliminarBi.setText("ELIMINAR");
        jBEliminarBi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEliminarBiActionPerformed(evt);
            }
        });

        jBSalirBi.setText("SALIR");
        jBSalirBi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirBiActionPerformed(evt);
            }
        });

        jCBTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "incendios en viviendas e industrias", "salvamento en derrumbes", "rescates en ámbito montaña", "rescate de personas", "socorrer inundaciones", "operativos de prevención" }));
        jCBTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBTipoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(186, 186, 186)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(35, 35, 35)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGap(16, 16, 16)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jTFIdCuartel, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jBGuardarBi)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel5))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jRBEstadoBi)
                                            .addGap(324, 324, 324))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jCBTipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGap(7, 7, 7))))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(25, 25, 25)
                                    .addComponent(jTFCodigoBi, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jTFNombreBi, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(188, 188, 188)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBSalirBi)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jBBuscarBi)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jBEliminarBi)
                                .addGap(25, 25, 25)))))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTFCodigoBi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jTFNombreBi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCBTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jRBEstadoBi))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6))
                    .addComponent(jTFIdCuartel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBGuardarBi)
                    .addComponent(jBBuscarBi)
                    .addComponent(jBEliminarBi))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jBSalirBi)
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBSalirBiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirBiActionPerformed

        this.dispose();
    }//GEN-LAST:event_jBSalirBiActionPerformed

    private void jTFCodigoBiKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFCodigoBiKeyTyped
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {
            evt.consume();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jTFCodigoBiKeyTyped

    private void jTFCodigoBiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFCodigoBiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFCodigoBiActionPerformed

    private void jBGuardarBiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarBiActionPerformed
 try {
           
            String nombreBrigada = jTFNombreBi.getText();
            String tipo = (String) jCBTipo.getSelectedItem();
            
            int numeroCuartel = Integer.parseInt(jTFIdCuartel.getText());
            
            boolean estado = jRBEstadoBi.isSelected();
           int ver= bd.verificar(nombreBrigada, tipo);
           if(ver==1){
              JOptionPane.showMessageDialog(null, "Ya existe una brigada con estos datos.");
           }else{
           Brigada b = new Brigada(nombreBrigada, tipo, estado, numeroCuartel);
            bd.guardarBrigada(b);
            } 
            jTFNombreBi.setText("");
            jCBTipo.setSelectedItem("");
            jTFIdCuartel.setText("");
            
            jRBEstadoBi.setSelected(false);

        } catch (Exception e) {

            JOptionPane.showMessageDialog(this, "error");

        }
    }//GEN-LAST:event_jBGuardarBiActionPerformed

    private void jBBuscarBiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarBiActionPerformed
        Brigada b = new Brigada();
        try {

            int codigoBrigada = Integer.parseInt(jTFCodigoBi.getText());
            b = bd.buscarBrigada(codigoBrigada);
           String a=b.getEspecialidad();
            jTFCodigoBi.setText(b.getCodigoBrigada() + "");
            jTFNombreBi.setText(b.getNombreBrigada());
            jCBTipo.setSelectedItem(b.getEspecialidad());
               
              
            jTFIdCuartel.setText(b.getNumeroCuartel() + "");
            jRBEstadoBi.setSelected(b.isLibre());
 
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, " debe completar correctamente el codigo de la brigada");
        }


    }//GEN-LAST:event_jBBuscarBiActionPerformed

    private void jCBTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCBTipoActionPerformed

    private void jTFIdCuartelKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFIdCuartelKeyTyped
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {
            evt.consume();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jTFIdCuartelKeyTyped

    private void jBEliminarBiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminarBiActionPerformed
     String nombreBrigada = jTFNombreBi.getText();
            String tipo = (String) jCBTipo.getSelectedItem();
            
            int numeroCuartel = Integer.parseInt(jTFIdCuartel.getText());
            
            boolean estado = jRBEstadoBi.isSelected();

           Brigada b = new Brigada(nombreBrigada, tipo, estado, numeroCuartel);
            
            bd.brigadaOcupada(b);
            JOptionPane.showMessageDialog(this, "La brigada cambio su estado por inactividad");
            jTFNombreBi.setText("");
            jCBTipo.setSelectedItem("");
            jTFIdCuartel.setText("");
            
            jRBEstadoBi.setSelected(false);   
            
    }//GEN-LAST:event_jBEliminarBiActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBBuscarBi;
    private javax.swing.JButton jBEliminarBi;
    private javax.swing.JButton jBGuardarBi;
    private javax.swing.JButton jBSalirBi;
    private javax.swing.JComboBox<String> jCBTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRBEstadoBi;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTFCodigoBi;
    private javax.swing.JTextField jTFIdCuartel;
    private javax.swing.JTextField jTFNombreBi;
    // End of variables declaration//GEN-END:variables
}
