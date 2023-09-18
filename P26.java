package com.jsp.LogicalProgramming2;

public class P26 {
	public static void main(String[] args) {
		int n=5;
		int k=1;
		for(int i=n;i>=1;i--) {
			for(int j=n;j>=k;j--) {
				//k=n-i+1 for without k
				System.out.print(j);
			}k++;
			System.out.println();
		}
	}
}
