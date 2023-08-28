package Chapter10;

public class FunctionalInterfaceDemo {
  public static void main(String[] args) {

//    MyFunction f = new MyFunction() {
//      @Override
//      public int max(int a, int b) {
//        return a>b? a:b;
//      }
//    }; //한번만 쓰고 말 익명 메소드인데 너무 복잡함!
    MyFunction f = (a, b) -> a>b? a:b; //이렇게 간단하게 표현가능!
    // 람다식은 익명 클래스 안에 있는 익명 메소드구나
    // 람다식 자체가 메소드이면서 객체이다.




    int max = f.max(4,6);
    System.out.println(max);


  }
}
@FunctionalInterface
interface MyFunction{
  int max(int a, int b);
  //int min(int a, int b);
  // FunctionalInterface를 사용하면 오류 방지해줌
}
