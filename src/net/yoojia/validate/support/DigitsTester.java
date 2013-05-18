package net.yoojia.validate.support;

import net.yoojia.validate.internal.Rule;

/**
 * author : 桥下一粒砂 (chenyoca@gmail.com)
 * date   : 2013-5-16
 * 数字校验器
 */
public class DigitsTester extends TesterWithRegex{

    static final String DIGITS_REGEX = "^\\d+$";
    static final String messageT = "Please enter only digits.";

    public DigitsTester() {
        super(Rule.Digits, DIGITS_REGEX, messageT);
    }


}
