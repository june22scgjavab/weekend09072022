 class WhileLoopDemo1 {
      public static void main(String []str){
        int ctr=0;  //intialisation of some variable which will decide whether to enter the loop or not.
       while(ctr<10) //condition check which decides to enter the loop initially and latter whether                        //to be within the loop or to move out of the loop 
         {
         System.out.println(ctr);
         ctr++;  //Reinitialisation of the variable so that the value of the variable changes and          whose changed value will decide whether to remain within the loop or to move out of the loop.
     
         }
         System.out.println("Out of the loop");
     }
  } 