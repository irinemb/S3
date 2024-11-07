import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class light implements ActionListener
{
JFrame f;
JRadioButtonMenuItem r1,r2,r3;
JLabel l1;
light()
{
 f=new JFrame ();
 f.setSize(350,200);
 f.setTitle("TRAFFIC LIGHTS");
 FlowLayout FL=new FlowLayout(FlowLayout.CENTER,20,20);
 f.setLayout(FL);
 l1=new JLabel("",SwingConstants.CENTER);
  
 r1=new JRadioButtonMenuItem("Red");
 r2=new JRadioButtonMenuItem("Yellow");
 r3=new JRadioButtonMenuItem("Green");
 
 ButtonGroup bg=new ButtonGroup();
 bg.add(r1);
 bg.add(r2);
 bg.add(r3);
 
 f.add(l1);
 
 f.add(r1);
 f.add(r2);
 f.add(r3);
 
 r1.addActionListener(this);
 r2.addActionListener(this);
 r3.addActionListener(this);
 
 f.setVisible(true);
 f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 }
 
 public void actionPerformed(ActionEvent e)
 {
  Color c1=Color.black;
  String str="";
  
  if(r1.isSelected())
  {
   str="stop";
   c1=Color.red;
   }
   
   if(r2.isSelected())
  {
   str="ready";
   c1=Color.yellow;
   }
   
   if(r3.isSelected())
  {
   str="go";
   c1=Color.green;
   }
   
  l1.setText(str);
  l1.setForeground(c1);
  }
  
  public static void main(String ar[])
   {
   new light();
   }
   }
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
