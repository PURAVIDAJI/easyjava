package Chapter09;

import java.util.Scanner;

public class ThrowsDemo {
  public static void main(String[] args)  { //던져야할 항목이 있는 메서드를 사용하는 경우, 그 메서드를 사용할 때도 Exception 던질 생각해준다.
    Scanner in = new Scanner(System.in);
    try {
      square(in.nextLine());
    } catch (NumberFormatException e) {
      System.out.println("정수가 아닙니다.");
    }
  }
  private static void square(String s)throws NumberFormatException{
    int n =Integer.parseInt(s);
    System.out.println(n*n);
  }
}
