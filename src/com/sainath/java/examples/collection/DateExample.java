package com.sainath.java.examples.collection;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class DateExample {

	public static void main(String[] args) {
		Date date = new Date();
		//System.out.println(date);
		Date date2 = new Date(1181500200000l);
		//System.out.println(date2);
		
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-dd-MM");
		//System.out.println(formatter.format(new Date(233345223232L)));
		
		Calendar cal = Calendar.getInstance();
		//cal.setTimeZone(TimeZone.getTimeZone("IST"));
		cal.setTime(date);
		cal.add(Calendar.DATE, 10);
		//cal.add(Calendar.MONTH, -10);
		//cal.add(Calendar.HOUR, 10);
		System.out.println(cal.get(Calendar.DATE));
		cal.setTimeZone(TimeZone.getTimeZone("IST"));
		System.out.println(cal.get(Calendar.MINUTE));
		System.out.println(cal.get(Calendar.DATE));
		//System.out.println(cal.getTime());
		//System.out.println(cal.get(Calendar.DAY_OF_YEAR));
		//System.out.println(cal.get(Calendar.DAY_OF_WEEK));
		
		Calendar cal2 = Calendar.getInstance();
		cal2.setTime(date2);
		
		System.out.println(cal.before(cal2));
		
		LocalTime time = LocalTime.now();
		System.out.println(time);
		
		LocalDate localDate = LocalDate.now();
		System.out.println(localDate);
		localDate = localDate.minusDays(10);
		System.out.println(localDate);
		
	}
}
