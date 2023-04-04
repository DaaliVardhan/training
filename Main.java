import java.util.ArrayList;

class Book{
    String name;
    String Author="default Author";
    Boolean isAvailable=true;
    String borrower;
    int NoDays=0;

    Book(String name){
        this.name=name;
    }

    Boolean isBookAvailable(){
        return this.isAvailable;
    }

    void setBorrower(String name){
        this.borrower = name;
    }
    String getBorrower(){
        return this.borrower;
    }

}

class Library{
    ArrayList<Book> books = new ArrayList<Book>();

    Library(){
        Book b1 = new Book("book1");
        books.add(b1);
        Book b2 = new Book("book2");
        books.add(b2);
        Book b3 = new Book("book3");
        books.add(b3);
        Book b4 = new Book("book4");
        books.add(b4);
    }

    ArrayList<String> getBooks(){
        ArrayList<String> ans=new ArrayList<>();
        books.forEach((item)->{
            ans.add(item.name);
        });
        return ans;
    }

    Boolean isBookAvailable(String name){
        for (Book book : books) {
            if (book.name==name) return true;
        }
        return false;
    }

    void add_book(String name){
        this.books.add(new Book(name));
    }  


}

class User{
    String name;
    String id;
    User(String name,String id){
        this.name=name;
        this.id=id;
    }
    
}

public class Main{
    public static void main(String[] args) {
        Library l = new Library();
        var d = l.getBooks();
        d.forEach((item)-> System.out.print(item+" "));
    }
}