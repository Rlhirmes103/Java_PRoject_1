import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.util.StringTokenizer;


public class FileMenuHandler implements ActionListener {
   JFrame jframe;
   public static TextFileInput inputFile;
   public static String myFile;
   public static String[] dateList = new String[100];
   public static boolean b;
	static UnsortedDateList UnsortedList = new UnsortedDateList();
	static SortedDateList SortedList = new SortedDateList(); 

   
   public FileMenuHandler (JFrame DateGUI) {
      jframe = DateGUI;
   }
   
   //reads  dates from file
   public static int readDatesFromFile(String myfile, String[] dateList) {
		TextFileInput in = new TextFileInput(myfile);
		int lengthFilled = 0;
		String line = in.readLine();
       //While loop goes through each token and adds the token to list until finished
		while(line!= null && lengthFilled < dateList.length) {
			StringTokenizer st = new StringTokenizer(line, ",");
			
			while(st.hasMoreTokens()) {
				/*
				String token = st.nextToken();
				String date = new String(token);
				dateList[lengthFilled++] = date;*/
				String tokenHolder = st.nextToken().trim();
				//try catch block
				try {
					Date212 dateInfo = new Date212(tokenHolder);
					UnsortedList.addU(dateInfo);
					SortedList.addS(dateInfo);
				}
				catch(NumberFormatException nfe){
					System.err.println( nfe.getMessage() );				}
				catch(Exception e) {
					System.err.println( e.getMessage() );				}
				
			}// end of inner while loop
			
			//try catch
			
			line =in.readLine();
		}// end of outer while loop
		return lengthFilled;
	}// end method
   
public void addDate(String[] dateList, int length) {
	for (int i=0; i<length; i++) {
		Date212 d = new Date212(dateList[i]);
		UnsortedList.addU(d);
		SortedList.addS(d);
	}
}
   
   public void actionPerformed(ActionEvent event) {
      String menuName = event.getActionCommand();
      if (menuName.equals("Open") && b==false) {
//         JOptionPane.showMessageDialog(null,"You clicked on Open"); 
         JFileChooser jFile = new JFileChooser();
		 int key = jFile.showOpenDialog(null);
		 
		 if(key == JFileChooser.APPROVE_OPTION) {
			 File f = jFile.getSelectedFile();
			 System.out.println("File: "+f);
			 myFile = f.getAbsolutePath();
			 System.out.println(myFile);
			 int length = readDatesFromFile(myFile, dateList);
			 addDate(dateList, length);
//			 System.out.println(SortedList.toString());
//			 System.out.println(UnsortedList.toString());

			 DateGUI.printDateToJFrame(SortedList, UnsortedList);
			 b=true;  
		 }//inner if
      }//outer if
         else if (menuName.equals("Quit")) {
//          JOptionPane.showMessageDialog(null,"You clicked on Quit"); 
 		 System.exit(0);
      }// else
   } //actionPerformed
 
}