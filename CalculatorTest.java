import static org.junit.Assert.assertEquals;

import org.junit.platform.commons.annotation.Testable;

@Testable
public class CalculatorTest {
	
	
	private calculatorMaster cal;
	
	public void init()
	{
		cal=new calculatorMaster();
	}
	public void emptyStringTestCase()
	{

		
		assertEquals(cal.calcuate(""),0);
	}
	
	public void singlevalue()
	{
		assertEquals(cal.calcuate("1"),1);
	}

}
