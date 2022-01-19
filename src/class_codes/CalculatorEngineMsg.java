package class_codes;

import java.awt.event.ActionListener;

import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;

public class CalculatorEngineMsg 
    implements ActionListener {

   public void actionPerformed(ActionEvent e){
       JOptionPane.showConfirmDialog(null,
               "ALert Button Clicked",
               "Just a test",
               JOptionPane.PLAIN_MESSAGE);
   }
}