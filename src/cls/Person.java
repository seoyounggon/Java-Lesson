package cls;

public class Person {
    //접근 제한자: private, protected, public
    //private: 외부에서 일체 접근 금지, 상속안됨, 클래스 내부에서만 접근 가능
    //protected: 같은 패키지의 객체들에서 접근 가능, 상속 가능, 다른 패키지로 넘어갈 때 안된다.
    //public: 제한없음, 완전공개


    //데이터
    private int age; //나이 데이터(속성, attribute, property, member variable)
    private String name; // 이름 데이터
    private float height;  // 키 데이터

    //생성자: 클래스명과 같음, 객체기 생성될 때 한번 호출됨.(생성자도 객체를 생성하는 메소드)
    public Person(String n, float h, int a) {
        age=a;
        name=n;
        height=h;

//        System.out.println("Person 클래스로부터 객체가 생성됨");
    }

    //행위(Method, Member function)
    public void introduce() {
        System.out.println("안녕하세요, 저는 "+ name + "이고, ");
        System.out.println("나이는 "+ age + "살 입니다.");
    }

    //getAge: 나이를 반환하는 메소드
    //setAge: 나이를 설정하는 메소드, 음수는 설정할 수 없도록 제한

    public int getAge() {
        return age;
    }

    //접근제한자,반환형,이름,(필요한매개변수) 순으로 적는다.
    public void setAge(int age) {
        if(age<0)
            return;
        this.age=age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(!name.isEmpty()) {
            this.name=name;
        }
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height=height;
    }


}
