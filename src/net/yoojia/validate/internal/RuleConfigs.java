package net.yoojia.validate.internal;

import net.yoojia.validate.support.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * author : 桥下一粒砂 (chenyoca@gmail.com)
 * date   : 2013-5-14
 * 规则配置。校验规则由各个规则接口的调用顺序决定，但是，如果使用Required规则，则Required不管顺序如何都最先被校验。
 */
public class RuleConfigs {
	
	private Map<Rule,Object[]> rulesParamArgs = new HashMap<Rule,Object[]>();
	
	private Map<Object,Tester> testerMapping = new HashMap<Object,Tester>();

	public final List<Tester> getTesterChain(){
		return new ArrayList<Tester>(testerMapping.values());
	}
	
	public final Object[] getArgs(Object tag){
		return rulesParamArgs.get(tag);
	}
	
	/**
	 * 移除一个Tester
	 * @param ruleOrTag Tester的Rule或者自定义的Tag名
	 * @return 返回被移除的Tester
	 */
	public Tester removeTester(Object ruleOrTag){
		return testerMapping.remove(ruleOrTag);
	}
	
	/**
	 * 是否配置了某个Tester
	 * @param ruleOrTag Tester的Rule或者自定义的Tag名
	 * @return 返回指定的Rule或者Tag已经配置
	 */
	public boolean containsTester(Object ruleOrTag){
		return testerMapping.containsKey(ruleOrTag);
	}
	
	/**
	 * 自定义校验规则接口，并指定这个接口的Tag
	 * @param tester 规则接口实现
	 * @param tag 标识这个Tester的Tag
	 * @return RuleConfigs对象，用于链式配置。
	 */
	public RuleConfigs custom(Tester<?,?> tester,String tag){
		testerMapping.put(tag,tester);
		return this;
	}
	
	/**
	 * 必须的字段，不能为空。此规则首先被验证。
	 * @return RuleConfigs对象，用于链式配置。
	 */
	public RuleConfigs required() {
		testerMapping.put(Rule.Required, new RequiredTester());
		return this;
	}

	/**
	 * 必须输入正确格式的电子邮件
	 * @return RuleConfigs对象，用于链式配置。
	 */
	public RuleConfigs email() {
		testerMapping.put(Rule.Email, new EmailTester());
		return this;
	}

	/**
	 * 必须输入正确格式的电话号码
	 * @return RuleConfigs对象，用于链式配置。
	 */
	public RuleConfigs phone(){
		testerMapping.put(Rule.MobilePhone, new MobilePhoneTester());
		return this;
	}

	/**
	 * 必须输入正确格式的网址
	 * @return RuleConfigs对象，用于链式配置。
	 */
	public RuleConfigs url() {
		testerMapping.put(Rule.URL, new URLTester());
		return this;
	}

	/**
	 * 必须输入整数
	 * @return RuleConfigs对象，用于链式配置。
	 */
	public RuleConfigs digits() {
        testerMapping.put(Rule.Digits, new DigitsTester());
		return this;
	}

	/**
	 * 必须输入合法的数字(负数，小数)
	 * @return RuleConfigs对象，用于链式配置。
	 */
	public RuleConfigs number() {
        testerMapping.put(Rule.Number, new NumberTester());
		return this;
	}

	/**
	 * 必须匹配指定正则表达式
	 * @param regex 匹配的正则表达式
	 * @return RuleConfigs对象，用于链式配置。
	 */
	public RuleConfigs regex(String regex) {
		testerMapping.put(Rule.Regex,new RegexTester());
		rulesParamArgs.put(Rule.Regex, new String[]{regex});
		return this;
	}

	/**
	 * 必须在此列表中
	 * @param list 列表参数
	 * @return RuleConfigs对象，用于链式配置。
	 */
	public RuleConfigs inList(String... list) {
        testerMapping.put(Rule.InList,new InListTester());
        rulesParamArgs.put(Rule.InList, list);
		return this;
	}

	/**
	 * 输入值必须和#input相同
	 * @param equalTo 需要被匹配的值
	 * @return RuleConfigs对象，用于链式配置。
	 */
	public RuleConfigs equalTo(Object equalTo) {
        testerMapping.put(Rule.EqualsTo,new EqualsToTester());
        rulesParamArgs.put(Rule.EqualsTo, new Object[]{equalTo});
		return this;
	}

	/**
	 * 输入字符串的最小长度
	 * @param minLength 最小长度
	 * @return RuleConfigs对象，用于链式配置。
	 */
	public RuleConfigs minLength(int minLength) {
		testerMapping.put(Rule.MinLength,new LengthMinTester());
		rulesParamArgs.put(Rule.MinLength, new Integer[]{minLength});
		return this;
	}

	/**
	 * 输入字符串的最大长度
	 * @param maxLength 最大长度
	 * @return RuleConfigs对象，用于链式配置。
	 */
	public RuleConfigs maxLength(int maxLength) {
		testerMapping.put(Rule.MaxLength,new LengthMaxTester());
		rulesParamArgs.put(Rule.MaxLength, new Integer[]{maxLength});
		return this;
	}

	/**
	 * 输入长度必须介于 minLength 和 maxLength 之间的字符串 (汉字算一个字符)
	 * @param minLength 最小长度
	 * @param maxLength 最大长度
	 * @return RuleConfigs对象，用于链式配置。
	 */
	public RuleConfigs rangeLength(int minLength, int maxLength) {
		testerMapping.put(Rule.RangeLength,new LengthRangeTester());
		rulesParamArgs.put(Rule.RangeLength, new Integer[]{minLength,maxLength});
		return this;
	}

	/**
	 * 输入值不能大于maxValue
	 * @param maxValue 最大值
	 * @return RuleConfigs对象，用于链式配置。
	 */
	public RuleConfigs maxValue(double maxValue) {
        testerMapping.put(Rule.MaxValue,new ValueMaxTester());
        rulesParamArgs.put(Rule.MaxValue, new Double[]{maxValue});
		return this;
	}

	/**
	 * 输入值不能小于minValue
	 * @param minValue 最小值
	 * @return RuleConfigs对象，用于链式配置。
	 */
	public RuleConfigs minValue(double minValue) {
        testerMapping.put(Rule.MinValue,new ValueMinTester());
        rulesParamArgs.put(Rule.MinValue, new Double[]{minValue});
		return this;
	}

	/**
	 * 输入值在[minValue,maxValue]区间
	 * @param minValue 最小值
	 * @param maxValue 最大值
	 * @return RuleConfigs对象，用于链式配置。
	 */
	public RuleConfigs rangeValue(double minValue, double maxValue) {
        testerMapping.put(Rule.RangeValue,new ValueRangeTester());
        rulesParamArgs.put(Rule.RangeValue, new Double[]{minValue,maxValue});
		return this;
	}
	
}
