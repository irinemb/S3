import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class test implements ActionListener
{
 JLabel l1,l2;
 JTextField t1,t2;
 JButton b1,b2;
 test()
 {
  JFrame f=new JFrame("LOGIN PAGE");
  l1=new JLabel("Username");
  t1=new JTextField(16);
  l2=new JLabel("Password");
  t2=new JTextField(16);
  b1=new JButton("Submit");
  b1=new JButton("Clear");
  JPanel p= new JPanel(new FlowLayout());
  p.add(l1);
  p.add(t2); 
  p.add(l2);
  p.add(t2);
  p.add(b2);
  p.add(b2);
  b1.addActionListener(this);
  b2.addActionListener(this);
  f.add(p);
  f.setSize(300,300);
  f.setVisible(true);
 }
 public void actionPerformed(ActionEvent e)
 {
  String s=e.getActionCommand();
  if(s.equals("Submit"))
  {
  	if(l1.equals("Irine")&&(l2.equals("siuuu7")))
  {
   System.out.println("Welcome"+l1);
  }
  else
  {
  System.out.println("Invalid username");
  }}
  if(s.equals("Clear"))
  {
   l1.setText(" ");
   l2.setText(" ");
   }
   }
   public static void main(String args[])
   {
    test t=new test();
    }
    }
