package conectionjava.prin;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import conectionjava.Conexion;
import javax.swing.table.DefaultTableModel;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.security.MessageDigest;
import java.awt.Color;

public class Jtable extends javax.swing.JFrame {

   Conexion con1=new Conexion();
   Connection conet;
   DefaultTableModel modelo;
   Statement st;
   ResultSet rt;
   int idc;
    
    public Jtable() {
        initComponents();
        setLocationRelativeTo(null);
        consultar();
        cargarRoles();
      
       
    
Tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                int fila = Tabla.getSelectedRow();
                
                if (fila >= 0) {
                    jTextField1.setText(Tabla.getValueAt(fila, 0).toString());
                    jTextField2.setText(Tabla.getValueAt(fila, 1).toString());
                    jTextField3.setText(Tabla.getValueAt(fila, 2).toString());
                    jTextField4.setText(Tabla.getValueAt(fila, 3).toString());
                    jTextField5.setText(Tabla.getValueAt(fila, 4).toString());
                    jTextField6.setText(Tabla.getValueAt(fila, 5).toString());
                    jTextField7.setText(Tabla.getValueAt(fila, 6).toString());
                    jTextField8.setText(Tabla.getValueAt(fila, 7).toString());
                    
                    // Obtener y mostrar el rol
                    int idRol = Integer.parseInt(Tabla.getValueAt(fila, 8).toString());
                    String nombreRol = obtenerNombreRol(idRol);
                    jComboBox1.setSelectedItem(nombreRol);
                }
            }
        });
    } 
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        jLabel1.setText("jTable");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 177, Short.MAX_VALUE)
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos"));

        jLabel2.setText("ID");

        jLabel3.setText("Nombre");

        jLabel4.setText("Apellido");

        jLabel5.setText("Edad");

        jTextField1.setEditable(false);
        jTextField1.setEnabled(false);

        jLabel6.setText("Cedula");

        jLabel7.setText("Telefono");

        jLabel8.setText("Correo");

        jLabel9.setText("ID_Especialidad");

        jLabel10.setText("Rol");

        jTextField5.addActionListener(this::jTextField5ActionPerformed);

        jTextField6.addActionListener(this::jTextField6ActionPerformed);

        jTextField7.addActionListener(this::jTextField7ActionPerformed);

        jTextField8.addActionListener(this::jTextField8ActionPerformed);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "paciente", "medico", "admin" }));
        jComboBox1.addActionListener(this::jComboBox1ActionPerformed);

        jLabel11.setText("Contraseña");

        jLabel12.setText("Confirmar contraseña");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel7)
                    .addComponent(jLabel12)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField9, javax.swing.GroupLayout.DEFAULT_SIZE, 514, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 514, Short.MAX_VALUE)
                        .addComponent(jTextField2)
                        .addComponent(jTextField3)
                        .addComponent(jTextField4)
                        .addComponent(jTextField5)
                        .addComponent(jTextField8)
                        .addComponent(jTextField7, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jTextField6))
                    .addComponent(jTextField10))
                .addContainerGap(168, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(12, 12, 12))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Operaciones"));

        jButton1.setText("Modificar");
        jButton1.addActionListener(this::jButton1ActionPerformed);

        jButton2.setText("Agregar");
        jButton2.addActionListener(this::jButton2ActionPerformed);

        jButton3.setText("Borrar");
        jButton3.addActionListener(this::jButton3ActionPerformed);

        jButton4.setText("Nuevo");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Base de Datos"));

        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Apellido", "Edad", "Cedula", "Telefono", "Correo", "ID_Especialidad", "ID_Rol", "Contraseña", "Confirmar contraseña"
            }
        ));
        jScrollPane1.setViewportView(Tabla);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(266, 266, 266)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       Agregar();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       Eliminar();
       
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        Limpiar();
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        
       /* int fila = Tabla.getSelectedRow();
    if (fila == -1) {
        JOptionPane.showMessageDialog(null, "No se seleccionó fila");
    } else {

        jTextField1.setText(Tabla.getValueAt(fila, 0).toString()); // ID
        jTextField2.setText(Tabla.getValueAt(fila, 1).toString()); // Nombre
        jTextField3.setText(Tabla.getValueAt(fila, 2).toString()); // Apellido
        jTextField4.setText(Tabla.getValueAt(fila, 3).toString()); // Edad
        jTextField5.setText(Tabla.getValueAt(fila, 4).toString()); // Cedula
        jTextField6.setText(Tabla.getValueAt(fila, 5).toString()); // Telefono
        jTextField7.setText(Tabla.getValueAt(fila, 6).toString()); // Correo
        jTextField8.setText(Tabla.getValueAt(fila, 7).toString()); // Id_Especialidad

        
        int idRol = Integer.parseInt(Tabla.getValueAt(fila, 8).toString());
        String nombreRol = obtenerNombreRol(idRol);
        jComboBox1.setSelectedItem(nombreRol);
        
       
    }//GEN-LAST:event_formMouseClicked
        }*/}
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
          Modificar();
          consultar();
    }//GEN-LAST:event_jButton1ActionPerformed
 
    private void jTextField10KeyReleased(java.awt.event.KeyEvent evt) {
    String contrasena = jTextField9.getText();
    String confirmar = jTextField10.getText();
    
    if (!confirmar.isEmpty()) {
        if (contrasena.equals(confirmar)) {
            jTextField10.setBackground(Color.GREEN);  // Verde si coinciden
        } else {
            jTextField10.setBackground(Color.RED);    // Rojo si no coinciden
        }
    } else {
        jTextField10.setBackground(Color.WHITE);      // Blanco si está vacío
    }
}
    
    
    void Modificar(){
    String id = jTextField1.getText();
    String nom = jTextField2.getText().trim();
    String ape = jTextField3.getText().trim();
    String edad = jTextField4.getText().trim();
    String ced = jTextField5.getText().trim();
    String tel = jTextField6.getText().trim();
    String cor = jTextField7.getText().trim();
    String iesp = jTextField8.getText().trim();
    String contrasena = jTextField9.getText();
    String confirmarContrasena = jTextField10.getText();
    
    String rolSeleccionado = jComboBox1.getSelectedItem().toString();
    int idRol = obtenerIdRol(rolSeleccionado);
    
    try {
        if (nom.isEmpty() || ape.isEmpty() || cor.isEmpty() ||
            ced.isEmpty() || tel.isEmpty() || iesp.isEmpty() || edad.isEmpty() || id.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Faltan ingresar datos o no ha seleccionado un registro");
            return;
        }  
    
    if (!contrasena.equals(confirmarContrasena)) {
            JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden");
            return;
        }    
        
        String contrasenaEncriptada = encriptarSHA256(contrasena);  
        String sql = "UPDATE usuario SET Nombre=?, Apellido=?, Edad=?, Cedula=?, Teléfono=?, Correo=?, Id_Especialidad=?, Id_rol=?, Contraseña=? WHERE ID_usuarios=?" ;
        
        Connection con = con1.getConnection();
        PreparedStatement ps = con.prepareStatement(sql);
        
        ps.setString(1, nom);
        ps.setString(2, ape);
        ps.setString(3, edad);
        ps.setString(4, ced);
        ps.setString(5, tel);
        ps.setString(6, cor);
        ps.setString(7, iesp);
        ps.setInt(8, idRol);
        ps.setString(9, contrasenaEncriptada);
        ps.setString(10, id);  
        
        ps.executeUpdate();
        
        JOptionPane.showMessageDialog(null, "Datos de usuario modificados");
        limpiarTabla();
        consultar();
        Limpiar();
        
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        e.printStackTrace();
    }
}
    
    
    public String obtenerNombreRol(int idRol) {
    String nombre = "";
    try {
        Connection con = con1.getConnection();
        PreparedStatement ps = con.prepareStatement(
            "SELECT Nombre_rol FROM roles WHERE Id_rol = ?"
        );
        ps.setInt(1, idRol);
        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            nombre = rs.getString("Nombre_rol");
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
    return nombre;
}
    


    public void cargarRoles() {
    try {
        jComboBox1.removeAllItems();  //borrar si no funciona
        
        Connection con = con1.getConnection();
        PreparedStatement ps = con.prepareStatement("SELECT Nombre_rol FROM roles");
        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            jComboBox1.addItem(rs.getString("Nombre_rol"));
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
    
}

    
    

    
    public int obtenerIdRol(String nombreRol) {
    int id = -1;
    try {
        Connection con = con1.getConnection();
        PreparedStatement ps = con.prepareStatement(
            "SELECT id_rol FROM roles WHERE Nombre_rol = ?"
        );
        ps.setString(1, nombreRol);
        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            id = rs.getInt("id_rol");
        }

    } catch (Exception e) {
        e.printStackTrace();
    }
    return id;
}
    

    void consultar() {
    
         String sql = "select * from usuario";
         
         try {
         
        conet = con1.getConnection();
        st = conet.createStatement();
        rt = st.executeQuery(sql);
        Object[] usuario = new Object[9];

        modelo = (DefaultTableModel) Tabla.getModel();
        while (rt.next()) {
            usuario[0] = rt.getInt("ID_usuarios");
            usuario[1] = rt.getString("Nombre");
            usuario[2] = rt.getString("Apellido");
            usuario[3] = rt.getString("Cedula");
            usuario[4] = rt.getString("Teléfono");
            usuario[5] = rt.getString("Correo");
            usuario[6] = rt.getInt("Edad");
            usuario[7] = rt.getInt("Id_Especialidad");
            usuario[8] = rt.getInt("Id_rol");
            
            modelo.addRow(usuario);
           
        }
        Tabla.setModel(modelo);
        
         } catch (Exception e){
             
          }
    }
    
 void Agregar() {
    String id = jTextField1.getText();
    String nom = jTextField2.getText();
    String ape = jTextField3.getText();
    String edad = jTextField4.getText();
    String ced = jTextField5.getText();
    String tel = jTextField6.getText();
    String cor = jTextField7.getText();
    String iesp = jTextField8.getText();
    String contrasena = jTextField9.getText();        
    String confirmarContrasena = jTextField10.getText(); 
    
    String rolSeleccionado = jComboBox1.getSelectedItem().toString();
    int idRol = obtenerIdRol(rolSeleccionado);


    try {
        if (nom.isEmpty() || ape.isEmpty() || cor.isEmpty() ||
            ced.isEmpty() || tel.isEmpty() || iesp.isEmpty() || contrasena.isEmpty() || confirmarContrasena.isEmpty()) {

            JOptionPane.showMessageDialog(null, "Faltan ingresar datos");
            return;
        }  
        
    if (!contrasena.equals(confirmarContrasena)) {
            JOptionPane.showMessageDialog(null, 
                "Las contraseñas no coinciden. Por favor verifique.", 
                "Error de contraseña", 
                JOptionPane.ERROR_MESSAGE);
            jTextField10.setText("");  
            jTextField10.requestFocus();  
            return;
        }    
    
    if (contrasena.length() < 6) {
            JOptionPane.showMessageDialog(null, 
                "La contraseña debe tener al menos 6 caracteres", 
                "Contraseña muy corta", 
                JOptionPane.WARNING_MESSAGE);
            return;
        }
    
     String contrasenaEncriptada = encriptarSHA256(contrasena);
     String sql = "INSERT INTO usuario (Nombre, Apellido, Edad, Cedula, Teléfono, Correo, Id_Especialidad, Id_rol, Contraseña) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";

        Connection con = con1.getConnection();
        PreparedStatement ps = con.prepareStatement(sql);
        
        ps.setString(1, nom);
        ps.setString(2, ape);
        ps.setString(3, edad);
        ps.setString(4, ced);
        ps.setString(5, tel);
        ps.setString(6, cor);
        ps.setString(7, iesp);
        ps.setInt(8, idRol);
        ps.setString(9, contrasenaEncriptada);

        
        ps.executeUpdate();


            JOptionPane.showMessageDialog(null, "Registro agregado");
            limpiarTabla();
            consultar();
            Limpiar();
        
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        e.printStackTrace();
    }
}

 void limpiarTabla(){
    
    modelo = (DefaultTableModel) Tabla.getModel();
    modelo.setRowCount(0);
}

      public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> {
            new Jtable().setVisible(true);
        });
   }

   void Eliminar(){
    int fila = Tabla.getSelectedRow();
    
    if (fila < 0) {
        JOptionPane.showMessageDialog(null, "Debe seleccionar un usuario de la tabla");
        return;
    }
    
    try {
        String id = Tabla.getValueAt(fila, 0).toString();
        
        
        int confirmacion = JOptionPane.showConfirmDialog(
            null, 
            "¿Está seguro de eliminar el usuario con ID: " + id + "?", 
            "Confirmar eliminación", 
            JOptionPane.YES_NO_OPTION,
            JOptionPane.WARNING_MESSAGE
        );
        
        if (confirmacion == JOptionPane.YES_OPTION) {
            String sql = "DELETE FROM usuario WHERE ID_usuarios = ?";
            
            Connection con = con1.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, id);
            
            int filasEliminadas = ps.executeUpdate();
            
            if (filasEliminadas > 0) {
                JOptionPane.showMessageDialog(null, "Usuario eliminado exitosamente");
                limpiarTabla();
                consultar();
                Limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo eliminar el usuario");
            }
        }
        
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error al eliminar: " + e.getMessage());
        e.printStackTrace();
    }
}
      
void Limpiar() {
    jTextField1.setText("");
    jTextField2.setText("");
    jTextField3.setText("");
    jTextField4.setText("");
    jTextField5.setText("");
    jTextField6.setText("");
    jTextField7.setText("");
    jTextField8.setText("");
    jTextField9.setText("");   
    jTextField10.setText("");
    jComboBox1.setSelectedIndex(0);
    jTextField2.requestFocus();
}

public String encriptarSHA256(String texto) {
    try {
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        byte[] hash = md.digest(texto.getBytes("UTF-8"));
        StringBuilder hexString = new StringBuilder();
        
        for (byte b : hash) {
            String hex = Integer.toHexString(0xff & b);
            if (hex.length() == 1) hexString.append('0');
            hexString.append(hex);
        }
        return hexString.toString();
    } catch (Exception e) {
        throw new RuntimeException(e);
    }
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabla;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}

