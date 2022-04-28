import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.platform.commons.annotation.Testable;

@Testable
public class CalculatorTest {

	
	private calculatorMaster cal;
	
	public void init()
	{
		cal=new calculatorMaster();
	}
	public void emptyStringTestCase() throws Exception
	{

		
		assertEquals(cal.calcuate(""),0);
	}
	
	public void singlevalue() throws Exception
	{
		assertEquals(cal.calcuate("1"),1);
	}
    
	public void twonumbers() throws Exception
	{
		assertEquals(cal.calcuate("1,2"),3);
	}
	public void twonumbersnewlinedelimit() throws Exception
	{
		assertEquals(cal.calcuate("1\n2"),3);
	}
	public void threenumbersnewlinedelimit() throws Exception
	{
		assertEquals(cal.calcuate("1,2,3"),6);
	}
	
	@Test(expected=Exception.class)
	public void negativenumbers() throws Exception
	{
		cal.calcuate("-1");
	}
}
