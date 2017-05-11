package com.open.commons;

import java.math.BigDecimal;

/**
 * Object 转换为对应的封装类型
 * 
 * @Desc:
 * @Author:liuxiaohong
 * @Since:2017年5月11日
 * @Version:1.0
 */
public class ObjectConvertUtil {
    /**
     * Object转换为Long，为null返null
     * 
     * @param obj
     * @return
     * @Desc:
     */
    public static Long objToLong(Object obj) {
	Long ret = null;

	try {
	    if (obj != null) {
		ret = Long.valueOf(String.valueOf(obj));
	    }
	} catch (NumberFormatException e) {
	}

	return ret;
    }

    /**
     * Object转换为Long，为null返默认值
     * 
     * @param obj
     * @return
     * @Desc:
     */
    public static Long objToLongDefault(Object obj) {
	Long ret = null;

	try {
	    if (obj != null) {
		ret = Long.valueOf(String.valueOf(obj));
	    }else{
		ret=BigDecimal.ZERO.longValue();
	    }
	} catch (NumberFormatException e) {
	}

	return ret;
    }

    /**
     * Object转换为Integer，为null返null
     * 
     * @param obj
     * @return
     * @Desc:
     */
    public static Integer objToInt(Object obj) {
	Integer ret = null;

	try {
	    if (obj != null) {
		ret = Integer.valueOf(String.valueOf(obj));
	    }
	} catch (NumberFormatException e) {
	}

	return ret;
    }

    /**
     * Object转换为Integer，为null返默认值
     * 
     * @param obj
     * @return
     * @Desc:
     */
    public static Integer objToIntDefault(Object obj) {
	Integer ret = 0;

	try {
	    if (obj != null) {
		ret = Integer.valueOf(String.valueOf(obj));
	    }else{
		ret=BigDecimal.ZERO.intValue();
	    }
	} catch (NumberFormatException e) {
	}

	return ret;
    }

    /**
     * Object转换为Double，为null返null
     * 
     * @param obj
     * @return
     * @Desc:
     */
    public static Double objToDuble(Object obj) {
	Double ret = null;

	try {
	    if (obj != null) {
		ret = Double.valueOf(String.valueOf(obj));
	    }
	} catch (NumberFormatException e) {
	}

	return ret;
    }

    /**
     * Object转换为Double，为null返默认值
     * 
     * @param obj
     * @return
     * @Desc:
     */
    public static Double objToDubleDefault(Object obj) {
	Double ret = 0.0D;

	try {
	    if (obj != null) {
		ret = Double.valueOf(String.valueOf(obj));
	    }else{
		ret=BigDecimal.ZERO.doubleValue();
	    }
	} catch (NumberFormatException e) {
	}

	return ret;
    }

    /**
     * Object转换为Float，为null返null
     * 
     * @param obj
     * @return
     * @Desc:
     */
    public static Float objToFloat(Object obj) {
	Float ret = null;

	try {
	    if (obj != null) {
		ret = Float.valueOf(String.valueOf(obj));
	    }
	} catch (NumberFormatException e) {
	}

	return ret;
    }

    /**
     * Object转换为Float，为null返默认值
     * 
     * @param obj
     * @return
     * @Desc:
     */
    public static Float objToFloatDefault(Object obj) {
	Float ret = null;

	try {
	    if (obj != null) {
		ret = Float.valueOf(String.valueOf(obj));
	    }else{
		ret=BigDecimal.ZERO.floatValue();
	    }
	} catch (NumberFormatException e) {
	}

	return ret;
    }

    /**
     * BigDecimal转换为Double，为null返null
     * 
     * @param obj
     * @return
     * @Desc:
     */
    public static Double bigDecimalToDouble(BigDecimal obj) {
	Double ret = null;

	try {
	    if (obj != null) {
		ret = obj.doubleValue();
	    }
	} catch (NumberFormatException e) {
	}

	return ret;
    }

    /**
     * BigDecimal转换为Double，为null返默认值
     * 
     * @param obj
     * @return
     * @Desc:
     */
    public static Double bigDecimalToDoubleDefault(BigDecimal obj) {
	Double ret = null;

	try {
	    if (obj != null) {
		ret = obj.doubleValue();
	    }else{
		ret=BigDecimal.ZERO.doubleValue();
	    }
	} catch (NumberFormatException e) {
	}
	return ret;
    }

    /**
     * Object转换为String，为null返null
     * 
     * @param obj
     * @return
     * @Desc:
     */
    public static String objToStr(Object obj) {
	String ret = null;

	try {
	    if (obj != null) {
		ret = String.valueOf(obj);
	    }
	} catch (NumberFormatException e) {
	}

	return ret;
    }

    /**
     * Object转换为BigDecimal，为null返null
     * 
     * @param obj
     * @return
     * @Desc:
     */
    public static BigDecimal objToBigDecimal(Object obj) {
	BigDecimal ret = null;

	try {
	    if (obj != null) {
		ret = new BigDecimal(objToStr(obj));
	    }
	} catch (NumberFormatException e) {
	}

	return ret;
    }

    /**
     * Object转换为BigDecimal，为null返0
     * 
     * @param obj
     * @return
     * @Desc:
     */
    public static BigDecimal objToBigDecimalDefault(Object obj) {
	BigDecimal ret = null;

	try {
	    if (obj != null) {
		ret = new BigDecimal(objToStr(obj));
	    } else {
		ret = BigDecimal.ZERO;
	    }
	} catch (NumberFormatException e) {
	}

	return ret;
    }
}
