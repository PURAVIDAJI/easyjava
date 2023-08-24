package Chapter09;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

public class GenericClassDemo1 {
  public static void main(String[] args) {

    ArrayList<Boricha> arrayListBoricha = new ArrayList<>(); //사용할 때 보리차만 담을 게요!
    arrayListBoricha.add(new Boricha());
//    arrayListBoricha.add(new Beer()); //담을 때 걸려버림! 아예 못 담게 함

    ArrayList<Beer> arrayListBeer= new ArrayList<>();
    arrayListBeer.add(new Beer());
    //arrayListBeer.add(new Boricha()); //컴파일에서 잘못담을 때 오류가 나도록 첨부터 거름



    Cup c =new Cup();
    c.setBeverage(new Boricha());//꺼낼 때마다 타입 체크 다해줘야함.
    if(c.getBeverage() instanceof Boricha) {
      Boricha boricha = (Boricha) c.getBeverage();
    } else if (c.getBeverage() instanceof Beer) {
      Beer beer =(Beer) c.getBeverage();
    }
    c.setBeverage(new Beer());
    Beer beer =(Beer) c.getBeverage();
    c.setBeverage(new Beverage());
//    c.setBeverage(new Object()); //모든 걸 다 담을 수 있음

    //근데 난 보리차밖에 못마심
    //보리차는 오브젝으로 업캐스팅되었으므로 다시 다운캐스팅해주어야 함.
//    Boricha boricha = (Boricha) c.getBeverage();
//    Beer beer =(Beer) c.getBeverage();


    Cup<Boricha> borichaCup =new Cup();
    borichaCup.setBeverage(new Boricha());
    Boricha beverage = borichaCup.getBeverage();

    Cup<Beverage> beerCup =  new Cup();
    beerCup.setBeverage(new Beer());

    Cup<Beverage> beverageCup = new Cup();
    beverageCup.setBeverage(new Beverage());




  }
}

class Beverage{}

class Boricha extends Beverage{
  void drink(){
    System.out.println("어린아이만 마실 수 있다.");
  }
}

class Beer extends Beverage{

  void cheers(){
    System.out.println("어른만 마실 수 있다.");
  }
}

class Cup<T extends Beverage>{
  //Beverage를 상속받은 애들만 올 수 있게
  // 선언 할때 type 상관없이 다 담을 수 있음
  //음료를 담을 수 있음
  //아무거나 모두 담을 수 있는 컵
  private T beverage;

  public T getBeverage() { //컵에 담긴 음료 꺼냄
    return beverage;
  }

  public void setBeverage(T beverage) { //음료를 컵에 담음
    this.beverage = beverage;
  }
}