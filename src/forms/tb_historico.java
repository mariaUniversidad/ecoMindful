package forms;

public class tb_historico {
// encapsulacion
    private int idHistorico;
    private int puntaje;
    private String nombreAlumno;
    private String apellidoAlumno;
    

    public tb_historico(int puntaje, String nombreAluno, String apellidoAlumno) {
        this.puntaje = puntaje;
        this.nombreAlumno = nombreAluno;
        this.apellidoAlumno = apellidoAlumno;
    }

    public tb_historico() {
    }

    public tb_historico(int idHistorico, int puntaje, String nombreAluno, String apellidoAlumno) {
        this.idHistorico = idHistorico;
        this.puntaje = puntaje;
        this.nombreAlumno = nombreAluno;
        this.apellidoAlumno = apellidoAlumno;
    }

    public int getIdHistorico() {
        return idHistorico;
    }

    public void setIdHistorico(int idHistorico) {
        this.idHistorico = idHistorico;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    public String getNombreAluno() {
        return nombreAlumno;
    }

    public void setNombreAluno(String nombreAluno) {
        this.nombreAlumno = nombreAluno;
    }

    public String getApellidoAlumno() {
        return apellidoAlumno;
    }

    public void setApellidoAlumno(String apellidoAlumno) {
        this.apellidoAlumno = apellidoAlumno;
    }

}
