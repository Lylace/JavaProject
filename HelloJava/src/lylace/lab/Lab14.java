package lylace.lab;

public class Lab14 {

	public static void main(String[] args) {
		// 6-1~5, 6-8, 6-9

		// # 6-1
		SutdaCard card1 = new SutdaCard(3, false);
		SutdaCard card2 = new SutdaCard();

	}

}

// # 6-1
class SutdaCard {
	int num;
	boolean isKwang;

	public SutdaCard() {
		num = 1;
		isKwang = true;
	}

	public SutdaCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}

}

// 6-2