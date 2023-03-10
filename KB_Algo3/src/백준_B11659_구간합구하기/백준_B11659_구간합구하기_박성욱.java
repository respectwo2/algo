package 백준_B11659_구간합구하기;

import java.util.Scanner;

public class 백준_B11659_구간합구하기_박성욱 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        
        int[] arr = new int[N + 1];
        int sum = 0;
        for (int i = 1; i <= N; i++) {
            sum += sc.nextInt();
            arr[i] = sum;
        }
        
        
        for (int i = 0; i < M; i++) {
            int answer = 0;
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(arr[b] - arr[a - 1]);
        }
    }
}


/*
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main
{

    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); //입력 숫자 갯수 
        int M = Integer.parseInt(st.nextToken()); 
        int[] arr = new int[N + 1];	// 1번 인덱스부터 사용하기 위해서

        st = new StringTokenizer(br.readLine()); // 두번쨰줄부터 입력받음
        for(int i = 1; i <= N; i++) {
            arr[i] = arr[i-1] + Integer.parseInt(st.nextToken());
        }
        for(int i = 0; i < M; i++) { //질문갯수
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            System.out.println(arr[b] - arr[a - 1]);
        }
    }

}*/