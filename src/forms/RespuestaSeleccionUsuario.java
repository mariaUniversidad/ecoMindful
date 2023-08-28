/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package forms;

/**
 *
 * @author Maluli
 */
public class RespuestaSeleccionUsuario {
    
    private int indexPregunta;
    private int indexRespuesta;

    public RespuestaSeleccionUsuario(int indexPregunta, int indexRespuesta) {
        this.indexPregunta = indexPregunta;
        this.indexRespuesta = indexRespuesta;
    }

    public RespuestaSeleccionUsuario() {
    }

    public int getIndexPregunta() {
        return indexPregunta;
    }

    public void setIndexPregunta(int indexPregunta) {
        this.indexPregunta = indexPregunta;
    }

    public int getIndexRespuesta() {
        return indexRespuesta;
    }

    public void setIndexRespuesta(int indexRespuesta) {
        this.indexRespuesta = indexRespuesta;
    }

    @Override
    public String toString() {
        return "RespuestaSeleccionUsuario{" + "indexPregunta=" + indexPregunta + ", indexRespuesta=" + indexRespuesta + '}';
    }
    
    
}
