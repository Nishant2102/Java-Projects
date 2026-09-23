
public class Date {
	
	private int day=1;
	
	private int month=1;
	
	private int year=2026;
	
	//  Constructor
	
	public Date(int day, int month, int year) {
		setDate(day,month,year);
	}
	
	// Getter Functions
	
	public int getDay() {
		return  day;
	}
	
	public int getMonth() {
		return month;
	}
	
	public int getYear() {
		return year;
	}
	
	
	// Setter Functions
	
	public void setDay(int day) {
		if(month==1 || month == 3  || month ==5 || month == 7 || month ==8 || month == 10 || month == 12) {
			if(day<1 || day>31) {
				this.day =1;
			}
			else this.day=day;
		}
		
		else if(month==4 || month == 6  || month ==9 || month ==11 ) {
			if(day<1 || day>30) {
				this.day =1;
			}
			else this.day=day;
		}
		else if (month == 2 && year%4==0) {
			if(day<1 || day>29) {
				this.day =1;
			}
			else this.day=day;
		}
		else if (month == 2 && year%4!=0) {
			if(day<1 || day>28) {
				this.day =1;
			}
			else this.day=day;
		}
	}
	
	public void setMonth(int month) {
		if(month <1 || month >12) {
			this.month=1;
		}
		else this.month=month;
	}
	
	public void setYear(int year) {
		if(year <1000 || year>3000) {
			this.year=1;
		}
		else this.year=year;
	}
	
	
	public void setDate(int day, int month, int year) {
		setYear(year);
		setMonth(month);
		setDay(day);
	}
	
	
	
	
}
