public class Numbers6{
 int num;
static int staticNum;

static{
 staticNum=100;
 System.out.println("static block is called");
}
 
Numbers6(int num, int num2){
  this.num=num;
  this.staticNum=num2;
  System.out.println("I am the parameterized constructor");
}

void dispData(){
  System.out.println(num);
  //System.out.println(staticNum);
}

static void dispStatic(){
  //System.out.println(num);
  // Number6 number=new Number6();
  //System.out.println(number.num);
   System.out.println(staticNum);
}

}


