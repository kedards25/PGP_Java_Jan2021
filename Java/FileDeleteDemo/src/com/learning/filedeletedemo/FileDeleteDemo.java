package com.learning.filedeletedemo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileDeleteDemo {

	public static void main(String[] args) {
		Path srcPath=Paths.get("D:\\Professional\\NIIT\\Online Sessions\\PGP Java Jan 2021"
				+ "\\Java\\testfile.txt");
		
		try {
			Files.delete(srcPath);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}


	}

}
