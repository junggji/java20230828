package ch05reference;

import java.lang.reflect.Method;

public class C09method {
	public static void main(String[] args) {
		int a = 5;
		
		method1(a);
		
		int b =50;
		
		method1(b);
		
	}
	
	public static void method1(int p) {
		System.out.println(p);
	}
}
