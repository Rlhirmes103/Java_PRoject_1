
import java.awt.*;

import javax.swing.*;

public class DateGUI extends JFrame{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
JMenuBar mBar;	
JMenu fileMenu, editMenu;
FileMenuHandler fileHandler;
EditMenuHandler editHandler;
JMenuItem MenuItem;
public static TextArea Sorted;
public static  TextArea Unsorted;
Container myDateGUIContentPane;


	//Create a GUI and set its size, location, and title
    public DateGUI(String title, int height, int width){
       setSize(400,200);
        setLocation(100,100);
        setTitle("Dates");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(1,2));
		myDateGUIContentPane = getContentPane();
		Unsorted = new TextArea();
		Sorted = new TextArea();
		myDateGUIContentPane.add(Unsorted);
		myDateGUIContentPane.add(Sorted);
        createMenu();
        setVisible(true);
    }
    
    // file menu handler
private void createMenu() {
        JMenuBar menuBar  = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        JMenuItem item;
        FileMenuHandler fmh  = new FileMenuHandler(this);
        item = new JMenuItem("Open"); 
        item.addActionListener( fmh );
        fileMenu.add( item );
        fileMenu.addSeparator(); 
        item = new JMenuItem("Quit"); 
        item.addActionListener( fmh );
        fileMenu.add( item );
        menuBar.add(fileMenu);
        setJMenuBar(menuBar); 
        
        editMenu = new JMenu("Edit");
        editHandler = new EditMenuHandler(this);
        item = new JMenuItem("Insert");
        item.addActionListener(editHandler);
        editMenu.add(item);
        menuBar.add(editMenu);
        
    }
    public static void printDateToJFrame(SortedDateList SortedList, DateList UnsortedList) {

    	     Unsorted.append((UnsortedList.toString() +"\n"));
    		Sorted.append(SortedList.toString()+"\n");
    	
    }
}