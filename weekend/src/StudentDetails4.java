public class StudentDetails4
{
	private int roll;
	private String name;
	private int marks1;
	private  int marks2;
	protected float totalMarks;
	private static int counter=1;
	public StudentDetails4(){}
	public StudentDetails4(String name,int marks1,int marks2)
	{
		this.roll=StudentDetails4.counter++;
		this.name=name;
		this.marks1=marks1;
		this.marks2=marks2;
		this.totalMarks=marks1+marks2;
	}
	public int getRoll(){return roll;}
	public String getName(){return name;}
	public void setName(String name){this.name=name;}
	public float getTotalMarks(){return totalMarks;}
	public void setTotalMarks(Float marks){this.totalMarks=marks;}

	public void displayStudentInfo()
	{
		System.out.println("Roll Number : "+roll);
		System.out.println("Student Name : "+name);
		System.out.println("Marks1 : "+marks1);
		System.out.println("Marks2 : "+marks2);
		System.out.println("Total Marks : "+totalMarks);

	}
}
