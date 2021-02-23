package com.learning.filecreationdemo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CreateFileDemo {

	public static void main(String[] args) {
		Path path=Paths.get("D:\\Professional\\NIIT\\Online Sessions\\PGP Java Jan 2021"
				+ "\\Java\\FileNIO\\testfile.txt");
		
		try {
			Path p=Files.createFile(path);
			System.out.println(path);
		} catch (IOException e) {
			System.out.println(e);
		}

	}

}
