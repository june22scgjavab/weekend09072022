public class StringDemo2 {

   public static void main(String args[]) {
   String str1="hello"; // In this line hello is a string literal/constant
   // So when we writing the above line, it will first check whether we 
   // have hello in the String constant pool, as in our case it is first
   // line , it wont find "hello" in the string pool. So this constant(hello) is placed 
   // in the string pool
  String str2="hello"; // For this line again a check is done in the String constant pool,
  // this time a string literal "hello" is found in the pool. So now the reference variable
  // str2 will also point to the same string literal hello which got created before.
   System.out.println(str1==str2);
  }
} 

