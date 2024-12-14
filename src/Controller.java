import java.util.Scanner;

public class Controller {
    public static void main(String[] args) {
        //조건문
        /* 첫 번째 형식
        * if(조건식){
        * //지역(local)
        * 조건식이 참인 경우 실행될 명령문 1
        * 조건식이 참인 경우 실행될 명령문 2
        * 조건식이 참인 경우 실행될 명령문 3
        * .....
        * }
        * */

        /* 두 번째 형식
        * if(조건식) {
        * 조건식이 참인 경우 실행될 명령문들
        * } else {
        * 조건식이 거짓일 경우 실행될 명령문들
        * }
        * */

        /* 세 번째 형식(비효율)
        *if(조건식1) {
        * 조건식1이 참인 경우 실행될 명령문들...
        * } else if(조건식2) {
        * 조건식2가 참일 경우 실행될 명령문들...
        * } else if(조건식3) {
        * 조건식3이 참일 경우 실행될 명령문들...
        * } else {
        *  위 조건식들이 모두 거짓일 때 실행될 문장들...
        * }
        * */

        //콘솔로부터 입력받을 수 있는 입력 객체를 생성한다
        Scanner sc= new Scanner(System.in);

//        System.out.print("숫자를 입력하세요 >>> ");
//        int number = sc.nextInt(); //콘솔로부터 정수를 입력한 후 number 에 들어옴


//        if(number % 2 == 0) {
//            System.out.println("입력한 값 " + number + "는 짝수입니다.");
//        } else {
//            System.out.println("입력한 값 " + number + "는 홀수입니다.");
//        }

//        if(number % 6 == 0) {
//            System.out.println("입력한 값 " + number + "는 6의 배수입니다.");
//        } else {
//            System.out.println("입력한 값 " + number + "는 6의 배수가 아닙니다.");
//        }

//        System.out.print("국어 점수를 입력하세요 >>> ");
//        int sub1 = sc.nextInt();
//        System.out.print("역사 점수를 입력하세요 >>> ");
//        int sub2 = sc.nextInt();
//
//        int sum;
//        sum = sub1+sub2;
//        System.out.println("총점은 " + sum + "점 입니다.");
//
//        float min;
//        min = sum/2.0F;
//        if(min>=60.0F) {
//            System.out.println("평균은 " + min + "점 입니다. 합격입니다.");
//        } else {
//            System.out.println("평균은 " + min + "점 입니다. 불합격입니다.");
//        }

//        System.out.print("키를 입력하세요 >>> ");
//        float height ;
//        height = sc.nextFloat();
//
//        if(height>=120.0F) {
//            System.out.println("놀이기구 탑승 가능");
//        } else {
//            System.out.println("놀이기구 탑승 불가");
//        }
//
//        System.out.println("프로그램을 종료합니다.");
//
//        sc.close();

        //지하철 요금계산
        //일반(19세 이상 65세미만) : 1500원
        //청소년(14세이상 19세 미만) : 1000원
        //어린이(8세이상 14세 미만) : 500원
        //유아(0~7세): 0원
        //어르신(65세 이상): 0원

//        int age;
//        age= sc.nextInt();
//
//        if(age>=65) {
//            System.out.println("지하철 요금은 0원입니다.");
//        } else if(age>=19 && age<65) {
//            System.out.println("지하철 요금은 1500원입니다.");
//        } else if(age>=14 && age<19) {
//            System.out.println("지하철 요금은 1000원입니다. ");
//        } else if(age>=8 && age<14) {
//            System.out.println("지하철 요금은 500원입니다.");
//        } else {
//            System.out.println("지하철 요금은 0원입니다.");
//        }

        //switch =case
        /*
        switch( 변수 )
        {
        case 값1:{
             변수의 값이 1일 떄 실행할 명령문들...
        }

        case 값2;{
             변수의 값이 2일 때 실행할 명령문들...
        }

         */

        System.out.println("1. 돈까스");
        System.out.println("2. 냉면");
        System.out.println("3. 김밥");
        System.out.println("4. 순대");
        System.out.println("5. 어묵");
        System.out.println("6.안시킴");

        System.out.print("메뉴 번호를 선택하세요 >>> ");
        int menu= sc.nextInt();

        switch ( menu ) {
            case 1: {
                System.out.println("돈까스 주문 완료했습니다.");
                break;
            }

            case 2: {
                System.out.println("냉면 주문 완료했습니다. ");
                break;
            }

            case 3: {
                System.out.println("김밥 주문 완료했습니다. ");
                break;
            }

            case 4: {
                System.out.println("순대 주문 완료했습니다. ");
                break;
            }

            case 5: {
                System.out.println("어묵 주문 완료했습니다. ");
                break;
            }

            //1~5에 해당하지 않는 번호
            default: {
                System.out.println("주문을 안 하고 나갔습니다. ");
                break;
            }
        }
    }
}
