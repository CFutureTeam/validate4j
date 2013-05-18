package net.yoojia.validate.support;

import net.yoojia.validate.internal.TestResult;

/**
 * author : 桥下一粒砂 (chenyoca@gmail.com)
 * date   : 13-5-17
 * 在列表中验证器
 */
public class InListTester extends Tester<Object,Object> {

    public static final String messageT = "This field not in accept list.";

    @Override
    public TestResult test(Object input, Object... args) {
        boolean passed = false;
        for(Object item : args){
            passed |= input.equals(item);
        }
        String message = passed ? null : messageT;
        return new TestResult(passed, message);
    }

}
