import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		try {
			
			Connection connection = null;
			 Statement stmt = null;
			ResultSet rSet = null;
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/library", "root", "root");
		
			stmt = connection.createStatement();
			rSet = stmt.executeQuery("Select * from users");
			while(rSet.next()) {
				System.out.println(rSet.getString(1) + " | " + rSet.getString(2) + " | " + rSet.getString(3) + " | " + rSet.getString(4) + " | " + rSet.getDouble(5));
				System.out.println("---------------------------------------------------------------------");
			}
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
	
//		Map<Integer,Book> map = new HashMap<>();
//		
//		Scanner sc = new Scanner(System.in);		
//		Menu sCase = Menu.ADD;
//		
//		while(sCase.getMenuNumber()!=4) {
//			
//			System.out.println("Enter Operation: 1.Add, 2.Display, 4. Exit");			
//			int input = sc.nextInt();
//	        
//			for(Menu option : Menu.values()) {
//				if(option.getMenuNumber() == input) {
//					sCase = option;
//					break;
//				}
//			}
//		
//		switch(sCase) {
//		case ADD:
//		{
//			System.out.println("Enter Book Name: ");
//			sc.nextLine();
//			String name=sc.nextLine();
//			
//			System.out.println("Enter Book Author: ");
//			String author=sc.nextLine();
//			
//			System.out.println("Enter Book Year of Publication: ");
//			int year=sc.nextInt();
//			
//			System.out.println("Enter Book Available Stock: ");
//			int stock = sc.nextInt();
//			
//			System.out.println("Enter Genre: "
//					+ "TECHNOLOGY(1),\r\n"
//					+ "	LAW(2),\r\n"
//					+ "	FANTASY(3),\r\n"
//					+ "	MYTHOLOGY(4),\r\n"
//					+ "	ROMANCE(5),\r\n"
//					+ "	CRIME(OGY(7),\r\n"
//					+ "	SCIENCE(8);6),\r\n"
//					+ "	PSYCHOLOGY(7),\r\n"
//					+ "	SCIENCE(8);");
//			
//			int option = sc.nextInt();
//			Genre tempGenre=null;
//			
//			for(Genre genre: Genre.values()) {
//				if(genre.getChoice()==option) {
//					tempGenre=genre;
//					break;
//				}
//			}
//			
//			map.put(Book.getBookId(), new Book(name, author, year, stock, tempGenre));
//		}
//			break;
//		case DISPLAY:
//			
//			for(int key:map.keySet()) {
//				System.out.println(map.get(key));
//			}
//			break;
//		
//		case EXIT:
//			System.out.println("Thanks for using Library Management ! ");
//			break;
//		default:
//			break;
//		
//		}
//		}
//		
//		sc.close();
	}
//	
	

}
