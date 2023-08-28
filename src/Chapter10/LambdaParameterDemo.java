package Chapter10;

public class LambdaParameterDemo {
  public static void main(String[] args) {
    MyFunction f = (a,b) ->a>b? a:b;//1
    myMethod(f);//2


    MyFunction myFunction = myFunction2();
    System.out.println(myFunction.max(10,300));

  }

  static void myMethod(MyFunction f){ //내가 펑션 만들어서 넘길 수도 있고
    System.out.println(f.max(3,5));//3
  }
  
  static MyFunction myFunction2(){ //매소드가 반환되도록 만들 수도 있음.
    MyFunction f =   (a,b) ->a>b? a:b;
    return f;
  }
}
