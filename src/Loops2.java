import java.util.Scanner;

public class Loops2 {
    public static void main(String[] args) {
        System.out.println("문자열");  // 라인 단위 출력, 형식문자 지원 불가
        System.out.print("문자열\t");    // 괄호 안 내용 그대로 출력(라인 단위 X)

        int age = 10;
        String name = "홍길동";

        //형식 문자열 출력(printf)
        //%d : 정수
        //%f : 실수
        //%c : 문자
        //%x : 16진수
        //%s : 문자열

        //제어문자
        // \n ; 줄바꿈
        // \t : 탭(tap) 문자
        System.out.printf("%s님의 나이는 %d살 입니다.\n", name, age);


        //구구단
        Scanner sc = new Scanner(System.in);

        System.out.print("출력할 단수를 입력하세요 >>> ");
       int dan =  sc.nextInt();
       int i=1;
       while(i<10) {
           System.out.printf("%d x %d = %d\n", dan, i, dan*i);
           i += 1;
       }

       //무한 반복문
        i=0;
       while( true ) {
           System.out.print(i++);
           if (i>=10)
               break; // 즉시 탈출
       }

       sc.close();
    }
}
