package forms;

public class tb_registro {
//Atributos heredables
    private String nombres;
    private String apellido;
    private String usuario;
    private String clave;
    private int fk_id_persona;
//constructor vacio
    public tb_registro() {
    }
//constructor con atributos
    public tb_registro(String nombres, String apellido, String usuario, String clave, int fk_id_Persona) {
        this.nombres = nombres;
        this.apellido = apellido;
        this.usuario = usuario;
        this.clave = clave;
        this.fk_id_persona = fk_id_Persona;
    }
//Metodos Setters and Getters
    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public int getFk_id_Persona() {
        return fk_id_persona;
    }

    public void setFk_id_Persona(int fk_id_persona) {
        this.fk_id_persona = fk_id_persona;
    }

}
