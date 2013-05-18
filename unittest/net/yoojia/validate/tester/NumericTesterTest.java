package net.yoojia.validate.tester;

import junit.framework.Assert;
import net.yoojia.validate.support.NumericTester;
import org.junit.Test;

/**
 * author : 桥下一粒砂 (chenyoca@gmail.com)
 * date   : 13-5-18
 * TODO
 */
public class NumericTesterTest {

    NumericTester tester = new NumericTester();

    @Test
    public void passed(){
        // test case from http://api.jquery.com/jQuery.isNumeric/
        Assert.assertTrue(tester.test("-10").passed);
        Assert.assertTrue(tester.test(16).passed);
        Assert.assertTrue(tester.test(+99).passed);
        Assert.assertTrue(tester.test(-16).passed);
        Assert.assertTrue(tester.test(-0).passed);
        Assert.assertTrue(tester.test(Long.MAX_VALUE).passed);
        Assert.assertTrue(tester.test("123456789012L").passed);
        Assert.assertTrue(tester.test(0xFF).passed);
        Assert.assertTrue(tester.test(0xABDECF).passed);
        Assert.assertTrue(tester.test("0xFF").passed);
        Assert.assertTrue(tester.test("0xabcdef").passed);
        Assert.assertTrue(tester.test("0x89FF").passed);
        Assert.assertTrue(tester.test("8e5").passed);
        Assert.assertTrue(tester.test(3.14159f).passed);
        Assert.assertTrue(tester.test("3.14159f").passed);
        Assert.assertTrue(tester.test("3.14159d").passed);
        Assert.assertTrue(tester.test(3.14159).passed);
        Assert.assertTrue(tester.test(+10).passed);
        Assert.assertTrue(tester.test(0144).passed); // octal integer
    }

    @Test
    public void notPass(){

        Assert.assertFalse(tester.test("99,99").passed);
        Assert.assertFalse(tester.test("#abde").passed);
        Assert.assertFalse(tester.test("1.2.3").passed);
        Assert.assertFalse(tester.test("1.2zzz").passed);
        Assert.assertFalse(tester.test("0xzy123").passed);
        Assert.assertFalse(tester.test("").passed);
        Assert.assertFalse(tester.test("    123").passed);
        Assert.assertFalse(tester.test(new Object()).passed);
        Assert.assertFalse(tester.test(Double.NaN).passed);
        Assert.assertFalse(tester.test(null).passed);
        Assert.assertFalse(tester.test(true).passed);

    }
}
