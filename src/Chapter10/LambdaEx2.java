package Chapter10;

public class LambdaEx2 {
  public static void main(String[] args) {
    Person person =new Person();

    person.action(()->
    {
      System.out.println("출근을 합니다.");
      System.out.println("프로그래밍을 합니다.");
    }); //()안의 람다식으로 Workable안에 있는 work메소드를 정의한다.

  }
}

interface Workable{
  //추상 메소드 가지는 함수형 인터페이스
  void work();
}

class Person{
  public void action(Workable workable){
    //이 함수에서는 Workable 인터페이스를 변수로 받은 다음에
    // 이 인터페이스에 있는 추상메소드를 실행시킨다.
    workable.work();
    //action 메소드는 제공된 람다식을 이용하여 데이터를 처리하는 처리부 역할을 한다.
    //work 메소드를 실행시키는 것!
  }
}