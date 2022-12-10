public class Test {
    public static void main(String args[]){
        Book b1 = new Book(" Игра престолов ", " Fantasy ");
        Book b2 = new Book(" 451 градусов "," Антиутолий ");
        Book b3 = new Book("Наруто", "Fantasy");

        Administrator librarianAdmin = new AdministratorLibrian(" Олег ");
        ReaderSupplier readerSupplier = new ReaderSupplier(" Паша ");

        readerSupplier.takeBook(librarianAdmin, b1);
        librarianAdmin.giveBook(b2);
        readerSupplier.returnBook(librarianAdmin, b3);
        librarianAdmin.notifyOverdue(readerSupplier);
        readerSupplier.takeBook(librarianAdmin, b1);












    }
}
