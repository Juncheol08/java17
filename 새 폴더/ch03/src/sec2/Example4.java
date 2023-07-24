package sec2;

public class Example4 {
    public static void main(String[] args) {

        /*
        1  2  3  4  5  6  7
        8  9  10 11
         */
        int cnt =0;
        for(int i=1; i<=5; i++){ // 1~5
            for(int j=1;j<=7;j++) {
                cnt++;
                if(cnt>31) break;
                System.out.printf("%2d\t",cnt);
            }
            System.out.println();
        }





        /*
        *
        **
        ***
        ****
        */
        for(int i=1;i<=6;i++) {
            for (int j=1; j<i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("");

        /*
        ****
        ***
        **
        *
         */
        for(int i=1;i<=6;i++) {         //몇줄인지
            for (int j=1; j<7-i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        /*
        구구단
        2X1=2  3X1=3 ... 9X1=1
        ...
        2X9=18
         */
        for (int i=1;i<10;i++) {
            for (int j=2; j<10; j++) {
                System.out.print(j+"X"+i+"="+j*i+"\t");
            }
            System.out.println();
        }





    }
}
