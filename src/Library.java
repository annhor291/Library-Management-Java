import java.util.ArrayList;
public class Library {
    private ArrayList<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book){
        books.add(book);
    }

    public void removeBookByTitle(String title){
        for(int i = 0; i < books.size(); i++){
            if(books.get(i).getTitle().equalsIgnoreCase(title)){
                books.remove(i);
                System.out.println("Đã xóa " + title);
                return;
            }
        }
        System.out.println("Không tìm thấy sách");
    }

    public void displayBooks(){
        if(books.isEmpty()){
            System.out.print("Thư viện trống");
            return;
        }
        for(int i = 0; i < books.size(); i++){
            Book b = books.get(i);
            System.out.println(b);
        }
    }

    public void handleEvent(Book book, LibraryEvent event){
        event.execute(book);
    }

}
