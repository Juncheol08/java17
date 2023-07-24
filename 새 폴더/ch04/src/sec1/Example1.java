package sec1;

public class Example1 {
    public static void main(String[] args) {
        //230712 배열
        int[]  a;   //선언방법 1 - 타입[] 배열명;
        int  b[];   //선언방법 2 = 타입 배열명[];

        int[] c = new int[3];   //선언과 할당
        int d;

//      System.out.println("a=[0]="+a[0]);
//      => a는 선언만 된 상태이며, 메모리 할당이 되지 않았기 때문에 에러

        System.out.println("a[0] : "+c[0]);

        //System.out.println("d : "+d);
        // => d는 primitive타입이므로 반드시 초기화가 필요함.


    }
}
