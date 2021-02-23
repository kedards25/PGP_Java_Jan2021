package com.learning.pathdemo;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathDemo {

	public static void main(String[] args) {
		
		Path path=Paths.get("D:\\Professional\\NIIT\\Online Sessions\\Java\\sampleFile.txt");
		
		//System.out.println(path.getNameCount());
		//System.out.println(path.getName(3));
		//System.out.println(path.getFileSystem());
		//System.out.println(path.getRoot());
		//System.out.println(path.getParent());
		System.out.println(path.isAbsolute());
		

	}

}
