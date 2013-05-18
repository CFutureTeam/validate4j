package net.yoojia.validate.internal;
/**
 * author : 桥下一粒砂 (chenyoca@gmail.com)
 * date   : 2013-5-15
 * 输入类型判断工具类
 */
public class InputType {

	public static boolean isPrimitiveType(Object object)
	 {  
		Class<?> clazz = object.getClass();
	     return 
	     (  
	    	clazz.isPrimitive()  ||
	        clazz.equals(String.class) ||  
	        clazz.equals(Integer.class)||  
	        clazz.equals(Byte.class) ||  
	        clazz.equals(Long.class) ||  
	        clazz.equals(Double.class) ||  
	        clazz.equals(Float.class) ||  
	        clazz.equals(Character.class) ||  
	        clazz.equals(Short.class) ||  
	        clazz.equals(Boolean.class)
	     );  
	 }

}
