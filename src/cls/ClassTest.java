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


        //Unit class test
        Unit u1 = new Unit("Tom", 100, 10);
        Unit u2 = new Unit("John", 150, 15);
        Unit u3 = new Unit();
        Unit u4 = new Unit("Tom", 100, 10);
        Unit u1_1=u1; //대리자를 생성



        u3.setHp(200);
        u3.setPower(20);
        u3.setName("Harry");

        int u1_hp=u1.getHp();
        int u2_hp=u2.getHp();
        System.out.printf("u1 의 HP 는 %d 입니다.\n", u1.getHp());
        System.out.printf("u2 의 HP 는 %d 입니다.\n", u2_hp);
        System.out.printf("u3 의 HP 는 %d 입니다.\n", u3.getHp());

        int u1_power=u1.getPower();
        int u2_power=u2.getPower();
        System.out.printf("u1 의 power 는 %d 입니다.\n", u1_power);
        System.out.printf("u2 의 power 는 %d 입니다.\n", u2_power);
        System.out.printf("u3 의 power 는 %d 입니다.\n", u3.getPower());

        System.out.printf("u3 의 name 은 %s 입니다.\n", u3.getName());
        System.out.printf("u1 의 name 은 %s 입니다.\n", u1.getName());
        System.out.printf("u2 의 name 은 %s 입니다.\n", u2.getName());

       //대리자를 이용하여 기능을 호출한다.
        u1_1.setName("Java");
        System.out.printf("u1의 이름은 %s입니다.\n",u1.getName());

        //
        u1.attack(u2);
        System.out.printf("u2 의 HP 는 %d 입니다.\n", u2.getHp());

    }
}
