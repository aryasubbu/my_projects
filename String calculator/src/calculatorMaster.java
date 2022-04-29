
public class calculatorMaster {
 
	public static void main(String[] args) {


	}

	public Object calcuate(String string) throws Exception {
		String [] numbers=string.split(",|\n");
      if(string.isEmpty())
      {
    	  return 0;
      }else
      {
		return getsum(numbers);
      }
	}

	private int  getsum(String[] numbers) throws Exception {
		
		
		int sum=0;
		for(int i=0;i<numbers.length;i++)
		{
			if(Integer.parseInt(numbers[i])>0)
			sum=sum+Integer.parseInt(numbers[i]);
			else
			{
				throw new Exception("Negatives not allowed");
			}
		}
		return sum;
	}

}
