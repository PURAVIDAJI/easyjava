package Chapter10;

public class LamdaDemo {

        //매개변수가 아예 없으면 괄호를 생략하면 안됨!
        public static void main(String[] args) {
          Object obj = new Object(){
            int max(int a, int b){
              return a>b ? a:b;
            }
          }; //부모 object의 몸을 빌려서 익명 메소드를 한 개 만듦.

          //int max =obj.max(3,5)// 부모의 리모컨 기능으로 자식의 기능 가리키지 못함.부모의 몸을 빌린 상태이기 때문에 자식의 메소드 사용 불가

          //-> 함수형 인터페이스


        }

}