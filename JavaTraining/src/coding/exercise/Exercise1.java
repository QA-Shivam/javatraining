package coding.exercise;

public class Exercise1 {

	String bookName;
	String authotName;
	static int totalBooks = 0;

	public Exercise1(String bookName, String authotName) {
		this.bookName = bookName;
		this.authotName = authotName;
		totalBooks++;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthotName() {
		return authotName;
	}

	public void setAuthotName(String authotName) {
		this.authotName = authotName;
	}

	public static int getTotalBooks() {
		return totalBooks;
	}

	public static void setTotalBooks(int totalBooks) {
		Exercise1.totalBooks = totalBooks;
	}

	public static void main(String[] args) {
		Exercise1 book1 = new Exercise1("Autonomy", "Shivam");
		Exercise1 book2 = new Exercise1("Science", "Rohit");
		System.out.println("Book 1: " + book1.getBookName() + " by " + book1.getAuthotName());
		System.out.println("Book 1: " + book1.getBookName() + " by " + book1.getAuthotName());
		System.out.println("Total number of books: " + Exercise1.getTotalBooks());

	}

}
