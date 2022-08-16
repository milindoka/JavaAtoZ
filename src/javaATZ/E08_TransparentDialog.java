package javaATZ;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Frame;
import java.awt.GraphicsEnvironment;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.io.IOException;

import javax.swing.AbstractAction;
import javax.swing.InputMap;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRootPane;
import javax.swing.KeyStroke;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class E08_TransparentDialog extends JDialog 

{
	JLabel l1,l2,l3,l4, lExit;
    public E08_TransparentDialog(Frame mf,String title,boolean modal) throws IOException
    {
        
    	//super(mf,title,modal);
    	
    
    	this.setSize(1000,1000);
    	
    	this.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        Container dlgpane=getContentPane();
        dlgpane.setLayout(new GridLayout(4,1,7,5));
    
    	l1=new JLabel("Test1");
    	l2=new JLabel("Test2");
    	l3=new JLabel("Test3");
    	l4=new JLabel("Test4");
    	lExit=new JLabel("Press Esc to close this Transparent Dialog");
    
        
        dlgpane.add(l1);
        dlgpane.add(l2);
        dlgpane.add(l3);
        dlgpane.add(l4);
        dlgpane.add(lExit);
    
        this.setUndecorated(true);
        this.setBackground(new Color(0, 0, 0, 0));
        
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        
        
    	
    }

    /////Press Escape to exit dialog
    protected JRootPane createRootPane() { 
    	    JRootPane rootPane = new JRootPane();
    	    KeyStroke stroke = KeyStroke.getKeyStroke("ESCAPE");
    	    AbstractAction actionListener = new AbstractAction() { 
    	      public void actionPerformed(ActionEvent actionEvent) { 
    	        setVisible(false);
    	      } 
    	    } ;
    	    InputMap inputMap = rootPane.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
    	    inputMap.put(stroke, "ESCAPE");
    	    rootPane.getActionMap().put("ESCAPE", actionListener);

    	    return rootPane;
    	  } 

}

