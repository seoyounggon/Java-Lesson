package cls;

public class Tank extends Unit {
    //클래스 이름:Tank
    //생성자: 이름만 받아서 생성, hp:500, power: 50
    //seize: boolean 형 필드(멤버변수) 선언하기
    //setSeize: seize 변수를 설정하는 setter 메소드
    //attack 메소드 재정의, seize 가 참이면 공격력 3배, 아니면 원래대로 50
    private boolean seize;

    public Tank(String name) {
        setName(name);
        setHp(500);
        setPower(50);
        seize = false;
    }

    public void setSeize(boolean seize) {
        this.seize = seize;
    }

    public void attack(Unit target) {
        if( seize )
            setPower( getPower()*3 );
        else
            setPower(50);

        super.attack(target);
    }

}
