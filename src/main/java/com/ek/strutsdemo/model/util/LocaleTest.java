package com.ek.strutsdemo.model.util;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

// 国际化
public class LocaleTest {
	
	public static void main(String[] args){
		//时间 数字 钱 格式转换用这个都可以
		
		Locale locale = Locale.getDefault(); //虚拟机默认locale
		//Locale locale = Locale.CHINA;
		
		// 不用这个了SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.MEDIUM , locale);
		System.out.println(dateFormat.format(new Date()));
	}
}