package net.yoojia.validate.tester;

import junit.framework.Assert;
import net.yoojia.validate.internal.TestResult;
import net.yoojia.validate.support.LengthMaxTester;
import net.yoojia.validate.util.StringGenerator;
import org.junit.Test;

public class MaxLengthTesterTest {

	LengthMaxTester tester = new LengthMaxTester();
	
	@Test
	public void passed() {
		for(int i=5;i<100;i++){
			TestResult result = tester.test(StringGenerator.genString(i), i);
			if( !result.passed ){
				System.out.println(result.message);
			}
			Assert.assertTrue(result.passed);
			
			result = tester.test(StringGenerator.genString(i-1), i);
			if( !result.passed ){
				System.out.println(result.message);
			}
			Assert.assertTrue(result.passed);
		}
	}
	
	@Test
	public void notPassed() {
		Assert.assertFalse(tester.test("12345",4).passed);
		Assert.assertFalse(tester.test("abc",1).passed);
	}

}
