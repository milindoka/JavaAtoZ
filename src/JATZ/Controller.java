package JATZ;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;


public class Controller 
{

    private Model model;
    private View view;
    private ActionListener genericAL;
    
    public Controller(Model model, View view)
    {
        this.model = model;
        this.view = view;
    }
    
    public void LinkViewButtons()
    {        
        genericAL = new ActionListener() 
        { 
        	public void actionPerformed(ActionEvent e) 
        	 {    
           	   if (e.getSource() instanceof JButton) 
           	      {
                    String text = ((JButton) e.getSource()).getText();
           	        ActionTerminal(text); 
                   }
        	  }
         };
             
        
        for(int i=0;i<100;i++)  view.GetButton(i).addActionListener(genericAL);   
    }

    
    void ActionTerminal(String ttt)
    {
      	show(ttt);
    }
    
//////Easy display message for string, int, long
public void show(String msg) 
{JOptionPane.showMessageDialog(null, msg);}
public void show(int msg)
{JOptionPane.showMessageDialog(null, msg);}
public void show(long msg)
{JOptionPane.showMessageDialog(null, msg);}

    
    
}