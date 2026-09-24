
public class Operations {

	public static void sortEmp(Employee arrEmp[], int count){
		
		Employee temp;
		
		for(int i=0; i<count;i++) {
			for(int j=i+1;j<count;j++) {
				if(arrEmp[i].name.compareToIgnoreCase(arrEmp[j].name)>0) {
					temp=arrEmp[i];
					arrEmp[i]=arrEmp[j];
					arrEmp[j]=temp;
				}
			}
		}
	}
	
	public static void sortEmpDesc(Employee arrEmp[], int count){
		
		Employee temp;
		
		for(int i=0; i<count;i++) {
			for(int j=i+1;j<count;j++) {
				if(arrEmp[i].name.compareToIgnoreCase(arrEmp[j].name)<0) {
					temp=arrEmp[i];
					arrEmp[i]=arrEmp[j];
					arrEmp[j]=temp;
				}
			}
		}
	}
	
	public static void addInEmp(Employee arrEmp[], Manager arrManager[], Engineer arrEngineer[], SalesPerson arrSalesPerson[], int countM, int countE, int countS ) {
		int count=0;
			for(int j=0; j<countM; j++) {
				arrEmp[count++]=arrManager[j];
			}
			for(int j=0; j<countE; j++) {
				arrEmp[count++]=arrEngineer[j];
			}
			for(int j=0; j<countS; j++) {
				arrEmp[count++]=arrSalesPerson[j];
			}
	
	}
	
	
	public static void sortAllEmp(Employee arrEmp[], int count){
		
		Employee temp;
		for(int i=0; i<count;i++) {
			for(int j=i+1;j<count;j++) {
				if(arrEmp[i].name.compareToIgnoreCase(arrEmp[j].name)>0) {
					temp=arrEmp[j];
					arrEmp[j]=arrEmp[j+1];
					arrEmp[j+1]=temp;
				}
			}
		}
	}
	
}
