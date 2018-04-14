package javaATZ;

import javax.swing.JFrame;
import javax.swing.ProgressMonitor;

public class E02_ProgressBar   
{
  JFrame frame;
  E02_ProgressBar()
  {
    frame = new JFrame("Swing's ProgressMonitor");
 
    int min = 0;   int max = 100;
    String[] message = new String[2];
    message[0] = "Performing Iterations.";
    message[1] = "Wait for completion.....";
    final ProgressMonitor monitor = new ProgressMonitor(frame, message, "Iteration", min, max);
    final Runnable runnable = new Runnable()  
           {
             public void run()   
             {
            	  
               int sleepTime = 100;
               for(int i = 1; i < 100; i++)    
               {
                 try  
                 { 
                  String Percentage=String.format("completed %d%%",i);
                   monitor.setNote(Percentage);
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
               frame.dispose();
             }
         } ;
 
    frame.setSize(200,50);
    frame.setLocationRelativeTo(null);
    frame.setVisible(false);
    
    
    Thread thread = new Thread(runnable);
    thread .start();
  }
}