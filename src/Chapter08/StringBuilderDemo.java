package Chapter08;

public class StringBuilderDemo {
  public static void main(String[] args) {
    String s = new String("hi"); //String 에는 toString이 구현되어 있다.
    System.out.println(s.hashCode());//object에서 상속 받은 hash코드 사용
    s = s+"!"; //수정하면 다른 메모리에 저장되는 것이다.



    System.out.println(s.hashCode());


    StringBuilder sb = new StringBuilder("hi");
    System.out.println(sb.hashCode());
    sb = sb.append("!");
    System.out.println(sb.hashCode());

    System.out.println(sb.replace(0,2,"Good Night").insert(0, "inji "));
    System.out.println(sb.capacity());
    System.out.println(sb.reverse());
    StringBuilder sb1 = new StringBuilder("소있고 지게지고 있소");
    System.out.println(sb1);
    sb1 = sb1.reverse();
    System.out.println(sb1);
    System.out.println(sb1.delete(4,7).reverse());

  }
}
