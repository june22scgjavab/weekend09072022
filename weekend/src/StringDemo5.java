public class StringDemo5 {
  public static void main(String args[]) {
    String str1="Hello";
    String str2="World";
    String str3=str1+str2;
    System.out.println(str3);
    String str4=str1.concat(str2);
    System.out.println(str4);
    String str5=str1+" "+str2;
    System.out.println(str5);
    String str6=str1.concat(" ").concat(str2);
          // Hello(space is concatenated
          // Hello World
    System.out.println(str6);
  }
 }