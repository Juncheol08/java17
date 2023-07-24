package sec1;

public class Example1 {
    public static void main(String[] args) {
        // 예외 Exception : 문법 상의 오류(Syntax Error)가 아니며,실행 중의 오류
        // 주요 예외: NullPoint, Arithmetic, ArrayIndexBounds, ClassCast, NumberFormat, ClassNotFound
        // 모든 예외는 java.lang.Exception 의 자식(서브클래스)로 구성된다.
        // 외부 자원(파일,데이터베이스, 주변 장치)등을 연동하거나 활용하기 위하여는 반드시
        // 예외 처리가 동반되어야 한다.


        int no1=100;
        int no2=0;
        int res=0;

        String num="1004김기태";
        int parNum;

//        String b;
//        int[] arr = new int[100];
//        int c = 500/ 0;



        try {
            res = no1 /no2; //예외 처리 대책이 필요한 문장을 try 구절로 묶는다.
            parNum = Integer.parseInt(num);
        } catch (ArithmeticException e){    // 예외사항이 발생하였을 경우 실행할 문장을 catch 구절로 묶는다.
            System.out.println("no2가 0으로 나누려고 시도하였음");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }  catch(Exception e) { //Exception = 모든 예외처리이므로 마지막에 작성
            System.out.println(e.getMessage());
            e.printStackTrace();
        } finally { // 성공/실패 상관없이 무조건 실행
            System.out.println("연결 종료");
            System.out.println("닫기");
        }

        System.out.println("출력 완료");





    }
}
