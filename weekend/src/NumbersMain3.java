public class NumbersMain3 {

	public static void main(String[] args) {
	// A static member can be initialised at
	// the place of declaration
	// static int num=10;
	// another way is thru static block
   // static {
		   //num=10;
		//}
		System.out.println(Numbers3.staticNum);
        Numbers3.staticNum=1000;
        System.out.println(Numbers3.staticNum);
		// System.out.println(Numbers2.num);
	   Numbers3 number=new Numbers3();
	   System.out.println(number.num);
	}

}
