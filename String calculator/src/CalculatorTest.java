import static org.junit.Assert.assertEquals;

import org.junit.platform.commons.annotation.Testable;

@Testable
public class CalculatorTest {
	
	public void emptyStringTestCase()
	{
		
		calculatorMaster cal=new calculatorMaster();
		assertEquals(cal.calcuate(""),0);
	}

}
