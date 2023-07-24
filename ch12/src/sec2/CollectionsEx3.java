package sec2;

import java.util.Calendar;
import java.util.Scanner;

public class CollectionsEx3 {
    public static void main(String[] args) {
        //입력한 월의 달력 출력하기
        //만약 7월의 경우
        /*
        7월
         일  월  화  수  목  금   토
                                 1
          2   3   4  5   6   7   8
         */
        /*
        1. 첫줄의 공백처리
            1일의 요일을 구하고 그만큼 공백처리
        2. 마지막 일의 수 구해서 그만큼 반복해서 날짜 출력
        3. 토요일에 줄바꿈 처리

         */

        Calendar cal = Calendar.getInstance();

        Scanner sc =new Scanner(System.in);
        System.out.print("출력하고 싶은 월 숫자로 입력 : ");
        int month = sc.nextInt();

        System.out.println(month+"월");
        System.out.println("  일  월  화  수  목  금   토");



    }
}
