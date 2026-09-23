
public class Program {

	public static void main(String[] args) {
		for(int i=0; i<4; i++) {
			for(int j=0;j<i;j++) {
				System.out.print(" ");
			}
			for(int j=4;j>i;j--) {
				System.out.print("*");
			}
			System.out.println("");
		}

		
		
		System.out.println("\n\n");
		
		
		boolean x=false;
		
		for(int i=-3; i<=3;i++) {
			if(i==0) continue;
			
			if(Math.abs(i)==1 && !x) x=true;
			else if (Math.abs(i)==1 && x) continue;
			
			for(int j=0; j<Math.abs(i);j++) {
				System.out.print("*");
			}
			for(int j=0; j<6-2*Math.abs(i);j++) {
				System.out.print(" ");
			}
			for(int j=0; j<Math.abs(i);j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
	}
}
