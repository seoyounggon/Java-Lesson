package array;      //현재 클래스(Lotto)가 존재하는 패키지

import java.util.Random;  // 모듈(Java 의 시스템 패키지(클래스들))

public class Lotto {
    public static void main(String[] args) {

        final int COUNT = 6;  // 상수(값을 변경할 수 없다.), 선언할 때 초기화한다


        //랜덤한 값(난수)을 만들어주는 객체(rand)를 생성한다.
        Random rand = new Random();

        int[] lotto = new int[COUNT];  // 6칸짜리 1차원 배열 생성한다.
        int k=0;
        while(k<COUNT) {
            boolean find = false;
            int tmp = rand.nextInt(1,46); // 1에서부터 45 사이의 랜덤한 수(난수)를 생성한다.
            for(int j=0;j<COUNT;j++) {
                if(lotto[j] == tmp) {
                    // tmp(난수) 값이 배열에 이미 있음
                    System.out.println("중복있음 : "+tmp);
                    find = true;  //찾았다는 신호를 주는 것이다.
                    break; // 안쪽 반복문 탈출
                }
            }
            //이 부분으로 나옴
            if(!find)  //못 찾았으면 변수값을 대입
                lotto[k++] = tmp;  //lotto 의 i번째 요소에 값을 대입한 뒤 1을 증가시킴
        }

        //for 문을 이용하여 lotto 배열 출력하기
        for(int i=0; i<COUNT; i++) {
            System.out.printf("%3d",lotto[i]);
        }
        System.out.println();  //줄바꿈

        //순차정렬
        for(int i=0;i<COUNT-1;i++) {
            for(int j=i+1;j<COUNT;j++) {
               if(lotto[i]>lotto[j]) {
                   //배열의 요소들이 값을 교환한다
                   int tmp=lotto[i]; //lotto[i]의 값을  tmp에 백업
                   lotto[i]=lotto[j];
                   lotto[j]=tmp;
               }
            }
        }

        //for 문을 이용하여 lotto 배열 출력하기
        for(int i=0; i<COUNT; i++) {
            System.out.printf("%3d",lotto[i]);
        }


    }
}
