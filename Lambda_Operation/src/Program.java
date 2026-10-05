import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.function.Supplier;

public class Program {

	private static final int Integer = 0;

	public static void main(String[] args) {
		List<String> str = Arrays.asList("sanket","nishant","rohit");
		Comparator <String> s1= (str1,str2)-> str1.compareTo(str2); 
		
		Collections.sort(str,s1);
		System.out.println("1. Sorted Array:" + str);
		
///////////////////////////////////////////////////////////////////////////////////////////

		
		List<Integer> largest_num = Arrays.asList(1,2,3,4,5,6);
		Comparator <Integer> numCompare= (num1,num2)-> num1>num2?1:num1<num2?-1:0; 
		Collections.sort(largest_num,numCompare);
		System.out.println("2. Maximum Integer: " + largest_num.getLast());
		
		
///////////////////////////////////////////////////////////////////////////////////////////

		
		System.out.println("3. Smallest Integer: " + largest_num.getFirst());
		
		
		
///////////////////////////////////////////////////////////////////////////////////////////

		Supplier<Integer>  randomNum = ()->{
			
			int num=0;
			for(int i =0; i<3; i++) {
				num*=10;
				num += (int) (Math.random()*9);
				
			}
			return num;
			
		};
		
		System.out.println("4. Random Integer: " + randomNum.get());


///////////////////////////////////////////////////////////////////////////////////////////
		

		
		Scanner sc = new Scanner(System.in);
		List<Integer> arrList = new ArrayList<Integer>();
		arrList.add(sc.nextInt());
		
		System.out.println("5. REverse Array: "+ arrList.reversed());
		
///////////////////////////////////////////////////////////////////////////////////////////

		Supplier<LocalDate> date= ()-> {return LocalDate.now();};
		
		System.out.println("6. Today's Date: "+date.get());
		
///////////////////////////////////////////////////////////////////////////////////////////
		int input = sc.nextInt();

		Supplier<Boolean> prime= ()->{
			int num=1;
			while(num<input) {
				if(input%num==0) return false;
				num++;
			}
			return true;
		};
		
		System.out.println("7. Your number is prime number? " + prime.get());
		
///////////////////////////////////////////////////////////////////////////////////////////

		
		
	}

}
