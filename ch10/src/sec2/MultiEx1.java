package sec2;

class Student {
    public String concept;



}

public class MultiEx1 {
    public static void main(String[] args) {
        Student st1 = new Student();
        Multi1 m1 = new Multi1<Student,String>();

        m1.setValue("김기태");

        System.out.println(m1.getValue());



    }
}
