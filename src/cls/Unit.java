package cls;

public class Unit {
    /*
     * 클래스 이름: Unit
     * hp: int, 객체를 생성할 때 결정됨, 수정불가
     * power: int
     *
     * move: 반환값은 없음, 매개변수(x,y) : int, 외부에서 호출가능
     * x, y 위치로 이동힙니다.
     * */

    private int hp; //this.hp를 말한다, this 는 객체 자기 자신을 가리키는 referenced(참조) 변수, 고정값
    private int power; //this.power 를 말한다
    private String name;

    public Unit() {
        hp=0;
        power=0;
        name="";
    }

    public Unit(String name, int hp, int power) {
       this.hp = hp;
       this.power = power;
       this.name = name;
        System.out.printf("name:%s, hp:%d, power:%d\n",this.name,this.hp,this.power);
    }

    //method, member function
    public void move(int x, int y) {
        System.out.printf("(%d, %d)위치로 이동합니다.\n",x,y);
    }

    //메소드의 정의방법
    //접근제한자 반환형, 메소드 이름(매개변수들...)
    public int getHp() {
        return hp;
    }

    public int getPower() {
        return power;
    }

    public String getName() {
        return name;
    }


    public void setHp(int hp) {
        if (hp < 0)
            return; // 메소드를 강제로 종료
        this.hp = hp;
    }

    public void setPower(int power) {
        if (power < 0)
            return;
        this.power = power;
    }

    public void setName(String name) {
        if(!name.isEmpty()) { //name 문자열이 빈 문자열이 아니면...
        //if (name.length() > 0) {  //String.length() 문자열의 길이를 반환, 이름의 길이가 0보다 크면 이름값을 설정함
            this.name= name;
        }
    }

    public void attack(Unit target) {
        target.hp -= this.power;
    }








}
