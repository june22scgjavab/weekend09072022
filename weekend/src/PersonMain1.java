public class PersonMain1 {
   public static void main(String args[]) {
      Address1 address[]=new Address1[2];
      Person1 person=new Person1();
      Name1 name=new Name1();
      address[0]=new Address1();
      address[0].setHno("A/22");
      address[0].setStreetName("Park Street");
      address[0].setLocality("Central Kolkata");
      address[0].setCity("Kolkata");
      address[1]=new Address1();
      address[1].setHno("111");
      address[1].setStreetName("Jawahar Street");
      address[1].setLocality("Hind market");
      address[1].setCity("Srinagar");
      name.setFirstName("Raman");
      name.setMiddleName("Kumar");
      name.setLastName("Verma");
      person.setAge(20);
      person.setName(name);
      person.setAddress(address);
      System.out.println("The details");
      System.out.println(person.getAge());
      name=person.getName();
      System.out.println(name.getFirstName());
      System.out.println(name.getMiddleName());
      System.out.println(name.getLastName());
      address=person.getAddress();
      for(Address add : address){
        System.out.println(add.getHno());
        System.out.println(add.getStreetName());
        System.out.println(add.getLocality());
        System.out.println(add.getCity());
       }
   }
 }