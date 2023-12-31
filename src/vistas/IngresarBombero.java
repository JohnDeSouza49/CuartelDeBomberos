package vistas;

import AccesoADatos.BomberoData;
import AccesoADatos.BrigadaData;
import AccesoADatos.CuartelData;
import Entidades.Bombero;
import Entidades.Brigada;
import Entidades.Cuartel;
import java.awt.event.KeyEvent;
import java.sql.Date;
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

        jTFId.setEditable(false);
        jTFId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFIdKeyTyped(evt);
            }
        });

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

        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jBGuardar.setText("GUARDAR");
        jBGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarActionPerformed(evt);
            }
        });

        jBuscar.setText("BUSCAR");
        jBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBuscarActionPerformed(evt);
            }
        });

        jBModificar.setText("MODIFICAR");

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
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTFNombreYApellido)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(jTFGrupo, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                                                .addComponent(jTFCodigoBrigada, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE))
                                            .addComponent(jDCFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jTFCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(0, 0, Short.MAX_VALUE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(23, 23, 23)
                                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(jBModificar)
                                                    .addComponent(jCBCuartel, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(8, 8, 8))))))
                            .addComponent(jBGuardar)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(222, 222, 222)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBuscar)
                            .addComponent(jBSalir))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                            .addComponent(jBModificar)))
                    .addComponent(jRadioButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(jBSalir)
                .addGap(44, 44, 44))
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
        BrigadaData brid=new BrigadaData();
        Boolean bandera=false;
        
        try {
           
            int dn = Integer.parseInt(jTFDni.getText());
            String nombreCom = jTFNombreYApellido.getText();
            LocalDate feNac = jDCFechaNacimiento.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            int cel = Integer.parseInt(jTFCelular.getText());
            int codBri = Integer.parseInt(jTFCodigoBrigada.getText());
            boolean est = jRadioButton1.isSelected();
            String gruSan = jTFGrupo.getText();
            int codCu = (Integer) jCBCuartel.getSelectedItem();

            if (jTFNombreYApellido.getText().isEmpty() || jTFGrupo.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "debe completar todos los campos");
                return;
            }
            if (!jTFId.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "El campo (Codigo) debe estar vacio");
                return;
            }

            if (!("O-".equals(gruSan) || "AB+".equals(gruSan) || "AB-".equals(gruSan) || "A+".equals(gruSan) || "A-".equals(gruSan) || "B+".equals(gruSan) || "B-".equals(gruSan) || "O+".equals(gruSan) || jTFGrupo.getText().equals(gruSan))) {
                JOptionPane.showMessageDialog(this, "Debe ingresar el grupo sanguíneo correcto");
                gruSan = null;
            }

            //Bombero b = new Bombero(dn, nombreCom, feNac, cel, codBri, est, gruSan, codCu);
            //bd.guardarBombero(b);


            //if(gruSan!="AB+"&&gruSan!="AB-"&&gruSan!="A+"&&gruSan!="A-"&&gruSan!="B+"&&gruSan!="B-"&&gruSan!="O+"&&gruSan!="O-"){
                
            //JOptionPane.showMessageDialog(this, "debe ingresar el grupo sanguineo Correcto");
           //gruSan = null;
            //}
            int cant=brid.cantBomberos(codBri);
            Brigada brigada= brid.buscarBrigada(codBri);
            
            if(codCu!=brigada.getNumeroCuartel()){
                JOptionPane.showMessageDialog(null, "Cuartel erroneo, la brigada ingresada pertenece al cuartel "+brigada.getNumeroCuartel());
               
            }else if(cant==5){
                JOptionPane.showMessageDialog(null, "Esta brigada se encuentra completa");
               
            } else {
            Bombero b = new Bombero(dn, nombreCom, feNac, cel, codBri, est, gruSan, codCu);
            bd.guardarBombero(b);  
            } 
           

            jTFDni.setText("");
            jTFNombreYApellido.setText("");
            jDCFechaNacimiento.setDate(null);
            jTFCelular.setText("");
            jTFCodigoBrigada.setText("");
            jRadioButton1.setSelected(false);
            jTFGrupo.setText("");
            
                
            
          } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(this, "Ingrese valores correctos!!");
        } catch (NullPointerException npe) {
            JOptionPane.showMessageDialog(this, "Ingrese valores correctos");
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

    private void jBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBuscarActionPerformed

        Bombero b = new Bombero();

        try {
            int dni = Integer.parseInt(jTFDni.getText());
            b = bd.buscarBomberoPorDni(dni);
            jTFId.setText(b.getIdBombero() + "");
            jTFDni.setText(b.getDni() + "");
            jTFNombreYApellido.setText(b.getNombreApellido());
            LocalDate fechaNa = b.getFechaNac();
            Date date = java.sql.Date.valueOf(fechaNa);
            jDCFechaNacimiento.setDate(date);
            jTFCelular.setText(b.getCelular() + "");
            jTFCodigoBrigada.setText(b.getCodigoBrigada() + "");
            jRadioButton1.setSelected(b.isEstado());
            jTFGrupo.setText(b.getGrupoSanguineo());
            jCBCuartel.setSelectedIndex(b.getCodigoCuartel()-1);

        } catch (NumberFormatException nfe) {
            //jTFId.setText("");
            //jTFDni.setText("");
            JOptionPane.showMessageDialog(this, "Ingrese el din del bombero a buscar");
                                           
    }//GEN-LAST:event_jBuscarActionPerformed
}
 
    private void jTFIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFIdKeyTyped
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {
            evt.consume();
    }//GEN-LAST:event_jTFIdKeyTyped
    }
    
    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed
    

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
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

    
  

