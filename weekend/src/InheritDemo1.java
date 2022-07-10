public class InheritDemo1{
    public static void main(String args[]){
      Parent1 parent=new Parent1();
      parent.displayParent();
      //parent.displayChild();
      Child1 child=new Child1();
      child.displayParent();
      child.displayChild();
     }
  }