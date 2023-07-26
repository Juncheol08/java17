package sec1;

//function
@FunctionalInterface
interface MyLambda5{
    int print(String a);
}
public class LambdaEx5 {
    public static void main(String[] args) {

        MyLambda5 lam5 = (a) -> {
            return Integer.parseInt(a);
        };

        String txt1 = "11";
        String txt2 = "22";
        System.out.println(lam5.print(txt1)+lam5.print(txt2));

    }
}
