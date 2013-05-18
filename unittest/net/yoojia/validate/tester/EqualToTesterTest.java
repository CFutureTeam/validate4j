/**
 * author : 桥下一粒砂 (chenyoca@gmail.com)
 * date   : 13-5-17
 * TODO
 */
package net.yoojia.validate.tester;

import net.yoojia.validate.support.EqualsToTester;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class EqualToTesterTest {

    EqualsToTester tester = new EqualsToTester();

    @Test
    public void passed() {
        assertTrue(tester.test(1,1).passed);
        assertTrue(tester.test(10086,10086).passed);
        assertTrue(tester.test(1987.987,1987.987).passed);
        assertTrue(tester.test(1.9f,1.9f).passed);
        assertTrue(tester.test("ddd","ddd").passed);
        assertTrue(tester.test(true,true).passed);
        assertTrue(tester.test(new String("abc"),new String("abc")).passed);
        assertTrue(tester.test(new Integer(10098),new Integer(10098)).passed);
    }

    @Test
    public void notPass() {
        assertFalse(tester.test("a", 1).passed);
        assertFalse(tester.test("a", 198.f).passed);
        assertFalse(tester.test(new String("ddd"), new String("aaaa")).passed);
    }
}
