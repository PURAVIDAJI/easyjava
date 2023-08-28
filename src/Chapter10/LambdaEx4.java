package Chapter10;

//리턴 값이 있는 람다식
public class LambdaEx4 {
  public static void main(String[] args) {
    Person2 person2 = new Person2();

    //람다식으로 Calculable안의 추상형 메소드 calc가 할 함수연산을 정의해줌
    person2.action((x,y)->(x+y));

    //sum 함수를 정의해서 sum함수에서 연산한 것을 result값으로 넘겨줌!
    person2.action((x,y)->sum2(x,y));
  }
  public static double sum2(double x, double y){
    return (2*(x+y));
  }

}
@FunctionalInterface
interface Calculable{
  double cal(double x, double y);
}
class Person2{
  public void action(Calculable calculable){
    double result = calculable.cal(10,4);
    System.out.println("결과 : " +result );
  }

}