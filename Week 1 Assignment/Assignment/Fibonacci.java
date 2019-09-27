package Assignment;

import java.util.Scanner;

public class Fibonacci {
	public static int fib(int num) {
		if(num == 0) {
			return 0;
		}
	    else if(num == 1) {
			return 1;
		}
		else {
			return (fib(num-1)+fib(num-2));
		}
	}
	public static void main(String[] args) {
		int n;
	    Scanner sc = new Scanner(System.in);
	    System.out.println("enter the nth term");
		n = sc.nextInt();
		System.out.println("fibonacci series"+n);
		for(int i=0;i<n;i++) {
			System.out.println(fib(i));
			
		}
		
	}

}
