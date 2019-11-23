package com.program;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		System.out.println("Enter a value");
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		//converted into char array
		char ch[]=str.toCharArray();
		int n=ch.length;
		boolean flag=true;
		for(int i=0,j=n-1;i<j;i++,j--) {
			if(ch[i]!=ch[j])
				flag=false;
			break;
		}
		
		if(flag==true)
			System.out.println(str+" is a palindrome");
		else
			System.out.println(str+" is not palindrome");
	}

}
