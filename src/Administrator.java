public interface Administrator {
      //просроченное уведомление у читателя
      void giveBook(Book book);
      void notifyOverdue(Reader reader);
}
