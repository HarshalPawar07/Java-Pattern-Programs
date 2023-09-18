package com.jsp.LogicalProgramming2;

public class P9 {
	public static void main(String[] args) {
		int n=5;
		for (int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(j==1 || j==n || i==1 || i==n || i==j || i+j==n+1) {	
				System.out.print("*"+" ");
			}else {
				System.out.print(" "+" ");
			}
			
		}
			System.out.println();
	}
	}
}
