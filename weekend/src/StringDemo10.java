public class StringDemo10 {
     public static void main(String args[]) {
      String str1="welcome";
      String subString1=str1.substring(3); // Start from the 3rd position of String till the end of the String
      System.out.println(subString1); //come
      String subString2=str1.substring(2,4); // 2==> startIndex, 4===> endIndex(endIndex-1) //lc
      System.out.println(subString2);
     }
  }