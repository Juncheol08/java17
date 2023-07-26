package sec1;

//consumer
@FunctionalInterface
interface MyLambda2 {
    void print(int x);
}

public class LambdaEx2 {
    public static void main(String[] args) {

        MyLambda1 lam1 = () -> {
            System.out.println("안녕하세요");
        };
        lam1.print();

        MyLambda2 lam2 = (x) -> {
            System.out.println("제곱결과 :"+x*x);
        };
        lam2.print(1004);

    }
}
