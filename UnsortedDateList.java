// inherited from datelist
public class UnsortedDateList extends DateList{
	public UnsortedDateList() {
		
	super();
	}
	public void addU(Date212 d) {
		DateNode n = new DateNode(d);
		last.next= n;
		last = n;
		length++;
	}// add
}
