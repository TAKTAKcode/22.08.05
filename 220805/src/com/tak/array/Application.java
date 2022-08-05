package com.tak.array;

import java.util.Scanner;

public class Application {

	static void aryRmvN(int[] a, int idx, int n) {
		
		if (n > 0 && idx >= 0 && idx + n < a.length) {
			int idx2 = idx + n - 1;
			
			if (idx2 > a.length - n - 1) {
				idx2 = a.length - n - 1;
				
				for (int i = idx; i < idx2; i++) {
					a[i] = a[i + n];
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("��� �� :");
		int num = sc.nextInt();
		int[] a = new int[num];
		
		for (int i = 0; i < num; i++) {
			System.out.print("a[" + i + "] : ");
			a[i] = sc.nextInt();
		}
		
		System.out.print("������ ������ �ε��� : ");
		int idx = sc.nextInt();
		
		System.out.print("������ ����� �� : ");
		int n = sc.nextInt();
		
		
		aryRmvN(a, idx, n);
		for (int i = 0; i < num; i++) {
			System.out.println("a[" + i + "] = " + a[i]);
			
		}
		

	}

}
