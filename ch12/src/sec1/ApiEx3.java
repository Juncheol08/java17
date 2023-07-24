package sec1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ApiEx3 {
    public static void main(String[] args) {

        //Math.random() : 0~1의 실수

        //로또 추첨기
        Integer[] lotto = new Integer[6];

        for(int i=0; i<6; i++) {
            lotto[i] = (int)(Math.random() * 45) + 1;

            for(int j=0; j<i; j++) {
                if(lotto[i] == lotto[j]) {
                    i--;
                    break;
                }
            }
        }
        for(int i=0; i<6; i++) {
            System.out.print(" "+lotto[i]);
        }
        System.out.println();

////////////////////////////////////////////////////////////////////////


        Integer[] lotto2 = new Integer[6];
        Set<Integer> gen = new HashSet<>(Arrays.asList(lotto2));

        while (gen.size()<6) {
            gen.remove(null);
            gen.add((int) (Math.random() * 44 + 1));

        }
        System.out.println(gen);
        lotto2 = gen.toArray(new Integer[6]);
        Arrays.sort(lotto2);     //오름차순 정렬
        System.out.println("정렬 : "+Arrays.toString(lotto2));





    }
}
