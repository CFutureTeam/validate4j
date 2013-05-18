package net.yoojia.validate.support;

import net.yoojia.validate.internal.Rule;
import net.yoojia.validate.internal.TestResult;

/**
 * author : 桥下一粒砂 (chenyoca@gmail.com)
 * date   : 2013-5-15
 * 长度区间校验器
 */
public class LengthRangeTester extends Tester<String,Integer> {

	final static String messageT = "Please enter characters in [ %d, %d ].";
	
	public LengthRangeTester() {
		super(Rule.RangeLength);
	}
	
	@Override
	public TestResult test(String input, Integer... args) {
		
		if( !String.class.equals(input.getClass()) ){
			throw new IllegalArgumentException("Parameter 'input' ONLY support 'String' type.");
		}
		
		final int length = input.length();
		final int minLength = args[0];
		final int maxLength = args[1];
		boolean passed = (length >= minLength && length <= maxLength);
		String message = passed ? null : String.format(messageT, minLength,maxLength);
		return new TestResult(passed, message);
	}

}
