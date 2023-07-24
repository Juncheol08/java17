package sec2;

public class RunException extends Exception{

    public RunException() {} //기본 생성자
    public RunException(String message) {
        super(message+"사용자 정의 익셉션");
    }



}
