import desenho.Semaforo;
import java.awt.Color;
import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Semaforo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Semaforo semaforo = new Semaforo();
        semaforo.setCorVermelha(Color.RED);
        semaforo.setCorAmarela(Color.YELLOW);
        semaforo.setCorVerde(Color.GREEN);

        frame.add(semaforo);
        frame.setSize(400, 400);
        frame.setVisible(true);
    }
}
