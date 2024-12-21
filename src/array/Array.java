package array;

public class Array {
    public static void main(String[] args) {

        //정수형(short) 배열
        short[] arr = new short[3];
        arr[0] = 100; //arr 배열의 0번째 아이템에 값 100 대입
        arr[1] = 90;  //arr 배열의 1번째 아이템에 값 90 대입
        arr[2] = 80;  //arr 배열의 2번째 아이템에 값 80 대입

        //char 형 배열 선언
        char[] str = new char[5];
        str[0] = 'A';
        str[1] = 'B';
        str[2] = 'C';
        str[3] = 'D';
        str[4] = 'E';

        //double 형 배열 선언
        double[] farr = new double[10];
        //배열의 순번 ===> 인덱스(index)
        // index 는 0부터 {(배열의 개수)-1}까지 지정가능

        for (int i = 0; i < 10; i++) {
            farr[i] = (double) (i + 1); //명시적 형변환하여 값을 대입한다
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(farr[i]);
        }

        //arr 배열의 for 문을 이용해서 10, 20, 30을 대입해라
        for(int i=0; i<3; i++) {
            arr[i] = (short) (10*(i+1));// int 형 변수 i를 short 형으로 변환
            System.out.println(arr[i]);
        }

        char ch = 'a';
        for(int i=0; i<5; i++) {
            str[i] =(char) (ch + i);
            System.out.print(str[i]);
        }

    }
}
