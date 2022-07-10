public class BookMain{
   public static void main(String args[]) {
     Book book=new Book();
     /* book.setData("B0001","Java",600);
     book.displayData(); */
     book.setId("B0001");
     book.setTitle("Java");
     book.setPrice(600);
     String id=book.getId();
     String title=book.getTitle();
     float price=book.getPrice();
     System.out.println(id);
     System.out.println(title);
     System.out.println(price);  
  }
 }