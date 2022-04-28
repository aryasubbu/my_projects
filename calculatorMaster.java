
public class calculatorMaster {

	public static void main(String[] args) {


	}

	public Object calcuate(String string) {

	String [] numbers=string.split(",|\n");
      if(string.isEmpty())
      {
    	  return 0;
      }
      else
      {
	return numbers[0]+numbers[1];
      }
	}

}
