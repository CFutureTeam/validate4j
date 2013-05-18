package net.yoojia.validate;

import junit.framework.Assert;
import net.yoojia.validate.internal.InputType;
import org.junit.Test;

public class InputTypeTest {

	@Test
	public void passed() {
		Assert.assertTrue("String -> ",InputType.isPrimitiveType("abc"));
		Assert.assertTrue("int -> ",InputType.isPrimitiveType(Integer.MAX_VALUE));
		Assert.assertTrue("long -> ",InputType.isPrimitiveType(Long.MAX_VALUE));
		Assert.assertTrue("float -> ",InputType.isPrimitiveType(123.32f));
		Assert.assertTrue("double -> ",InputType.isPrimitiveType(123.325));
		Assert.assertTrue("char -> ",InputType.isPrimitiveType('a'));
		Assert.assertTrue("byte -> ",InputType.isPrimitiveType(Byte.MIN_VALUE));
		Assert.assertTrue("boolean -> ",InputType.isPrimitiveType(false));
		
		Assert.assertTrue("Integer -> ",InputType.isPrimitiveType(new Integer(123)));
		Assert.assertTrue("Long -> ",InputType.isPrimitiveType(new Long(123456789L)));
		Assert.assertTrue("Float -> ",InputType.isPrimitiveType(new Float(12345.123f)));
		Assert.assertTrue("Double -> ",InputType.isPrimitiveType(new Double(12345.123555)));
		Assert.assertTrue("Character -> ",InputType.isPrimitiveType(new Character('a')));
		Assert.assertTrue("Byte -> ",InputType.isPrimitiveType(new Byte(Byte.MIN_VALUE)));
		Assert.assertTrue("Boolean -> ",InputType.isPrimitiveType(new Boolean(true)));
		
	}
	
	@Test
	public void notPass(){
		Assert.assertFalse("Object -> ",InputType.isPrimitiveType(new Object()));
	}

}
