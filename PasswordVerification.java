import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PasswordGUI implements ActionListener{
    JFrame f;
    JLabel uname,passwrd;
    JTextField user;
    JButton submit,cancel;
    JPasswordField pwd;
    String username="Amrutha";
    String password="12345";
    PasswordGUI(){
        f=new JFrame("PassWord Verification");
        uname=new JLabel("Enter username");
        passwrd=new JLabel("Enter password");
        f.setSize(600,500);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        uname.setBounds(50,80,100,30);
        f.add(uname);
        user=new JTextField();
        user.setBounds(200,80,150,30);
        f.add(user);
        passwrd.setBounds(50,160,100,30);
        f.add(passwrd);
        pwd=new JPasswordField();
        pwd.setBounds(200,160,150,30);
        f.add(pwd);
        submit=new JButton("Submit");
        cancel=new JButton("Cancel");
        submit.setBounds(50,200,100,30);
        f.add(submit);
        cancel.setBounds(200,200,100,30);
        f.add(cancel);
        submit.addActionListener(this);
        cancel.addActionListener(this);
        f.setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        char[] ch=pwd.getPassword();
        String p=new String(ch);
        String u=user.getText();
        if(e.getSource()==submit){
            if(p.equals("12345") && u.equals("Amrutha")){
            System.out.println("Login Successful");
            }
            else if(!(p.equals("12345") && u.equals("Amrutha"))){
                System.out.println("Login UNSUCCESSFUL");
            }
        }
        else if(e.getSource()==cancel){
            user.setText(" ");
            pwd.setText(" ");
        }
    }
    public static void main(String[] args){
        new PasswordGUI();
    }
}
