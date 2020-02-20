package Task_4.Clean_code;


import static org.junit.Assert.*;

import org.junit.Test;

import Task_4.Clean_code.SimpleInterest;
import Task_4.Clean_code.CompoundInterest;

public class CompoundInterestTest {

	@Test
	public void test() {
		SimpleInterest s=new SimpleInterest();
		assertEquals(Double.valueOf(200.0),s.calculate_simpleinterest(1000.0,5.0,4.0));
		CompoundInterest c=new CompoundInterest();
		assertEquals(Double.valueOf(216.65290240000013),c.calculate_compoundinterest(1000.0,5.0,4.0));
	}

}