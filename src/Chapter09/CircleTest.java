package Chapter09;


public class CircleTest {
  public static void main(String[] args) {
    Circle c1 = new Circle(3);
    Circle c2 = new Circle(3);
    if(c1.equals(c2))
      System.out.println("같다");
    else
      System.out.println("다르다");
  }
}
class Circle{
  int radius;
  public Circle(int radius){

    this.radius =radius;
  }
//  //오버로딩
//  @Override
//  public boolean equals(Circle circle) {
//    if (this.radius == circle.radius ){
//    }return true;
//  }
  //오버라이딩


  @Override
  public boolean equals(Object obj) {
    if(obj instanceof Circle circle){
      if(this.radius == circle.radius){
        return true;
      }
    }
   return false;
  }
}