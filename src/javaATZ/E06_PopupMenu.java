package javaATZ;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;

public class E06_PopupMenu 
{
	public void show(String msg) 
	{JOptionPane.showMessageDialog(null, msg);}

	 void PopupMenu(JButton b)
	    {
	    	 final JPopupMenu menu = new JPopupMenu("Menu");
	         
	         JMenuItem item1 = new JMenuItem("Item One");
	         item1.addActionListener(new ActionListener() {
	           public void actionPerformed(ActionEvent e) 
	           {
	             show("Item One clicked");
	           }
	         });
	         menu.add(item1);    

	         menu.addSeparator();
	         
	         JMenuItem item2 = new JMenuItem("Item Two");
	         item2.addActionListener(new ActionListener() {
	           public void actionPerformed(ActionEvent e) 
	           {
	             show("Item Two clicked");
	           }
	         });
	         menu.add(item2);
	         
	         menu.addSeparator();
	         
	         JMenuItem item3 = new JMenuItem("Item Three");
	         item3.addActionListener(new ActionListener() {
	           public void actionPerformed(ActionEvent e) 
	           {
	             show("Item Three clicked");
	           }
	         });
	         menu.add(item3);
	         
	         menu.show(b, b.getWidth()/2, b.getHeight()/2);
	    }
	   

}
