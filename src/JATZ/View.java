package JATZ;


import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class View {
      
    private JFrame frame;
    private JLabel label;
    //private JButton button;

    JButton buttons[];
    public View(String text)
    {
    	frame = new JFrame("View - JavaAtoZ");                                    
        frame.getContentPane().setLayout(new GridLayout(3,3));      
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);           
        frame.setSize(200,200);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        
        
        buttons = new JButton[10];
        for(int i = 0; i < 10; i++) 
        {
            buttons[i] = new JButton(String.valueOf(i));
        }

        for(int i=0;i<9;i++)
        {
        	frame.add(buttons[i]);
        }
        
       
      //  frame.getContentPane().add(button, BorderLayout.CENTER);        
    
    
    
    }
    
    
    
    
    
    
        
    /*
    public JButton getButton(){
        return button;
    }
    */
}