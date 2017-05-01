package com.topcoder.div2.level1;

public class AlienAndPassword {

	public static void main(String[] args) {
		AlienAndPassword aap = new AlienAndPassword();
	    System.out.println(aap.getNumber("AGAAGAHHHHFTQLLAPUURQQRRRUFJJSBSZVJZZZ"));
	}
	
	public int getNumber(String s){
		int count = 0;
		Character previousCh = null;
		for(Character nextCh : s.toCharArray())
			if(nextCh != previousCh) { count++; previousCh = nextCh;}
		return count;
	}
}