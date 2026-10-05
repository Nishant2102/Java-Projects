import java.util.function.Supplier;

public class Program {

	public static void main(String[] args) {
		Supplier<String> otp=()->{
			char [] vowels= {'A','E','I','O','U'};
			String str="";
			str+=Character.toString(vowels[(int)(Math.random()*4)]);
			
		for(int i =0; i<5; i++) {
			str+=Integer.toString((int)(Math.random()*9)) ;
		}
		return str;
		};
		
		System.out.println(otp.get());

	}

}
