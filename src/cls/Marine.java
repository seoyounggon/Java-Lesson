package cls;

public class Marine extends Unit {

    //steampack : 논리형(boolean) ,외부접근 금지
    private boolean steampack;

    public Marine(String name) {
        setName(name);
        setHp(200);
        setPower(10);
        steampack = false;
    }

    public void setSteampack(boolean steampack) {
        this.steampack = steampack;
    }

    public void attack(Unit target) {
        if( steampack )
            setPower( getPower()*2 );
        else
            setPower( 10 );


        super.attack(target);  //부모 클래스의 어택매소드를 호출하기
    }

}


//클래스 이름:Tank
//생성자: 이름만 받아서 생성, hp:500, power: 50
//seize: boolean형 필드 선언하기
//setSeize: seize 변수를 설정하는 setter 메소드
//attack 메소드 재정의, seize가 참이면 공격력 3배, 아니면 원래대로 50