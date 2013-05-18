package net.yoojia.validate.support;

import net.yoojia.validate.internal.Rule;

/**
 * author : 桥下一粒砂 (chenyoca@gmail.com)
 * date   : 2013-5-16
 * 电话号码校验器
 */
public class MobilePhoneTester extends TesterWithRegex {
	
	static final String PHONE_REGEX = "^(\\+?\\d{2}-?)?((13[0-9])|(14[5-9])|(15[^4,//D])|(18[0,5-9]))\\d{8}$";

	final static String messageT = "Please enter a valid mobile phone number.";
	
	public MobilePhoneTester() {
		super(Rule.MobilePhone,PHONE_REGEX,messageT);
	}


}
