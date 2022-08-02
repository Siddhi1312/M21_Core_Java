package com.cg.datetime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Scanner;

public class ZoneIds {

	public static void main(String[] args) {
		
		LocalTime t=LocalTime.now(ZoneId.of("Egypt"));
		//LocalTime t=LocalTime.now(ZoneId.of());
		LocalDate d=LocalDate.now(ZoneId.of("Egypt"));
		System.out.println(t);
		System.out.println(d);
		for(String s:ZoneId.getAvailableZoneIds())
		{
			System.out.println(s);
		}
		

	}

}
