import java.text.DateFormatSymbols;

public class Date212 {

	private int year, month, day;
		//turning string given into integer
		public Date212(String dates){
			isValidDate(dates);
		int	m=  Integer.parseInt(dates.substring(4, 6));
		int d=  Integer.parseInt(dates.substring(6,8));
		int y=  Integer.parseInt(dates.substring(0, 4));
			year= y;
			day=d;
			month=m;
		}
		//getting and setting dates
	public int getMonth() {
		return month;
	}
	public int getDay() {
		return day;
	}
	public int getYear() {
		return year;
	}
	public void setMoth(int m) {
		this.month = m;
	}
	public void setDay(int d) {
		this.day = d;
	}
	public void setYear(int y) {
		this.year = y;
	}
	
	//checking validity of date
	public static void isValidDate(String s) {
		if(s.length() !=8) throw new Date212Exception("Invalid length "+ s);
		
		int yearCheck =Integer.parseInt(s.substring(0, 4));
		int monthCheck =Integer.parseInt(s.substring(4, 6));
		int dayCheck =Integer.parseInt(s.substring(6, 8));
		
		if(yearCheck<1) throw new Date212Exception("Invalid year " + s);
		if(monthCheck>12 || monthCheck< 1) throw new Date212Exception("Invalid month " + s);
		if(dayCheck<1 || dayCheck>31) throw new Date212Exception("Invalid day " + s);
		if(monthCheck == 2) {
			if (dayCheck > 28 ) throw new Date212Exception("Invalid day " + s);
		}
		/*if(monthCheck == 01 || monthCheck ==03 || monthCheck == 05 || monthCheck == 07 || monthCheck == 08 || monthCheck == 10 || monthCheck ==12) {
			if(dayCheck > 31) throw new Date212Exception("Invalid day " + s);
		}*/
		if(monthCheck == 4 || monthCheck == 6 || monthCheck == 9 || monthCheck == 11) {
			if(dayCheck> 30) throw new Date212Exception("Invalid day " + s);
		}

	}
	//compares if dates are equal
	public boolean equals(Date212 other) {
		if(this.year==other.year && this.month==other.month && this.day==other.day) return true;
		return false;
		}
	
	//compares the dates 
	public int compareTo(Date212 other) {
		if(this.year< other.year) return -1;
		else if(this.year== other.year) {
			if(this.month< other.month) return -1;
			else if(this.month == other.month) {
				if( this.day< other.day) return -1;
				else if (this.day == other.day) return 0;
			}
		}
		return 1;
		}
	
	
	   public String toString() {
			  String month = new DateFormatSymbols().getMonths()[this.month-1];
		      return month + " " + day + ", " + year;
		  }
	
}