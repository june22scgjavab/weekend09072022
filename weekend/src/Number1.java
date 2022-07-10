public class Number1{
  private int num[];
  private int sum;

 public void setNum(int num[])
  {
     this.num=num;
  }

 public int add(){
   
    for(int i=0;i<num.length;i++){
       sum+=num[i];
     }
     return sum;   
   }
}