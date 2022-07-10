import java.util.Scanner;
class ArrayDemo9 {
  public static void main(String args[]) {
  int numbers[][]=new int[3][4];
  Scanner scan=new Scanner(System.in);
  for(int row=0;row<numbers.length;row++){
    for(int col=0;col<numbers[row].length;col++){
         System.out.println("Enter the value");
         numbers[row][col]=scan.nextInt();
         }
     }
 for(int row=0;row<numbers.length;row++){
    for(int col=0;col<numbers[row].length;col++){
         System.out.print(numbers[row][col]);
        
         }
     System.out.println(); 
    }
 

 }
}