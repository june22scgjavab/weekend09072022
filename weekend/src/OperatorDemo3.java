class OperatorDemo3 {
  public static void main(String args[]) {
 
   int num=10;
   System.out.println(num); //10
   int num2=num++; // num2=num; num=num+1;
   // as it is post increment, so the value of num is first assigned to num2 and then it is incremented  
   System.out.println(num2); //10
   System.out.println(num);  //11
  }
}