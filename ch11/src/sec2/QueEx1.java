package sec2;

import java.util.LinkedList;
import java.util.Queue;

public class QueEx1 {
    public static void main(String[] args) {

        Queue<String> que = new LinkedList<>();

        que.offer("0");
        que.offer("1");
        que.offer("2");
        que.offer("3");
        que.offer("4");

        System.out.println(que);
        que.poll();
        que.poll();
        System.out.println(que);
    }


}
