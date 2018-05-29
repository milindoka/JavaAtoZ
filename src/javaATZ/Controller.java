package javaATZ;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;


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
    	if(ButtonString.contains("02")) { ProgressBarDemo(); return; }
    	if(ButtonString.contains("03")) { E03_DesktopToast.AutoCloseMsg("This is a Test"); return; }
    	if(ButtonString.contains("04")) { TabbedPaneDemo(); return; }
    	if(ButtonString.contains("05")) { HTML_TextDemo(); return; }
    	if(ButtonString.contains("06")) { PopupMenu(); return; }
    	if(ButtonString.contains("07")) { SimplestJDialog(); return; }
    	if(ButtonString.contains("08")) { TransparentJDialog(); return; }
    	//otherwise display button string as default action
    	show(ButtonString);
    }
    
    
    void TransparentJDialog()
    {
    	  try {
  				new E08_TransparentDialog(null,"Simplest JDialog",true);
  			} catch (IOException e) {
  				// TODO Auto-generated catch block
  				e.printStackTrace();
  			}
    	return;
    	
    }
    
    
    
    void SimplestJDialog()
    {
    	  try {
  				new E07_Simplest_JDialog(null,"Simplest JDialog",true);
  			} catch (IOException e) {
  				// TODO Auto-generated catch block
  				e.printStackTrace();
  			}
    	return;
    	
    }
    
    void PopupMenu()
    {E06_PopupMenu pm=new E06_PopupMenu();
     pm.PopupMenu(view.GetButton(6)); ///show popup menu on button no 6
    	
    }
    
    ////E05
    void HTML_TextDemo()
    {  
    	
  	  try {
				new E05_HTML_Text(null,"HTML Text Demo",true);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
  	return;
  	}
    
   /////E04
    void TabbedPaneDemo()
    {E04_TabbedPane TP = new E04_TabbedPane();
	TP.setModal(true);
	TP.setVisible(true);
    }
    

    //E03    ///static class
    
    
    ///E02
    
    void ProgressBarDemo()
    {
    	E02_ProgressBar m=new E02_ProgressBar();
    }
    	
    
  ///E01
    void PrinterPreferrenceDemo()
    {
    	E01_SetPrinter sp=new E01_SetPrinter();
        String printername=sp.LoadPreferences();
        if(printername==null) printername="No Printer";
    	
        
        printername=sp.SelectPrinter();
        //view.getSetPRN().setText("Printer : "+ printername+"  (Click To Change");
        //model.setPrinterName(printername);
        //sp.SavePreferences();
        
    }
    
    
    
    ////E00
    void BorderLayoutDemo()
    {
    	E00_BorderLayout BL = new E00_BorderLayout();
    	BL.setModal(true);
    	BL.setVisible(true);
    	if(BL.Response==null) show("You did not select any button");
    	else
    	show(BL.Response);
    }
    
    
//////Easy display message for string, int, long
public void show(String msg) 
{JOptionPane.showMessageDialog(null, msg);}
public void show(int msg)
{JOptionPane.showMessageDialog(null, msg);}
public void show(long msg)
{JOptionPane.showMessageDialog(null, msg);}


    
}