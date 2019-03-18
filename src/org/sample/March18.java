package org.sample;

public class March18 {

	public static void main(String[] args) {
		
			int a=12345;
			int temp=0;
			int temp1=0;
			
			while(a>0) {
				temp=a%10;
				temp1=(temp1*10)+temp;
				a=a/10;
				
			}
		System.out.println(temp1);
			}

	}


