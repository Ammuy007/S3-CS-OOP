import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
public class Calculator extends JFrame implements ActionListener{
    JTextField result;
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,beq,badd,bsub,bmul,bdiv,bclr;
    JFrame f;
    double a,b,ans;
    int op;
    public Calculator(){
        f=new JFrame();
        b1=new JButton("1");
        b2=new JButton("2");
        b3=new JButton("3");
        b4=new JButton("4");
        b5=new JButton("5");
        b6=new JButton("6");
        b7=new JButton("7");
        b8=new JButton("8");
        b9=new JButton("9");
        b0=new JButton("0");
        beq=new JButton("=");
        bsub=new JButton("-");
        badd=new JButton("+");
        bmul=new JButton("*");
        bdiv=new JButton("/");
        bclr=new JButton("C");
        result=new JTextField();
        f.setSize(600,600);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);
        result.setBounds(50,50,310,60);
        b1.setBounds(50,140,50,50);
        f.add(b1);
        b2.setBounds(130,140,50,50);
        f.add(b2);
        b3.setBounds(220,140,50,50);
        f.add(b3);
        b4.setBounds(310,140,50,50);
        f.add(b4);
        b5.setBounds(50,220,50,50);
        f.add(b5);
        b6.setBounds(130,220,50,50);
        f.add(b6);
        b7.setBounds(220,220,50,50);
        f.add(b7);
        b8.setBounds(310,220,50,50);
        f.add(b8);
        b9.setBounds(50,310,50,50);
        f.add(b9);
        b0.setBounds(130,310,50,50);
        f.add(b0);
        badd.setBounds(220,310,50,50);
        f.add(badd);
        bsub.setBounds(310,310,50,50);
        bdiv.setBounds(50,400,50,50);
        f.add(bdiv);
        bmul.setBounds(130,400,50,50);
        f.add(bmul);
        beq.setBounds(220,400,50,50);
        f.add(beq);
        bclr.setBounds(310,400,50,50);
        f.add(bclr);

        f.add(bsub);
        f.add(result);
        f.setVisible(true);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b0.addActionListener(this);
        badd.addActionListener(this);
        bsub.addActionListener(this);
        bdiv.addActionListener(this);
        bmul.addActionListener(this);
        bclr.addActionListener(this);
        beq.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==b1){
            result.setText(result.getText().concat("1"));
        }
        else if(e.getSource()==b2){
            result.setText(result.getText().concat("2"));
        }
        else if(e.getSource()==b3){
            result.setText(result.getText().concat("3"));
        }
        else if(e.getSource()==b4){
            result.setText(result.getText().concat("4"));
        }
        else if(e.getSource()==b5){
            result.setText(result.getText().concat("5"));
        }
        else if(e.getSource()==b6){
            result.setText(result.getText().concat("6"));
        }
        else if(e.getSource()==b7){
            result.setText(result.getText().concat("7"));
        }
        else if(e.getSource()==b8){
            result.setText(result.getText().concat("8"));
        }
        else if(e.getSource()==b9){
            result.setText(result.getText().concat("9"));
        }
        else if(e.getSource()==b0){
            result.setText(result.getText().concat("0"));
        }
        else if(e.getSource()==badd){
            a=Double.parseDouble(result.getText());
            result.setText(" ");
            op=1;
        }
        else if(e.getSource()==bsub){
            a=Double.parseDouble(result.getText());
            result.setText(" ");
            op=2;
        }
        else if(e.getSource()==bmul){
            a=Double.parseDouble(result.getText());
            result.setText(" ");
            op=3;
        }
        else if(e.getSource()==bdiv){
            a=Double.parseDouble(result.getText());
            result.setText(" ");
            op=4;
        }
        else if(e.getSource()==beq){
            b=Double.parseDouble(result.getText());
            switch(op){
                case 1:ans=a+b;
                    break;
                case 2:ans=a-b;
                        break;
                case 3:ans=a*b;
                        break;
                case 4:if(b!=0){
                    ans=a/b;
                }
                break;
                default:

            }
            result.setText(String.valueOf(ans));
        }
        else if(e.getSource()==bclr){
            result.setText(" ");
        }

    }
    public static void main(String[] args){
        new Calculator();
    }
}
