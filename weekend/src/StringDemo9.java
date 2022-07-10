public class StringDemo9 {
     public static void main(String args[]) {
      String str1="welcome";
      char ch=str1.charAt(0);
      System.out.println(ch); //w
      ch=str1.charAt(2);  //l
      System.out.println(ch);
     // ch=str1.charAt(20); // java.lang.StringIndexOutOfBoundsException: String index out of range: 20
     // System.out.println(ch);
     }
  }