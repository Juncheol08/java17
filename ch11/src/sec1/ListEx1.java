package sec1;

import java.util.ArrayList;

//Stack, Que, Deque, Set, Map, List ...
//컬렉션 프레임워크 : 여러 데이터의 모음을 저장하고 처리할 자료 구조
//List : 데이터의 순서가 있으며, 순서 유지가 됨. -> ArrayList, vector, LinkedList ...
//Set : 일반적인 집합을 말하며, 순서 유지가 되지 않지만, 데이터 중복 허용되지 않음 -> *HashSet, TreeSet
//Map : 키와 값을 쌍으로 저장, 키의 중복은 허용되지 않지만, 값은 중복이 허용됨 -> *HashMap , HashTable, TreeMap, *Properties
//      1:{"kor":100, "eng":90, "mat":80}, 2:{"kor":100, "eng":90, "mat":80} ...
//Stack : 일반적인 데이터, 최신의 데이터를 저장하는 자료구조로 데이터 입출력이 LIFO로서 거꾸로 진행됨
//Queue : 데이터 입출력이 FIFO 로서 순서대로 진행되는 자료구조로 CPU 스케줄링 -> 쓰레드의 우선순위 또는 발생
//Deque : FIFO/LIFO 운영방식이 모두 가능한 자료구조



public class ListEx1 {
    public static void main(String[] args) {

        ArrayList<Board> lst = new ArrayList<>();
        Board bd1;

        for(int i=1;i<5; i++) {
            bd1= new Board();
            bd1.setNo(i);
            bd1.setTitle("더미제목"+i);
            bd1.setContent("더미 내용"+i);
            bd1.setAuthor(""+i);
            bd1.setResdate("23-07-20");
            lst.add(bd1);
        }
        prt(lst);


    }
    public static void prt(ArrayList<Board> lst) {
        for(Board bd:lst) {
            System.out.println("글 번호 :"+bd.getNo());
            System.out.println("글 제목 :"+bd.getTitle());
            System.out.println("글 저자 :"+bd.getAuthor());
            System.out.println("글 날짜 :"+bd.getResdate());
        }
    }

}
