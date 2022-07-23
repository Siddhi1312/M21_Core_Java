package com.cg.strings;
//StringBuffer
public class stringbuffer {

	public static void main(String[] args) {
		//String s = "Today";
        //StringBuffer sb = new StringBuffer(s.length());
		//capacity() function returns capacity of string
		//System.out.println(sb.capacity());
		StringBuffer buff = new StringBuffer("Internet of things");
		//append() function to append the string 
		buff.append("project");
		 System.out.println(buff);
		 //charAt() function to print character at given place from string
		 System.out.println(buff.charAt(1));
		 //setCharAt() function to change character at given place in string
		 buff.setCharAt(1, 'a');
		 System.out.println(buff); 
		System.out.println(buff.capacity());//16(default)+18(string length)
        buff = new StringBuffer(" ");
        System.out.println(buff.capacity());//16(default)+1(space given in abve string)
       // System.out.println(buff.charAt(1));
        
       
	}

}
