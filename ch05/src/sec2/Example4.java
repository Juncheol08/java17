package sec2;

import sec1.Board;
import sec1.Qna;

public class Example4 {
    public static void main(String[] args) {

        Qna q1 = new Qna();
        q1.setTitle(Qna.DUMMY);
        System.out.println(q1.getTitle()+1);

        Qna q2 = new Qna();
        q2.setTitle(Qna.DUMMY);
        System.out.println(q2.getTitle()+1+"\n");

        q1.method1(); //final static
        q1.method2(); //x
        q1.method3(); //static
        System.out.println();

        System.out.println(Qna.DUMMY);
        System.out.println("DUMMY2 : "+Qna.DUMMY2);     //public static final String DUMMY = "테스트글제목";
        Qna.DUMMY2 = "test";
        System.out.println("DUMMY2 : "+Qna.DUMMY2);     //public static String DUMMY2 = "DUMMY2";
//        System.out.println("DUMMY3 : "+Qna.DUMMY3);  // static String DUMMY3 = "DUMMY3";  =>  !! 에러발생 !!

        Qna test1 = new Qna(5);
        System.out.println(test1.getNo());

        Board test2 = new Board();
        test2.method2();

        Board test3 = new Qna();
        test3.method2();
//        Qna test4 = new Board();  //다형성 개념.

    }
}
