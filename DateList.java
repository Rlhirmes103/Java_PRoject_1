//abstract means it cant be added to directly
public abstract class DateList {
 	protected DateNode first;
	protected DateNode last;
	protected int length;
	
public DateList() {
	DateNode ln = new DateNode();
	first = ln;
	last = ln;
	length = 0;
}
public void append(Date212 d) {
	DateNode n = new DateNode(d);
	last.next = n;
	last = n;
	length++;
}

public String toString() {
    DateNode p = first.next;
    String returnString = "";
    while (p != null) {
        returnString += p.data.toString() + "\n";
        p = p.next;
    }
    return returnString;
}

}
