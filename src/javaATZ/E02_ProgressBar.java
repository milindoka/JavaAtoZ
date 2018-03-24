package javaATZ;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.ProgressMonitor;

public class E02_ProgressBar   
{
  E02_ProgressBar()
  {
    JFrame frame = new JFrame("Swing's ProgressMonitor");
    JButton button = new JButton("Start Iteration");
    frame.getContentPane().add(button, BorderLayout.CENTER);
 
    int min = 0;   int max = 100;
    String[] message = new String[2];
    message[0] = "Performing Iterations.";
    message[1] = "Wait for completion…….";
    final ProgressMonitor monitor = new ProgressMonitor(frame, message, "Iteration", min, max);
    final Runnable runnable = new Runnable()  
           {
             public void run()   
             {
               int sleepTime = 500;
               for(int i = 1; i < 100; i++)    
               {
                 try  
                 {
                   monitor.setNote("Iteration " + i);
                   monitor.setProgress(i);
 
                   if (monitor.isCanceled())    
                   {
                     monitor.setProgress(100);
                     break;             
                   }
                   Thread.sleep( sleepTime);
                 }
                 catch (InterruptedException e) { }
               }
               monitor.close();
             }
         } ;
 
    button.addActionListener(new ActionListener()   
        {
           public void actionPerformed(ActionEvent e)
           {                                      // run the iterations in a separate thread
             Thread thread = new Thread(runnable);
             thread .start();
         }   }  ) ;
    frame.setSize(200,300);
    frame.setVisible(true);
    
    
    Thread thread = new Thread(runnable);
    thread .start();
  }
}