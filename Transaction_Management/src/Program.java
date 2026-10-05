import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Program {

	
	public static void main(String[] args) {
		
		List <Transaction> list = Arrays.asList(
			new Transaction(),
			new Transaction(),
			new Transaction(),
			new Transaction(),
			new Transaction()
			
		);
		
		for(Transaction x: list) {
			x.add();
		}
	
		
		Predicate<Transaction> condition1 = (transaction )-> transaction.txAmount>5000; 
		Predicate<Transaction> condition2 = (transaction )-> !transaction.txStatus; 

		TransactionValidate.filter(list,condition1);
		System.out.println("-------------------------------------------------------------");
		
		TransactionValidate.filter(list,condition2);
		System.out.println("-------------------------------------------------------------");

		
		
		for (Transaction transaction : list) {
			
			Supplier<Float> getAmountSupplier = ()->{
				
				if(transaction.txArrears )
					return (float) ((transaction.txAmount+500)*1.18);
				else {
					return transaction.txAmount;
				}
			};
			
			System.out.println(getAmountSupplier.get());
		}
		
		
	}
}
