
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

public class Book {
	
	public Book(String name, String author, int yearOfPublication, int avavilableStock, Genre genre) {
		super();
		this.name = name;
		this.author = author;
		this.yearOfPublication = yearOfPublication;
		this.avavilableStock = avavilableStock;
		this.genre = genre;
	}

	String name;
	String author;
	int yearOfPublication;
	int avavilableStock;
	Genre genre;
	
	private static AtomicInteger id = new AtomicInteger(1);
	
	public static int getBookId() {
		return id.getAndIncrement();
	}
	
	

	

//	private void setbookId(int bookId) {
//		bookId = bookId;
//	}

	private String getName() {
		return name;
	}

	private void setName(String name) {
		this.name = name;
	}

	private String getAuthor() {
		return author;
	}

	private void setAuthor(String author) {
		this.author = author;
	}

	private int getYearOfPublication() {
		return yearOfPublication;
	}

	private void setYearOfPublication(int yearOfPublication) {
		this.yearOfPublication = yearOfPublication;
	}

	private int getAvavilableStock() {
		return avavilableStock;
	}

	private void setAvavilableStock(int avavilableStock) {
		this.avavilableStock = avavilableStock;
	}

	private Genre getGenre() {
		return genre;
	}

	private void setGenre(Genre genre) {
		this.genre = genre;
	}

	@Override
	public int hashCode() {
		return Objects.hash(author, Integer.valueOf(avavilableStock), name, Integer.valueOf(yearOfPublication));
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(author, other.author) && avavilableStock == other.avavilableStock
				&& Objects.equals(name, other.name) && yearOfPublication == other.yearOfPublication;
	}

	@Override
	public String toString() {
		return "Book [name=" + name + ", author=" + author + ", yearOfPublication=" + yearOfPublication
				+ ", avavilableStock=" + avavilableStock + "]";
	}
	
	
}
