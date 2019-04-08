package com.yr.io.file;

import java.io.File;
import java.util.HashMap;

public class FileTest4 {

	public static void main(String[] args) {
		File file = new File("c:\\test\\iu");
		//이미지 파일을 제외한 나머지는 삭제
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("bmp", "img");
		map.put("jpg", "img");
		map.put("gif", "img");
		map.put("png", "img");
		
		String[] names = file.list();
		for(int i =0; i <names.length;i++) {
			int index = names[i].lastIndexOf('.');
			String n = names[i].substring(index+1);
			if(!(map.get(n)!= null && map.get(n).equals("img"))) {
				File f = new File(file,names[i]);
				f.delete();
			}
			
		}
		
		/*
		String [] s = file.list();
		for(int i =0; i <s.length;i++) {
			String r = s[i].substring(s[i].length()-3, s[i].length());
			if(r.equals("jpg") || r.equals("bmp")) {
				File f = new File(file, s[i]);
				f.delete();
			}
		}
		*/
	}
}
