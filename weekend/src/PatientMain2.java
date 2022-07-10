public class PatientMain2 {
  public static void main(String args[]){
   Appointment appointment=new Appointment();
   appointment.setId(1);
   System.out.println(appointment.getId());    // 1
   System.out.println(appointment.getDate());  // null

   Patient2 patient=new Patient2();
   patient.setAge(30);
   patient.setName("Romesh");
   patient.setGender("Male");
   patient.makeAppointment(appointment);
   System.out.println("the details");
   System.out.println(patient.getAge());
   System.out.println(patient.getName());
   System.out.println(appointment.getId());  //1
   System.out.println(appointment.getDate()); //11-Jun-2022
 }
}