package 백준_B11660_구간합구하기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 백준_B11660_구간합구하기 {
	private static Integer Arrarys;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
	
		int a = Integer.parseInt(st.nextToken()); //숫자 갯수 // 4 3 하면 공백단위라 각자 들어감
		int b = Integer.parseInt(st.nextToken()); //질문 갯수

		int [][] arr = new int[a+1][b+1]; // 0,0 좌표를 없애기 위한 장치
		
		for (int i = 1; i <= a; i++) { // 1행
			st = new StringTokenizer(br.readLine());
			for (int j = 1; j <= a; j++) { // 1열부터
				arr[i][j] = Integer.parseInt(st.nextToken());
							//숫자			//문자
			}
		}
//구간합?
		int [][] d = new int[a+1][b+1]; 
		for (int i = 1; i < a; i++) {
			for (int j = 1; j < a; j++) {
				d[i][j]=d[i-1][j]+d[i][j-1]-d[i-1][j-1]+arr[i][j];
			}//				2번		3번		1번				A
		}	for (int [] is : d ) {
			System.out.println(Arrarys.toString());
		}
	
}
}