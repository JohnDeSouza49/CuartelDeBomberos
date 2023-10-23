package vistas;

import AccesoADatos.BrigadaData;
import AccesoADatos.CuartelData;
import AccesoADatos.SiniestroData;
import Entidades.Brigada;
import Entidades.Cuartel;
import Entidades.Siniestro;
import java.awt.event.KeyEvent;
import java.time.LocalDate;
import java.time.ZoneId;
import javax.swing.JOptionPane;

public class IngresarSiniestro extends javax.swing.JInternalFrame {

    private BrigadaData bd;
    private SiniestroData sd;
    Brigada brigadaAsignada = null;
    Siniestro siniestro = null;

    public IngresarSiniestro(BrigadaData bd, SiniestroData sd) {
        this.bd = bd;
        this.sd = sd;

        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jTFCodigoSi = new javax.swing.JTextField();
        jTFBrigada = new javax.swing.JTextField();
        jDCFechaSi = new com.toedter.calendar.JDateChooser();
        jTFCooXSi = new javax.swing.JTextField();
        jTFCooYSi = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTADetalleSi = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTFCuartel = new javax.swing.JTextField();
        jBGuardarSi = new javax.swing.JButton();
        jBSalir = new javax.swing.JButton();
        jBEliminarSi = new javax.swing.JButton();
        jBAsignarCuartel = new javax.swing.JButton();
        jCBTipoSi = new javax.swing.JComboBox<>();

        setTitle("INGRESAR SINIESTRO");

        jPanel1.setPreferredSize(new java.awt.Dimension(600, 450));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("SINIESTRO");

        jLabel2.setText("Codigo");

        jLabel3.setText("Tipo");

        jLabel4.setText("Fecha de Siniestro");

        jLabel5.setText("Coordenada X");

        jLabel6.setText("Coordenada Y");

        jTFCodigoSi.setEditable(false);

        jTFBrigada.setEditable(false);
        jTFBrigada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFBrigadaActionPerformed(evt);
            }
        });

        jTFCooXSi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFCooXSiKeyTyped(evt);
            }
        });

        jTFCooYSi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFCooYSiKeyTyped(evt);
            }
        });

        jTADetalleSi.setColumns(20);
        jTADetalleSi.setRows(5);
        jScrollPane1.setViewportView(jTADetalleSi);

        jLabel8.setText("DETALLES DE SINIESTRO");

        jLabel9.setText("Nombre Brigada");

        jLabel10.setText("Cuartel");

        jTFCuartel.setEditable(false);

        jBGuardarSi.setText("GUARDAR");
        jBGuardarSi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarSiActionPerformed(evt);
            }
        });

        jBSalir.setText("SALIR");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        jBEliminarSi.setText("ELIMINAR");

        jBAsignarCuartel.setText("ASIGNAR CUARTEL");
        jBAsignarCuartel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAsignarCuartelActionPerformed(evt);
            }
        });

        jCBTipoSi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "incendios en viviendas e industrias", "salvamento en derrumbes", "rescates en ámbito montaña", "rescate de personas", "socorrer inundaciones", "operativos de prevención", " " }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(219, 219, 219)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(87, 87, 87)
                                .addComponent(jBGuardarSi)
                                .addGap(48, 48, 48)
                                .addComponent(jBEliminarSi)
                                .addGap(47, 47, 47)
                                .addComponent(jBSalir)))
                        .addGap(0, 19, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jTFCodigoSi, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(34, 34, 34))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(162, 162, 162)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(jTFCooXSi, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                                                    .addComponent(jDCFechaSi, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)))
                                            .addComponent(jTFCuartel, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(34, 34, 34)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jBAsignarCuartel, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jCBTipoSi, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTFCooYSi, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTFBrigada, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTFCodigoSi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jCBTipoSi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jDCFechaSi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(jTFBrigada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTFCooXSi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jTFCooYSi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTFCuartel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBAsignarCuartel))
                .addGap(30, 30, 30)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBGuardarSi)
                    .addComponent(jBSalir)
                    .addComponent(jBEliminarSi))
                .addGap(95, 95, 95))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_jBSalirActionPerformed

    private void jTFBrigadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFBrigadaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFBrigadaActionPerformed

    private void jBAsignarCuartelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAsignarCuartelActionPerformed
        if (jTFCooXSi.getText().isEmpty() || jTFCooYSi.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "debe completar las coordenadas del siniestro");
        } else {
            CuartelData cu = new CuartelData();
            int x = Integer.parseInt(jTFCooXSi.getText());
            int y = Integer.parseInt(jTFCooYSi.getText());
            String tipo = (String) jCBTipoSi.getSelectedItem();
            LocalDate feSi = jDCFechaSi.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            siniestro = new Siniestro(tipo, feSi, x, y);
            brigadaAsignada = sd.AsignarBrigada(siniestro);
            JOptionPane.showMessageDialog(this, "buscando brigada libre...");
            if (brigadaAsignada== null){
          JOptionPane.showMessageDialog(this, "No se encontraron brigadas libres. Por favor, inténtelo de nuevo más tarde.");  
        }
        
            jTFBrigada.setText(brigadaAsignada.getNombreBrigada());
            Cuartel cuartelAsignado = cu.BuscarCuartelPorCodigo(brigadaAsignada.getNumeroCuartel());
            jTFCuartel.setText(cuartelAsignado.getNombreCuartel());

        }
    }//GEN-LAST:event_jBAsignarCuartelActionPerformed

    private void jBGuardarSiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarSiActionPerformed
        //try{
        //bd.brigadaOcupada(brigadaAsignada);
        //SiniestroData sd = new SiniestroData();
        //int x = siniestro.getCoordenadaX();
        //int y = siniestro.getCoordenadaY();
        //String tipo = siniestro.getTipo();
        //String detalles = jTADetalleSi.getText();
        //LocalDate feS = siniestro.getFechaSiniestro();
        //  LocalDate frS = siniestro.getFechaResolucion();
        //int puntuacion = siniestro.getPuntuacion();
      try{
        bd.brigadaOcupada(brigadaAsignada);
        SiniestroData sd= new SiniestroData();
        int x= siniestro.getCoordenadaX();
        int y= siniestro.getCoordenadaY();
        String tipo= siniestro.getTipo();
        String detalles=jTADetalleSi.getText();
        LocalDate feS=siniestro.getFechaSiniestro();
       
        Siniestro s = new Siniestro(tipo, feS, x, y, detalles, brigadaAsignada.getCodigoBrigada());

        sd.guardarSiniestro(s);
        JOptionPane.showMessageDialog(this, "Siniestro registrado");
        //}catch (Exception e) {
        // Maneja la excepción cuando no se encuentra una brigada libre
        //JOptionPane.showMessageDialog(this, "No se encontraron brigadas libres. Por favor, inténtelo de nuevo más tarde."+e.getMessage());
        System.out.println(siniestro.getTipo() + " " + siniestro.getFechaSiniestro() + " " + siniestro.getCoordenadaX() + siniestro.getCoordenadaY() + jTADetalleSi.getText() + brigadaAsignada.getCodigoBrigada());

       }catch (Exception e) {
           
            JOptionPane.showMessageDialog(this, "No se encontraron brigadas libres. Por favor, inténtelo de nuevo más tarde.");
       }

    }//GEN-LAST:event_jBGuardarSiActionPerformed

    private void jTFCooXSiKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFCooXSiKeyTyped
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE || c == '-'))) {
            evt.consume();
        }
    }//GEN-LAST:event_jTFCooXSiKeyTyped

    private void jTFCooYSiKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFCooYSiKeyTyped
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE || c == '-'))) {
            evt.consume();
        }
    }//GEN-LAST:event_jTFCooYSiKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAsignarCuartel;
    private javax.swing.JButton jBEliminarSi;
    private javax.swing.JButton jBGuardarSi;
    private javax.swing.JButton jBSalir;
    private javax.swing.JComboBox<String> jCBTipoSi;
    private com.toedter.calendar.JDateChooser jDCFechaSi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTADetalleSi;
    private javax.swing.JTextField jTFBrigada;
    private javax.swing.JTextField jTFCodigoSi;
    private javax.swing.JTextField jTFCooXSi;
    private javax.swing.JTextField jTFCooYSi;
    private javax.swing.JTextField jTFCuartel;
    // End of variables declaration//GEN-END:variables
}
