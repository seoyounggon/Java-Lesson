package cls;

public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person("Tom",175.8F, 30);
        Person p2 = new Person("John",185.2F,25);
        Person p3 = new Person("Jane",158.0F,25);

        p3.setAge(28);
        p3.introduce();

        // Student 클래스를 이용해서 객체 생성
        Student s1 = new Student("Brad",185.3F,9);
        s1.setSchool("수원초등");
        s1.setGrade(2);

        Student s2 = new Student("Jack",170.0F,10,"SBS Academy");
        s2.setGrade(3);

        s1.introduce();
        s2.introduce();

    }
}
