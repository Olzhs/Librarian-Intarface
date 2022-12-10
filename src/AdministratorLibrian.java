public class AdministratorLibrian extends User implements Administrator,Librarian {
    public AdministratorLibrian(String name) {
        super(name);
    }
    @Override
    public void giveBook(Book book){
        System.out.println("Библеотекарь " + getName() + " дал читателю книгу " + book.getName());
    }

    @Override
    public void notifyOverdue(Reader reader){
        System.out.println("Библеотекарь " + getName() + " уведомил читателя " +((User)reader).getName() + "об истечений арендв") ;
    }
    @Override
    public void orderBook(String book, BookSupplier supplier){
        System.out.println("Библеотекарь " + getName() + " заказал у постовщика " + ((User)supplier).getName() + "книгу " + book);
    }
}
