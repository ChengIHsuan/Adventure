package com.adv;

public class Map {
	int row = 7;
	int col = 7;
	int hp = 100;
	
	public Map(int col, int row) {
		this.col = col;
		this.row = row;
	}

	public boolean up(int pos) {
		if (pos / col == 0) {
			return false;
		} else {
			return true;
		}
	}

	public boolean down(int pos) {
		if (pos / col == row - 1) {
			return false;
		} else {
			return true;
		}
	}

	public boolean left(int pos) {
		if (pos % col == 0) {
			return false;
		} else {
			return true;
		}
	}

	public boolean right(int pos) {
		if (pos % col == col - 1) {
			return false;
		} else {
			return true;
		}
	}	
}
