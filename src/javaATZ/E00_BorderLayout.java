package javaATZ;


import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
 

public class E00_BorderLayout extends JDialog 
{
public String Response;

public E00_BorderLayout() 
{
setBounds(0,0 , 500, 275);
setTitle("BorderLayout and JDialog Demo");
setLocationRelativeTo(null);

JLabel labelWEST = new JLabel("WEST");
JLabel labelNORTH = new JLabel("NORTH",JLabel.CENTER);
JLabel labelCENTER = new JLabel("CENTER",JLabel.CENTER);
JLabel labelEAST = new JLabel("EAST");


Container dlgpane=getContentPane();
dlgpane.setLayout(new BorderLayout());

dlgpane.add(labelWEST,BorderLayout.WEST);
dlgpane.add(labelNORTH,BorderLayout.NORTH);
dlgpane.add(labelCENTER,BorderLayout.CENTER);
dlgpane.add(labelEAST,BorderLayout.EAST);
JPanel buttonpanel=new JPanel();



// Button OK
JButton btnOK = new JButton("OK");
btnOK.addActionListener(new ActionListener() 
{
public void actionPerformed(ActionEvent e) 
{
Response = "You Pressed OK";
dispose();
}
});


buttonpanel.add(btnOK);
 
// Button Cancel
JButton btnCancel = new JButton("Cancel");
btnCancel.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) 
{
	Response = "You Pressed CANCEL";
	dispose();
}
});
buttonpanel.add(btnCancel);

dlgpane.add(buttonpanel,BorderLayout.SOUTH);


}
}
 