package sec1;

//Type, Element, Key, Number, Value, Result, Question, Query, Generic
//첫번째 글자만 약어로 만들어 인자를 사용하는 것이 관례이다.
//기본 문법
//public class 클래스이름<인자> { }

public class Gen2<T>{
  private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }


}
