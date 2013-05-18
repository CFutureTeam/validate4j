package net.yoojia.validate.util;

/**
 * @author : 桥下一粒砂
 * @email  : chenyoca@gmail.com
 * @date   : 2013-5-15
 * @desc   : 生成字符
 */
public class StringGenerator {

	public static String genString(int length){
		StringBuffer buffer = new StringBuffer("");
		for(int i=1;i<=length;i++){
			buffer.append("A");
		}
		return buffer.toString();
	}
}
