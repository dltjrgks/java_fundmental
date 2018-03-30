class Tv {

	// ��� ����
	String color;
	boolean power;
	int channel;

	// ��� �޼ҵ�
	void power() {
		power = !power;
	}

	void channelUp() {
		++channel;
	}

	void channelDown() {
		--channel;
	}

}

public class TvTest {
	public static void main(String[] args) {
		Tv tv1 = new Tv();

		tv1.color = "red";
		tv1.power();
		// tv1.power = true;

		tv1.channel = 9;
		tv1.channelUp();
		tv1.channelUp();

		System.out.println("tv1�� ������ : " + tv1.color);
		System.out.println("tv1�� ������ : " + (tv1.power == true ? "ON" : "OFF"));
		System.out.println("tv1�� ä���� : " + tv1.channel);
		
		System.out.println();
		
		Tv tv2 = new Tv();
		
		tv2.channel = 15;
		tv2.color = "black";
		tv2.power();
		
		tv2.channelUp();
		
		System.out.println("tv2�� ������ : " + tv2.color);
		System.out.println("tv2�� ������ : " + (tv2.power == true ? "ON" : "OFF"));
		System.out.println("tv2�� ä���� : " + tv2.channel);
		
		
		// ���������� ����
		System.out.println();
		
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		
		t2 = t1; // t1 �� �����ϴ� ���� t2 �� �����ϰ� �Ѵ�.
		
		t1.channel = 7;
		
		System.out.println("t1�� ä�� ���� : " + t1.channel);
		System.out.println("t2�� ä�� ���� : " + t2.channel);
		
		
		

	}
}