
public class calculatorMaster {

	public static void main(String[] args) {


	}

	public Object calcuate(String string) {
		String [] numbers=string.split(",|\n");
      if(string.isEmpty())
      {
    	  return 0;
      }else
      {
		return getsum(numbers);
      }
	}

	private int  getsum(String[] numbers) {
		int sum=0;
		for(int i=0;i<numbers.length;i++)
		{
			sum=sum+Integer.parseInt(numbers[i]);
		}
		return sum;
	}

}
