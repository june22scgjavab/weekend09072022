public class NumbersMain2 {

	public static void main(String[] args) {
	// A static member can be accessed with the
		// class we dont require an object to 
		// access a static member
		System.out.println(Numbers2.staticNum);
   // A non static member cannot be access with the 
   // class , for accessing a non static member
	// we have create the object of the class
	// which is having the non static member
		
		// System.out.println(Numbers2.num);
	   Numbers2 number=new Numbers2();
	   System.out.println(number.num);
	}

}