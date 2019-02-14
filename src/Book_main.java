public class Book_main {
    public static void main(String[] args) {
        System.out.println("sample book..");
        Book_App ba=new Book_App("Java_book","ayaleneh","about love",15.00,true);
        ba.getDispaly();
        Book_dynamics bd=new Book_dynamics();
        bd.Book();
    }
}
