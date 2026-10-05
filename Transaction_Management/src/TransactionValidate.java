import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class TransactionValidate  {

	
	public static void filter(List <Transaction> list, Predicate<Transaction> criteria) {
		Iterator<Transaction> iter = list.iterator();
		while(iter.hasNext()) {
			Transaction objTransaction = iter.next();
			if(criteria.test(objTransaction)) System.out.println(objTransaction);
		}
			
	}

}
