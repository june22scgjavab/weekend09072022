class Student
{
	private int roll;
	private String name;
	private static String subject1="Mathematics";
	private static String subject2="Science";
	private static String subject3="English";

	public Student(int roll,String name)
	{
		this.roll=roll;
		this.name=name;
	}

	public int getRoll(){return roll;}
	public void setRoll(int roll){this.roll=roll;}
	public String getName(){return name;}
	public void setName(String name){this.name=name;}
	
	public void display()
	{
		System.out.println("Roll Number : "+roll);
		System.out.println("Name : "+name);
		System.out.println("Subject 1 : "+subject1);
		System.out.println("Subject 2 : "+subject2);
		System.out.println("Subject 3 : "+subject3);
		System.out.println("\n\n");
	}
}