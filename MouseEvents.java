import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class Mouseex implements MouseListener{
    Mouseex(){
        JFrame f=new JFrame("Mouse Events");
        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);
    f.addMouseListener(this);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
    public void mousePressed(MouseEvent m){
        System.out.println("Mouse pressed");
    }
    public void mouseReleased(MouseEvent m){
        System.out.println("Mouse Released");
    }
    public void mouseExited(MouseEvent m){
        System.out.println("Mouse Exited");
    }
    public void mouseEntered(MouseEvent e){
        System.out.println("Mouse Entered");
    }
    public void mouseClicked(MouseEvent e){
        System.out.println("Mouse Clicked");
    }

    public static void main(String[] args){
        new Mouseex();
    }
}
