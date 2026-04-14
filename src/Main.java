public class Main {
    public static void main(String[] args) {
        Library lib = new Library();

        Book b = new Book();
        b.setTitle("C++");
        b.setYear(2000);
        b.setAuthor("An");
        lib.addBook(b);

        Book b1 = new Book();
        b1.setTitle("Java");
        b1.setYear(2000);
        b1.setAuthor("Minh");
        lib.addBook(b1);

        EBook eb = new EBook();
        eb.setTitle("Python");
        eb.setYear(2010);
        eb.setAuthor("Toàn");
        eb.setFileFormat("PDF");
        eb.setFileSize(5.2);
        lib.addBook(eb);

        lib.displayBooks();

        lib.handleEvent(b, new BorrowEvent());

        lib.handleEvent(b, new ReturnEvent());
    }
}