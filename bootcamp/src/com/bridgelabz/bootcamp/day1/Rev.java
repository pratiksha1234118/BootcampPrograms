package com.bridgelabz.bootcamp.day1;
import java.util.Scanner;
public class Rev {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter strting to be rev");
		String name=sc.nextLine();
		String src[]= name.split("");
		for(int i=0;i<src.length;i++)
		{
			System.out.println("string is"+src[i]);
		}
		for(int j=src.length-1;j>=0;j--)
		{
			String	rev=" ";
			rev=src[j]+rev;
			System.out.print(rev);
		}
	}
}
