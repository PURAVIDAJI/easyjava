package Chapter09;

import java.io.BufferedInputStream;
import java.util.stream.Stream;

public class ExceptionHandlingDemo {
  public static void main(String[] args) {

    String s =null;
    try {
      s.length();
      int res = 10 / 0; //2번째 문장 실행안되었음. 첫번째에서 에러가 있었기 때문
    } catch (ArithmeticException e) {
      System.out.println("0으로 나눌 수 없습니다.");
//      throw new RuntimeException(e);
    } catch (NullPointerException n){
      System.out.println("문자열에 내용이 없습니다.");
    } catch (Exception e){
      System.out.println("예외가 발생했습니다."); //범위가 더 넓은 에러를 마지막으로 빼주어야 한다!
    } finally {
      //에러에서 걸리든 안걸리든 무조건 실행하는 것
      System.out.println("프로그램을 종료합니다.");
    }

  }
}
