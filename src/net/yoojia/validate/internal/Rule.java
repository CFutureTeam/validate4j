package net.yoojia.validate.internal;

/**
 * author : 桥下一粒砂 (chenyoca@gmail.com)
 * date   : 2013-5-14
 * 内建规则
 */
public enum Rule {

	/* 必填，不能为空 */
	Required,

	/* 邮件 */
	Email,

	/* 网址 */
	URL,

	/* 手机号码 */
	MobilePhone,

	/* 数字：负数，小数 */
	Number,

	/* 整数 */
	Digits,

	/* 与另一值相等 */
	EqualsTo,

	/* 在此列表中  */
	InList,

	/* 字符最大长度 */
	MaxLength,

	/*  字符最小长度 */
	MinLength,

	/* 字符长度范围 */
	RangeLength,

	/* 最大值 */
	MaxValue,

	/*  最小值 */
	MinValue,

	/* 数值范围  */
	RangeValue,

	/* 匹配正则表达式 */
	Regex,
	
	/* 自定义规则 */
	Custom

}
