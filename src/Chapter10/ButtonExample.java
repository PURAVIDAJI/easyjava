package Chapter10;

public class ButtonExample {
  public static void main(String[] args) {
    Button btnOk = new Button();

    //어차피 함수형 인터페이스를 매개변수로 받는데
    //함수형 매개변수가 들어갈 자리에 람다식을 정의해서 넣으면 함수형 인터페이스에 1개있는 추상형 메소드가 정의되는 것이다.
    //여기서는 설정만해주는 메소드를 실행한 것!
    btnOk.setClickListener(()-> System.out.println("OK버튼을 클릭했습니다."));
    //설정한 것을 실행하는 메소드.
    btnOk.click();

    Button btnCancel = new Button();
    btnCancel.setClickListener(()-> System.out.println("Cancel 버튼을 클릭했습니다."));

    btnCancel.click();

  }
  //익명 함수 장점 : 데이터만 저장해두고 필요할 때마다 메서드를 맘대로 만들어서 사용할 수 있다.

}
class Button{
  //함수형 인터페이스를 클래스 안에 선언
  public static interface ClickListener{
    void onClick();
  }
  //인터페이스를 필드로 선언
  private ClickListener clickListener;
  //ClickListener타입의 매개변수를 받아서 clicklistener로 바꿔주는 메소드
  public void setClickListener(ClickListener clickListener) {
    this.clickListener = clickListener;
  }
  //onClick 메소드 실행시켜주는 메소드
  //위에서는 인터페이스에 선언되어 있기만 한거니까 실행시켜주는 메소드가 따로 필요하다.
  public void click(){
    this.clickListener.onClick();
  }
}