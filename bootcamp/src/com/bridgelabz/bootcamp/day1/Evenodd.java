package com.bridgelabz.bootcamp.day1;
import java.util.Scanner;
public class Evenodd {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter number");
		int num=sc.nextInt();
		 if(num==0){
			System.out.println("number canot be 0");
			
		}
		 else if(num<0)
		 {
			 System.out.print("num is not positive");
		 }
		 else if(num%2==0)
		{
			System.out.print("number is even");
		}
		else{
			System.out.println("number is odd");
		}
		
	}

}
