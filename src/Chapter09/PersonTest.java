package Chapter09;

public class PersonTest {
  public static void main(String[] args) {
    Person p1 = new Person("11111","홍길동");
    Person p2 = new Person("11111","손흥민");
    if(p1.equals(p2))
      System.out.println("같다");
    else
      System.out.println("다르다");
  }
}
class Person{
  String name;
  String num;
  public Person(String num, String name){
    this.num =num;
    this.num =name;
  }
  //오버로딩
  public boolean equals(Person person) {
    if (this.num == person.num){
    }return true;
  }

}
