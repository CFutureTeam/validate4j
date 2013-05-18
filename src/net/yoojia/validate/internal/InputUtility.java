package net.yoojia.validate.internal;
/**
 * author : 桥下一粒砂 (chenyoca@gmail.com)
 * date   : 2013-5-15
 * 输入类型判断工具类
 */
public class InputUtility {

    /**
     * @param object 输入对象
     * @return 是否为基本类型及其封装类
     */
	public static boolean isPrimitiveType(Object object)
	 {
         if(null == object) return false;
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


    public static boolean isEmpty(Object input){
        if( null == input)return true;
        String inputS = String.valueOf(input);
        boolean notEmpty = inputS.length() >= 0 && !inputS.trim().replaceAll("\\s", "").equals("");
        return !notEmpty;
    }


}
