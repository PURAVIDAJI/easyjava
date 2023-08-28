package Chapter10;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LamdaEx1 {
  public static void main(String[] args) {
    List<String> list = Arrays.asList("abc","aaa","bbb","ddd","aaa");

    System.out.println("내립차순 정렬");
    Collections.sort(list,(s1, s2) -> s2.compareTo(s1));
    //람다식 자체가 익명개체가 된다!
    System.out.println(list);
  }
}
interface Comparator<T>{
  int compare(T o1,T o2);
}