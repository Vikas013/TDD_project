
import org.junit.jupiter.api.Test;

import junit.framework.TestCase;

class StringCalculatorTest extends TestCase{

	@Test
	void test_1() {
		StringCalculator s = new StringCalculator();
		assertEquals(s.add(""),0);
		
		
	}
	@Test
	void test_2() {
		StringCalculator s = new StringCalculator();
		assertEquals(s.add("1"),1);
		
		
	}
	@Test
	void test_3() {
		StringCalculator s = new StringCalculator();
		assertEquals(s.add("1,2"),3);
		
		
	}
	@Test
	void test_4() {
		StringCalculator s = new StringCalculator();
		assertEquals(s.add("1,2,8"),11);
		
		
	}
	

}

