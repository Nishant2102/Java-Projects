
public enum Menu {

	ADD(1),
	DISPLAY(2),
	DELETE(3),
	EXIT(4);
	
	private final int choice;
	
	Menu(int choice){
		this.choice = choice;
	}
	
	

	public int getMenuNumber() {
		return choice;
	}
	
	
	
	
}
