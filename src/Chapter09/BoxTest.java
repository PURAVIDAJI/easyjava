package Chapter09;

public class BoxTest {
  public static void main(String[] args) {
    Box<Integer> i = new Box<>();
    i.set(Integer.valueOf((100)));
    System.out.println(i.get());

    Box<String> s =new Box<>();
    s.set("만능이네!");
    System.out.println(s.get());

  }
}
class Box<T>{
  private T box;

  public T get() {
    return box;
  } // getter메서드는 값을 보여주는 역할이니까 return값이 있어야 하는 게 맞음.

  public void set(T box) {
    this.box = box;
  }
}