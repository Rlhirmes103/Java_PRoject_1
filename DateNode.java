
public class DateNode {
	//declares instance variables
	public Date212 data;
	public DateNode next;
	// no argument constructor initiates empty dateNode
	public DateNode() {
		data= null;
		next = null;		
	}
	// constructor that takes date and points to nothing
	public DateNode (Date212 d) { 
		data=d;
		next = null;
	}
}
