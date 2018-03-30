
public class Array2Dtest03 {
	public static void main(String[] args) {
		int [][] a;
		a = new int[3][];	// 행의 갯수
		
		a[0] = new int[4];	// 첫 번째 열의 행의 갯수
		a[1] = new int[5];	// 두 번째 열의 행의 갯수
		a[2] = new int[4];	// 세 번째 열의 행의 갯수
		
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = (int)(Math.random()*90 + 10);
			}
		}
		
		
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[i].length; j++) {
				System.out.printf("%4d", a[i][j]);
			}
			System.out.println();
		}
		
	}
}
