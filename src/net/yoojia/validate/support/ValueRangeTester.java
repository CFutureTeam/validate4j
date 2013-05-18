package net.yoojia.validate.support;

import net.yoojia.validate.internal.TestResult;

/**
 * author : 桥下一粒砂 (chenyoca@gmail.com)
 * date   : 2013-5-16
 * 最值区间验证器
 */
public class ValueRangeTester extends Tester<Double,Double> {

    final static String messageT = "Please enter value in [ %.0f, %.0f ].";

    @Override
    public TestResult test(Double input, Double... args) {
        double minValue = args[0];
        double maxValue = args[1];
        boolean passed = (input >= minValue && input <= maxValue);
        String message = passed ? null : String.format(messageT,minValue,maxValue);
        return new TestResult(passed,message);
    }
}
