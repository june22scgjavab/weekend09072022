public class SportStudent extends StudentDetails4
{
	private String sportName;
	
	public SportStudent(String name,int marks1,int marks2,String sportName)
	{
		super(name,marks1,marks2);
		this.sportName=sportName;
		this.totalMarks=this.totalMarks+10;
		//setTotalMarks(getTotalMarks()+10);

	}
	public String getSportName(){return sportName;}
	public void setSportName(String sportName){this.sportName=sportName;}
}

