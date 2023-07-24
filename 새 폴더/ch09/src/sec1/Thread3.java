package sec1;


class SAThread extends Thread {
    @Override
    public synchronized void start() { //쓰레드 생성
        super.start();
    }

    @Override
    public void run() {                //쓰레드 실행할 내용을 기술
        int[] arr = {95,60,85,70,90,80};

        for(int i=0; i<arr.length; i++) {
            System.out.println(i+1);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("점수 : "+arr[i]); //전체 Single 쓰레드 6개
            try {
                Thread.sleep(1000);
             } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public void method1() {
        for(int i=1; i<7; i++) {
            try {
                Thread.sleep(1000);
                System.out.println(i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}



public class Thread3{
    public static void main(String[] args) {

        Thread th1 = new SAThread();
        th1.start();    //쓰레드 생성 후 자동 실행
//        th1.run();



    }






}
