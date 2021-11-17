import java.util.Scanner;

public class Question_1157 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 문제 1157번
		//  주어진 단어에서 가장 많이 사용된 알파벳을 출력하는 문제
		Scanner sc = new Scanner(System.in);
		
		int[] count = new int[26];
		int max = 0;
		char ch = '?';
		
		String input = sc.next();
		
		for(int i = 0; i < input.length(); i++) {
			if((int)input.charAt(i) >= 65 && (int)input.charAt(i) <= 90) {
				count[(int)input.charAt(i) - 65]++;
			} else {
				count[(int)input.charAt(i) - 97]++;
			}
		}
		
		for(int j = 0; j < count.length; j++) {
			if(max < count[j]) {
				max = count[j];
				ch = (char)(j+65);
			} else if(max == count[j]) {
				ch = '?';
			}
		}
		
		System.out.println(ch);
	}

}
