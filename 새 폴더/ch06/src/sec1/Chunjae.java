package sec1;

public class Chunjae {

    private int no;
    protected int point;
    int partNo;
    public String name;
    public static final double PI = 3.141592;

    public void setValue(int no) {
        this.no = no;
    }



}
class Chanwon {
    private int seq;
    private int data;

    public Chanwon() { this(1);}
    public Chanwon(int seq) { this(1,100);}
    public Chanwon(int seq , int data) { this.seq=seq; this.data=data;}

}
class Sehun{
    private int num =1;
    private String data = "김기태";

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}