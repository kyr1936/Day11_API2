package com.yr.io.file;

import java.io.File;
import java.util.StringTokenizer;

public class FileTest3 {

	public static void main(String[] args) {
		File file = new File("c:\\test");
		
		String str = "iu-suji-choa,hani";
		str = str.replace(",","-");
		String[] names = str.split("-");
		for(int i=0; i<names.length; i++) {
			File f = new File(file, names[i]);
			f.mkdir();
		//	System.out.println(names[i].trim());
		}
	}

}
