package ctrl;

public class Gugudan {
    public static void main(String[] args) {

        int i = 1;
        int dan = 2;
        while(dan<10) {
            i = 1;
            System.out.printf("%d단\n", dan);
            while (i < 10) {
                System.out.printf("%d X %d = %d\n",dan, i, dan * i);
                i += 1;
            }
            System.out.println();

            dan+=1;
        }
    }
}
