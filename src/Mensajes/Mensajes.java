
package Mensajes;

import javax.swing.JOptionPane;


    
 public class Mensajes {

    public static void campoVacio() {
        JOptionPane.showMessageDialog(null, "Debe llenar todos los campos obligatorios", "Error", JOptionPane.ERROR_MESSAGE);
    }

    public static void usuarioInvalido() {
        JOptionPane.showMessageDialog(null, "El usuario solo debe contener caracteres alfanuméricos sin espacios", "Error", JOptionPane.ERROR_MESSAGE);
    }

    public static void contraseniaInvalida() {
        JOptionPane.showMessageDialog(null, "La contraseña debe tener al menos una letra mayúscula, una letra minúscula, un número, un carácter especial y ser de al menos 8 caracteres", "Error", JOptionPane.ERROR_MESSAGE);
    }

    public static void nombresInvalidos() {
        JOptionPane.showMessageDialog(null, "Nombres y Apellidos solo deben contener letras y espacios", "Error", JOptionPane.ERROR_MESSAGE);
    }

    public static void categoriaNoSeleccionada() {
        JOptionPane.showMessageDialog(null, "Debe seleccionar una categoría", "Error", JOptionPane.ERROR_MESSAGE);
    }
}


