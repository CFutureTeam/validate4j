package net.yoojia.validate.support;

import net.yoojia.validate.internal.Rule;
import net.yoojia.validate.internal.TestResult;

/**
 * author : 桥下一粒砂 (chenyoca@gmail.com)
 * date   : 2013-5-15
 * 测试基类
 */
public abstract class Tester<T,P> {

	public final Rule rule;
	
	/**
	 * 使用公共接口实现的自定义Tester被标识为Custom规则类型
	 */
	public Tester(){
		this(Rule.Custom);
	}
	
	/**
	 * @param rule 内建Tester要标识其所属规则类型
	 */
	Tester(Rule rule){
		this.rule = rule;
	}
	
	/**
	 * 执行测试
	 * @param input 请求测试的数据。此参数首先被过滤，在被传入测试对象时，必定不为null。
	 * @param args 根据各个测试对象不同，其它测试参数由此对象数组传入。自定义测试类中，此参数为null。
	 * @return 如果测试通过，返回TestResult.passed为true的对象。否则，返回TestResult.passed为true的对象，并中TestResult.message中描述出错原因或者提示语。
	 *
	 */
	public abstract TestResult test(T input,P... args);
	
}
