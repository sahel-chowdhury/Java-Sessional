
class LibraryBook {
    String title;
    String author;
    int bookID;

    LibraryBook(String title, String author, int bookID) {
        this.title = title;
        this.author = author;
        this.bookID = bookID;
    }

    
    void displayBookInfo() {
        System.out.println("Book Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Book ID: " + bookID);
    }

    
    public static void main(String[] args) {
        LibraryBook b1 = new LibraryBook("Java Programming", "Herbert Schildt", 1001);
        LibraryBook b2 = new LibraryBook("Python Basics", "Mark Lutz", 1002);

        System.out.println("--- Book 1 Details ---");
        b1.displayBookInfo();

        System.out.println("\n--- Book 2 Details ---");
        b2.displayBookInfo();
    }
}
