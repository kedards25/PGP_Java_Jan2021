package com.learning.fileexistsdemo;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileExistsDemo {

	public static void main(String[] args) {
		
		Path srcPath=Paths.get("D:\\Professional\\NIIT\\Online Sessions\\PGP Java Jan 2021"
				+ "\\Java\\testfile.txt");
		
		boolean fileExists=Files.exists(srcPath);
		System.out.println(fileExists);

	}

}
