package Chapter09;

public class GenMethod2Demo {
  public static void main(String[] args) {
    Integer[] ia ={1,2,3,4,5};
    Double[] da = {1.0,2.0,3.0,4.0,5.0};
    Character[] ca ={'a','b','c','d','e'};


  Utils2.showArray(ia);//{1,2,3,4,5}
    Utils2.showArray(da);
   // Utils2.showArray(ca);//넘버 상속받지 않았기 때문에 오류

    System.out.println(Utils2.getLast(ia));
    //System.out.println(Utils2.getLast(ca)); //매개변수를 넘버 상속받는 애로만 했으니까
  }
}
class Utils2 {
  public static <T extends Number> void showArray(T[] a) {
    for (T t : a) {
      System.out.printf("%s", t);
    }
    System.out.println();
  }

  public static <T extends Number> T  getLast(T[] a) { //리턴 타입을 제너릭 으로받는 제너릭 메소드
  return a[a.length-1];
  }
}