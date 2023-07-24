package sec1;

public class Example3 {
    public static void main(String[] args) {


        //관계연산 : ==(이다/일치), !=(아니다/불일치) , >(초과/후) , <(미만/전)
        //          >=(이상/이후), <=(이하/이전)

        int su1 = 90;
        int su2 = 85;
        int su3 = 88;

        System.out.println("su1 = "+su1+" , su2 = "+su2+" , su3 = "+su1);
        System.out.println("su1 == su2 : "+(su1==su2));
        System.out.println("su1 != su2 : "+(su1!=su2));
        System.out.println("su1 > su2 : "+(su1>su2));
        System.out.println("su2 >= su3 : "+(su2>=su3));
        System.out.println("su1 < su2 : "+(su1<su2));
        System.out.println("su1 <= su2 : "+(su1<=su2));

        //논리연산 : and , or , not
        // && and 연산 / 두 조건 모두 참일때
        System.out.println("su1 <= su2 && su2 >= su3 : "+(su1 <= su2 && su2 >= su3));
        System.out.println("su1 >= su2 && su2 >= su3 : "+(su1 >= su2 && su2 >= su3));
        System.out.println("su1 <= su2 && su2 <= su3 : "+(su1 <= su2 && su2 <= su3));
        System.out.println("su1 >= su2 && su2 <= su3 : "+(su1 >= su2 && su2 <= su3));


        // || or 연산
        System.out.println("su1 <= su2 || su2 >= su3 : "+(su1 <= su2 || su2 >= su3));
        System.out.println("su1 <= su2 || su2 <= su3 : "+(su1 <= su2 || su2 <= su3));
        System.out.println("su1 >= su2 || su2 >= su3 : "+(su1 >= su2 || su2 >= su3));
        System.out.println("su1 >= su2 || su2 <= su3 : "+(su1 >= su2 || su2 <= su3));

        // ! not 연산
        System.out.println("!(su1>=su2) : "+(!(su1>=su2)));
        System.out.println("!(su2>=su3) : "+(!(su2>=su3)));



    }
}
