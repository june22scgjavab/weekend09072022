public class Numbers4{
 int num;
static int staticNum;

static{
 staticNum=100;
 System.out.println("static block is called");
}
 
Numbers4(int num, int num2){
  this.num=num;
  this.staticNum=num2;
  System.out.println("I am the parameterized constructor");
}

void dispData(){
  System.out.println(num);
  System.out.println(staticNum);
}
}


