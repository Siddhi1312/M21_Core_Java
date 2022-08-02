package com.cg.datetime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeformatEg2 {

	public static void main(String[] args) {
		LocalDateTime datetime =LocalDateTime.now();
		DateTimeFormatter df=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
		String dt= datetime.format(df);
		System.out.println(dt);

	}

}
