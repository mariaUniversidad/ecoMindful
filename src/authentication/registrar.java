package authentication;

import java.sql.Connection;
import java.sql.PreparedStatement;
import conexionDB.conexionMysql;
import forms.tb_registro;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class registrar extends javax.swing.JFrame {

    private conexionMysql conexion;

    public registrar() {
        try {
            javax.swing.JFrame.setDefaultLookAndFeelDecorated(true);
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            System.err.println(ex);
        }
        initComponents();

        conexion = new conexionMysql();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        apellido = new javax.swing.JTextField();
        usuario = new javax.swing.JTextField();
        nombre = new javax.swing.JTextField();
        clave = new javax.swing.JTextField();
        categoriaRegistro = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Registrarse = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        registroBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        apellido.setToolTipText("Apellidos");
        jPanel1.add(apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 150, 270, 30));

        usuario.setToolTipText("Usuario");
        jPanel1.add(usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 270, 30));

        nombre.setToolTipText("Nombres");
        nombre.setBorder(null);
        jPanel1.add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 270, 30));

        clave.setToolTipText("Clave");
        jPanel1.add(clave, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 210, 270, 30));

        categoriaRegistro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione...", "Docente", "Alumno" }));
        jPanel1.add(categoriaRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, 550, 30));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Apellidos");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 130, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombres");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Usuario");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Clave");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 190, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Categoría");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, -1, -1));

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
        jPanel1.add(Registrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 330, 100, 30));

        cancelar.setBackground(new java.awt.Color(243, 250, 250));
        cancelar.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        cancelar.setForeground(new java.awt.Color(0, 51, 51));
        cancelar.setText("CANCELAR");
        cancelar.setBorder(null);
        cancelar.setBorderPainted(false);
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });
        jPanel1.add(cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 330, 100, 30));

        registroBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/REGISTRO.png"))); // NOI18N
        jPanel1.add(registroBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        //accion para boton cancelar
        this.CloseWindow();
    }//GEN-LAST:event_cancelarActionPerformed

    private void RegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarseActionPerformed
        // accion de regisrar
        tb_registro entidadRegistro = new tb_registro();
        int Categoria = -1;
        System.out.println("seleccion de categoria: " + categoriaRegistro.getSelectedItem());

        if (categoriaRegistro.getSelectedItem() == "Docente") {
            Categoria = 1;
        } else if (categoriaRegistro.getSelectedItem() == "Alumno") {
            Categoria = 2;
        } else if (categoriaRegistro.getSelectedItem() == "Seleccione...") {
            Categoria = -1;
            JOptionPane.showMessageDialog(rootPane, "Debe ingresar la categoría para continuar", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        };

        entidadRegistro.setNombres(nombre.getText());
        entidadRegistro.setApellido(apellido.getText());
        entidadRegistro.setUsuario(usuario.getText());
        entidadRegistro.setClave(clave.getText());
        entidadRegistro.setFk_id_Persona(Categoria);

        String sqlQuery = "insert into tb_registros(nombres, apellido, usuario, clave, fk_id_persona) values(?,?,?,?,?)";

        try (Connection conn = conexion.getDbConnection(); PreparedStatement ps = conn.prepareStatement(sqlQuery)) {
            ps.setString(1, entidadRegistro.getNombres());
            ps.setString(2, entidadRegistro.getApellido());
            ps.setString(3, entidadRegistro.getUsuario());
            ps.setString(4, entidadRegistro.getClave());
            ps.setInt(5, entidadRegistro.getFk_id_Persona());

            ps.execute();
            int resp;
            if (Categoria == 1) {
                this.OptionMessages("Usuario docente creado con éxito.", "Guardando...");
            } else {
                this.OptionMessages("Usuario Alumno creado con éxito.", "Guardando...");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Error: " + ex, "Error!", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_RegistrarseActionPerformed

    private void CloseWindow() {
        this.dispose();
    }

    private void OptionMessages(String mensaje, String titulo) {
        Object[] options = {"OK"};
        int result = JOptionPane.showOptionDialog(null, mensaje, titulo, JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
        if (result == JOptionPane.OK_OPTION) {
            this.CloseWindow();
        }
    }

    public static void main(String args[]) {

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Registrarse;
    private javax.swing.JTextField apellido;
    private javax.swing.JButton cancelar;
    private javax.swing.JComboBox<String> categoriaRegistro;
    private javax.swing.JTextField clave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nombre;
    private javax.swing.JLabel registroBackground;
    private javax.swing.JTextField usuario;
    // End of variables declaration//GEN-END:variables
}
