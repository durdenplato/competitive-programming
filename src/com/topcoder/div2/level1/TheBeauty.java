package com.topcoder.div2.level1;

public class TheBeauty {

	public static void main(String[] args) {
		TheBeauty tb = new TheBeauty();
		System.out.println(tb.find(1000000000));
	}
	
	public int find(int n){
		byte count = 0;
		boolean digits[] = new boolean[10];
		String nStr = String.valueOf(n);
		for(char ch : nStr.toCharArray())
			digits[ch - '0'] = true;
		for(boolean digit : digits)
			if(digit == true) count++;
		return count;
	}
}