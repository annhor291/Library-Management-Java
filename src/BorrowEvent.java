import java.time.LocalDate;

public class BorrowEvent implements LibraryEvent{
    @Override
    public void execute(Book book) {
        book.setIsBorrowed(true);
        book.setBorrowDate(LocalDate.now());
        System.out.println( book.getTitle() + " Đã được mượn");
    }
}
