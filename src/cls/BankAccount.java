package cls;

public class BankAccount {
    /*
     * BankAccount: 클래스 이름
     * accountNumber : 문자열(계좌번호), 접근금지
     * balance : 정수(잔액), 접근 금지
     *
     * 생성자: 매개변수로 accountNumber 만 입력받는다. balance 는 무조건 0
     *
     * 메소드(기능)
     * deposit(입금) : 매개변수로 입금액(정수)를 주면 balance 를 매개변수 값만큼 증가시킴, 반환값 없음
     *
     * withdraw(출금) : 매개변수로 출금액(정수)를 주면 balance 를 매개변수 값만큼 감소시킴, 반환값 없음
     *
     * print : 매개변수 없고 반환값 없는 출력 기능
     * 출력형식)
     * 현재 잔액은 xxx 원 입니다.
     * */

    private String accountNumber;
    private int balance;

    public BankAccount(String accountNumber) {
        this.accountNumber= accountNumber;
        this.balance=0;
    }

    public void deposit(int money) {
        this.balance+=money;
        System.out.printf("[ %s ] %d원 입금되었습니다.\n",this.accountNumber, money);
    }

    public void withdraw(int money) {
        this.balance-=money;
        System.out.printf("[ %s ] %d원 출금되었습니다.\n", this.accountNumber, money);
    }

    public void print() {
        System.out.printf("[ %s ], 현재 잔액은 %d원 입니다.\n", this.accountNumber, this.balance);
    }

}
