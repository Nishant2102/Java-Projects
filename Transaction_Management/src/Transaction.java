import java.util.Objects;
import java.util.Scanner;

public class Transaction {

	 int txId;
	 String txDate;
	 float txAmount;
	 boolean txStatus;
	 boolean txArrears;
  
	 
	 
	 @Override
	 public String toString() {
		return "Transaction [txId=" + txId + ", txDate=" + txDate + ", txAmount=" + txAmount + ", txStatus=" + txStatus
				+ ", txArrears=" + txArrears + "]";
	 }
	 @Override
	 public int hashCode() {
		return Objects.hash(Float.valueOf(txAmount), Boolean.valueOf(txArrears), txDate, Integer.valueOf(txId),
				Boolean.valueOf(txStatus));
	 }
	 @Override
	 public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Transaction other = (Transaction) obj;
		return Float.floatToIntBits(txAmount) == Float.floatToIntBits(other.txAmount) && txArrears == other.txArrears
				&& Objects.equals(txDate, other.txDate) && txId == other.txId && txStatus == other.txStatus;
	 }
	 public void add(){
	
		 	Scanner sc = new Scanner (System.in);
			 System.out.println("Enter Transaction ID:  ");
			this.txId = sc.nextInt();
			
			System.out.println("Enter Transaction Amount: ");
			this.txAmount = sc.nextFloat();
			
			System.out.println("Enter Transaction Arrears");
			this.txArrears = sc.nextBoolean();
			
			System.out.println("Enter Status True or false");
			this.txStatus = sc.nextBoolean();
			
			
			System.out.println("Enter a date (yyyy-MM-dd): ");
			sc.nextLine();
			this.txDate = sc.nextLine();
		
	 }

}
