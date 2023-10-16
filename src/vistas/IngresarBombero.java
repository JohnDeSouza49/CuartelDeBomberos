package vistas;

import AccesoADatos.BomberoData;
import AccesoADatos.CuartelData;
import Entidades.Bombero;
import Entidades.Cuartel;
import java.awt.event.KeyEvent;
import java.time.LocalDate;
import java.time.ZoneId;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class IngresarBombero extends javax.swing.JInternalFrame {

    BomberoData bd = new BomberoData();
    CuartelData cd = new CuartelData();
    //int codCu = 0 ;
    private DefaultComboBoxModel modelito = null;

    public IngresarBombero() {
        initComponents();
        llenarCB();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTFId = new javax.swing.JTextField();
        jTFDni = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTFNombreYApellido = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jDCFechaNacimiento = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        jTFCelular = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTFCodigoBrigada = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jBGuardar = new javax.swing.JButton();
        jBuscar = new javax.swing.JButton();
        jBModificar = new javax.swing.JButton();
        jBEliminar = new javax.swing.JButton();
        jBSalir = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jTFGrupo = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jCBCuartel = new javax.swing.JComboBox<>();

        setTitle("INGRESAR BOMBERO");

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("BOMBERO");

        jLabel2.setText("Codigo");

        jLabel3.setText("DNI");

        jTFDni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFDniKeyTyped(evt);
            }
        });

        jLabel4.setText("Nombre Completo ");

        jLabel5.setText("Fecha Nacimiento");

        jLabel6.setText("Celular");

        jTFCelular.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFCelularKeyTyped(evt);
            }
        });

        jLabel7.setText("Codigo Brigada");

        jTFCodigoBrigada.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFCodigoBrigadaKeyTyped(evt);
            }
        });

        jLabel8.setText("Estado");

        jBGuardar.setText("GUARDAR");
        jBGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarActionPerformed(evt);
            }
        });

        jBuscar.setText("BUSCAR");

        jBModificar.setText("MODIFICAR");

        jBEliminar.setText("ELIMINAR");

        jBSalir.setText("SALIR");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        jLabel10.setText("Grupo Sanguineo");

        jLabel9.setText("Cuartel");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(214, 214, 214)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTFId, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTFDni, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTFNombreYApellido)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jTFGrupo)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(jDCFechaNacimiento, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jTFCodigoBrigada, javax.swing.GroupLayout.Alignment.LEADING))
                                                .addComponent(jBuscar)))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                                                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(jTFCelular)
                                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(0, 0, Short.MAX_VALUE))))
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(jBModificar)
                                                        .addGap(0, 0, Short.MAX_VALUE))))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(23, 23, 23)
                                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jCBCuartel, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(8, 8, 8))))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jBGuardar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jBEliminar)))))
                .addContainerGap(25, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jBSalir)
                .addGap(215, 215, 215))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTFId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jTFDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jTFNombreYApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jDCFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(jTFCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jTFCodigoBrigada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jTFGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(jCBCuartel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBGuardar)
                            .addComponent(jBuscar)
                            .addComponent(jBModificar)
                            .addComponent(jBEliminar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                        .addComponent(jBSalir)
                        .addGap(44, 44, 44))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jRadioButton1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_jBSalirActionPerformed

    private void jBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarActionPerformed
        // TODO add your handling code here:

        try {
            int codigo = Integer.parseInt(jTFId.getText());
            int dn = Integer.parseInt(jTFDni.getText());
            String nombreCom = jTFNombreYApellido.getText();
            LocalDate feNac = jDCFechaNacimiento.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            int cel = Integer.parseInt(jTFCelular.getText());
            int codBri = Integer.parseInt(jTFCodigoBrigada.getText());
            boolean est = jRadioButton1.isSelected();
            String gruSan = jTFGrupo.getText();
            int codCu = (Integer) jCBCuartel.getSelectedItem();
            
            
            if(jTFNombreYApellido.getText().isEmpty() || jTFGrupo.getText().isEmpty() ){
                JOptionPane.showMessageDialog(this, "Ingrese valores correptos");
                return;
            }
            if(!jTFId.getText().isEmpty()){
                JOptionPane.showMessageDialog(this, "El campo (Codigo) debe estar vacio");
                return;
            }

            Bombero b = new Bombero(dn, nombreCom, feNac, cel, codBri, est, gruSan, codCu);
            bd.guardarBombero(b);

            jTFDni.setText("");
            jTFNombreYApellido.setText("");
            jDCFechaNacimiento.setDate(null);
            jTFCelular.setText("");
            jTFCodigoBrigada.setText("");
            jRadioButton1.setSelected(false);
            jTFGrupo.setText("");

        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(this, "Ingrese valores correptos");
        } catch (NullPointerException npe) {
            JOptionPane.showMessageDialog(this, "Ingrese valores correptos");
        }


    }//GEN-LAST:event_jBGuardarActionPerformed

    private void jTFDniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFDniKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {
            evt.consume();
        }
    }//GEN-LAST:event_jTFDniKeyTyped

    private void jTFCelularKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFCelularKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {
            evt.consume();
        }
    }//GEN-LAST:event_jTFCelularKeyTyped

    private void jTFCodigoBrigadaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFCodigoBrigadaKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {
            evt.consume();
        }
    }//GEN-LAST:event_jTFCodigoBrigadaKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBEliminar;
    private javax.swing.JButton jBGuardar;
    private javax.swing.JButton jBModificar;
    private javax.swing.JButton jBSalir;
    private javax.swing.JButton jBuscar;
    private javax.swing.JComboBox<String> jCBCuartel;
    private com.toedter.calendar.JDateChooser jDCFechaNacimiento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTFCelular;
    private javax.swing.JTextField jTFCodigoBrigada;
    private javax.swing.JTextField jTFDni;
    private javax.swing.JTextField jTFGrupo;
    private javax.swing.JTextField jTFId;
    private javax.swing.JTextField jTFNombreYApellido;
    // End of variables declaration//GEN-END:variables

    private void llenarCB() {
        modelito = new DefaultComboBoxModel();
        jCBCuartel.setModel(modelito);
        for (Cuartel aux : cd.mostrarTodosCuarteles()) {
            modelito.addElement(aux.getCodigoCuartel());

        }

    }

}
