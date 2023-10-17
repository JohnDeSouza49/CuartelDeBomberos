package vistas;

import AccesoADatos.BomberoData;
import AccesoADatos.BrigadaData;
import AccesoADatos.CuartelData;
import Entidades.Bombero;
import Entidades.Brigada;
import Entidades.Cuartel;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ConsultarBomberos extends javax.swing.JInternalFrame {
        private BrigadaData bd;
    private CuartelData cd;
    private BomberoData bombd;
   private DefaultComboBoxModel modelito= null;
   private DefaultComboBoxModel modelito2= null;  
    private DefaultTableModel modelo = new DefaultTableModel(){
        public boolean isCellEditable(int f, int c){
            return false;
        }
    };

    public ConsultarBomberos(CuartelData cd, BrigadaData bd, BomberoData bombd) {
        this.bd=bd;
        this.cd=cd;
        this.bombd=bombd;
        initComponents();
        armarEncabezado();
        llenar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTBomberos = new javax.swing.JTable();
        jBBuscar = new javax.swing.JButton();
        jCBCuarteles = new javax.swing.JComboBox<>();
        jCBBrigada = new javax.swing.JComboBox<>();
        jBSalir = new javax.swing.JButton();
        jCheckBox = new javax.swing.JCheckBox();

        setTitle("CONSULTAS BOMBEROS");

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("CONSULTAR BOMBEROS ");

        jLabel2.setText("Cuarteles");

        jTBomberos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTBomberos);

        jBBuscar.setText("BUSCAR");

        jCBCuarteles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBCuartelesActionPerformed(evt);
            }
        });

        jCBBrigada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBBrigadaActionPerformed(evt);
            }
        });

        jBSalir.setText("SALIR");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        jCheckBox.setText("Brigadas");
        jCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jBBuscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBSalir)
                .addGap(64, 64, 64))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 25, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCBCuarteles, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jCheckBox)
                        .addGap(18, 18, 18)))
                .addComponent(jCBBrigada, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jCBCuarteles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCBBrigada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBBuscar)
                    .addComponent(jBSalir))
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_jBSalirActionPerformed

    private void jCBCuartelesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBCuartelesActionPerformed
        // TODO add your handling code here:
         Cuartel selec= (Cuartel) jCBCuarteles.getSelectedItem();
         borrarFilas();
         int codigo=selec.getCodigoCuartel();
          List<Bombero>cuartel = new ArrayList<>();
          cuartel=bombd.listarBomberosxCuartel(codigo);
          for(Bombero aux:cuartel){
                   modelo.addRow(new Object[]{
                aux.getDni(),
                aux.getNombreApellido(),
                aux.getFechaNac(),
                aux.getCelular(),
                aux.getCodigoBrigada(),
                aux.isEstado(),
                aux.getGrupoSanguineo()
           });
          }
          
     //JOptionPane.showMessageDialog(null, selec.getCodigoCuartel());
    }//GEN-LAST:event_jCBCuartelesActionPerformed

    private void jCBBrigadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBBrigadaActionPerformed
        // TODO add your handling code here:
          Cuartel selec= (Cuartel) jCBCuarteles.getSelectedItem();
         int codigo=selec.getCodigoCuartel();
          
          
    }//GEN-LAST:event_jCBBrigadaActionPerformed

    private void jCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxActionPerformed
        // TODO add your handling code here:
        if(jCheckBox.isSelected()==true){ 
             Cuartel selec= (Cuartel) jCBCuarteles.getSelectedItem();
         int codigo=selec.getCodigoCuartel();
          llenarB(codigo);
        }
        if(jCheckBox.isSelected()==false){ 
            jCBBrigada.removeAllItems();
        }
    }//GEN-LAST:event_jCheckBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBBuscar;
    private javax.swing.JButton jBSalir;
    private javax.swing.JComboBox<String> jCBBrigada;
    private javax.swing.JComboBox<String> jCBCuarteles;
    private javax.swing.JCheckBox jCheckBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTBomberos;
    // End of variables declaration//GEN-END:variables
private void armarEncabezado() {
        modelo.addColumn("DNI");
        modelo.addColumn("NOMBRE COMPLETO");
        modelo.addColumn("F DE NAC");
        modelo.addColumn("CELULAR");
        modelo.addColumn("BRIGADA");
        modelo.addColumn("ESTADO");
        modelo.addColumn("G SANGUINEO");

        jTBomberos.setModel(modelo);
        jTBomberos.getColumnModel().getColumn(0).setPreferredWidth(70);
        jTBomberos.getColumnModel().getColumn(1).setPreferredWidth(120);
        jTBomberos.getColumnModel().getColumn(2).setPreferredWidth(70);
        jTBomberos.getColumnModel().getColumn(3).setPreferredWidth(80);
        jTBomberos.getColumnModel().getColumn(4).setPreferredWidth(50);
        jTBomberos.getColumnModel().getColumn(5).setPreferredWidth(50);
        jTBomberos.getColumnModel().getColumn(6).setPreferredWidth(50);

    }
public void llenar(){
    modelito= new DefaultComboBoxModel ();
    jCBCuarteles.setModel(modelito);
    for(Cuartel aux: cd.mostrarTodosCuarteles() ){ 
        modelito.addElement(aux);
    }
}
public void llenarB(int codigo){
     List<Brigada> brigadas = new ArrayList<>();
    brigadas= bd.brigadaPorCuartel(codigo);
     modelito2= new DefaultComboBoxModel ();
     jCBBrigada.setModel(modelito2);
     for(Brigada aux:brigadas){ 
         modelito2.addElement(aux);
         }
}
   private void borrarFilas(){
    int filas=jTBomberos.getRowCount()-1;
    for(int f=filas;f>=0;f--){
        modelo.removeRow(f);
    
        }
    }
}
