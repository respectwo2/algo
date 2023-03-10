package 백준_B12891_DNA비밀번호;

import java.util.Scanner;

public class 백준_B12891_DNA_권규택 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt(); // 전체 문자열 개수 9
        int p=sc.nextInt(); // 검색할 부문자열 길이 8
        String str=sc.next(); // 전체 문자열
        int ans=0;
        int[] dna=new int[4]; // 4번 읽음
        for (int i = 0; i < dna.length; i++) {
            dna[i]=sc.nextInt();// acgt 필요 개수 4번 읽어드림
        }
        int sidx=0; // 슬라이딩윈도우 시작인덱스
        int eidx=p-1; // 마지막 인덱스 -> 7 (0~7까지 총 8개 글자)
        
        int[] cnt=new int[4]; // 검색된 acgt의 횟수, 상태 저장
        
        for (int i = 0; i < p; i++) { //상태 초기화
            if(str.charAt(i)=='A') cnt[0]++;
            else if(str.charAt(i)=='C')    cnt[1]++;
            else if(str.charAt(i)=='G')    cnt[2]++;
            else if(str.charAt(i)=='T')    cnt[3]++;
        }
        boolean isans=true; //검색된결과가 필요갯수를 만족하나?
        for (int i = 0; i < 4; i++) {
            if(cnt[i]<dna[i]) isans=false; //4개중에 하나라도 횟수가 작으면 false
        }
        if(isans==true) ans++; //4개숫자가 모두 최소횟수를 만족하면 정답횟수증가
    //    while(eidx!=str.length())
        while(true) //무한반복, 탈출조건은 내부에서 정의
        {
            isans=true; //정답 조건
            char bf=str.charAt(sidx); //삭제할 문자
            //상태 갱신
            if(bf=='A') cnt[0]--;
            else if(bf=='C')    cnt[1]--;
            else if(bf=='G')    cnt[2]--;
            else if(bf=='T')    cnt[3]--;
            //이동
            sidx++;
            eidx++;
            
            if(eidx==str.length()) break; //종료 조건
            char nw=str.charAt(eidx); //추가할 문자
            //상태 갱신
            if(nw=='A') cnt[0]++;
            else if(nw=='C')    cnt[1]++;
            else if(nw=='G')    cnt[2]++;
            else if(nw=='T')    cnt[3]++;
            
            for (int i = 0; i < 4; i++) {//정답 조건 확인
                if(cnt[i]<dna[i]) isans=false;
            }
            if(isans==true) ans++;
        }
        
        System.out.println(ans);
    }

}