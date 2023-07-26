package sec1;

//supplier
@FunctionalInterface
interface MyLambda3 {
    String print();
}
public class LambdaEx3 {
    public static void main(String[] args) {

        MyLambda3 lam3 = () -> {
            return "김기태";
        };

        System.out.println(lam3.print());
    }
}
