package com.adv;

public class Item {

	// 回復藥水位置設置
	public boolean solution(int pos) {
		if (pos == 26 || pos == 30 || pos == 10) {
			return true;
		} else {
			return false;
		}
	}

	// 金幣位置設置
	public boolean money(int pos) {
		if (pos == 8 || pos == 40 || pos == 42) {
			return true;
		} else {
			return false;
		}
	}

	// 陷阱位置設置
	public boolean trap(int pos) {
		if (pos == 24) {
			return true;
		} else {
			return false;
		}
	}

	// 大怪位置設置
	public boolean monster(int pos) {
		if (pos == 1 || pos == 16 || pos == 36|| pos == 45) {
			return true;
		} else {
			return false;
		}
	}
	
	// 小怪位置設置
	public boolean litomonster(int pos) {
		if (pos == 12 || pos == 39) {
			return true;
		} else {
			return false;
		}
	}
}
