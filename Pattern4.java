package assignments_27;

public class Pattern4 {

	public static void main(String[] args) {
		for (int i = 1; i < 5; i++) {
			for (int j = 1; j < 5; j++) {
				System.out.print(i % 2);// for row
			}
			System.out.println(" ");// for column
		}
	}
}
/*
1111 
0000 
1111 
0000 */