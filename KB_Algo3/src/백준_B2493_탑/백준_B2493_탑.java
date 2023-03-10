package 백준_B2493_탑;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

class Top {
	int num;
	int height;
	
	Top(int num. int height){
		this.num = num;
		this.height = height;
	}
	
}


public class 백준_B2493_탑 {

	public static void main(String[] args) throws IOException {
		Stack<Integer> stack = new Stack<>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder answer = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
//		int K = Integer.parseInt(br.readLine());
		
		int [] arr = new int[N];
		
		for (int i = 0; i < N; i++) {
			int K = Integer.parseInt(st.nextToken());
			
			if(stack.isEmpty()==true) {
				answer.append("0 ");
				stack.push(new Top(i, height)
		}
		
		
	}
		
	}

}
