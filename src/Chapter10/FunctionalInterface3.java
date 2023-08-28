package Chapter10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FunctionalInterface3 {
  public static void main(String[] args) {
    List<Integer> list =new ArrayList<>();
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);

    //Consumer interface 사용
    list.forEach(i-> System.out.println(i));
    list.removeIf(i->i%2==0);
    list.forEach(i-> System.out.println(i));
    list.add(2);
    list.add(4);


    list.replaceAll(i->i*10);// uniary 메서드
    System.out.println(list);

    Map<String, Integer> map =new HashMap<>();
    map.put("A",65);
    map.put("a",97);
    map.forEach((k,v)-> System.out.println("Key : "+k+" , "+"Value : "+ v));
    //Biconsumer

  }

}
