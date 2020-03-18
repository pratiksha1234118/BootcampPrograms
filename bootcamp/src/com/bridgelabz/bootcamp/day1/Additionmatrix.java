package com.bridgelabz.bootcamp.day1;
import java.util.Scanner;
public class Additionmatrix {
	public static void main(String args[]) {
		{
			Scanner sc=new Scanner(System.in);
			System.out.print("enter row of mattix");
			int r=sc.nextInt();
			System.out.print("enter colomn of matrix ");
			int c=sc.nextInt();
			int first[][]=new int[r][c];
			for(int i=0;i<r;i++)
			{
				for(int j=0;j<c;j++)
				{
				   	first[i][j]=sc.nextInt();
				}
			}
			for(int i=0;i<r;i++)
			{
				for(int j=0;j<c;j++)
				{
				   System.out.print(first[i][j]+ "\t");
				}
				System.out.println();
			}
			System.out.println("enter second matrics");
			int second[][]=new int[r][c];
			for(int i=0;i<r;i++)
			{
				for(int j=0;j<c;j++)
				{
				   	second[i][j]=sc.nextInt();
				}
			}
			for(int i=0;i<r;i++)
			{
				for(int j=0;j<c;j++)
				{
				   System.out.println(second[i][j]+ "\t");
				}
				System.out.print("");
				}
			System.out.println("sum of matrix is"+ "\t");
			 int sum[][]=new int[r][c];
			for(int i=0;i<r;i++)
			{
				for(int j=0;j<c;j++)
				{
				   	sum[i][j]=first[i][j]+second[i][j];
				   	System.out.print(sum[i][j]+ "\t");
				}
				System.out.println();
			}
//			for(int i=0;i<r;i++)
//			{
//				for(int j=0;j<c;j++)
//				{
//				   System.out.print(sum[i][j]+ "\t");
//				}
//				System.out.println();
//			}
			
		}
		
	}

}
