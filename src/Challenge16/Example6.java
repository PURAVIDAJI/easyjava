package Challenge16;


public class Example6 {
  public static double calc(Function fun) {
    double x = 10;
    double y = 4;
    return fun.apply(x, y);
  }
  public static void main(String[] args) {
    double add = calc((x, y) -> (x + y) );
    double minus = calc((x, y) -> (x - y) );
    double divide = calc((x, y) -> (x / y) );
    double multiply = calc((x, y) -> (x * y) );
    System.out.println("add result: " + add);
    System.out.println("minus result: " + minus);
    System.out.println("divide result: " + divide);
    System.out.println("multiply result: " + multiply);
  }

}
@FunctionalInterface
interface Function{
  double apply(double a, double b);



}

