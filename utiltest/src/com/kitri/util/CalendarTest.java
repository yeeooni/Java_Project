package com.kitri.util;


import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CalendarTest {
	public static void main(String[] args) {
		Calendar cal = new GregorianCalendar();
		int y = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;
		int d = cal.get(Calendar.DATE);
		int apm = cal.get(Calendar.AM_PM);
		int m = cal.get(Calendar.MINUTE);
		int ss = cal.get(Calendar.SECOND);

		System.out.println(cal.get(Calendar.YEAR) + "년 " + zeroPlus(month) + "월 " + zeroPlus(d) + (apm == 0 ? " 오전 " : " 오후 ")
				+ apm + "시 " + zeroPlus(m) + "분 " + zeroPlus(ss) + "초");

		Date date = new Date();
		System.out.println(date.toString());
	}

	private static String zeroPlus(int num) {
		return num < 10 ? "0" + num : "" + num;
	}

}
