package sec1;

import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {

        //키보드로 학번과 세 과목 점수를 입력받아
        //총점, 평균, 학점, 판정, 등급 등을 계산하여 출력하도록 하시오.

        //tot(총점) avg(평균) hak(학점) pan(판정) grd(등급)
        //총점 = 전산 + PG + OA
        //평균은 세 과목의 점수의 총점을 3으로 나눈 실수
        //학점은 평균이 96이상 A+ 93이상은 A0 90이상은 A-
        //86 -> B+ 83 -> B0 80 -> B- ..70이상 D- 나머지 F
        //판정은 평균이 80이상이면서, 세 과목 모두 70이상이면 "합격" 아니면 "불합격"
        //등급은 평균을 20 으로 나눈값으로 하되, 5이면 5등급, 4이면 4등급

        //출력 형식
        //학번    전산   PG  OA  총점  평균  학점  판정  등급
        //xxx   xx      xx   xx  xx  xx   xx    xx   xx

        Scanner sc = new Scanner(System.in);

        System.out.print("학번 입력 : ");
        int num = sc.nextInt();
        System.out.print("\n전산 점수 입력: ");
        int junsan = sc.nextInt();
        System.out.print("\nPG 점수 입력 : ");
        int pg = sc.nextInt();
        System.out.print("\nOA 점수 입력 : ");
        int oa = sc.nextInt();

        int tot = junsan+pg+oa;
        double avg =tot/3;
        String hak="F";
        String pan="";
        int grd=0;

        //총점

        //평균

        //학점
        if (avg >= 96) {
            hak="A+";
        } else if (avg >=93) {
            hak="A0";
        }else if (avg >=90) {
            hak="A-";
        }else if (avg >=86) {
            hak="B+";
        }else if (avg >=83) {
            hak="B0";
        }else if (avg >=80) {
            hak="B-";
        }else if (avg >=76) {
            hak="C+";
        }else if (avg >=73) {
            hak="C0";
        }else if (avg >=70) {
            hak="C-";
        }else {
            hak="F";
        }

        //판정  판정은 평균이 80이상이면서, 세 과목 모두 70이상이면 "합격" 아니면 "불합격"
        if(avg>=80 &&junsan>=70&&oa>=70&&pg>=70) {
            pan="합격";
        } else pan="불합격";

        //등급은 평균을 20 으로 나눈값으로 하되, 5이면 5등급, 4이면 4등급
        switch ((int) avg/20) {
            case 5:
                grd=5;
                break;
            case 4:
                grd=4;
                break;
            case 3:
                grd=3;
                break;
            case 2:
                grd=2;
                break;
            case 1:
                grd=1;
                break;

        }

//        System.out.println("학번\t전산\tPG\tOG\t총점\t평균 \t판정\t\t등급");
//        System.out.println(num+" "+junsan+"\t"+pg+"\t"+oa+"\t"+tot+"\t"+avg+" \t"+pan+"\t"+grd);
        System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t\t%s\t\t%s\n", "학번", "전산", "PG", "OG", "총점", "평균", "판정", "등급");
        System.out.printf("%d %d\t%d\t%d\t%d\t%3.2f\t%s\t%s\n", num, junsan, pg, oa, tot, avg, pan, grd);


    }
}
