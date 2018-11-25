package view;

import controller.*;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import model.*;
import static view.vPersona.cboSexo;
import static view.vPersona.txtApellido;
import static view.vPersona.txtCI;
import static view.vPersona.txtDireccion;
import static view.vPersona.txtNombre;
import static view.vPersona.txtTelefono;



public class vChofer extends javax.swing.JFrame {
     public vChofer() {
        initComponents();
        cbos();
        txtAntiguedad.setEnabled(false);
        txtNombre.setEnabled(false);
        txtApellido.setEnabled(false);
        txtCi.setEnabled(false);
        txtTelefono.setEnabled(false);
        txtIngreso.setVisible(false);
        grdChofer.setModel(cCho.grillaChofer());models=2;
         System.out.println(models);
    }
        cPersona cPer = new cPersona();
    mPersona mPer = new mPersona();
    cChofer cCho = new cChofer();
    mChofer mCho = new mChofer();
    vPersona vp =new vPersona();
    int boton=0;
public void cbos(){
    cboEstadoCivil.addItem("Seleccione");
    cboEstadoCivil.addItem("Soltero(a)");
    cboEstadoCivil.addItem("Casado(a)");
    cboEstadoCivil.addItem("Divorciado(a)");
    cboEstadoCivil.addItem("Viudo(a)");
    
    cboTipoSangre.addItem("Tipos");
    cboTipoSangre.addItem("0 RH+");
    cboTipoSangre.addItem("0 RH-");
    cboTipoSangre.addItem("A RH+");
    cboTipoSangre.addItem("A RH-");
    cboTipoSangre.addItem("B RH+");
    cboTipoSangre.addItem("B RH-");
    cboTipoSangre.addItem("AB RH+");
    cboTipoSangre.addItem("AB RH-");
}
     int validar,dia,mes,year;
    public String fecha;
    private void fechaCall(){
    dia=jFecha.getCalendar().get(Calendar.DAY_OF_MONTH);
    mes=jFecha.getCalendar().get(Calendar.MONTH)+1;
    year=jFecha.getCalendar().get(Calendar.YEAR);
    jFecha.setEnabled(false);
    txtIngreso.setText(year+"/"+mes+"/"+dia);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtAntiguedad = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtRegisto = new javax.swing.JTextField();
        cboEstadoCivil = new javax.swing.JComboBox<>();
        cboTipoSangre = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        grdChofer = new javax.swing.JTable();
        txtCi = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        btnPersonal = new javax.swing.JButton();
        jFecha = new com.toedter.calendar.JDateChooser();
        txtIngreso = new javax.swing.JTextField();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(jList1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Gestion de Choferes", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("MS Reference Sans Serif", 3, 24))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("Nombre:");

        jLabel2.setText("Apellido:");

        jLabel3.setText("Antiguedad:");

        jLabel4.setText("Telefono:");

        jLabel5.setText("Grupo Sanguineo:");

        jLabel6.setText("Registro de Conducir:");

        jLabel8.setText("Estado Civil:");

        jLabel9.setText("Año de Ingreso:");

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnNuevo.setText("Nuevo Chofer");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        cboEstadoCivil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboEstadoCivilActionPerformed(evt);
            }
        });

        grdChofer.setModel(new javax.swing.table.DefaultTableModel(
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
        grdChofer.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_LAST_COLUMN);
        grdChofer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grdChoferMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(grdChofer);

        jLabel10.setText("Cedula de Identidad:");

        btnPersonal.setText("Nuevo Personal");
        btnPersonal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPersonalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cboTipoSangre, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel10)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtCi, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(63, 63, 63)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2))
                                .addGap(29, 29, 29)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtApellido)
                                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(35, 35, 35)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnPersonal)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cboEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtAntiguedad, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(106, 106, 106))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtRegisto, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel7)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnGuardar)
                        .addGap(90, 90, 90)
                        .addComponent(btnModificar)
                        .addGap(101, 101, 101)
                        .addComponent(btnEliminar)
                        .addGap(100, 100, 100)
                        .addComponent(btnCancelar)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 777, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel9)
                                .addComponent(jFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(cboTipoSangre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addComponent(jLabel7))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnNuevo))
                                .addGap(27, 27, 27)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(btnPersonal)))
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtAntiguedad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(cboEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtRegisto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnModificar)
                    .addComponent(btnEliminar)
                    .addComponent(btnCancelar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    int models=0;
    private void grdChoferMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grdChoferMouseClicked
        int fila=grdChofer.rowAtPoint(evt.getPoint());
        if(models==1){
        txtCi.setText(grdChofer.getValueAt(fila,0).toString());
       txtNombre.setText(grdChofer.getValueAt(fila,1).toString());
       txtApellido.setText(grdChofer.getValueAt(fila, 2).toString());
       txtTelefono.setText(grdChofer.getValueAt(fila, 3).toString());
        }else 
            if(models==2){
             txtCi.setText(grdChofer.getValueAt(fila,0).toString());
             txtNombre.setText(grdChofer.getValueAt(fila,1).toString());
             txtApellido.setText(grdChofer.getValueAt(fila, 2).toString());
             //jFecha.set(grdChofer.getValueAt(fila,3).toString());
             txtTelefono.setText(grdChofer.getValueAt(fila, 4).toString());
             cboEstadoCivil.setSelectedItem(grdChofer.getValueAt(fila,6).toString());
             cboTipoSangre.setSelectedItem(grdChofer.getValueAt(fila,7).toString());
             txtRegisto.setText(grdChofer.getValueAt(fila, 8).toString());
             
            }
            System.out.println(jFecha);
    }//GEN-LAST:event_grdChoferMouseClicked

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
         grdChofer.setModel(cCho.grillaPersona());models=1;
         System.out.println(models);
           boton=1;
        activarText();
    btnGuardar.setEnabled(true);
    activarBotones();
     limpiarCampos();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnPersonalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPersonalActionPerformed
       vp.setVisible(true);
    }//GEN-LAST:event_btnPersonalActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
       grdChofer.setModel(cCho.grillaChofer());models=2;
       limpiarCampos();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void cboEstadoCivilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboEstadoCivilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboEstadoCivilActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
       if(boton==1){
       //pasar los datos del formulario
       validarCampos();
       
       }else
           if(boton==2){
               btnGuardar.setEnabled(true);
               cPer.pasarDatos(mPer);
              mPer.setCiViejo(Integer.parseInt(vPersona.txtCi2.getText()));
               // llamar al metodo modificar 
               cPer.modificarPersona(mPer);
                   
              validar=50;
           }else
               if(boton==3){
               //alu.id=idAlumno;//paso parametro
               cPer.eliminarPersona(mPer);
               validar=50;
               }
       if(validar==50){
       cPer.grillaPersona();
       inactivarText();
       btnGuardar.setEnabled(false);
       activarBotones();
       limpiarCampos();
       validar=0;
       }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarActionPerformed

  private void limpiarCampos(){
     txtNombre.setText("");
     txtApellido.setText("");
     txtCi.setText("");
     txtTelefono.setText("");
     txtIngreso.setText("");
     txtAntiguedad.setText("");
     txtRegisto.setText("");
     
    }
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vChofer().setVisible(true);
            }
        });
    }
    private void validarCampos(){
        validar=0;
        if(txtCI.getText().equals("")){
            JOptionPane.showMessageDialog(null,"El campo no Puede quedar vacio :(");
            txtCI.requestFocus();
            txtCI.setEnabled(true);
        }else if(txtNombre.getText().equals("")){
        JOptionPane.showMessageDialog(null,"El campo Nombre no puede quedar vacio");
        txtNombre.requestFocus();
        txtNombre.setEnabled(true);
        }else if(txtApellido.getText().equals("")){
        JOptionPane.showMessageDialog(null,"El campo Apellido no puede quedar vacio");
        txtApellido.requestFocus();
        txtApellido.setEnabled(true);
        }else if(txtTelefono.getText().equals("")){
        JOptionPane.showMessageDialog(null,"El campo Apellido no puede quedar vacio");
        txtTelefono.requestFocus();
        txtTelefono.setEnabled(true);
        }else if(txtIngreso.getText().equals("")){
            JOptionPane.showMessageDialog(null,"El campo Fecha de Ingreso no puede quedar vacio");
          txtIngreso.requestFocus();
          txtIngreso.setEnabled(true);
        }else if(txtDireccion.getText().equals("")){
           JOptionPane.showMessageDialog(null,"El campo Direccion no puede quedar vacio");
           txtDireccion.requestFocus();
           txtDireccion.setEnabled(true);
        }else if(txtRegisto.getText().equals("")){
            JOptionPane.showMessageDialog(null,"El campo Registro no puede quedar vacio");
            txtDireccion.requestFocus();
            txtDireccion.setEnabled(true);
        }else{
            validar=50;
            cCho.pasarDatos(mCho);
            cCho.insertarChofer(mCho);
        }
         
    }
     private void inactivarText(){
    txtCI.setEnabled(false);
    txtNombre.setEnabled(false);
    txtApellido.setEnabled(false);
    txtDireccion.setEnabled(false);
    txtTelefono.setEnabled(false);
    cboSexo.setEnabled(false);
    }
    private void activarText(){
    txtCI.setEnabled(true);
    txtNombre.setEnabled(true);
    txtApellido.setEnabled(true);
    txtDireccion.setEnabled(true);
    txtTelefono.setEnabled(true);
    cboSexo.setEnabled(true);
    }
    private void inactivarBotones(){
    btnNuevo.setEnabled(false);
    btnModificar.setEnabled(false);
    btnGuardar.setEnabled(false);
    btnEliminar.setEnabled(false);
    }
    private void activarBotones(){
    btnNuevo.setEnabled(true);
    btnModificar.setEnabled(true);
    btnGuardar.setEnabled(true);
    btnEliminar.setEnabled(true);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnPersonal;
    public static javax.swing.JComboBox<String> cboEstadoCivil;
    public static javax.swing.JComboBox<String> cboTipoSangre;
    public static javax.swing.JTable grdChofer;
    private com.toedter.calendar.JDateChooser jFecha;
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
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtAntiguedad;
    public static javax.swing.JTextField txtApellido;
    public static javax.swing.JTextField txtCi;
    public static javax.swing.JTextField txtIngreso;
    public static javax.swing.JTextField txtNombre;
    public static javax.swing.JTextField txtRegisto;
    public static javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
