package sec2;

public class Example6 {
    public static void main(String[] args) {

        int a = 100;
        int b = 0b100;  // 0b  2진수 / 실제연산과 논리연산 등을 수행
        int c = 0100;   // 0으로 시작  8진수 / 권한 부여및 수행, 회수 ex)chmod
        int d = 0x100;  // 0x  16진수  / 실제 물리적 주소 또는 메모리 주소 ex) mac주소

        System.out.println("a = "+a);
        System.out.println("b = "+b);
        System.out.println("c = "+c);
        System.out.println("d = "+d);


    }


}
