package Chapter09;

import java.util.ArrayList;

public class GenericTest {
  public static void main(String[] args) {
    /*제너릭 타입 안줌*/
    ArrayList nums = new ArrayList<>(); //object 타입임
    nums.add(10); //Integer로 10이 auto boxing됨
    nums.add("30");
    nums.add(3.14);//Double로 3.14가 auto boxing됨
    nums.add("abc");

    for (int i = 0; i < nums.size(); i++) {
//      System.out.println((Integer)(nums.get(i))*2);//ClassCastException
      if(nums.get(i) instanceof Integer)
        System.out.println((Integer)(nums.get(i))*2);
      else if (nums.get(i) instanceof Double) {
        System.out.println((Double)(nums.get(i))*2);
      } else if (nums.get(i) instanceof String) {
        System.out.println(Integer.parseInt((String) nums.get(i)));

      } //이런식으로 나올 수 있는 모든 타입에 대해서 다 형변환 시켜야함.
        //Solid 원칙 위반함

    } //제너릭 안쓰면 오브젝 들어가도록 만들어 놓았음,사용할 때 형 지정안해주면 모든 걸 다 담을 수 있기에~
      // 이경우 타입 체크를 다 해줘야 함!



    System.out.println((Integer) nums.get(0)*2); //어레이 리스트에 오브젝이 담겼기에 인티저로 형변환한다음에 곱할 수 있음
  }
}

