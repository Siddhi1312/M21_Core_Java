package com.cg.datetime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DatetimeFormatExample {

	public static void main(String[] args) {
		String datetime ="2022-04-27 18:15";
		DateTimeFormatter df=DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
		LocalDateTime dt=LocalDateTime.parse(datetime,df);
		System.out.println(dt);

	}

}
