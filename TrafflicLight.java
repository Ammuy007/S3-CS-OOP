import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Trafficlt extends JPanel implements ActionListener {
    JRadioButton r, y, g;
    Color red_c, yellow_c, green_c;

    public Trafficlt() {
        setBounds(0,0,500,600);
        r = new JRadioButton("Red");
        y = new JRadioButton("Yellow");
        g = new JRadioButton("Green");
        r.setBounds(70, 50, 70, 30);
        add(r);
        y.setBounds(170, 50, 100, 30);
        add(y);
        g.setBounds(270, 50, 70, 30);
        add(g);
        ButtonGroup bg = new ButtonGroup();
        bg.add(r);
        bg.add(g);
        bg.add(y);

        r.addActionListener(this);
        y.addActionListener(this);
        g.addActionListener(this);

        
    }

    public void actionPerformed(ActionEvent e) {
        if (r.isSelected() == true) {
            red_c = Color.RED;
            yellow_c = Color.WHITE;
            green_c = Color.WHITE;
        } else if (y.isSelected() == true) {
            red_c = Color.WHITE;
            yellow_c = Color.YELLOW;
            green_c = Color.WHITE;
        } else if (g.isSelected() == true) {
            red_c = Color.WHITE;
            yellow_c = Color.WHITE;
            green_c = Color.GREEN;
        }
        repaint();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        g.drawOval(70, 100, 50, 50);
        g.drawOval(70, 170, 50, 50);
        g.drawOval(70, 240, 50, 50);
        g.setColor(red_c);
        g.fillOval(70, 100, 50, 50);
        g.setColor(yellow_c);
        g.fillOval(70, 170, 50, 50);
        g.setColor(green_c);
        g.fillOval(70, 240, 50, 50);
    }

    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);
        f.setSize(500, 600);
        Trafficlt t=new Trafficlt();
        f.add(t);
        f.setVisible(true);
    }
}
