

// As we decided that result is not used by any other method so let use declare it 
// within the add method.

public class Calculator2 {
private int num1;
private int num2;

public void setData(int n1, int n2)
{
	num1=n1;
	num2=n2;
}


public int add()
{
       // Result here is a local variable and it cannot be accessed by any other method of the Calculator2
      // class
	int result=num1+num2;
	return result;
}

}
