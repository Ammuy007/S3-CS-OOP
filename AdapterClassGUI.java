import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class KeyAdapterEx extends KeyAdapter{
    public KeyAdapterEx(){
    JFrame f=new JFrame("Adapter Class");
    JLabel label=new JLabel("KeyAdapter");
    f.setSize(300,300);
    label.setBounds(50,50,70,50);
    JTextField t=new JTextField();
    t.setBounds(70,140,100,40);
    f.add(t);
    f.add(label);
    f.setLayout(null);
    t.addKeyListener(this);
    f.setVisible(true);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void keyPressed(KeyEvent e){
        System.out.println("Key Pressed");
    }
    public static void main(String[] args){
        new KeyAdapterEx();
    }
}
