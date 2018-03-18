package JATZ;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;


public class Controller {

    private Model model;
    private View view;
    private ActionListener AL01;
    
    
    public Controller(Model model, View view){
        this.model = model;
        this.view = view;
    }
    
    public void LinkViewButtons()
    {        
        AL01 = new ActionListener() 
        { public void actionPerformed(ActionEvent actionEvent) 
              {                  
              }
        };                
       // view.getButton().addActionListener(AL01);   
    }

    
    
//////Easy display message for string, int, long
public void show(String msg) 
{JOptionPane.showMessageDialog(null, msg);}
public void show(int msg)
{JOptionPane.showMessageDialog(null, msg);}
public void show(long msg)
{JOptionPane.showMessageDialog(null, msg);}

    
    
    
    
}