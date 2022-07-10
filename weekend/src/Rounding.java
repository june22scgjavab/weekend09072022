public class Rounding {

	public static void main(String[] args) {
		
		float f1=12.45f;
		float f2=15.67f;
		float f3=12.50f;
		float f4=18.49f;
		System.out.println(Math.round(f1));
		System.out.println(Math.round(f2));
		System.out.println(Math.round(f3));
		System.out.println(Math.round(f4));
		float f5=123.4657f;
		System.out.println(Math.round(f5));
		float f6=Math.round(f5*100)/100.0f;
	    System.out.println(f6);
	    float f7=Math.round(f5*10)/10.0f;
	    System.out.println(f7);
	}

}