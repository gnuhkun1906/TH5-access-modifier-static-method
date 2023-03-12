package TH1;

public class Main {
    public static void main(String[] args) {
        Student.change();
        Student s1=new Student(111,"Hung");
        Student s2=new Student(222,"Nam");
        Student s3=new Student(333,"Beo");
        s1.display();
        s2.display();
        s3.display();
    }
}
