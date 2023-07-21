package sec2;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.LinkedBlockingDeque;

//Deque = Stack과 Que의 장점을 혼합한 이중 구조
public class DequeEx1 {
    public static void main(String[] args) {

        Deque<String> dq1 = new ArrayDeque<>();
        Deque<String> dq2 = new LinkedBlockingDeque<>();
        Deque<String> dq3 = new ConcurrentLinkedDeque<>();
        Deque<String> dq4 = new LinkedList<>();


//요소 추가
        dq1.add("0");
        dq1.push("1"); //0 의 앞에
        dq1.offer("2"); // 0의 뒤에
        dq1.add("3"); //맨뒤
        dq1.push("4"); //현재 앞에
        dq1.offer("5"); //현재 뒤에
        dq1.addFirst("6");
        dq1.addLast("7");
        dq1.offerFirst("8");
        dq1.offerLast("9");


        System.out.println(dq1);

//요소 제거
        dq1.remove("4");
        System.out.println(dq1);
        dq1.removeFirst();
        System.out.println(dq1);
        dq1.removeLast();
        System.out.println(dq1);
        dq1.poll();
        System.out.println(dq1);
        dq1.pollFirst();
        System.out.println(dq1);
        dq1.pollLast();
        System.out.println(dq1);
        dq1.pop();
        System.out.println(dq1);

        // 값 접근
        System.out.println(dq1.peek());
        System.out.println(dq1.peekFirst());
        System.out.println(dq1.peekLast());
        System.out.println(dq1.getFirst());
        System.out.println(dq1.getLast());
    }
}
