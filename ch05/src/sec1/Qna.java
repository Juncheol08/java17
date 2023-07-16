package sec1;

public class Qna extends Board {

    public static final String DUMMY = "테스트글제목";
    public static String DUMMY2 = "DUMMY2";
    static String DUMMY3 = "DUMMY3";


    private int level; //
    private int parno; //부모


    //super //부모생성자 함수에 떠넘길때
    public Qna() {
        super();
    }

    public Qna(int no) {
        super(no);
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getParno() {
        return parno;
    }

    public void setParno(int parno) {
        this.parno = parno;
    }

    @Override
    public void method2() {
        System.out.println("Qna입니다. ");
    }
}
