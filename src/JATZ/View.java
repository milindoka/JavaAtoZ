package JATZ;


import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class View {
      
    private JFrame frame;
    private JLabel label;
    private JButton button;

    
    public View(String text){
        frame = new JFrame("View - JavaAtoZ");                                    
        frame.getContentPane().setLayout(new BorderLayout());                                          
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);           
        frame.setSize(200,200);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        
        button = new JButton("Button");        
        frame.getContentPane().add(button, BorderLayout.CENTER);        
    }
        
    public JButton getButton(){
        return button;
    }
    
}