public class Numbers{
      private int num[];
      private int min;
	public int[] getNum() {
		return num;
	}
	public void setNum(int[] num) {
		this.num = num;
	}
	public int getMin() {
		min=num[0];
		for(int i=0;i<num.length;i++)
		{
			if(num[i]<min)
			{
				min=num[i];
			}
		}
		return min;
	}
