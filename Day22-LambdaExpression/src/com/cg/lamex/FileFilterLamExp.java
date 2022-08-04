package com.cg.lamex;

import java.io.File;
import java.io.FileFilter;

public class FileFilterLamExp {

	public static void main(String[] args) {
		FileFilter obj=(File pathname)->pathname.getName().endsWith(".txt");
		File dir=new File("C:\\Users\\siddh\\Desktop");
		File[] contents=dir.listFiles(obj);
		for (File i:contents)
		{
			System.out.println(i);
		}

	}

}
