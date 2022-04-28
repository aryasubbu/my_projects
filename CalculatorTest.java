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
	public void twonumbers()
	{
		assertEquals(cal.calcuate("1,2"),3);
	}
	
	public void twonumbersnewlinedelimit()
	{
		assertEquals(cal.calcuate("1\n2"),3);
	}

}
