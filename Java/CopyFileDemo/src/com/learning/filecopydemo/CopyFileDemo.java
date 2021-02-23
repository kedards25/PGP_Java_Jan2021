package com.learning.filecopydemo;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class CopyFileDemo {

	public static void main(String[] args) {
		Path srcPath=Paths.get("D:\\Professional\\NIIT\\Online Sessions\\PGP Java Jan 2021"
				+ "\\Java\\FileNIO\\testfile.txt");
		
		Path destPath=Paths.get("D:\\Professional\\NIIT\\Online Sessions\\PGP Java Jan 2021"
				+ "\\Java\\testfile.txt");
		
		try {
			Files.copy(srcPath,destPath,StandardCopyOption.REPLACE_EXISTING,StandardCopyOption.COPY_ATTRIBUTES);
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
