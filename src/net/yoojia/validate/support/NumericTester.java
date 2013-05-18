package net.yoojia.validate.support;

import net.yoojia.validate.internal.Rule;

/**
 * author : 桥下一粒砂 (chenyoca@gmail.com)
 * date   : 2013-5-16
 * 判断是否为数字
 */
public class NumericTester extends TesterWithRegex {

    static final String NUMBER_REGEX = "^-?(?:\\\\d+|\\\\d{1,3}(?:,\\\\d{3})+)?(?:\\\\.\\\\d+)?$";

    static final String messageT = "Please enter a valid number.";

    public NumericTester() {
        super(Rule.Numeric, NUMBER_REGEX, messageT);
    }
}
