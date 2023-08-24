package Chapter09;

import java.util.ArrayList;

public class GenericTest2 {
  public static void main(String[] args) {
    /*제너릭 타입 안줌*/
    ArrayList<Integer> nums = new ArrayList<>(); //사용할 때 Integer만 쓸 것이다. -> 사용할 때 타입을 지정해준다.
    nums.add(10);
    nums.add(556);
  //Integer로 10이 auto boxing됨
//    nums.add("30"); //컴파일시 타입체크 하므로  Integer가 아닌 원소는 추가할 수 없다.
//    nums.add(3.14);
//    nums.add("abc");

    for (int i = 0; i < nums.size(); i++) {
      System.out.println((nums.get(i))*2); //어차피 다  int이니까 타입 체크가 필요없다.
//      if(nums.get(i) instanceof Integer)
//        System.out.println((Integer)(nums.get(i))*2);
//      else if (nums.get(i) instanceof Double) {
//        System.out.println((Double)(nums.get(i))*2);
//      } else if (nums.get(i) instanceof String) {
//        System.out.println(Integer.parseInt((String) nums.get(i)));
//      }
    }

    String s = "world";
    ArrayList<String> strs = new ArrayList<>();
    strs.add("hello");
    strs.add(s);
    strs.add(null);

    for (int i = 0; i < strs.size(); i++) {
      String getstr =strs.get(i);
      if(getstr !=null)
      System.out.println(strs.get(i).length());
      else {
        System.out.println("아무것도 없습니다!!");
      }

    }

  }
}

