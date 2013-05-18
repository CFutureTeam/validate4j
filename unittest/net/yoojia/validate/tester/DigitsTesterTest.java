/**
 * author : 桥下一粒砂 (chenyoca@gmail.com)
 * date   : 13-5-17
 * TODO
 */
package net.yoojia.validate.tester;

import net.yoojia.validate.support.DigitsTester;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class DigitsTesterTest {

    DigitsTester tester = new DigitsTester();

    @Test
    public void passed(){
        assertTrue(tester.test("123").passed);
        assertTrue(tester.test("123343434").passed);
        assertTrue(tester.test("00000").passed);
    }

    @Test
    public void notPass(){
        assertFalse(tester.test("aaa123").passed);
        assertFalse(tester.test("###123343434").passed);
        assertFalse(tester.test("abc").passed);
    }
}
