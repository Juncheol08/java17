package sec1;

//람다의 추상체는 기능적 인터페이스
@FunctionalInterface
interface MyLambda1 { //추상체
    void print();
}
public class LambdaEx1 {
//    public int method1(int x,int y) {
//        return x*y;
//    }

    /*

    람다식 구현체
    (argument)  (arrow token)   (function body)
    매개변수        어로우토큰       함수 바디
    (x,y) -> {x*y};
    () -> { }       : Basic
    (x) -> { }      : Consumer
    () -> { x }     : Supplier
    (x) -> { x*x }  Operator : 주로 매개변수를 전달받아 처리를 한 후 다시 반환하는 타입
                    Function : 주로 매개변수를 받아 처리한 후 그 결과를 형변환하여 반환
                    Predicate : 주로 매개변수를 받아 비교한 후 일치하는지 여부를 논리값으로 반환

     */

    public static void method1() {
        System.out.println("안녕하세요 메소드1 입니다.");
    }

    public static void main(String[] args) {
        method1();
        MyLambda1 lam1 = () -> {
            System.out.println("안녕하세요 람다식1 입니다.");
        };  //람다식 블록에는 ; 을 붙여야 함.
        lam1.print();

    }

}
