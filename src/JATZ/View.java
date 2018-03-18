package JATZ;


import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class View {
      
    private JFrame frame;

    JButton ButtonArray[];  //button array
    
    public View(String text)
    {
    	frame = new JFrame("View - JavaAtoZ");                                    
        frame.getContentPane().setLayout(new GridLayout(10,10));      
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);           
        frame.setSize(200,200);
        frame.setLocationRelativeTo(null);
         frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setVisible(true);
        
        //// create buttons and add them programmatically
        ButtonArray = new JButton[100];
        for(int i = 0; i < 100; i++) 
        {
            ButtonArray[i] = new JButton(String.valueOf(i));
        }

        for(int i=0;i<100;i++)
        {
        	frame.add(ButtonArray[i]);
        }
    }
    
    JButton GetButton(int i)
    {
    	return ButtonArray[i];
    }
    
}