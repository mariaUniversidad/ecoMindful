package forms;

import javax.swing.Timer;
import java.awt.event.ActionListener;

public class Cronometro extends Timer {

    private int segundosTranscurridos;

    public Cronometro(int delay, ActionListener listener) {
        super(delay, listener);
        segundosTranscurridos = 0;
        System.out.println("Cronómetro creado");
    }

    public int getSegundosTranscurridos() {
        return segundosTranscurridos;
    }

    public void reiniciar() {
        segundosTranscurridos = 0;
    }
}
