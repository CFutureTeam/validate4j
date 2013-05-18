package net.yoojia.validate.support;

import net.yoojia.validate.internal.Rule;
import net.yoojia.validate.internal.TestResult;

/**
 * author : 桥下一粒砂 (chenyoca@gmail.com)
 * date   : 2013-5-16
 * 最大长度验证器
 */
public class LengthMaxTester extends Tester<String,Integer> {

	final static String messageT = "Please enter no more than %d characters.";
	
	public LengthMaxTester() {
		super(Rule.MaxLength);
	}

	@Override
	public TestResult test(String input, Integer... args) {
		String inputS = String.valueOf(input);
		final int maxLength = args[0];
		boolean passed = inputS.length() <= maxLength;
		String message = passed ? null : String.format(messageT, maxLength);
		return new TestResult(passed, message);
	}

}
