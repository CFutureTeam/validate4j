package net.yoojia.validate.tester;

import junit.framework.Assert;
import net.yoojia.validate.support.RegexTester;
import org.junit.Test;

public class RegexTesterTest {
	
	RegexTester tester = new RegexTester();

	@Test
	public void passed() {
		Assert.assertTrue(tester.test(0,"\\d*").passed);
		Assert.assertTrue(tester.test(10086,"\\d*").passed);
		
		Assert.assertTrue(tester.test("A","[a-zA-Z]*").passed);
		Assert.assertTrue(tester.test("Apple","[a-zA-Z]*").passed);
	}
	
	@Test
	public void notPass(){
		Assert.assertFalse(tester.test("10086","[a-zA-Z]*").passed);
		Assert.assertFalse(tester.test("false","\\d*").passed);
	}

}
