package sec5;

import java.util.Arrays;

public class ArraysEx1 {
    public static void main(String[] args) {



        System.out.println();

        System.out.println("정렬 전");
        int[] points = {90,100,80,70,95,85,75};
        for(int p:points) {
            System.out.println(p);
        }
        System.out.println("정렬 후");
        Arrays.sort(points);
        for(int p:points){

        }

    }
}
