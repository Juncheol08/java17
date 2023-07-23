package sec1;

import java.util.ArrayList;

//Stack, Que, Deque, Set, Map, List ...




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
