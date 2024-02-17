import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Draw extends JPanel{
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        setForeground(Color.RED);
        g.drawLine(50,100,100,100);
        g.drawRect(50, 150, 100, 70);
        g.fillRect(50, 150, 100, 70);
        g.drawOval(50,250,50,50);
        g.fillOval(50,250,50,50);
    }
    public static void main(String[] args){
        JFrame f=new JFrame();
        Draw d=new Draw();
        f.add(d);
        f.setSize(300,500);
        
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
