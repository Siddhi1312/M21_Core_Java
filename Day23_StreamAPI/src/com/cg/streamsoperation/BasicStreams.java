package com.cg.streamsoperation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class BasicStreams {

	public static void main(String[] args) {
		//stream can be created with static data
		Stream <String> obj=Stream.of("shabnam","ash","vai","shubh");
		obj.forEach((i)->System.out.println(i));//entire code for printing collection elements replaced with this one line
        //stream can be acquired from array or collection
		List<String>obj1=Arrays.asList(new String[] {"mumbai","pune","nagpur","nasik"});
		obj=obj1.stream();
		obj.forEach(System.out::println);//:: before println  need to be so elements will be on diff lines
		//obj.forEach((i)->System.out.println(i));//all elements in single line
	}

}
