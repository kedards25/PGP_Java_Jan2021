package com.learning.createdirectorydemo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CreateDirectoryDemo {

	public static void main(String[] args) {
		Path path=Paths.get("D:\\Professional\\NIIT\\Online Sessions\\PGP Java Jan 2021\\Java\\FileNIO");
		
		try {
			Path p=Files.createDirectory(path);
			System.out.println(p);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}

	}

}
