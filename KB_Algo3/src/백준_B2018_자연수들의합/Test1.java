package 백준_B2018_자연수들의합;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int cnt = 1;
		int sum = 1;
		int start = 1;
		int end = 1;
		
		while(end != N) {
			if(sum==N) {
				end++;
				cnt++;
				sum = sum + end;
			}else if(sum<N){
				end++;
				sum = sum + end;
				
			}else if(sum>N) {
				sum = sum-start;  
				start++;
			}
			
		}
		System.out.println(cnt);
	}
}
