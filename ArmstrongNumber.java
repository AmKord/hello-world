package com.java.basics;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.annotation.Generated;

public class ArmstrongNumber {
	
	public static int power(int num, int power) {
		int temp =1;
		for(int i=0;i<power;i++) {
			temp= temp*num;
			//System.out.println("power-"+temp);
		}
		return temp;
	}
	public static int squareNumber(int number, int size) {
		int i=0;
		int temp = number;
		int sum=0;
		while(temp%10!=0) {
			sum = sum+power(temp%10,size);
			//System.out.println("sum-"+sum);
			temp = temp/10;
		}
		return sum;
		
	}
	
	public static int getDigits(int number) {
		
		
		int temp = number;
		int size = 0;
		while(temp%10!=0) {
			//System.out.println("digit: "+temp%10);
			temp = temp/10;
			size++;
			
		}
		//System.out.println("size - "+size);
		return (squareNumber(number, size));
		
	}
	
	public static void main(String[] args) {
		
		int number;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		number = sc.nextInt();
		if(number == getDigits(number)) {
			System.out.println("Armtrong number");
		}
		else {
			System.out.println("NOT Armtrong number");
		}
		System.out.println("size: "+getDigits(number));
		
		
	}

}
