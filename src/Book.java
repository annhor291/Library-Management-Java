import java.time.LocalDate;

public class Book {
    private String title;
    private String author;
    private int year;

    private boolean isBorrowed;
    private LocalDate borrowDate;
    private LocalDate returnDate;

    public Book() {
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void setIsBorrowed(boolean borrow) {
        isBorrowed = borrow;
    }

    public LocalDate getBorrowDate() {
        return borrowDate;
    }

    public void setBorrowDate(LocalDate borrowDate) {
        this.borrowDate = borrowDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    public String toString() {
        return "Tựa đề: " + title + ", Tác Giả: " + author + ", Năm Xuất Bản: " + year;
    }


}
