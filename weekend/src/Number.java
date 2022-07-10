public class Number {
    private int num;
    private boolean isEven;
     public boolean isEvenMethod(){
         if(num%2==0)
         {
        	isEven=true; 
         }
        // If we are not writing isEven with else as false, 
        // than also it will work because the default value
         // in boolean variable is false
         else
         {
        	 isEven=false;
         }
    	 return isEven;
     }
     public void setNumber(int n){
       num=n;
      }
  }