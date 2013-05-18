package net.yoojia.validate.support;

import net.yoojia.validate.internal.Rule;
import net.yoojia.validate.internal.TestResult;

/**
 * author : 桥下一粒砂 (chenyoca@gmail.com)
 * date   : 2013-5-15
 * 最小长度测试校验器
 */
public class LengthMinTester extends Tester<String,Integer>{
	
	final static String messageT = "Please enter at least %d characters.";

	public LengthMinTester() {
		super(Rule.MinLength);
	}

	@Override
	public TestResult test(String input, Integer... args) {
		final int minLength = args[0];
		boolean passed = input.length() >= minLength;
		String message = passed ? null : String.format(messageT, minLength);
		return new TestResult(passed, message);
	}

}
