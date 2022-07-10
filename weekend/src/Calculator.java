public class Calculator {
private int num1;
private int num2;
private int result;
// Here the return type is void and
// method with parameters and
// parameters are having datatype as int
public void setData(int n1, int n2)
{
	num1=n1;
	num2=n2;
}
// Here the return type is void and
// method is not passed with any parameter
/* public void add()
{
	result=num1+num2;
	System.out.println(result);
}*/


public int add()
{
	result=num1+num2;
	return result;
}

}

