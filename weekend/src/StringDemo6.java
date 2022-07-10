   public class StringDemo6 {
     public static void main(String args[]) {
      String str1="hello";
      String str2="hello";
      String str3=new String("hello");
      String str4=new String("hello");
      System.out.println(str1==str2);  // true   == checks whether the reference variable are pointing to the same object or not
      System.out.println(str3==str4);  // false
      System.out.println(str1.equals(str2)); // true  // equals will check for the content , whether the content of the objects are same or not.

      System.out.println(str3.equals(str4)); // true
    }
  }