package ctrl;

public class Loops5 {
    public static void main(String[] args) {
        //for 반복문
        // for(초기식;조건식;증감식) {
        //     반복 실행할 명령문들...
        //     ...
        // }
        for(int i=0; i<5; i++) {
            System.out.println("i = "+ i);
        }
        System.out.println();

        int i=0;
        while(i<5) {
            System.out.println("i = "+ i);
            i++;
        }
    }
}
