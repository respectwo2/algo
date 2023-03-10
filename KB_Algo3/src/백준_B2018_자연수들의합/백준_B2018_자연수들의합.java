package 백준_B2018_자연수들의합;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.StringTokenizer;

public class 백준_B2018_자연수들의합 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(br.readLine());
		int start = 1;
		int end = 1;
		int sum = 1; //1부터 더할꺼니까
		int cnt = 1;
		while (end != N){
			if (sum == N){//자연수의 합이 N과 같다면
				cnt++; // 횟수 +1 그리고 마지막인덱스 하나 늘림
				end++;
				sum = sum+end;
			}else if(sum >N) {
				sum = sum-start;  //합계에 스타트인덱스만큼 빼줌, 카운트는 XX	
				start++;
			}else if(sum <N) {
				end++;
				sum = sum+end;
			}
			
		}
		System.out.println(cnt);
	}
}
		
		
/*		
		for (int i = 1; i <= n; i++) {
			int sum = 0;
			for (int j = 1; j < n; j++) {
				sum+= j;
		
			if(sum>n)
				break;
			else if(sum==n){ 
				cnt++;
				break;
			}
		}
	}System.out.println(cnt);	완전 탐색방식 // */

