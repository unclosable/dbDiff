package com.itiaoling.dbdiff;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TimeTest {
	private static long ONE_DAY = 24 * 60 * 60 * 1000;

	public static Date[] getDate(int days, int month, int year) {
		System.out.println(String.format("--%s年%s月处理账期--", year, month));
		if (days > 0)
			month -= 1;
		else
			days += 1;
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:ss:mm");
		Date[] reDates = new Date[2];
		Calendar calendar = get(days, month, year);
		calendar.add(Calendar.SECOND, -1);
		System.out.println(dateFormat.format(calendar.getTime()));
		calendar = get(days, month - 1, year);
		System.out.println(dateFormat.format(calendar.getTime()));
		return reDates;
	}

	private static Calendar get(int days, int month, int year) {
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.MONTH, month - 1);
		calendar.set(Calendar.DAY_OF_MONTH, 0);
		calendar.set(Calendar.HOUR_OF_DAY, 0);
		calendar.set(Calendar.MINUTE, 0);
		calendar.set(Calendar.SECOND, 0);
		calendar.add(Calendar.DATE, days);
		return calendar;
	}

	//
	// public static Date[] getDate(int days, int month) {
	// System.out.println(String.format("--%s月账期--", month - 1));
	// if (days > 0 && days < 29) {
	// return getDate_positive(days, month);
	// } else if (days < 0 && days > -29) {
	// return getDate_negative(days, month);
	// }
	// throw new RuntimeException();
	// }
	public static void main(String[] args) {
		int days = -4;
		for (int m = 1; m <= 12; m++) {
			getDate(days, m, 2017);
		}
	}

}
