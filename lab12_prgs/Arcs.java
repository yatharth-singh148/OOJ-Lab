// Draw Arcs
import java.awt.*;
import java.awt.event.*;
public class Arcs extends Frame {
    Arcs() {
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
    public void paint(Graphics g) {
        g.drawArc(10, 40, 70, 70, 0, 75);
        g.fillArc(100, 40, 70, 70, 0, 75);
        g.drawArc(10, 100, 70, 80, 0, 175);
        g.fillArc(100, 100, 70, 90, 0, 270);
        g.drawArc(200, 80, 80, 80, 0, 180);
    }
    public static void main(String args[]){
        Arcs frame = new Arcs();
            
            frame.setSize(300,300);
            frame.setVisible(true);
        }

}
