package sec3;

public class SystemEx3 {
    public static void main(String[] args) {

        //성능 평가 기준 :
        //처리능력(Throughput), 반환시간(Turn Around Time)
        //사용 가능도(Availability), 신뢰도(Reliability)
        long tot = 0;

//        long start = System.currentTimeMillis();    // 1/1000초
        long start = System.nanoTime();    // 1/1000000000초

        for(int i=0; i<1000000000; i++) {
            tot += i;
        }
        long end = System.nanoTime();    // 1/1000000000초

        System.out.println("누적 결과 : "+tot);
        System.out.println("걸린 시간 : "+(end-start)+"ns");

    }
}
