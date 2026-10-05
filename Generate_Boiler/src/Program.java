import java.util.LinkedHashMap; 
import java.util.Scanner; 

public class Program { 
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 

        System.out.println("Enter package name :"); 
        String pkg = scanner.next().trim(); 

        System.out.println("Enter class name :"); 
        String classname = scanner.next().trim(); 

        System.out.println("Select access specifier :"); 
        String specifier = scanner.next().trim(); 

        System.out.println("Enter no of var :"); 
        int noOfVars = scanner.nextInt(); 

        LinkedHashMap<String, String> map = new LinkedHashMap<>(); 
        for (int i = 0; i < noOfVars; i++) { 
            System.out.println("Enter var name :"); 
            String nm = scanner.next().trim(); 
            System.out.println("Enter data type :"); 
            String dt = scanner.next().trim(); 
            map.put(nm, dt); 
        } 

        System.out.println("Enter name of function :"); 
        String funname = scanner.next().trim(); 

        System.out.println("Select access specifier :"); 
        String funspec = scanner.next().trim(); 

        System.out.println("Enter return type :"); 
        String rtype = scanner.next().trim(); 

        GenerateBoiler.generateBoiler(pkg, specifier, classname, map, funspec, rtype, funname); 
        scanner.close(); 
    } 
}