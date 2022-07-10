class ArrayDemo7 {
  public static void main(String args[]) {
  int numbers[][]=new int[3][4];
  
  for(int row=0;row<numbers.length;row++){
    for(int col=0;col<numbers[row].length;col++){
         System.out.print(numbers[row][col]);
         }
       System.out.println();
     }
  }
}