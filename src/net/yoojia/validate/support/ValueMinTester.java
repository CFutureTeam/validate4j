package net.yoojia.validate.support;

import net.yoojia.validate.internal.TestResult;

/**
 * author : 桥下一粒砂 (chenyoca@gmail.com)
 * date   : 2013-5-16
 * 最小值验证器
 */
public class ValueMinTester extends Tester<Double,Double> {

    final static String messageT = "Please enter a value greater than or equal to %.2f.";

    @Override
    public TestResult test(Double input, Double... args) {
        double minValue = args[0];
        boolean passed = input <= minValue;
        String message = passed ? null : String.format(messageT,minValue);
        return new TestResult(passed,message);
    }
}
