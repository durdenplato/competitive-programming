package com.topcoder.div2.level1;

public class GreatFairyWar {

	public static void main(String[] args) {
		GreatFairyWar gfw = new GreatFairyWar();
		int dps[] = {30,2,7,4,7,8,21,14,19,12};
		int hp[] = {2,27,18,19,14,8,25,13,21,30};
		System.out.println(gfw.minHP(dps, hp));
	}

	public int minHP(int[] dps, int[] hp){
		int minHp = 0, totalDps = 0;
		for(int d : dps) totalDps += d;
		for(int i = 0; i < hp.length; i++){
			minHp += hp[i] * totalDps;
			totalDps -= dps[i];
		}
		return minHp;
	}
}