import java.util.Scanner;

public class Question_10809 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���� 10809��
		// �� �ܾ�� �� ���ĺ��� ó�� �����ϴ� ��ġ�� ã�� ����
		Scanner sc = new Scanner(System.in);
		
		String input = sc.next();
		char[] ch = input.toCharArray();
		char[] alpha = new char[26];
		int[] count = new int[26];
		
		for(int k = 0; k < alpha.length; k++) {
			alpha[k] = (char)('a'+k);
			count[k] = -1;
		}
		
		for(int i = 0; i < ch.length; i++) {
			for(int j = 0; j < alpha.length; j++) {
				if(ch[i] == alpha[j] && count[j] == -1) {
					count[j] = i;
				}
			}
		}
		
		for(int x = 0; x < count.length; x++) {
			System.out.print(count[x] + " ");
		}
	}

}
