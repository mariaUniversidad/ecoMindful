package forms;

public class tb_respuestas {

    private int idQuizResponse;
    private String respuestas;
    private int fk_id_quiz;
    private int fk_id_comodin;
    private int fk_id_nivel;
    private boolean validate;

    public tb_respuestas() {
    }

    public tb_respuestas(int idQuizResponse, String respuestas, boolean validate) {
        this.idQuizResponse = idQuizResponse;
        this.respuestas = respuestas;
        this.validate = validate;
    }
    
    public tb_respuestas(String respuestas, int fk_id_quiz) {
        this.respuestas = respuestas;
        this.fk_id_quiz = fk_id_quiz;
    }
    
    public tb_respuestas(String respuestas, boolean validate) {
        this.respuestas = respuestas;
        this.validate = validate;
    }
    
    public tb_respuestas(String respuestas, int fk_id_quiz, boolean validate) {
        this.respuestas = respuestas;
        this.fk_id_quiz = fk_id_quiz;
        this.validate = validate;
    }
    
    public tb_respuestas(int idQuizResponse, String respuestas, int fk_id_quiz, int fk_id_comodin, int fk_id_nivel, boolean validate) {
        this.idQuizResponse = idQuizResponse;
        this.respuestas = respuestas;
        this.fk_id_quiz = fk_id_quiz;
        this.fk_id_comodin = fk_id_comodin;
        this.fk_id_nivel = fk_id_nivel;
        this.validate = validate;
    }

    public int getIdQuizResponse() {
        return idQuizResponse;
    }

    public void setIdQuizResponse(int idQuizResponse) {
        this.idQuizResponse = idQuizResponse;
    }

    public String getRespuestas() {
        return respuestas;
    }

    public void setRespuestas(String respuestas) {
        this.respuestas = respuestas;
    }

    public int getFk_id_quiz() {
        return fk_id_quiz;
    }

    public void setFk_id_quiz(int fk_id_quiz) {
        this.fk_id_quiz = fk_id_quiz;
    }

    public int getFk_id_comodin() {
        return fk_id_comodin;
    }

    public void setFk_id_comodin(int fk_id_comodin) {
        this.fk_id_comodin = fk_id_comodin;
    }

    public int getFk_id_nivel() {
        return fk_id_nivel;
    }

    public void setFk_id_nivel(int fk_id_nivel) {
        this.fk_id_nivel = fk_id_nivel;
    }

    public boolean isValidate() {
        return validate;
    }

    public void setValidate(boolean validate) {
        this.validate = validate;
    }

    @Override
    public String toString() {
        return "tb_respuestas{" + "idQuizResponse=" + idQuizResponse + ", respuestas=" + respuestas + ", fk_id_quiz=" + fk_id_quiz + ", fk_id_comodin=" + fk_id_comodin + ", fk_id_nivel=" + fk_id_nivel + ", validate=" + validate + '}';
    }

}
