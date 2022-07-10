  public class Base1 {
    private int num;
       
    public void setBase(int num){
      this.num=num;
    }
    private void disp(){
      System.out.println("The private method");
     }
    public void dispBase(){
      System.out.println(num);
    }
}