public class Student4
{
	private int roll;
	private String name;
	private static String[] subject;
	 
	
	static
	{
	subject=new String[]{"Mathematics","Science","English"};
	}

	public Student4(int roll,String name)
	{
		this.roll=roll;
		this.name=name;
	}

	public int getRoll(){return roll;}
	public void setRoll(int roll){this.roll=roll;}
	public String getName(){return name;}
	public void setName(String name){this.name=name;}

	public static String getSubject(int index){return subject[index];}
	public static void setSubject(int index,String subject){Student4.subject[index]=subject;}

	public void display()
	{
		System.out.println("Roll Number : "+roll);
		System.out.println("Name : "+name);
		for(int i=0;i<3;i++)
		{
			System.out.println("Subject  "+(i+1)+" : "+subject[i]);
		}
		
		System.out.println("\n\n");
	}
}

