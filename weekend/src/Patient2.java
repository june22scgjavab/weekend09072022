public class Patient2 {
  private int age;
  private String name;
  private String gender;
 
   public void makeAppointment(Appointment app){
      Appointment appo=app;
      appo.setDate("11-Jun-2022");
      
      
   }

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getGender() {
	return gender;
}

public void setGender(String gender) {
	this.gender = gender;
}
   
   
}


