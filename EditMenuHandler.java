import javax.swing.*;
import java.awt.event.*;
public class EditMenuHandler implements ActionListener {
   JFrame jframe;
   public EditMenuHandler (JFrame jf) {
      jframe = jf;
   }
   
   /**
    * Invoked (called) automatically when an action occurs in the 
    * Edit menu.
    */
   public void actionPerformed(ActionEvent event) {
      String menuName = event.getActionCommand(); //get String associated with action (the item's label in our case)
      if (menuName.equals("Insert")) {
    	  	String  date = JOptionPane.showInputDialog(jframe, "Input a date om format yyyymmdd: ");
    	  	try {
    	  		Date212 currentDate = new Date212(date);
    	  		FileMenuHandler.UnsortedList.addU(currentDate);
    	  		FileMenuHandler.SortedList.addS(currentDate);
    	  	}
    	  	catch(NumberFormatException nfe){
				System.err.println( nfe.getMessage() );				}
			catch(Exception e) {
				System.err.println( e.getMessage() );				}
      }//if 
      DateGUI.printDateToJFrame(FileMenuHandler.SortedList, FileMenuHandler.UnsortedList);
   } //actionPerformed
}