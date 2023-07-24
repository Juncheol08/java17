package sec1;

public class Example4 {
    public static void main(String[] args) {

        //부호
        //비트연산 = 2진수
        int a = 20; // 10100
        int b = 14; // 01110

        System.out.println("a & b : "+(a&b));   // & : 모두 1일때만 1로 계산
        System.out.println("a | b : "+(a|b));   // | : 1이 있으면 1로 계산
        System.out.println("~a : "+(~a));       // ~ : 0->1 , 1->0 으로 전환
        System.out.println("a ^ b : "+(a ^ b)); // ^ : 서로 다르면 1로 계산

        //시프트 연산
        System.out.println("a >> 2 : "+(a >> 2));
        // >> 2 : 2진수로 바꿔서 오른쪽으로 2번 밀기 = 뒤 2자리 버림
        System.out.println("a << 2 : "+(a << 2));
        System.out.println("a >>> 2 : "+(a >>> 2));
//        System.out.println("a << 2 : "+(a <<< 2)); // => <<연산은 2까지만 가능하므로 오류








    }
}
