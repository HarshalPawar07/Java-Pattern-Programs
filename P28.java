package com.jsp.LogicalProgramming2;

public class P28 {
	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int s=1;s<i;s++) {
				System.out.print(" ");
			}
			for(int j=n;j>=i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
//		for(int i=n;i>=1;i--) {
//			for(int s=1;s<=n-i;s++) {
//				System.out.print(" ");
//			}
//			for( int j=1;j<=i;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
	}
}
