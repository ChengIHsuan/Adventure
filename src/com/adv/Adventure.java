package com.adv;

import java.util.Scanner;

public class Adventure {

	public static void main(String[] args) {

		Map map = new Map(7, 7);
		Player p = new Player();
		Rule r = new Rule();

		Scanner scanner = new Scanner(System.in);
		r.rule();
		System.out.println("\n" + "請輸入你的名字:");
		String name = scanner.nextLine();
		System.out.println("你好，勇士 " + name + "! 按5以開始遊戲，並收取5枚金幣遊戲費用$$");

		String s1 = scanner.nextLine();
		int enter = Integer.parseInt(s1);
		if (p.coin >= 5) {
			if (enter == 5) {
				p.cost();
				System.out.println("冒險開始!!");

				int dir = 0;
				while (dir != 5) {
					System.out.println("請輸入移動方向:");
					String s2 = scanner.nextLine();
					p.count++;
					dir = Integer.parseInt(s2);

					switch (dir) {
					case 8:
						if (map.up(p.pos)) {
							p.pos = p.pos - map.col;
						} else {
							p.wall();
						}
						break;

					case 2:
						if (map.down(p.pos)) {
							p.pos = p.pos + map.col;
						} else {
							p.wall();
						}
						break;

					case 4:
						if (map.left(p.pos)) {
							p.pos = p.pos - 1;
						} else {
							p.wall();
						}
						break;

					case 6:
						if (map.right(p.pos)) {
							p.pos = p.pos + 1;
						} else {
							p.wall();
						}
						break;
					}

					if (p.pos != 48) {
						p.result();
						if (p.hp <= 0) {
							System.out.println("你掛了，GG");
							break;
						}
					} else {
						p.end();
						if (p.coin >= 5) {
							System.out.println("\n" + "仍擁有5枚金幣，可再用5枚金幣繼續冒險，或按5花費5枚金幣結束遊戲。");
							p.again();
							p.cost();
							continue;
						} else {
							System.out.println("感謝你的遊玩~~~");
							break;
						}
					}
				}
				System.out.println("=====冒險結束=====");
			} else {
				System.out.println("看來你還不認識數字，再回去讀一次幼稚園吧!!");
			}
		} else {
			System.out.println("金幣不足，無法開始遊戲。");
		}
	}
}
