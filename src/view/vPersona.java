package view;

import controller.cPersona;
import javax.swing.JOptionPane;
import model.mPersona;

public class vPersona extends javax.swing.JFrame {
    cPersona cPer = new cPersona();
    mPersona mPer = new mPersona();
      int boton=0;
    public vPersona() {
        initComponents();
        
        grdPersona.setModel(cPer.grillaPersona());
         cboSexo.addItem("Seleccione");
         cboSexo.addItem("Masculino");
         cboSexo.addItem("Femenino");
          inactivarText();
        btnGuardar.setEnabled(false);
        txtCi2.setVisible(false);
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
        txtCI = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        cboSexo = new javax.swing.JComboBox<>();
        btnNuevo = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        grdPersona = new javax.swing.JTable();
        btnCancelar = new javax.swing.JButton();
        txtCi2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), "PERSONALES", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 24))); // NOI18N

        jLabel1.setText("Cedula de Identidad:");

        jLabel2.setText("Nombre:");

        jLabel3.setText("Apellido:");

        jLabel4.setText("N° de Telefono:");

        jLabel5.setText("Direccion:");

        jLabel6.setText("Sexo:");

        btnNuevo.setText("NUEVO");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnGuardar.setText("GUARDAR");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnModificar.setText("MODIFICAR");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminar.setText("ELMINAR");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        grdPersona.setModel(new javax.swing.table.DefaultTableModel(
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
        grdPersona.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grdPersonaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(grdPersona);

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        txtCi2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCi2ActionPerformed(evt);
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
                        .addComponent(btnNuevo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnModificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCancelar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cboSexo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCI, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(txtCi2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCi2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevo)
                    .addComponent(btnGuardar)
                    .addComponent(btnModificar)
                    .addComponent(btnEliminar)
                    .addComponent(btnCancelar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
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
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    int grillaOK=0,parametro=0;
   
    private void grdPersonaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grdPersonaMouseClicked
         //definir variable que almecene la fila seleccionada
      int fila=grdPersona.rowAtPoint(evt.getPoint());
      //evt.getPoint identifica la fila seleccionada
      //cargar datos
      txtCI.setText(grdPersona.getValueAt(fila,0).toString());
      txtNombre.setText(grdPersona.getValueAt(fila,1).toString());
      txtApellido.setText(grdPersona.getValueAt(fila,2).toString());
      txtDireccion.setText(grdPersona.getValueAt(fila,3).toString());
      txtTelefono.setText(grdPersona.getValueAt(fila,4).toString());
      cboSexo.setSelectedItem(grdPersona.getValueAt(fila,5).toString());
      grillaOK=10;
      txtCi2.setText(grdPersona.getValueAt(fila,0).toString());
      if(parametro==2){
     // activarText();
      parametro=0;
      }
    }//GEN-LAST:event_grdPersonaMouseClicked

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
//         int opcion=JOptionPane.showConfirmDialog(null,"Desea Guardar los cambios?","Aviso",JOptionPane.YES_NO_OPTION);
//       if(opcion==JOptionPane.YES_OPTION){
//       cPer.pasarDatos(mPer);
//       cPer.insertarPersona(mPer);   
//       }
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

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        boton=1;
        activarText();
    btnGuardar.setEnabled(true);
    activarBotones();
     limpiarCampos();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
       grdPersona.setModel(cPer.grillaPersona());
        inactivarText();
    activarBotones();
     btnGuardar.setEnabled(false);
    limpiarCampos();
    dispose();
    
    
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        boton=2;
        parametro=108;
        txtCI.setEnabled(true);
        inactivarBotones();
          if(grillaOK==10){
       activarText();
       grillaOK=0;
       btnGuardar.setEnabled(true);
       }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        boton=3;
        txtCI.setEnabled(true);
        inactivarBotones();
        btnGuardar.setEnabled(true);
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void txtCi2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCi2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCi2ActionPerformed
    
     private void limpiarCampos(){
    txtCI.setText("");
    txtNombre.setText("");
    txtApellido.setText("");
    txtDireccion.setText("");
    txtTelefono.setText("");
    txtCi2.setText("");
    
    }
     int validar;
    
    private void validarCampos(){
        validar=0;
        if(txtCI.getText().equals("")){
            JOptionPane.showMessageDialog(null,"El campo no Puede quedar vacio :(");
            txtCI.requestFocus();
            txtCI.setEnabled(true);
        }
        else
        if(txtNombre.getText().equals("")){
        JOptionPane.showMessageDialog(null,"El campo Nombre no puede quedar vacio");
        txtNombre.requestFocus();
        txtNombre.setEnabled(true);
        }
        else
        if(txtApellido.getText().equals("")){
        JOptionPane.showMessageDialog(null,"El campo Apellido no puede quedar vacio");
        txtApellido.requestFocus();
        txtApellido.setEnabled(true);
        }else
         if(txtTelefono.getText().equals("")){
        JOptionPane.showMessageDialog(null,"El campo Telefono no puede quedar vacio");
        txtTelefono.requestFocus();
        txtTelefono.setEnabled(true);
        }else{
             validar=50;//para identificar si se cargaron todos los campos requeridos
              cPer.pasarDatos(mPer);
       cPer.insertarPersona(mPer);
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
    public static void main(String args[]) { java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vPersona().setVisible(true);
            }
        }); }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnNuevo;
    public static javax.swing.JComboBox<String> cboSexo;
    public static javax.swing.JTable grdPersona;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTextField txtApellido;
    public static javax.swing.JTextField txtCI;
    public static javax.swing.JTextField txtCi2;
    public static javax.swing.JTextField txtDireccion;
    public static javax.swing.JTextField txtNombre;
    public static javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
