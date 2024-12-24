// Demonstrate color.
import java.awt.*;
import java.awt.event.*;

public class ColorDemo1 extends Frame {
 // draw lines
 public ColorDemo1()
 {addWindowListener(new MyWindowAdapter());
 
 }
 public void paint(Graphics g) {
 Insets i = getInsets();
 int l=i.left,t=i.top;//, r=i.right, b=i.bottom;
 Color c1 = new Color(255, 100, 100);
 Color c2 = new Color(100, 255, 100);
 Color c3 = new Color(100, 100, 255);
 g.setColor(c1);
 g.drawLine(l+0, t+0, l+100, t+100);
 g.drawLine(l+0, t+100, l+100, t+0);
 g.setColor(c2);
 g.drawLine(l+40, t+25, l+250, t+180);
 g.drawLine(l+75, t+90, l+400, t+400);
 g.setColor(c3);
 g.drawLine(l+20, t+150, l+400, t+40);
 g.drawLine(l+5, t+290, l+80, t+19);
 g.setColor(Color.red);
 g.drawOval(l+10, t+10, l+50, t+50);
 g.fillOval(l+70, t+90, l+140, t+100);
 g.setColor(Color.blue);
 g.drawOval(l+190, t+10, l+90, t+30);
 g.drawRect(l+10, t+10, l+60, t+50);
 g.setColor(Color.cyan);
 g.fillRect(l+100, t+10, l+60, t+50);
 g.drawRoundRect(l+190, t+10, l+60, t+50, 15, 15);
 }
 public static void main(String ar[])
 {
	 ColorDemo1 cd=new ColorDemo1();
	 cd.setSize(new Dimension(600,700));
	 cd.setTitle("Color Demo");
	 cd.setVisible(true);
 } 
}

 
class MyWindowAdapter extends WindowAdapter {
public void windowClosing(WindowEvent we) {
 System.exit(0);
}}
