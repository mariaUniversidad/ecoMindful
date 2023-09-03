package forms;

public class tbDatoCurioso {

    private int idDato;
    private String dato_curioso;

    public tbDatoCurioso(int idDato, String dato_curioso) {
        this.idDato = idDato;
        this.dato_curioso = dato_curioso;
    }

    public tbDatoCurioso() {
    }

    public int getIdDato() {
        return idDato;
    }

    public void setIdDato(int idDato) {
        this.idDato = idDato;
    }

    public String getDato_curioso() {
        return dato_curioso;
    }

    public void setDato_curioso(String dato_curioso) {
        this.dato_curioso = dato_curioso;
    }

}
