package com.adv;

public class Rule {

	String a = new String("此為一7*7冒險地圖");
	String f = new String("起點為左上角(位置:0)/終點為右下角(位置:48)");
	String b = new String("使用8，2，4，6以上下左右移動");
	String c = new String("遊戲中按5將會跳出遊戲");
	String d = new String("你將會擁有hp 100和5枚金幣");
	String g = new String("地圖中會遇到怪物、藥水、金幣、陷阱，請一一克服他們並抵達終點吧^^");
	String h = new String("另外，抵達終點若有5枚金幣將會有小獎勵喔:)");
	String e = new String("希望你有個美好的遊戲體驗♥♥");
	String[] rule = {a, f, b, c, d ,g ,h , e};
	int [] num = {1, 2, 3, 4, 5, 6, 7, 8};
	
	public void rule(){
		for (int i=0 ; i<num.length ; i++)
			System.out.println(num[i] + ". " + rule[i]);
	}

}
