package array;

import java.util.Random;

public class Lotto {
    public static void main(String[] args) {

        final int COUNT = 6;


        //랜덤한 값을 만들어주는 객체를 생성한다
        Random rand = new Random();

        int[] lotto = new int[COUNT];
        for(int i=0; i<COUNT; i++) {
            lotto[i] =rand.nextInt(1,46); //1에서 45 사이의 랜덤한 수
        }

        //for 문을 이용하여 lotto 배열 출력하기
        for(int i=0; i<COUNT; i++) {
            System.out.printf("%3d",lotto[i]);
        }

    }
}
