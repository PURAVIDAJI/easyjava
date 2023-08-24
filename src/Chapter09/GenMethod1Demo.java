package Chapter09;

public class GenMethod1Demo {
  public static void main(String[] args) {
    Integer[] ia ={1,2,3,4,5};
    Character[] ca ={'a','b','c','d','e'};
    Box[] ba ={new Box(), new Box()};
    ba[0].set(10);
    ba[1].set(20);

  Utils.showArray(ia);//{1,2,3,4,5}
    Utils.showArray(ca);//a,b,c,d,e
    Utils.showArray(ba);
    System.out.println(Utils.getLast(ia));
    System.out.println(Utils.getLast(ca));
  }
}
class Utils {/*클래스 안에 선언된 메서드*/
  public static <T> void showArray(T[] a) {
    for (T t : a) {
      System.out.printf("%s", t);
    }
    System.out.println();
  }

  public static <T> T getLast(T[] a) { //리턴 타입을 제너릭 으로받는 제너릭 메소드
  return a[a.length-1];
  }
}