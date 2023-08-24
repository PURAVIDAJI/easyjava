package Chapter09;

import java.io.IOException;

public class ThrowExceptionError {
  public static void main(String[] args) throws IOException, InterruptedException {
    write("a.txt"); //메소드에서 받아오면서 익셉션 발생할 수 있으니 나도 밖으로 던지겠다!!!

  }
  static void write(String filename) throws IOException, InterruptedException{
    System.out.println(filename+"파일을 저장합니다.");
  }
}
