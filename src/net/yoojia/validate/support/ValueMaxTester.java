package net.yoojia.validate.support;

import net.yoojia.validate.internal.TestResult;

/**
 * author : 桥下一粒砂 (chenyoca@gmail.com)
 * date   : 2013-5-16
 * 最大值验证器
 */
public class ValueMaxTester extends Tester<Double,Double> {

    final static String messageT = "Please enter a value less than or equal to %.2f.";

    @Override
    public TestResult test(Double input, Double... args) {
        double maxValue = args[0];
        boolean passed = input <= maxValue;
        String message = passed ? null : String.format(messageT,maxValue);
        return new TestResult(passed,message);
    }
}
