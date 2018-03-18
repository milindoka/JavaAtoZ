package javaATZ;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;



public class Controller 
{

    private Model model;
    private View view;
    private ActionListener genericAL;
    //private AA_Titles Titles;
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

        /////Set All Button Texts
        for(int i=0;i<AA_Titles.titles.length;i++)
        	view.GetButton(i).setText(AA_Titles.titles[i]);
    
    }

    
    void ActionTerminal(String ButtonString)
    {
    	if(ButtonString.contains("00")) { BorderLayoutDemo(); return; }
    	if(ButtonString.contains("01")) { PrinterPreferrenceDemo(); return; }
      	
    	show(ButtonString);
    }
    
    
    void BorderLayoutDemo()
    {
    	E00_BorderLayout BL = new E00_BorderLayout();
    	BL.setModal(true);
    	BL.setVisible(true);
    	if(BL.Response==null) show("You did not select any button");
    	else
    	show(BL.Response);
    }
    
    void PrinterPreferrenceDemo()
    {
    	SetPrinter sp=new SetPrinter();
        String printername=sp.LoadPreferences();
        if(printername==null) printername="No Printer";
    	
        
        printername=sp.SelectPrinter();
        //view.getSetPRN().setText("Printer : "+ printername+"  (Click To Change");
        //model.setPrinterName(printername);
        //sp.SavePreferences();
        
    }
    
//////Easy display message for string, int, long
public void show(String msg) 
{JOptionPane.showMessageDialog(null, msg);}
public void show(int msg)
{JOptionPane.showMessageDialog(null, msg);}
public void show(long msg)
{JOptionPane.showMessageDialog(null, msg);}


    
}