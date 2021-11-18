import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Question_1152 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// 문제 1152번
		// 단어의 개수를 구하는 문제
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input = br.readLine();
				
		StringTokenizer st = new StringTokenizer(input, " ");
		
		System.out.println(st.countTokens());
	}

}
