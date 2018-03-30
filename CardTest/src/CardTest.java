class Card {
	// �ν��Ͻ� ���� non-static field 
	String kind;
	int number;

	// Ŭ���� ���� static field
	static int width = 100;
	static int height = 250;
	// �⺻ ������
	Card() {
		
	}
	
	Card(String k, int n) {
		kind = k;
		number = n;
	}
}

public class CardTest {
	public static void main(String[] args) {
		System.out.println("Card.width = " + Card.width);
		System.out.println("Card.height = " + Card.height);

		Card c1 = new Card();
		c1.kind = "Heart";
		c1.number = 7;

		Card c2 = new Card();
		c2.kind = "Spade";
		c2.number = 4;

		System.out.println("c1 �� " + c1.kind + " , " + c1.number + " �̸�, ũ��� (" + c1.width + " , " + c1.height + ")");
		System.out.println("c2 �� " + c2.kind + " , " + c2.number + " �̸�, ũ��� (" + c2.width + " , " + c2.height + ")");

		System.out.println();

		System.out.println("c1�� width�� height�� ���� 50, 80���� �����մϴ�.");
		c1.width = 50;
		c1.height = 80;

		System.out.println();
		Card c3 = new Card("Diamond", 13);
		System.out.println("c1 �� " + c1.kind + " , " + c1.number + " �̸�, ũ��� (" + c1.width + " , " + c1.height + ")");
		System.out.println("c3 �� " + c3.kind + " , " + c3.number + " �̸�, ũ��� (" + c3.width + " , " + c3.height + ")");

	}
}