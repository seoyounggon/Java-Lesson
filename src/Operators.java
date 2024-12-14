import java.util.Scanner;

public class Operators {

    public static void main(String[] args) {
        System.out.println("연산자 공부");

        //산술 연산자 +, - , * ,/ , %
        //대입 연산자: =, +=, -=, *=, /=, %=
        //비교 연산자(검증): >, <, <=, >=, ==, !=
        //논리 연산자: &&(AND), ||(OR), !(NOT)
        //증감 연산자: ++, --
        //부호 연산자(양수, 음수): +, -
        //비트 연산자: &, |,
        //기타 연산자: instanceof,

        //산술 연산
        int sum;
        int a=10;
        int b= 3;
        sum= a+b;
        System.out.println("sum = "+sum);
        sum= a-b;
        System.out.println("sum = "+sum);
        sum= a*b;
        System.out.println("sum = "+sum);
        sum= a/b;
        System.out.println("sum = "+sum);
        sum= a%b;
        System.out.println("sum = "+sum);

        float f1= 10.0F; // flaot 선언 시 뒤에 대문자f, 소문자f 상관없음
        float f2= 3.0F;
        float result;

        result= f1/f2;
        System.out.println("result = "+result);
        result= f1%f2;
        System.out.println("result = "+result);

        result=f1/b; //***실수와 정수 간의 연산 결과는 실수이다.
        System.out.println("result = "+result);

        sum= (int)(f1/b); //실수와 정수 간의 연산 결과는 실수이므로 형변환이 필요하다
        System.out.println("sum = "+sum);

        result=(float)(a/b);
        System.out.println("result = "+result);

        //국어 48, 수학 29, 영어 97>>>> 자료형은 모두 정수형
        //총점과 평균을 구하여 각각 출력하세요>>>> 자료형은 모두 정수형

        a= -b;// - 연산자는 부호를 바꾸는 역할
        System.out.println("a의 값: "+a);

        a= -a;
        System.out.println("a의 값: "+a);

        //대입연산자
        a=10;
        sum=0;
        sum+=a;  //sum= sum+a를 의미한다.
        System.out.println("sum = "+sum);

        sum+=a;
        System.out.println("sum = "+sum);

        sum-=a;
        System.out.println("sum = "+sum);

        sum*=a;
        System.out.println("sum = "+sum);

        sum/=a;
        System.out.println("sum = "+sum);

        sum%=a;
        System.out.println("sum = "+sum);

        //비교(관계) 연산자
        a=10;
        b=3;

        boolean res;
        res= a>b;
        System.out.println("a>b의 결과 : "+res);

        res=a<=b;
        System.out.println("a<=b의 결과 : "+res);

        res=a==b;
        System.out.println("a==b의 결과 : "+res);

        res= a!=b;
        System.out.println("a!=b의 결과 : "+res);

        //논리 연산자
        boolean flag1=a>b; //true
        boolean flag2=a==b; //false
        res=flag1 && flag2; //true && true ===> true, true && false ===> false
        System.out.println(flag1 + " && " + flag2 + " ===> " + res);

        res=flag1 || flag2;
        System.out.println(flag1 + " || " + flag2 + " ===> " + res);

        res=!flag1;
        System.out.println("!" + flag1 + " ===> " + res);

        //증감 연산자
        a=10;
//        a++; //a+=1, a=a+1과 같은 의미. Post Fix
//        a--; //a+=1, a=a+1과 같은 의미
//        ++a; //a-=1, a=a-1과 같은 의미. Pre Fix
//        --a; //a-=1, a=a-1과 같은 의미
        System.out.println(a++);//a를 먼저 출력한 후 1을 증가시킨다
        System.out.println(++a);//a를 1만큼 증가시킨 후 출력한다.

//        //콘솔로부터 값 입력받기
//        Scanner sc = new Scanner(System.in);
//        System.out.print("a의 들어갈 값을 입력하세요 >>> ");
//        a=sc.nextInt(); // int형 정수를 콘솔로부터 입력받아서 변수 a에 대입하기
//
//        b=a%10;
//        System.out.println("a의 값 : "+a);
//        System.out.println("a의 일의 자리의 값 : "+b);
//
//        //삼항 연산자
//        String strOut = "";
//
//        System.out.print("a의 들어갈 값을 입력하세요 >>> ");
//        a=sc.nextInt(); // int형 정수를 콘솔로부터 입력받아서 변수 a에 대립하기
//
//        strOut = a%2==0 ? "짝수" : "홀수"; //조건식 ? 조건식이 참일 때 : 조건식이 거짓일 때
//        System.out.println(a+ "는  "+ strOut + "입니다.");
//
//        sc.close();
//
//        //기타 연산자 : instanceof
//        flag1 = strOut instanceof String;

        //비트 연산자 : &, |, ~, <<, >>,^
        a=3; //이진수:   0011
        b=5; //이진수: & 0101
        //    결과:      0001
        sum=a&b;
        System.out.println("a & b : "+sum);

        sum=a|b;
        System.out.println("a | b : "+sum);//결과: 0111>>>7

        sum=~a;
        System.out.println("~a : "+sum);// 0011>>>1100(제일 앞 비트가 부호비트. 0이면 +, 1이면 -)

    }
}
