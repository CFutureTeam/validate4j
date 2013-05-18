package net.yoojia.validate.support;

import net.yoojia.validate.internal.Rule;

/**
 * author : 桥下一粒砂 (chenyoca@gmail.com)
 * date   : 2013-5-16
 * URL验证器
 */
public class URLTester extends TesterWithRegex {
	
	static final String URL_REGEX = 
			"^((https?|ftp):\\/\\/)?[\\w\\-_]+(\\.[\\w\\-_]+)+([\\w\\-\\.,@?^=%&amp;:/~\\+#]*[\\w\\-\\@?^=%&amp;/~\\+#])?$";

	static final String messageT = "Please enter a valid URL.";

	public URLTester() {
		super(Rule.URL,URL_REGEX,messageT);
	}

}
