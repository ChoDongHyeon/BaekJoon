import java.util.Scanner;

public class Question_1065 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 문제번호 1065번
		// X가 한수인지 판별
		Scanner sc = new Scanner(System.in);
		
		int a, count = 0;
		
		a = sc.nextInt();
		
		System.out.println(sum(a));
	}
	
	public static int sum(int a) {
		int count = 0;
		int x, y, z;
		
		for(int i = 1; i <= a; i++) {
			x = i / 100;
			y = (i % 100) / 10;
			z = i % 10;
			
			if(i > 0 && i < 100) {
				count++;
			} else if(x - y == y - z) {
				count++;
			}
		}
		
		return count;
	}
	
}