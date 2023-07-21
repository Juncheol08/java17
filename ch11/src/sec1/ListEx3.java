package sec1;

import java.util.ArrayList;
import java.util.List;


class Student {
    public int sno;
    public String sname;
    public int point;

    public Student() { }
    public Student(int sno, String sname, int point) {
        this.sno = sno;
        this.sname = sname;
        this.point = point;
    }
}



public class ListEx3 {
    public static void main(String[] args) {

        List<String> lst1 = new ArrayList<>();
        lst1.add("백준철"); //요소 추가
        lst1.add("오세훈");
        lst1.add("박진권");
        lst1.add("신승원");
        System.out.println(lst1);
        lst1.remove(1);
        System.out.println(lst1);
        lst1.clear();
        System.out.println(lst1);
        lst1.add("오태훈");
        lst1.add("김현경");
        lst1.add("김보경");
        lst1.add("김기태");
        System.out.println(lst1);
        System.out.println("리스트의 요소 수 : "+lst1.size());
        System.out.println("인덱스가 2인 데이터 : "+lst1.get(2));



        if(lst1.contains("이기태")) {  //contains 존재 유무 판단
            System.out.println("이기태가 존재");
        } else {
            System.out.println("이기태가 존재하지 않습니다.");
        }


        if(lst1.isEmpty()){ //빈 리스트를 검증
            System.out.println("현재 리스트가 비어있음");
        } else {
            System.out.println("현재 리스트가 사용 중임");
        }


        for(int i=0; i<lst1.size(); i++) {
            System.out.println(lst1.get(i));
        }
        System.out.println("------------");
        for(String s:lst1) {
            System.out.println(s);
        }


        List<Student> sl = new ArrayList<>();
        Student q1 = new Student();
        q1.sno=1;
        q1.sname="한선";
        q1.point=90;
        Student q2 = new Student();
        q2.sno=2;
        q2.sname="황교진";
        q2.point=85;
        Student q3 = new Student();
        q3.sno=3;
        q3.sname="서광";
        q3.point=50;


        sl.add(q1);
        sl.add(q2);
        sl.add(q3);


        for(int i=0; i<sl.size(); i++) {
            Student s = sl.get(i);
            System.out.println("번호 : "+s.sno);
            System.out.println("이름 : "+s.sname);
            System.out.println("포인트 : "+s.point);
        }
        System.out.println("------------");
        for(Student s:sl) {
            System.out.println("번호 : "+s.sno);
            System.out.println("이름 : "+s.sname);
            System.out.println("포인트 : "+s.point);
        }


    }



}
