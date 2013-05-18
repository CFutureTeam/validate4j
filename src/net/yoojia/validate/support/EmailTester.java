package net.yoojia.validate.support;

import net.yoojia.validate.internal.Rule;

/**
 * author : 桥下一粒砂 (chenyoca@gmail.com)
 * date   : 2013-5-16
 * 电子邮件校验器
 */
public class EmailTester extends TesterWithRegex {

	static final String EMAIL_REGEX = 
			"^[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?$";
	
	static final String messageT = "Please enter a valid email address.";
	
	public EmailTester() {
		super(Rule.Email,EMAIL_REGEX,messageT);
	}

}
