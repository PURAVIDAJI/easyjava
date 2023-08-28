package Chapter10;

public class LambdaEx3 {
  public static void main(String[] args) {
    Person1 person1 = new Person1();

    //제공된 람다식을 이용하기

    person1.action1((name, job) ->
      System.out.println(name+"이 "+job+"을 합니다.")
    );

    person1.action2(content -> System.out.println("\""+content+ "\"라고 외칩니다."));

  }
}
@FunctionalInterface
interface Workable1{
  void work(String name, String job);
}

@FunctionalInterface
interface Speakable{
  void work(String content);
}
class Person1{
  //아래의 메소드는 제공된 람다식을 이용해서 내부 데이터를 처리하는 처리부 역할을 한다.
  //여기서는 함수형 인터페이스에 있는 추상 메서드에 매개변수를 받아와야 하는 작업이 있다.
  //따라서 추상메서드의 매개변수 정보는 action메소드에서 정의해준다.
  public void action1(Workable1 workable){
    workable.work("홍길동","프로그래밍");
  }

  //액션 실행하면 매개변수로 받아온 함수형 인터페이스의 work메소드 실행시킴!
  public void action2(Speakable speakable){
    speakable.work("안녕하세요");
  }
}