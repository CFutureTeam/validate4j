package net.yoojia.validate.support;

import net.yoojia.validate.internal.InputType;
import net.yoojia.validate.internal.Rule;
import net.yoojia.validate.internal.TestResult;

/**
 * author : 桥下一粒砂 (chenyoca@gmail.com)
 * date   : 2013-5-16
 * 必填内容校验器
 */
public class RequiredTester extends Tester<Object,Void> {

	public RequiredTester() {
		super(Rule.Required);
	}

	final static String messageT = "This field is required.";
	
	@Override
	public TestResult test(Object input, Void... args) {
		
		//如果不是基本类型
		if( !InputType.isPrimitiveType(input) ){
			throw new IllegalArgumentException("Parameter 'input' ONLY support primitive type.");
		}
		
		String inputS = String.valueOf(input);
		boolean passed = inputS.length() >= 0 && !inputS.trim().replaceAll("\\s", "").equals("");
		String message = passed ? null : messageT;
		return new TestResult(passed, message);
	}

}
