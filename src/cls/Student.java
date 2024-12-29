package cls;

//extends [클래스 이름] 는 지정된 클래스로부터 상속을 받겠다는 의미. Person 의 기능을 100% 이어받음
public class Student extends Person {

    //외부에 노출 금지
    //학교: 문자열
    //힉년: 정수
    //Person 클래스의 자식 클래스(Student 클래스)에만 있는 데이터, 자식 클래스는 부모 클래스의 모든 기능 사용가능
    private String school;
    private int grade;

    //Student 클래스의 생성자
    public Student(String n, float h, int a) {
        //super: 부모(Person 클래스)의 생성자를 호출
        super(n, h, a);
        school = "";
        grade = 1;
    }

    //Student 클래스만의 새로운 생성자
    public Student(String n, float h, int a, String s) {
        super(n, h, a);
        school = s;
        grade = 1;
    }

    public void setSchool(String s) {
        school = s;
    }

    public void setGrade(int g) {
        if(g<1)
            return;
        grade=g;
    }

    public String getSchool() {
        return school;
    }

    public int getGrade() {
        return grade;
    }

    //부모 클래스로부터 오버라이드 되었다. override(재정의) ==> 이점: 기능 업그레이드
    public void introduce() {
        super.introduce(); //부모 클래스로부터 introduce() 호출
        System.out.printf("%s학교, %d학년 입니다.\n", school, grade);
    }

}
