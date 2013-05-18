package net.yoojia.validate.tester;

import junit.framework.Assert;
import net.yoojia.validate.internal.TestResult;
import net.yoojia.validate.support.LengthRangeTester;
import net.yoojia.validate.util.StringGenerator;
import org.junit.Test;

public class RangeLengthTesterTest {
	
	LengthRangeTester tester = new LengthRangeTester();

	@Test
	public void passed() {
		
		for(int i=1;i<10;i++){
			TestResult result = tester.test(StringGenerator.genString(i), 0,i);
			if(!result.passed){
				System.err.println(result.message);
			}
			Assert.assertTrue(result.passed);
		}
	}
	
	@Test
	public void notPassed(){
		Assert.assertFalse(tester.test(StringGenerator.genString(10), 0,5).passed);
		Assert.assertFalse(tester.test(StringGenerator.genString(4), 6,100).passed);
	}

}
