import java.util.Scanner;

public class Question_2675 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���� 2675��
		// �� ���ڸ� �ݺ��Ͽ� ����ϴ� ����
		Scanner sc = new Scanner(System.in);
		
		int a, b;
		
		a = sc.nextInt();
		
		for(int i = 0; i < a; i++) {
			b = sc.nextInt();
			String input = sc.next();
			char[] ch = input.toCharArray();
			for(int j = 0; j < ch.length; j++) {
				for(int k = 0; k < b; k++) {
					System.out.print(ch[j]);
				}
			}
			System.out.println();
		}
	}

}
