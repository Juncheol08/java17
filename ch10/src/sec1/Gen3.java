package sec1;


public class Gen3 implements InterGen3<String>{
    @Override
    public String method1() {   //위 InterGen3<String> 에서 지정한 String으로 자동 생성
        return "김기태미남";
    }
}
