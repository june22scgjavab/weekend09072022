public class SportStudentTester
{
	public static void main(String s[])
	{
		SportStudent ss1=new SportStudent("Ashish",70,80,"FootBall");
		ss1.displayStudentInfo();
		System.out.println("Sports Name : "+ss1.getSportName());
	}
}