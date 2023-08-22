package Chapter08;

public class objectMethodDemo {
  public static void main(String[] args) {
    Mouse mouse1 = new Mouse("SAMSUNG");
    Mouse mouse2 = new Mouse("SAMSUNG");
    System.out.println(mouse1 == mouse2); // 참조 변수가 같은 지 check
    System.out.println("제조사가 같은지?"+ mouse1.equals(mouse2)); //오버라이드 해서 제조사가 같은지 탐색한 것.

    Keyboard keyboard =new Keyboard("쌈쑹");
    System.out.println(keyboard);
    Keyboard keyboard1 = new Keyboard("LG");
    Keyboard keyboard2 = new Keyboard("LG");
    Keyboard keyboard3 = new Keyboard("SAMSUNG");
    System.out.println("제조사가 같은지?"+ keyboard1.equals(keyboard2));
    System.out.println("제조사가 같은지?"+ keyboard1.equals(keyboard3));

    Class c = keyboard1.getClass(); //키보드를 상속받은 어떤 클라스!
    System.out.println(c);
    System.out.println(c.getName()); //패키지+객체 이름
    System.out.println(c.getSimpleName());//객체 이름
    System.out.println(c.getTypeName()); //
    System.out.println(c.getPackage().getName()); //패키지 이름만 가지고 올 수 있음


    //객체가 같은지 아닌지 확인하는 방법 > eqaul
    //제조사가 같은지 알고 싶음 > equals 오버라이드
    //내가 원하는 대로 오버라이드 해야함.

  }
}
class Mouse {
  String name;

  public Mouse(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "제조사가 " + name + "인 마우스입니다.";
  }

//  @Override
//  public boolean equals(Object obj) { //비교하려고 하는게,
//    if(obj instanceof Mouse mouse) {
//     if( this.name.equalsIgnoreCase(mouse.name)){
//       return true;
//     }
//    }return false;
//  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true; //주소 자체가 같음 -> 그냥 같은 객체가 된다.
    if (obj == null || this.getClass() != obj.getClass()) return false;
    if (this.name.equalsIgnoreCase(((Mouse) obj).name)) {
      return true;
    }
    return false;
  }

}

class Keyboard {
  String name;

  public Keyboard(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "제조사가 " + name + "인 키보드입니다.";
  }

//  @Override
//  public boolean equals(Object obj) {
//    if (obj instanceof Keyboard keyboard) {
//      if (this.name.equalsIgnoreCase(keyboard.name)) {
//
//        return true;
//      }
//    }
//    return false;
//  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || this.getClass() != obj.getClass()) return false; //다른 클래스일 때 걸러진다.
    if (this.name.equalsIgnoreCase(((Keyboard) obj).name)) {
      return true;
    }
    return false;
  }


}

