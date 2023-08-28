package Challenge16;

public class Example7 {
  private static int[] scores = { 10, 50, 3 };
  public static int maxOrMin(Operator operator) { //데이터 처리부
    int result = scores[0];
    for(int score : scores) {
      result = operator.apply(result, score);
      //큰 걸 구할지 작은 것을 구할지 모르니까, apply x,y가지고 우선 구조만 줄게
      // 나중에 니가 구현해봐!
    }
    return result; //구조만 있음
  }
  public static void main(String[] args) {
//최대값 얻기
    int max = maxOrMin((res,score)->res>= score? res : score);
    // 익명 메소드를 구현하는 것
    // 람다식으로 apply 메소드를 정의하고, apply에서 나온 값이 result에 저장되니까
    // result값을 반환하는 MaxOrMin의 함수 출력값을 다시 int max에 저장한다.
    System.out.println("최대값: " + max);
//최소값 얻기
    int min = maxOrMin((res,score)->res<= score? res : score);
    System.out.println("최소값: " + min);
  }
}
@FunctionalInterface
interface Operator {
  public int apply(int x, int y);
}
