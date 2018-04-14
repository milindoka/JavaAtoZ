package javaATZ;

import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.*;



public class E04_TabbedPane extends JDialog 
{

public E04_TabbedPane() 
{
	
    JTextArea ta=new JTextArea(200,200);  
    JPanel p1=new JPanel();  
    p1.add(ta);  
    JPanel p2=new JPanel();  
    JPanel p3=new JPanel();  
    JTabbedPane tp=new JTabbedPane();  
    tp.setBounds(50,50,200,200);  
    tp.add("Pane1",p1);  
    tp.add("Pane2",p2);  
    tp.add("Pane3",p3);    
	
setBounds(0,0 , 500, 275);
setTitle("Tabbed Pane Demo");
setLocationRelativeTo(null);

//JLabel labelWEST = new JLabel("WEST");
//JLabel labelNORTH = new JLabel("NORTH",JLabel.CENTER);
//JLabel labelCENTER = new JLabel("CENTER",JLabel.CENTER);
//JLabel labelEAST = new JLabel("EAST");


Container dlgpane=getContentPane();
dlgpane.setLayout(new BorderLayout());

//dlgpane.add(labelWEST,BorderLayout.WEST);
dlgpane.add(tp,BorderLayout.NORTH);
//dlgpane.add(labelCENTER,BorderLayout.CENTER);
//dlgpane.add(labelEAST,BorderLayout.EAST);
//JPanel buttonpanel=new JPanel();


}
}
 