
public class Operations {
	
	public void addDays(Date date, int days) {
		int remain=days;
		int curr_day= date.getDay();
		int curr_month = date.getMonth(); 
		int curr_year = date.getYear();
		
		while(remain!=0) {
				
			if(curr_month==1 || curr_month == 3  || curr_month ==5 || curr_month == 7 || curr_month == 8 || curr_month == 10 || curr_month == 12) {
				if(remain>31) {
					remain=remain-(31-curr_day+1);
					curr_month++;
					curr_day=1;
				}
				else {
					if(curr_day==0) {
						curr_day+=remain;
						remain =0;
					}
					else {
						if (curr_day+remain<=31) {
							curr_day+=remain;
							remain =0;
						}
						else {
							remain=remain-(31-curr_day+1);
							curr_month++;
							curr_day=1;
						}
					}
				}
				
			}
			
			else if(curr_month==4 || curr_month == 6  || curr_month ==9 || curr_month ==11 ) {
				if(remain>30) {
					remain=remain-(30-curr_day+1);
					curr_month++;
					curr_day=1;
				}
				else {
					if(curr_day==0) {
						curr_day+=remain;
						remain =0;
					}
					else {
						if (curr_day+remain<=30) {
							curr_day+=remain;
							remain =0;
						}
						else {
							remain=remain-(30-curr_day+1);
							curr_month++;
							curr_day=1;
						}
					}
				}
				}
			else if (curr_month == 2 && curr_year%4==0) {
				if(remain>29) {
					remain=remain-(29-curr_day+1);
					curr_month++;
					curr_day=1;
				}
				else {
					if(curr_day==0) {
						curr_day+=remain;
						remain =0;
					}
					else {
						if (curr_day+remain<=29) {
							curr_day+=remain;
							remain =0;
						}
						else {
							remain=remain-(29-curr_day+1);
							curr_month++;
							curr_day=1;
						}
					}
				}
				}
			else if (curr_month == 2 && curr_year%4!=0) {
				if(remain>28) {
					remain=remain-(28-curr_day+1);
					curr_month++;
					curr_day=1;
				}
				else {
					if(curr_day==0) {
						curr_day+=remain;
						remain =0;
					}
					else {
						if (curr_day+remain<=28) {
							curr_day+=remain;
							remain =0;
						}
						else {
							remain=remain-(28-curr_day+1);
							curr_month++;
							curr_day=1;
						}
					}
				}
				}
			
			
			if(curr_month>12) {
				curr_month=1;
				curr_year++;
			}
		}
		
		date.setDay(curr_day);
		date.setMonth(curr_month);
		date.setYear(curr_year);
		}
	
	
	
	public void addMonths(Date date, int months) {
		int curr_month=date.getMonth();
		int remain=months;
		int curr_year=date.getYear();
		while(remain>0) {
			if(curr_month+remain<=12) {
				curr_month+=remain;
				remain=0;
				
			}
			else {
					remain-=(12-curr_month+1);
					curr_month=1;
					curr_year++;
			}
		}
		date.setMonth(curr_month);
		date.setYear(curr_year);
	}
	
	
	public void addYear(Date date, int years) {
		int recent=date.getYear()+years;
		
		if(date.getMonth()==2 && date.getDay()==29) {
			if(!((recent % 4 == 0 && recent % 100 != 0) || (recent % 400 == 0))) {
				date.setDay(1);
				date.setMonth(3);
			}
		}
		date.setYear(recent);
	}
}
