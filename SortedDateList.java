//inherited from datelist
import java.util.TreeMap;
public class SortedDateList {
	public TreeMap <Date212, Date212> sortedDates = new TreeMap<Date212, Date212>(new Date212Comparator());

	public void addS(Date212 d) {
		sortedDates.put(d, d);
		/*
		DateNode temp = new DateNode(d);
		//insertion point
		DateNode p = this.first;
		//look through nodes until end and sort
		while(p.next!= null && p.next.data.compareTo(temp.data)< 0) {
			p=p.next; // move on to next node until right position
		}// end while loop
		//next node
			temp.next = p.next;
			p.next = temp;
			//if temp node is last node make temp last
			if(temp.next== null) {
				this.last = temp;
			}
			// when increase node add length in both sorted and unsorted
		// update list length
		length++;*/
	}// end add 
	
	public String toString() {
	    String returnString = "";
	    for(Date212 d: sortedDates.keySet()) {
	    		returnString += d.toString() +"\n";
	    }
	    return returnString;
	}

}
