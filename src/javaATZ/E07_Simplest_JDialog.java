package javaATZ;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.io.IOException;

import javax.swing.AbstractAction;
import javax.swing.InputMap;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JRootPane;
import javax.swing.KeyStroke;

public class E07_Simplest_JDialog extends JDialog 

{
    public E07_Simplest_JDialog(Frame mf,String title,boolean modal) throws IOException
    {
        super(mf,title,modal);
        this.setSize(300,200);
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

