
import org.junit.jupiter.api.Test;

import junit.framework.TestCase;

class StringCalculatorTest extends TestCase{
	public static void main(String args[]) {
	      org.junit.runner.JUnitCore.main("is.ru.stringcalculator.StringCalculatorTest");
	    }

	@Test
	void test_1() {
		 
		assertEquals(StringCalculator.add(""),0);
		
		
	}
	@Test
	void test_2() {
		
		assertEquals(StringCalculator.add("1"),1);
		
		
	}
	@Test
	void test_3() {
		
		assertEquals(StringCalculator.add("1,2"),3);
		
		
	}
	@Test
	void test_4() {
	
		assertEquals(StringCalculator.add("1,2,8"),11);
		
		
	}
	
	@Test
	void test_5() {
		
		assertEquals(StringCalculator.add("1,5,10,122,8"),146);
		
		
	}
	
	@Test
	void test_6() {
		
		assertEquals(StringCalculator.add("1\n2,3"),6);
		
		
	}
	@Test
	void test_7() {
		
		assertEquals(StringCalculator.add("//;\n1;2"),3);
		
		
	}
	@Test
    void test_8(){
		try {
			StringCalculator.add("-1,2");
		}
		catch (IllegalArgumentException e){
			assertEquals(e.getMessage(), "negatives not allowed: -1");
		}

		try {
			StringCalculator.add("1,-2,4,-6");
		}
		catch (IllegalArgumentException e){
			assertEquals(e.getMessage(), "negatives not allowed: -2,-6");
		}
    }
	
	//Failing Test case
	@Test
	void test_9() {
		
		assertFalse(StringCalculator.GetCalledCount()==3);
	}
	
	@Test
	void test_10() {
	
		assertEquals(StringCalculator.add("2,1001"),2);
	}
	
	

}

