package net.yoojia.validate.tester;

import net.yoojia.validate.support.URLTester;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class URLTesterTest {

	URLTester tester = new URLTester();
	
	@Test
	public void passed() {
		assertTrue(tester.test("http://www.baido.com").passed);
		assertTrue(tester.test("http://www.baido.com/logo.png").passed);
		assertTrue(tester.test("https://www.baido.com").passed);
		assertTrue(tester.test("http://stackoverflow.com/questions/123559/a-comprehensive-regex-for-phone-number-validation").passed);
		assertTrue(tester.test("https://www.google.com.hk/search?newwindow=1&safe=strict&biw=1814&bih=963&q=phone+number+regex+pattern&oq=phone+regex+patt&gs_l=serp.3.1.0i19j0i8i30i19j0i5i30i19j0i8i30i19l2j0i5i30i19j0i8i30i19l2.2719540.2728868.0.2731221.16.15.0.1.1.0.213.1945.0j9j2.11.0...0.0...1c.1.9.serp.G5I1V2oogfc").passed);
		assertTrue(tester.test("ftp://www.baidoo.com/abc.png").passed);
	}
	
	@Test
	public void notPassed() {
		assertFalse(tester.test("wget://abc.com").passed);
		assertFalse(tester.test("httpd://abc.111111dm").passed);
		assertFalse(tester.test("XXXX").passed);
		assertFalse(tester.test("thunder://ssssss").passed);
	}

}
