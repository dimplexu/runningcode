package com.dimple.headfirst.decorator.io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputTest {

	public static void main(String[] args) throws IOException{
		int c;
		try {
			// 设置FileInoutStream，先用BufferedInputStream装饰它，再用我们崭新的LowerCaseInputStream过滤器装饰它
			InputStream inputStream = new LowerCaseInputStream(
					new BufferedInputStream(
							new FileInputStream("src/com/dimple/headfirst/decorator/io/test.txt")));
			
			while ((c = inputStream.read()) >= 0) {
				System.out.print((char)c);
			}
			inputStream.close();
		} catch (IOException e) {
			
		}
	}
}
