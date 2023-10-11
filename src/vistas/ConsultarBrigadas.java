package vistas;

import AccesoADatos.BrigadaData;
import AccesoADatos.CuartelData;
import Entidades.Brigada;
import Entidades.Cuartel;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

public class ConsultarBrigadas extends javax.swing.JInternalFrame {
    private BrigadaData bd;
    private CuartelData cd;
    private DefaultTableModel modelo = new DefaultTableModel();
    private DefaultTableModel modelo2 =new DefaultTableModel();
    private DefaultComboBoxModel modelito= null;
    
    public ConsultarBrigadas(BrigadaData bd, CuartelData cd) {
        this.bd=bd;
        this.cd=cd;
        initComponents();
        armarEncabezado();
        armarEncabezado2();
        llenarCB();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jRBLibres = new javax.swing.JRadioButton();
        jRBEnServicio = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTConsultaBrigada = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTListar = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jCBCuarteles = new javax.swing.JComboBox<>();
        jBSalir = new javax.swing.JButton();

        setTitle("CONSULTAR BRIGADAS");

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("CONSULTA BRIGADA");

        buttonGroup1.add(jRBLibres);
        jRBLibres.setText("Brigadas Libres");
        jRBLibres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBLibresActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRBEnServicio);
        jRBEnServicio.setText("Brigadas En Servicio");
        jRBEnServicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBEnServicioActionPerformed(evt);
            }
        });

        jTConsultaBrigada.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTConsultaBrigada);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("BRIGADAS POR CUARTEL");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(jRBLibres, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jRBEnServicio, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(281, 281, 281)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 705, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(228, 228, 228)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 655, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRBLibres)
                    .addComponent(jRBEnServicio))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTListar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTListar);

        jLabel3.setText("Cuarteles");

        jCBCuarteles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBCuartelesActionPerformed(evt);
            }
        });

        jBSalir.setText("SALIR");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addGap(16, 16, 16))
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jCBCuarteles, 0, 518, Short.MAX_VALUE)
                .addGap(44, 44, 44))
            .addGroup(layout.createSequentialGroup()
                .addGap(325, 325, 325)
                .addComponent(jBSalir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jCBCuarteles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(jBSalir)
                .addGap(145, 145, 145))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_jBSalirActionPerformed

    private void jRBLibresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBLibresActionPerformed
        // TODO add your handling code here:
        borrarFilasBrigadas();
        List<Brigada> brigadas = new ArrayList<>();
          brigadas= bd.brigadasLibres();
          if(jRBLibres.isSelected()==true && jRBEnServicio.isSelected()==false ){
           for(Brigada aux:brigadas){
               modelo.addRow(new Object[]{
                aux.getCodigoBrigada(),
                aux.getNombreBrigada(),
                aux.getEspecialidad(),
                aux.getNumeroCuartel()
           });
               }
            }
    }//GEN-LAST:event_jRBLibresActionPerformed

    private void jRBEnServicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBEnServicioActionPerformed
        // TODO add your handling code here:
        borrarFilasBrigadas();
        List<Brigada> brigadas = new ArrayList<>();
        brigadas=bd.brigadasAsignadas();
        if(jRBLibres.isSelected()==false && jRBEnServicio.isSelected()==true ){
           for(Brigada aux:brigadas){
               modelo.addRow(new Object[]{
                aux.getCodigoBrigada(),
                aux.getNombreBrigada(),
                aux.getEspecialidad(),
                aux.getNumeroCuartel()
           });
            }
           }
    }//GEN-LAST:event_jRBEnServicioActionPerformed

    private void jCBCuartelesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBCuartelesActionPerformed
        // TODO add your handling code here:
     
       
        //Cuartel cuartel = (Cuartel) jCBCuarteles.getSelectedItem();
        
        int cuartel = jCBCuarteles.getSelectedIndex();
        borrarFilasCuartel();
        System.out.println("indice:" + cuartel);
        //int libre = cuartel.getCodigoCuartel();
       
        if(cuartel!= -1){
            List<Brigada> brigadas = new ArrayList<>();
            brigadas  = bd.brigadaPorCuartel(cuartel+1);
            for(Brigada b: brigadas){
                
                modelo2.addRow( new Object[]{
                    
                    b.getCodigoBrigada(),
                    b.getNombreBrigada(),
                    b.getEspecialidad(),
                  
                });
            }
            
        }
       
        
        
        
     
        
        
       
    }//GEN-LAST:event_jCBCuartelesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jBSalir;
    private javax.swing.JComboBox<String> jCBCuarteles;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRBEnServicio;
    private javax.swing.JRadioButton jRBLibres;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTConsultaBrigada;
    private javax.swing.JTable jTListar;
    // End of variables declaration//GEN-END:variables
private void armarEncabezado() {
        modelo.addColumn("CÓDI");
        modelo.addColumn("NOMBRE");
        modelo.addColumn("ESPECIALIDAD");
        modelo.addColumn("CUARTEL");
        jTConsultaBrigada.setModel(modelo);
        
        jTConsultaBrigada.getColumnModel().getColumn(0).setPreferredWidth(50);
        jTConsultaBrigada.getColumnModel().getColumn(1).setPreferredWidth(70);
        jTConsultaBrigada.getColumnModel().getColumn(2).setPreferredWidth(120);
        jTConsultaBrigada.getColumnModel().getColumn(3).setPreferredWidth(80);
    }

    private void armarEncabezado2() {
        modelo2.addColumn("CÓDI");
        modelo2.addColumn("NOMBRE");
        modelo2.addColumn("ESPECIALIDAD");
        jTListar.setModel(modelo2);
        
        jTListar.getColumnModel().getColumn(0).setPreferredWidth(50);
        jTListar.getColumnModel().getColumn(1).setPreferredWidth(70);
        jTListar.getColumnModel().getColumn(2).setPreferredWidth(120);
       
    }
    private void borrarFilasBrigadas(){
    int filas=jTConsultaBrigada.getRowCount()-1;
    for(int f=filas;f>=0;f--){
        modelo.removeRow(f);
    }
}
      private void borrarFilasCuartel(){
    int filas=jTListar.getRowCount()-1;
    for(int f=filas;f>=0;f--){
        modelo2.removeRow(f);
    }
}
      private void llenarCB(){
                modelito= new DefaultComboBoxModel();
                jCBCuarteles.setModel(modelito);
                for(Cuartel aux:cd.mostrarTodosCuarteles()){
                modelito.addElement(aux.getNombreCuartel());
                   
                }

            }
}
