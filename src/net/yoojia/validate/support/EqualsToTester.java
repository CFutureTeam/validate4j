package net.yoojia.validate.support;

import net.yoojia.validate.internal.TestResult;

/**
 * author : 桥下一粒砂 (chenyoca@gmail.com)
 * date   : 2013-5-16
 * 判断两个参数是否相等
 */
public class EqualsToTester extends Tester<Object,Object> {

    final static String messageT = "Please enter the same value again.";

    @Override
    public TestResult test(Object input, Object... args) {
        Object equalsTo = args[0];
        boolean passed = equalsTo.equals(input);
        String message = passed ? null : messageT;
        return new TestResult(passed,message);
    }
}
