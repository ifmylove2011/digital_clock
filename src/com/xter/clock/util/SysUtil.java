package com.xter.clock.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Created by XTER on 2016/9/20. 系统相关
 */
public class SysUtil {

	/**
	 * 得到当前时间
	 *
	 * @return time
	 */
	public static String getNow() {
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.CHINA);
		return sdf.format(d);
	}

	/**
	 * 得到当前时间
	 *
	 * @return time
	 */
	public static String getNow2() {
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss", Locale.CHINA);
		return sdf.format(d);
	}

	/**
	 * 得到转换时间
	 *
	 * @param time 数
	 * @return time
	 */
	public static String getTime(long time) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.CHINA);
		return sdf.format(time);
	}

	/**
	 * 得到转换时间
	 *
	 * @param time 数
	 * @return time
	 */
	public static String getTime(Date time) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.CHINA);
		return sdf.format(time);
	}

	/**
	 * 得到转换日期
	 *
	 * @param time 数
	 * @return time
	 */
	public static String getDate(long time) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd", Locale.CHINA);
		return sdf.format(time);
	}

	/**
	 * 得到转换日期
	 *
	 * @param time 数
	 * @return time
	 */
	public static String getDate(long time, String regex) {
		SimpleDateFormat sdf = new SimpleDateFormat(regex, Locale.CHINA);
		return sdf.format(time);
	}
}
