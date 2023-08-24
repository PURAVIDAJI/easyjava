package Chapter09;

public class UnChecked2Demo {
  public static void main(String[] args) {
    int[] array = {0,1,2};
    System.out.println(array[3]);
    //개발자 부주의 오류 -> runtimeexception
    //컴파일러가 발견 못한 것.
  }
}
