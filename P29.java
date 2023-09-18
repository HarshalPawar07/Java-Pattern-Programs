package com.jsp.LogicalProgramming2;

public class P29 {
	public static void main(String[] args) {
		int n=5;
		int k=1;
		int sum=0;
		for(int i=1;i<=n;i++) {
			for(int s=1;s<=n-i; s++)
			{
				System.out.print(" ");
			}	
			sum=2*k-1;
			for(int j=1;j<=sum;j++) {
			System.out.print("*");
					
			}k++;
			System.out.println();
			
			
			
		}
	}

}
