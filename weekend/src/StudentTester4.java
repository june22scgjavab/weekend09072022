public class StudentTester4
{
	public static void main(String s[])
	{
		int index=1;
		Student4 s1=new Student4(101,"Anil");
		Student4 s2=new Student4(102,"Pooja");
		s1.display();
		s2.display();
		Student4.setSubject(index,"Social Science");
		System.out.println("changed subject "+Student4.getSubject(index));
		System.out.println("\n\n");
		s1.display();
		s2.display();

	}
}