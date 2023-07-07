package sec1;

public class Example2 {
    public static void main(String[] args) {

        //대입연산 : =, +=, -=, *=, /=
        int su =0;
        float num=0;

        System.out.println("su = "+su);

        su += 10;   // su = su + 10
        System.out.println("su += 10 => "+su);

        su-=5;
        System.out.println("su -= 5 => " +su);

        su *= 10;
        System.out.println("su *= 10 => " +su);


        num = su /4.0f; // num = (float) su/4
        su /= 4;
        // * 중요 : 정수 나누기 정수의 결과는 정수로 자동 형변환됨.


        System.out.println("su /= 4 => " +su);
        System.out.println("su /= 4 => " +num);



        //증감연산 : ++, -- 전위와 후위 존재
        int a = 10 , b= 10;
        System.out.println("--------------------------");
        System.out.println("현재 : a = "+a+" , b = "+b);
        System.out.printf("a++의 결과 : %d\n",a++); //후위연산
        System.out.printf("++b의 결과 : %d\n",++b); //전위연산
        System.out.println("현재 : a = "+a+" , b = "+b);
        System.out.printf("a--의 결과 : %d\n",a--);
        System.out.printf("--b의 결과 : %d\n",--b);
        System.out.println("현재 : a = "+a+" , b = "+b);










    }
}
