package net.yoojia.validate.tester;

import junit.framework.Assert;
import net.yoojia.validate.support.LengthMinTester;
import net.yoojia.validate.util.StringGenerator;
import org.junit.Test;

public class MinLengthTesterTest {

	LengthMinTester tester = new LengthMinTester();
	
	@Test
	public void passed() {
		for(int i=0;i<100;i++){
			Assert.assertTrue(tester.test(StringGenerator.genString(i), i).passed);
			Assert.assertTrue(tester.test(StringGenerator.genString(i+3), i).passed);
		}
	}
	
	@Test
	public void notPassed() {
		Assert.assertFalse(tester.test("abc",4).passed);
		Assert.assertFalse(tester.test("aaaa",100).passed);
	}

}
