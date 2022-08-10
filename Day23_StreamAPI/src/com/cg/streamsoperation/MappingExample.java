package com.cg.streamsoperation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MappingExample {

	public static void main(String[] args) 
	{
		List<String>obj=Arrays.asList(new String[] {"apple","mango","banana", "lichi"});
        System.out.println("word length for object-fruits");
        obj.stream().map(String::length).forEach(i->System.out.print(i+" "));
        List<Integer>obj1 =Arrays.asList(new Integer [] {13,23,33, 43});
        List<Integer>obj2=obj1.stream().map(i->i*i).collect(Collectors.toList());
        System.out.println(obj2+" ");
        
        
	}

}
