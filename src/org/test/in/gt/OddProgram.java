package org.test.in.gt;

public class OddProgram {
	public static void main(String[] args) {
		int c=0;
		for (int i = 0; i <=100; i++) {
			if(i%2==1) {
				c=c+i;
			}
		}
		System.out.println(c);
}
}
