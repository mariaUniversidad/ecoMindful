package forms;

import java.util.List;

public class tb_quiz {

    private int idquiz;
    private String pregunta;
    private List<tb_respuestas> respuestas;

    public tb_quiz() {
    }

    public tb_quiz(int idquiz, String pregunta) {
        this.idquiz = idquiz;
        this.pregunta = pregunta;
    }

    public tb_quiz(int idquiz, String pregunta, List<tb_respuestas> respuestas) {
        this.idquiz = idquiz;
        this.pregunta = pregunta;
        this.respuestas = respuestas;
    }
    
    public int getIdquiz() {
        return idquiz;
    }

    public void setIdquiz(int idquiz) {
        this.idquiz = idquiz;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public List<tb_respuestas> getRespuestas() {
        return respuestas;
    }

    public void setRespuestas(List<tb_respuestas> respuestas) {
        this.respuestas = respuestas;
    }

    @Override
    public String toString() {
        return "tb_quiz{" + "idquiz=" + idquiz + ", pregunta=" + pregunta + ", respuestas=" + respuestas + '}';
    }

}
