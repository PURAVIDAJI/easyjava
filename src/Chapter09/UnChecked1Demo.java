package Chapter09;

import java.util.StringTokenizer;

public class UnChecked1Demo {
  public static void main(String[] args) {
    String s ="Time is money";
    StringTokenizer st = new StringTokenizer(s);

    while(st.hasMoreTokens()){
      System.out.println(st.nextToken());
    }
    //System.out.println(st.nextToken());
    // NoSuchElementException 오류 ->
    // 개발자가 부주의 > 개발자가 처리해야 하는 오류(exception), 컴파일에서는 오류가 나지 않는다

  }
}
