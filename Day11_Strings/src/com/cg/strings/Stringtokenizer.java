package com.cg.strings;

import java.util.StringTokenizer;

//stringTokenizer
public class Stringtokenizer {

	public static void main(String[] args) {
		StringTokenizer s = new StringTokenizer("adventure and thrill");
        //nextToken() method=to print tokens in string
		//System.out.println(s.nextToken());
		//hasMoretokens() method=to print all tokens in string with the help of nextToken() method 
		while (s.hasMoreTokens()) {

			System.out.println(s.nextToken());
		}
		//System.out.println(s.nextToken());
		//if 'true' then symbols in between will print else if 'false' then wont
		StringTokenizer st3 =new StringTokenizer("JAVA|Code|String", "|", true);

				while (st3.hasMoreTokens())
				{
				System.out.println(st3.nextToken());

				}
		

	}

}
