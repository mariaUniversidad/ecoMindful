/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package authentication;

import java.sql.SQLException;
import javax.swing.UIManager;
import conexionDB.conexionMysql;
import forms.tb_registro;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import menuPrincipal.Principal;

public class login extends javax.swing.JFrame {

    private conexionMysql conexion;

    public login() {
        try {
            javax.swing.JFrame.setDefaultLookAndFeelDecorated(true);
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            System.err.println(ex);
        }

        initComponents();
        this.ocultar.setVisible(false);

        conexion = new conexionMysql();
    }
       
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        usuario = new javax.swing.JTextField();
        categoria = new javax.swing.JComboBox<>();
        ocultar = new javax.swing.JLabel();
        ver = new javax.swing.JLabel();
        clave = new javax.swing.JPasswordField();
        showPassword = new javax.swing.JButton();
        cerrar = new javax.swing.JButton();
        Registrarse = new javax.swing.JButton();
        Ingresar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        loginBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ecomindful");
        setBounds(new java.awt.Rectangle(350, 450, 450, 450));
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        usuario.setForeground(new java.awt.Color(0, 51, 51));
        usuario.setToolTipText("");
        usuario.setActionCommand("<Not Set>");
        usuario.setBorder(null);
        usuario.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        usuario.setSelectionColor(new java.awt.Color(0, 102, 102));
        jPanel1.add(usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 200, 30));

        categoria.setForeground(new java.awt.Color(0, 51, 51));
        categoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione...", "Docente", "Alumno" }));
        categoria.setBorder(null);
        jPanel1.add(categoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, 200, 30));

        ocultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ocultar_32px.png"))); // NOI18N
        ocultar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ocultarMouseClicked(evt);
            }
        });
        jPanel1.add(ocultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, 30, 30));

        ver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ver_32px.png"))); // NOI18N
        ver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                verMouseClicked(evt);
            }
        });
        jPanel1.add(ver, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, 30, 30));

        clave.setForeground(new java.awt.Color(0, 51, 51));
        clave.setBorder(null);
        clave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                claveActionPerformed(evt);
            }
        });
        jPanel1.add(clave, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 200, 30));

        showPassword.setText("jButton1");
        showPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showPasswordActionPerformed(evt);
            }
        });
        jPanel1.add(showPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, 40, -1));

        cerrar.setBackground(new java.awt.Color(243, 250, 250));
        cerrar.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        cerrar.setForeground(new java.awt.Color(0, 51, 51));
        cerrar.setText("CERRAR");
        cerrar.setBorder(null);
        cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarActionPerformed(evt);
            }
        });
        jPanel1.add(cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 360, 200, 30));

        Registrarse.setBackground(new java.awt.Color(243, 250, 250));
        Registrarse.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        Registrarse.setForeground(new java.awt.Color(0, 51, 51));
        Registrarse.setText("REGISTRAR");
        Registrarse.setBorder(null);
        Registrarse.setBorderPainted(false);
        Registrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarseActionPerformed(evt);
            }
        });
        jPanel1.add(Registrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 320, 100, 30));

        Ingresar.setBackground(new java.awt.Color(243, 250, 250));
        Ingresar.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        Ingresar.setForeground(new java.awt.Color(0, 51, 51));
        Ingresar.setText("INGRESAR");
        Ingresar.setBorder(null);
        Ingresar.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        Ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngresarActionPerformed(evt);
            }
        });
        jPanel1.add(Ingresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 320, 90, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Usuario");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Clave");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Categoría");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, -1, -1));

        loginBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ECOMINDFUL.png"))); // NOI18N
        jPanel1.add(loginBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 450));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_cerrarActionPerformed

    private void RegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarseActionPerformed
        registrar registrarAction = new registrar();
        registrarAction.setVisible(true);
    }//GEN-LAST:event_RegistrarseActionPerformed

    private void IngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngresarActionPerformed
   
         // Accion al iniciar sesion
        
        int Categoria = -1;

        tb_registro entidadRegistro = new tb_registro();

        if (categoria.getSelectedItem() == "Docente") {
            Categoria = 1;
        } else if (categoria.getSelectedItem() == "Alumno") {
            Categoria = 2;
        } else if (categoria.getSelectedItem() == "Seleccione...") {
            Categoria = -1;
            JOptionPane.showMessageDialog(rootPane, "Debe ingresar la categoría para continuar", "Error", JOptionPane.ERROR_MESSAGE);
            return;
            
        };
        

        entidadRegistro.setUsuario(usuario.getText());
        entidadRegistro.setClave(String.valueOf(this.clave.getPassword()));
        entidadRegistro.setFk_id_Persona(Categoria);
           // Validar la longitud del nombre de usuario y la contraseña
    if (entidadRegistro.getUsuario().isEmpty() || entidadRegistro.getUsuario().length() > 20) {
        JOptionPane.showMessageDialog(rootPane, "Debe ingresar un usuario válido de hasta 20 caracteres.", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
        return;
    }

    if (entidadRegistro.getClave().isEmpty() || entidadRegistro.getClave().length() > 20) {
        JOptionPane.showMessageDialog(rootPane, "Debe ingresar una contraseña válida de hasta 20 caracteres.", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
        return;
    }
        // Comprobar si el nombre de usuario y la contraseña están completos
        if (entidadRegistro.getUsuario().isEmpty()) {
        JOptionPane.showMessageDialog(rootPane, "Debe ingresar el usuario.", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
        return;
          }
         
      
    
    if (entidadRegistro.getClave().isEmpty()) {
        JOptionPane.showMessageDialog(rootPane, "Debe ingresar la contraseña.", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
        return;
        
    }
    String passwordRegex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[!*_\\.])[a-zA-Z\\d!*_\\.]{1,15}$";

    if (!entidadRegistro.getClave().matches(passwordRegex)) {
        JOptionPane.showMessageDialog(rootPane, "Contraseña no válida.\nDebe tener al menos una minúscula, una mayúscula, un dígito y un carácter especial (!, *, _).\nLongitud máxima de 15 caracteres.", "Advertencia", JOptionPane.WARNING_MESSAGE);
        return;
    }
    

        String sqlQuery = "select * from tb_registros where usuario = ? and clave = ? and fk_id_persona = ?";
        try (Connection conn = conexion.getDbConnection(); PreparedStatement ps = conn.prepareStatement(sqlQuery)) {

            ps.setString(1, entidadRegistro.getUsuario());
            ps.setString(2, entidadRegistro.getClave());
            ps.setInt(3, entidadRegistro.getFk_id_Persona());

            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    this.dispose();
                    Principal menu = new Principal();
                    menu.setVisible(true);
                    //TODO: aplicar la logica para menu de estudiante o docente
                }else{
                JOptionPane.showMessageDialog(rootPane, "Error: " + "Lo sentimos, el registro no existe.", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
                }
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Error: " + ex, "Error!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_IngresarActionPerformed

    private void claveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_claveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_claveActionPerformed

    private void showPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_showPasswordActionPerformed

    private void verMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verMouseClicked
        ver.setVisible(false);
        ocultar.setVisible(true);
        clave.setEchoChar((char)0);
    }//GEN-LAST:event_verMouseClicked

    private void ocultarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ocultarMouseClicked
        ver.setVisible(true);
        ocultar.setVisible(false);
        clave.setEchoChar('◉');
    }//GEN-LAST:event_ocultarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Ingresar;
    private javax.swing.JButton Registrarse;
    private javax.swing.JComboBox<String> categoria;
    private javax.swing.JButton cerrar;
    private javax.swing.JPasswordField clave;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel loginBackground;
    private javax.swing.JLabel ocultar;
    private javax.swing.JButton showPassword;
    private javax.swing.JTextField usuario;
    private javax.swing.JLabel ver;
    // End of variables declaration//GEN-END:variables
}
