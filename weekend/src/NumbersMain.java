
 public class NumbersMain{
    public static void main(String[] args){
    int num[]={100,2,2,4,8,20,30,67,9,10};
    Numbers numbers=new Numbers();
    numbers.setNum(num);
    int min=numbers.getMin();
    System.out.println("The numbers are");
    num=numbers.getNum();
    for(int n : num)
    {
    	System.out.println(n);
    }
    
    System.out.println("The minimum value "+min);
   }
  }