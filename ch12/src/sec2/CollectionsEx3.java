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
        System.out.print("년도 입력 : ");
        int year = sc.nextInt();
        System.out.print("월 입력 : ");
        int month = sc.nextInt();


        System.out.println(month+"월");
        System.out.println(" 일\t월\t화\t수\t목\t금\t토");


        cal.set(2023,month-1,1);

        int end = cal.getActualMaximum(Calendar.DATE);
        int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);

        for(int i=1; i<=end; i++) {
            if(i==1) {
                for(int j=1; j<dayOfWeek; j++) {
                    System.out.print("    ");
                }
            }
            if(i<10) { //한자릿수일 경우 공백을 추가해서 줄맞추기
                System.out.print(" ");
            }
            System.out.print(" "+i+" ");
            if(dayOfWeek%7==0) { //한줄에 7일씩 출력
                System.out.println();
            }
            dayOfWeek++;
        }



    }
}
