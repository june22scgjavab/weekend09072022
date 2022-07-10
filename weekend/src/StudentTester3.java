public class StudentTester3
{
	public static void main(String s[])
	{
		Student3 s1=new Student3(101,"Anil");
		Student3 s2=new Student3(102,"Pooja");
		s1.display();
		s2.display();
		Student3.setSubject1("JAVA");
		System.out.println("changed subject "+Student3.getSubject1());
		System.out.println("\n\n");
		s1.display();
		s2.display();

	}
}