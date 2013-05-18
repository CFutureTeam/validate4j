package net.yoojia.validate.internal;

/**
 * author : 桥下一粒砂 (chenyoca@gmail.com)
 * date   : 2013-5-14
 * 测试结果
 */
public class TestResult {

	public final boolean passed;
	public final String message;
	
	public TestResult(boolean passed, String message){
		this.passed = passed;
		this.message = message;
	}
}
