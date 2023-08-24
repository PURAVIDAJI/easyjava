package Chapter09;

public class EntryDemo {
  public static void main(String[] args) {
    Entry<String, Integer> e1 = new Entry<>("김선달", 20);
    e1.setKey("123");
    e1.setKey("유기명");
    System.out.println(e1.getKey());
    System.out.println(e1.getValue() * 10);

    Entry<Integer, String> e2 = new Entry<>(50, "123");
    System.out.println(e2.getKey() * 8);
    //자바에서 문자열이 숫자인지 체크하는 것!
    String str = e2.getValue(); //length체크는 String에만 있으니까. str으로 재정의 해줘야 함
    boolean res = true;
    for (int i = 0; i < str.length(); i++) {
      if (Character.isDigit(str.charAt(i)) == false) {
        res = false;
        break;
      } else {
        res = true;
      }
    }
    if (res) {
      System.out.println(Integer.parseInt(str) * 10);


    }
  }
}
  class Entry<K, V> {
    private K key;
    private V value;

    public Entry(K key, V value) {
      this.key = key;
      this.value = value;
    }

    public K getKey() {
      return key;
    }

    public void setKey(K key) {
      this.key = key;
    }

    public V getValue() {
      return value;
    }

    public void setValue(V value) {
      this.value = value;
    }
  }

