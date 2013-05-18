package net.yoojia.validate;

import net.yoojia.validate.internal.Rule;
import net.yoojia.validate.internal.RuleConfigs;
import net.yoojia.validate.internal.TestResult;
import net.yoojia.validate.support.Tester;

import java.util.List;

/**
 * author : 桥下一粒砂 (chenyoca@gmail.com)
 * date   : 2013-5-14
 * Java校验器
 */
public class Validator {
	
	private final RuleConfigs ruleConfigs;
	
	public Validator(){
		ruleConfigs = new RuleConfigs();
	}

	public RuleConfigs getRuleConfigs(){
		return ruleConfigs;
	}

    /**
     * 根据给定数据进行校验
     * @param input 需要被校验的数据
     * @return 校验通过返回true，否则返回false。
     */
	public boolean test(Object input){
		return testResult(input).passed;
	}

    /**
     * 根据给定数据进行校验，并返回一个封装校验结果和消息的对象
     * @param input 需要被校验的数据
     * @return 封装校验结果和消息的对象
     */
	public TestResult testResult(Object input){
		TestResult result = new TestResult(false, "Parameter 'input' is null !");
		if(input == null) return result;
		//最先校验Required
		if(ruleConfigs.containsTester(Rule.Required)){
			Tester requiredTester = ruleConfigs.removeTester(Rule.Required);
			result = requiredTester.test(input);
		}

		//如果Required没有通过，则中断校验，返回结果。
		if( !result.passed ) return result;
		
		List<Tester> testers = ruleConfigs.getTesterChain();
		for(Tester tester : testers){
			Object[] args = null;
            if( !Rule.Custom.equals(tester.rule) ){
                ruleConfigs.getArgs(tester.rule);
            }
			result = tester.test(input, args);
			if( !result.passed ) break;
		}
		return result;
	}

}
