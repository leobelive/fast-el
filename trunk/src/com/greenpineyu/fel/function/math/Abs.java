package com.greenpineyu.fel.function.math;

import com.greenpineyu.fel.common.NumberUtils;
import com.greenpineyu.fel.function.CommonFunction;

/**
 * 绝对值函数
 * 
 * @author 钟杰
 */
public class Abs extends CommonFunction {

	public Object call(Object[] arguments) {
		if (arguments.length < 1) {
			throw new NullPointerException(ERROR_ARGS);
		}
		Object obj = arguments[0];
		if (obj instanceof Number) {
			return NumberUtils.parseNumber(Math.abs(((Number) obj).doubleValue()));
		}
		return new Integer(0);
	}

	public String getName() {
		return "abs";
	}

}