package vistas;

import AccesoADatos.BrigadaData;
import AccesoADatos.SiniestroData;
import Entidades.Brigada;
import Entidades.Siniestro;
import java.sql.Date;
import java.text.NumberFormat;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import javax.management.Query;
import javax.swing.DefaultCellEditor;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.MaskFormatter;
import javax.swing.text.NumberFormatter;

/**
 *
 * @author Ivan Martin
 */
public class ConsultarSiniestro extends javax.swing.JInternalFrame {

    private SiniestroData sd;
    private DefaultTableModel modelo = new DefaultTableModel() {

        public boolean isCellEditable(int row, int column) {
            return column == 3 || column == 4;
        }
    };

    public ConsultarSiniestro(SiniestroData sd) {
        this.sd = sd;
        initComponents();
        armarEncabezado();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTSiniestro = new javax.swing.JTable();
        jBBuscarSiniestro = new javax.swing.JButton();
        jBGuardarCambios = new javax.swing.JButton();
        jBSalir = new javax.swing.JButton();
        jBSinResolver = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setTitle("SINIESTROS ACUALES");

        jTSiniestro.setModel(new javax.swing.table.DefaultTableModel(
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
        jTSiniestro.setRowHeight(22);
        jScrollPane1.setViewportView(jTSiniestro);

        jBBuscarSiniestro.setText("ULTIMAS 24 HORAS");
        jBBuscarSiniestro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarSiniestroActionPerformed(evt);
            }
        });

        jBGuardarCambios.setText("GUARDAR CAMBIOS");
        jBGuardarCambios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarCambiosActionPerformed(evt);
            }
        });

        jBSalir.setText("SALIR");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        jBSinResolver.setText("SIN RESOLVER");
        jBSinResolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSinResolverActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("BUSCAR SINIESTROS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jBGuardarCambios)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBSalir)
                .addGap(43, 43, 43))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jBBuscarSiniestro, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 447, Short.MAX_VALUE)
                .addComponent(jBSinResolver)
                .addGap(57, 57, 57))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(93, 93, 93))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addGap(22, 22, 22))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(70, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBBuscarSiniestro)
                    .addComponent(jBSinResolver))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBSalir)
                    .addComponent(jBGuardarCambios))
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_jBSalirActionPerformed

    private void jBSinResolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSinResolverActionPerformed
        // TODO add your handling code here:
        List<Siniestro> sin = new ArrayList<>();
        borrarFilas();
        sin = sd.siniestroSinResolver();
        for (Siniestro aux : sin) {
            modelo.addRow(new Object[]{
                aux.getCodigoSiniestro(),
                aux.getTipo(),
                aux.getFechaSiniestro(),
                aux.getFechaResolucion(),
                aux.getPuntuacion(),
                aux.getCodigoBrigada()
            });
        }
         try {
    MaskFormatter dateMask = new MaskFormatter("####-##-##");
    dateMask.setPlaceholderCharacter('_');
    JTextField dateField = new JFormattedTextField(dateMask);
    jTSiniestro.getColumnModel().getColumn(3).setCellEditor(new DefaultCellEditor(dateField));
} catch (ParseException e) {
  
}
        try {
    NumberFormat format = NumberFormat.getInstance();
    format.setGroupingUsed(false);
    NumberFormatter numberFormatter = new NumberFormatter(format);
    numberFormatter.setValueClass(Integer.class);
    numberFormatter.setMinimum(1); // Establecer el valor mínimo a 1
    numberFormatter.setMaximum(10); // Establecer el valor máximo a 10
    numberFormatter.setAllowsInvalid(false);

    JFormattedTextField numberField = new JFormattedTextField(numberFormatter);
    jTSiniestro.getColumnModel().getColumn(4).setCellEditor(new DefaultCellEditor(numberField));
} catch (Exception e) {
 
}
    }//GEN-LAST:event_jBSinResolverActionPerformed

    private void jBBuscarSiniestroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarSiniestroActionPerformed
        List<Siniestro> sin = new ArrayList<>();
        borrarFilas();
        sin = sd.consultarSiniestroUlt24Hs();
        for (Siniestro aux : sin) {
            modelo.addRow(new Object[]{
                aux.getCodigoSiniestro(),
                aux.getTipo(),
                aux.getFechaSiniestro(),
                aux.getFechaResolucion(),
                aux.getPuntuacion(),
                aux.getCodigoBrigada()
            });
            
        }
        try {
    MaskFormatter dateMask = new MaskFormatter("####-##-##");
    dateMask.setPlaceholderCharacter('_');
    JTextField dateField = new JFormattedTextField(dateMask);
    jTSiniestro.getColumnModel().getColumn(3).setCellEditor(new DefaultCellEditor(dateField));
} catch (ParseException e) {
  
}
        try {
    NumberFormat format = NumberFormat.getInstance();
    format.setGroupingUsed(false);
    NumberFormatter numberFormatter = new NumberFormatter(format);
    numberFormatter.setValueClass(Integer.class);
    numberFormatter.setMinimum(1); // Establecer el valor mínimo a 1
    numberFormatter.setMaximum(10); // Establecer el valor máximo a 10
    numberFormatter.setAllowsInvalid(false);

    JFormattedTextField numberField = new JFormattedTextField(numberFormatter);
    jTSiniestro.getColumnModel().getColumn(4).setCellEditor(new DefaultCellEditor(numberField));
} catch (Exception e) {
}


        
    }//GEN-LAST:event_jBBuscarSiniestroActionPerformed

    private void jBGuardarCambiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarCambiosActionPerformed

        try {
            int filas = jTSiniestro.getRowCount();

            int codigoBrigada = 0;
            boolean cambiosRealizados = false;
            for (int fila = 0; fila < filas; fila++) {
                Siniestro siniestro = null;
                int codigoSiniestro = (int) jTSiniestro.getValueAt(fila, 0);
                String tipo = (String) jTSiniestro.getValueAt(fila, 1);
                String lc = jTSiniestro.getValueAt(fila, 2).toString();
               if ( jTSiniestro.getValueAt(fila, 3)!= null) {
                String lc2 =  jTSiniestro.getValueAt(fila, 3).toString();
                LocalDate fechaSiniestro = LocalDate.parse(lc, DateTimeFormatter.ISO_DATE);
                LocalDate fechaResolucion = LocalDate.parse(lc2, DateTimeFormatter.ISO_DATE);
                int puntuacion = Integer.parseInt(jTSiniestro.getValueAt(fila, 4).toString());
                if (puntuacion != 0) {
                codigoBrigada = (int) jTSiniestro.getValueAt(fila, 5);
                siniestro = new Siniestro(codigoSiniestro, tipo, fechaSiniestro, fechaResolucion, puntuacion, codigoBrigada);
                sd.actualizarSiniestro(siniestro);
                 BrigadaData bd = new BrigadaData();
                bd.brigadaLibre(codigoBrigada);
                cambiosRealizados = true;
                 
                }
               }
            }
        
            if (cambiosRealizados) {

                JOptionPane.showMessageDialog(null, "Datos actualizados con éxito");
            } else {
                JOptionPane.showMessageDialog(null, "No se han ingresado cambios");
            }

        } catch (Exception ex) {
           
            JOptionPane.showMessageDialog(null, "Error: " );

        }


    }//GEN-LAST:event_jBGuardarCambiosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBBuscarSiniestro;
    private javax.swing.JButton jBGuardarCambios;
    private javax.swing.JButton jBSalir;
    private javax.swing.JButton jBSinResolver;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTSiniestro;
    // End of variables declaration//GEN-END:variables
private void armarEncabezado() {
        modelo.addColumn("CODI");
        modelo.addColumn("TIPO");
        modelo.addColumn("FECHA");
        modelo.addColumn("FECHA RESUELTO");
        modelo.addColumn("PUNTUACION");
        modelo.addColumn("CODIGO BRIGADA");
        jTSiniestro.setModel(modelo);
    }

    private void borrarFilas() {
        int filas = jTSiniestro.getRowCount() - 1;
        for (int f = filas; f >= 0; f--) {
            modelo.removeRow(f);
        }
    }
}
