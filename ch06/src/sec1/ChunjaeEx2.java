package sec1;

public class ChunjaeEx2 {
    public static void main(String[] args) {
        Chunjae c1 = new Chunjae();

        c1.partNo =1234; //default
        c1.point =200;  //protected
        c1.name = "김기태";    // public
        System.out.println(Chunjae.PI * 20 * 20);
        //public > protected > default > private

        Sehun s1= new Sehun();
        Chanwon ch1 = new Chanwon();

        int[] k = new int[100];

        Sehun[] s = new Sehun[10];

        for(int a=0; a<s.length; a++) {
            s[a]= new Sehun();
            s[a].setNum(a+1);
            s[a].setData("세훈"+(a+1));
        }

        for(int a=0; a<s.length; a++) {
            System.out.println(s[a].getNum());
            System.out.println(s[a].getData());
            System.out.println("----------------------------------");
        }







    }
}
