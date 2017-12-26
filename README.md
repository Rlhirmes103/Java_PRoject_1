# Java_Project_1

Create a class called Date212 to represent a date. It will store the year, month and day as integers
Given an input file of dates represented as Strings, read the dates from the file and display them in a GUI.
The dates will be in the form yyyymmdd (such as 20171001 for October 1, 2017). 
The GUI should have a GridLayout with one row and two columns. The left column should display the dates in the format read from the file, and the right column should display the dates as Date212 object in sorted order (using Selection Sort).
Create a class called DateNode which has fields for the data (a Date212) and next (DateNode) instance variables. Include a one-argument constructor which takes a Date212 as a parameter.
Create an abstract linked list class called DateList.
Create two more linked list classes that extend the abstract class DataList: 
  One called UnsortedDateList and one called SortedDateList, each with appropriate no-argument constructors.
Instantiate two linked lists, and for every date read from the file, add it to the unsorted and sorted lists using the add method
Add a file menu to your DateGUI with options to open a file for reading, and one to Quit the program.
Create a new Exception called Date212Exception. The constructor of Date212 should throw this exception if an invalid date is read from the file
Add a second menu to the GUI called Edit which will have one menu item called Insert.
Clicking on insert should prompt the user using a JOptionPane input dialog to enter a new date in the same format as is read from the input file
