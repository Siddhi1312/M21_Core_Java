package com.cg.strings;
//StringBuilder
public class stringbuilder {

	public static void main(String[] args) {
	StringBuilder s=new StringBuilder();
	//System.out.println(s);
	System.out.println(s.capacity());//16(default) as string is empty
	s.append("hive");
	System.out.println(s.capacity());//16(default) as given string size is<16
	s.append("java is coding language");
	System.out.println(s.capacity());
	//(16*2)+2 as given string size is >16
		

	}

}
