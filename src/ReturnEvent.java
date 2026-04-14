import java.time.LocalDate;

public class ReturnEvent implements LibraryEvent{
    @Override
    public void execute(Book book) {
        book.setIsBorrowed(false);
        book.setReturnDate(LocalDate.now());
        System.out.println(book.getTitle() + " Đã được trả");
    }
}
