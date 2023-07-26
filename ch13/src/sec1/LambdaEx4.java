package sec1;

import java.util.Scanner;

@FunctionalInterface
interface MyLambda4 {
    String print(int a);
}
public class LambdaEx4 {
    public static void main(String[] args) {

//        Scanner sc =new Scanner(System.in);
//        System.out.println();
        MyLambda4 lam4 = (a) -> {
          return "람다4 : "+a;
        };

        System.out.println(lam4.print(123));
    }
}
