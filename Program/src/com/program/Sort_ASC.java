package com.program;

import java.util.Scanner;

public class Sort_ASC {

	public static void main(String[] args) {
		System.out.println("Enter a value");
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		//converted into char array
		char ch[]=str.toCharArray();
		int n=ch.length;
		for(int i=0;i<=n-2;i++) {
			for(int j=i+1;j<=n-1;j++) {
				if((int)ch[i]>(int)ch[j]) {
					char temp=ch[i];
					ch[i]=ch[j];
					ch[j]=temp;
				}
			}
			
		}
		String newStr=new String(ch);
		System.out.println(newStr);

	}

}
