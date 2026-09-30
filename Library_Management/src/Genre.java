
public enum Genre {
		
	TECHNOLOGY(1),
	LAW(2),
	FANTASY(3),
	MYTHOLOGY(4),
	ROMANCE(5),
	CRIME(6),
	PSYCHOLOGY(7),
	SCIENCE(8);
	
	
	private int choice;
	
	Genre(int choice){
		this.choice = choice;
	}
	
	
	
	public int getChoice() {
		return choice;
	}
}
