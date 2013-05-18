package net.yoojia.validate;

import junit.framework.Assert;
import net.yoojia.validate.internal.InputUtility;
import org.junit.Test;

public class InputTypeTest {

	@Test
	public void passed() {
		Assert.assertTrue("String -> ", InputUtility.isPrimitiveType("abc"));
		Assert.assertTrue("int -> ", InputUtility.isPrimitiveType(Integer.MAX_VALUE));
		Assert.assertTrue("long -> ", InputUtility.isPrimitiveType(Long.MAX_VALUE));
		Assert.assertTrue("float -> ", InputUtility.isPrimitiveType(123.32f));
		Assert.assertTrue("double -> ", InputUtility.isPrimitiveType(123.325));
		Assert.assertTrue("char -> ", InputUtility.isPrimitiveType('a'));
		Assert.assertTrue("byte -> ", InputUtility.isPrimitiveType(Byte.MIN_VALUE));
		Assert.assertTrue("boolean -> ", InputUtility.isPrimitiveType(false));
		
		Assert.assertTrue("Integer -> ", InputUtility.isPrimitiveType(new Integer(123)));
		Assert.assertTrue("Long -> ", InputUtility.isPrimitiveType(new Long(123456789L)));
		Assert.assertTrue("Float -> ", InputUtility.isPrimitiveType(new Float(12345.123f)));
		Assert.assertTrue("Double -> ", InputUtility.isPrimitiveType(new Double(12345.123555)));
		Assert.assertTrue("Character -> ", InputUtility.isPrimitiveType(new Character('a')));
		Assert.assertTrue("Byte -> ", InputUtility.isPrimitiveType(new Byte(Byte.MIN_VALUE)));
		Assert.assertTrue("Boolean -> ", InputUtility.isPrimitiveType(new Boolean(true)));
		
	}
	
	@Test
	public void notPass(){
		Assert.assertFalse("Object -> ", InputUtility.isPrimitiveType(new Object()));
	}

}
