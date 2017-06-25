package com.adv;

public class Player {
	int hp = 100;
	int pos = 0;
	int coin = 5;
	int count = 0;
	Item i = new Item();

	public void again() {
		pos = 0;
		count = 0;
	}

	public void cost() {
		coin = coin - 5;
	}

	public void move() {
		System.out.println("位置:" + pos + " /hp值:" + hp + " /金幣:" + coin);
	}

	public void wall() {
		System.out.println("撞到牆壁囉 hp-10，幫QQ");
		hp = hp - 10;

	}

	public void solution() {
		System.out.println("獲得藥水 hp+10");
		hp = hp + 10;
		System.out.println("位置:" + pos + " /hp值:" + hp + " /金幣:" + coin);
	}

	public void money() {
		System.out.println("撿到3枚金幣");
		coin = coin + 3;
		System.out.println("位置:" + pos + " /hp值:" + hp + " /金幣:" + coin);
	}

	public void monster() {
		System.out.println("與怪物廝殺  hp-20");
		hp = hp - 20;
		System.out.println("位置:" + pos + " /hp值:" + hp + " /金幣:" + coin);
	}

	public void litomonster() {
		System.out.println("遇到頭戴金幣的小怪物，輕輕鬆鬆  hp-10並獲得1枚金幣");
		hp = hp - 10;
		coin = coin + 1;
		System.out.println("位置:" + pos + " /hp值:" + hp + " /金幣:" + coin);
	}

	public void trap() {
		System.out.println("掉進陷阱，hp-30並返回原點，哭哭喔");
		hp = hp - 30;
		pos = 0;
		System.out.println("位置:" + pos + " /hp值:" + hp + " /金幣:" + coin);
	}

	public void end() {
		System.out.println("恭喜你，抵達終點!!");
		System.out.println("共走了" + count + "步 /hp值:" + hp + " /金幣:" + coin);
	}

	public void result() {
		if (i.solution(pos)) {
			solution();
		} else {
			if (i.money(pos)) {
				money();
			} else {
				if (i.trap(pos)) {
					trap();
				} else {
					if (i.monster(pos)) {
						monster();
					} else {
						if (i.litomonster(pos)) {
							litomonster();
						} else {
							move();
						}
					}
				}
			}
		}
	}
}