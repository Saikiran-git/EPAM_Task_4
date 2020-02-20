package Task_4.Clean_code;


import static org.junit.Assert.*;

import org.junit.Test;

import Task_4.Clean_code.SimpleInterest;

public class SimpleInterestTest {

	@Test
	public void test() {
		SimpleInterest s=new SimpleInterest();
		assertEquals(Double.valueOf(200.0),s.calculate_simpleinterest(1000.0,5.0,4.0));
		
	}

}