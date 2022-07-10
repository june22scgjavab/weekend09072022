class OperatorDemo8 {
   public static void main(String args[]) {
   int num1=1;
   int num2=2;
   int num3=3;
   System.out.println(num2>num1 && num3>num2);   // true
   System.out.println(num2>num1 || num3>num2);  // true
   System.out.println(num1>num2  && num3>num2);  // false && true===> false
   System.out.println(num1>num2  || num3>num2); //  false || true ===> true
   System.out.println(num1>num2  && num2>num3);  // false && false==> false
   System.out.println(num1>num2  || num2>num3);  // false || false ===> false
  }
 } 