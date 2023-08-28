package Chapter10;

import java.util.function.Predicate;

public class FunctionalInterface2Demo {
  public static void main(String[] args) {
    Predicate<String> isEmptyStr = s ->s.length()==0;
    String s = "";

    if(isEmptyStr.test(s))
      System.out.println("There is an empty String");

    //인티저 값을 받아서 0인지 아닌지

    Predicate<Integer> isZero = i -> i==0;
    Integer i = 1;
    if(isZero.test(i))
      System.out.println("0입니다");
    else System.out.println("0이 아닙니다.");

  }
}
