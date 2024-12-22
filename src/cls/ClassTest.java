package cls;

import java.util.Scanner;



public class ClassTest {
    public static void main(String[] args) {
        // primitive 자료형
        // byte, char, int, long, float, double,boolean
        int number=10;

        //Referenced 자료형
        String str1= "Hello Java"; // 문자열 변수
        System.out.println(str1);

        String str2 = new String("헬로우 자바");
        System.out.println(str2);

        Scanner sc = new Scanner(System.in);

        String str3 = new String();
        str3= "이것은 자바 문자열입니다.";
        System.out.println(str3);

//        Scanner sc = new Scanner(System.in);
//        Random rand = new Random();

        Person seo = new Person("구라",178.8F, 20 ); //new 뒤의 부분을 생성자라고 부른다., 객체가 생성되는 시점
        Person james = new Person("Dean",172.4F, 25 );
        Person tom = new Person("Cruz", 180F,45);

        seo.introduce();   //메소드에 접근하기
        james.introduce();
        tom.introduce();



    }
}
