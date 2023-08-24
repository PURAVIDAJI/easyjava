package Chapter09;

import java.util.Random;

public class DiceTest {
  public static void main(String[] args) {
    System.out.println(new Dice().roll());

  }
}
class Dice{
  public int roll(){
    Random r = new Random();
    int a= r.nextInt(1,7);
    return a;
  }
 


}
